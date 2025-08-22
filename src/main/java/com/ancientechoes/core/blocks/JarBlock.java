package com.ancientechoes.core.blocks;

import com.ancientechoes.core.AncientEchoesItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class JarBlock extends Block {

    protected static final VoxelShape SHAPE = Block.createCuboidShape(2, 0, 2, 14, 9, 14);

    public static final BooleanProperty MARSHMALLOW = BooleanProperty.of("marshmallow");
    public static final BooleanProperty LIGHTMARSHMALLOW = BooleanProperty.of("lightlyroasted_marshmallow");
    public static final BooleanProperty GOLDMARSHMALLOW = BooleanProperty.of("golden_marshmallow");
    public static final BooleanProperty BURNTMARSHMALLOW = BooleanProperty.of("burnt_marshmallow");

    public JarBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(MARSHMALLOW, false)
                .with(LIGHTMARSHMALLOW, false)
                .with(GOLDMARSHMALLOW, false)
                .with(BURNTMARSHMALLOW, false));
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient) {
            BooleanProperty[] props = {MARSHMALLOW, LIGHTMARSHMALLOW, GOLDMARSHMALLOW, BURNTMARSHMALLOW};
            net.minecraft.item.Item[] items = {
                    AncientEchoesItems.MARSHMALLOW_ON_A_STICK,
                    AncientEchoesItems.LIGHTLY_ROASTED_MARSHMALLOW_ON_A_STICK,
                    AncientEchoesItems.GOLDEN_MARSHMALLOW_ON_A_STICK,
                    AncientEchoesItems.BURNT_MARSHMALLOW_ON_A_STICK
            };

            for (int i = 0; i < props.length; i++) {
                if (state.get(props[i])) {
                    ItemStack stack = new ItemStack(items[i]);
                    if (!player.isCreative()) {
                        Block.dropStack(world, pos, stack);
                    }
                    break;
                }
            }
        }

        super.onBreak(world, pos, state, player);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(MARSHMALLOW, LIGHTMARSHMALLOW, GOLDMARSHMALLOW, BURNTMARSHMALLOW);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public boolean isShapeFullCube(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }


    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        ItemStack stack = ctx.getStack();
        BlockState state = this.getDefaultState();

        if (stack.hasNbt() && stack.getNbt().contains("BlockStateTag")) {
            NbtCompound nbt = stack.getNbt().getCompound("BlockStateTag");
            state = state
                    .with(MARSHMALLOW, nbt.getBoolean("marshmallow"))
                    .with(LIGHTMARSHMALLOW, nbt.getBoolean("lightlyroasted_marshmallow"))
                    .with(GOLDMARSHMALLOW, nbt.getBoolean("golden_marshmallow"))
                    .with(BURNTMARSHMALLOW, nbt.getBoolean("burnt_marshmallow"));
        }

        return state;
    }


    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) return ActionResult.SUCCESS;

        ItemStack stackInHand = player.getStackInHand(hand);
        BooleanProperty[] props = {MARSHMALLOW, LIGHTMARSHMALLOW, GOLDMARSHMALLOW, BURNTMARSHMALLOW};
        net.minecraft.item.Item[] items = {
                AncientEchoesItems.MARSHMALLOW_ON_A_STICK,
                AncientEchoesItems.LIGHTLY_ROASTED_MARSHMALLOW_ON_A_STICK,
                AncientEchoesItems.GOLDEN_MARSHMALLOW_ON_A_STICK,
                AncientEchoesItems.BURNT_MARSHMALLOW_ON_A_STICK
        };

        boolean hasAny = false;
        for (BooleanProperty prop : props) {
            if (state.get(prop)) {
                hasAny = true;
                break;
            }
        }

        for (int i = 0; i < props.length; i++) {
            if (stackInHand.getItem() == items[i] && !hasAny) {
                world.setBlockState(pos, state.with(props[i], true), Block.NOTIFY_ALL);
                if (!player.isCreative()) {
                    stackInHand.decrement(1);
                    player.giveItemStack(new ItemStack(net.minecraft.item.Items.STICK));
                }
                return ActionResult.SUCCESS;
            }
        }

        if (stackInHand.getItem() == net.minecraft.item.Items.STICK) {
            for (int i = 0; i < props.length; i++) {
                if (state.get(props[i])) {
                    world.setBlockState(pos, state.with(props[i], false), Block.NOTIFY_ALL);
                    if (!player.isCreative()) {
                        stackInHand.decrement(1);
                        player.giveItemStack(new ItemStack(items[i]));
                    }
                    return ActionResult.SUCCESS;
                }
            }
        }

        return ActionResult.PASS;
    }
}

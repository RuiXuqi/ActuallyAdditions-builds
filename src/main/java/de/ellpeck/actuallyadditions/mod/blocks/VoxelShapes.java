package de.ellpeck.actuallyadditions.mod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Optional;
import java.util.stream.Stream;

public class VoxelShapes {
    static final VoxelShape CANOLA_PRESS_SHAPE = Stream.of(Block.box(0.5, 8, 0.5, 3.5, 10, 3.5),
            Block.box(1, 2, 1, 3, 14, 3),
            Block.box(2, 0, 2, 14, 6, 14),
            Block.box(3, 6, 3, 13, 9, 13),
            Block.box(12.5, 14, 12.5, 15.5, 16, 15.5),
            Block.box(2, 9, 2, 14, 15, 14),
            Block.box(13, 2, 1, 15, 14, 3),
            Block.box(1, 2, 13, 3, 14, 15),
            Block.box(13, 2, 13, 15, 14, 15),
            Block.box(12.5, 14, 0.5, 15.5, 16, 3.5),
            Block.box(0.5, 14, 0.5, 3.5, 16, 3.5),
            Block.box(0.5, 14, 12.5, 3.5, 16, 15.5),
            Block.box(12.5, 8, 12.5, 15.5, 10, 15.5),
            Block.box(12.5, 8, 0.5, 15.5, 10, 3.5),
            Block.box(0.5, 8, 12.5, 3.5, 10, 15.5),
            Block.box(0.5, 5, 12.5, 3.5, 7, 15.5),
            Block.box(0.5, 5, 0.5, 3.5, 7, 3.5),
            Block.box(12.5, 5, 0.5, 15.5, 7, 3.5),
            Block.box(12.5, 5, 12.5, 15.5, 7, 15.5),
            Block.box(12.5, -0.01, 0.5, 15.5, 1.99, 3.5),
            Block.box(0.5, -0.01, 0.5, 3.5, 1.99, 3.5),
            Block.box(0.5, -0.01, 12.5, 3.5, 1.99, 15.5),
            Block.box(12.5, -0.01, 12.5, 15.5, 1.99, 15.5)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape CRYSTAL_CLUSTER_SHAPE = Stream.of(Block.box(5, 4, 5, 10, 19, 10), Block.box(4, 0, 4, 11, 5, 11), Block.box(3, 0, 3, 5, 4, 5), Block.box(10, 0, 3, 12, 2, 5), Block.box(12, 0, 4, 13, 1, 5), Block.box(11, 0, 5, 12, 1, 6), Block.box(10, 0, 10, 12, 3, 12), Block.box(3, 0, 10, 5, 1, 12), Block.box(9, 0, 3, 10, 3, 4), Block.box(8, 0, 2, 11, 1, 4), Block.box(4, 0, 2, 5, 2, 3), Block.box(5, 0, 3, 7, 1, 4), Block.box(2, 0, 4, 4, 1, 6), Block.box(3, 0, 5, 4, 3, 6.5), Block.box(3, 0, 9, 4, 2, 10), Block.box(2, 0, 8, 4, 1, 10), Block.box(5, 0, 11, 7, 2, 13), Block.box(7, 0, 11, 11, 1, 13), Block.box(10, 0, 9, 13, 1, 11), Block.box(11, 0, 7, 12, 3, 9)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape DISPLAY_STAND_SHAPE = Stream.of(
            Block.box(1, 7, 0, 15, 8, 1),
            Block.box(0, 0, 0, 16, 1, 16),
            Block.box(1, 1, 1, 15, 7, 15),
            Block.box(6, 7, 6, 10, 9, 10),
            Block.box(0, 1, 0, 1, 7, 1),
            Block.box(15, 1, 0, 16, 7, 1),
            Block.box(15, 1, 15, 16, 7, 16),
            Block.box(0, 1, 15, 1, 7, 16),
            Block.box(0, 7, 0, 1, 8, 16),
            Block.box(15, 7, 0, 16, 8, 16),
            Block.box(1, 7, 15, 15, 8, 16),
            Block.box(5, 7, 5, 6, 9, 6),
            Block.box(5, 7, 10, 6, 9, 11),
            Block.box(10, 7, 10, 11, 9, 11),
            Block.box(10, 7, 5, 11, 9, 6)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape BATBOX_SHAPE = Stream.of(
            Block.box(0, 0, 0, 16, 1, 16),
            Block.box(2, 2, 2, 14, 5, 14),
            Block.box(1, 1, 14, 2, 6, 15),
            Block.box(14, 1, 14, 15, 6, 15),
            Block.box(1, 1, 1, 2, 6, 2),
            Block.box(14, 1, 1, 15, 6, 2),
            Block.box(1, 5, 2, 2, 6, 14),
            Block.box(14, 1, 2, 15, 2, 14),
            Block.box(14, 5, 2, 15, 6, 14),
            Block.box(1, 1, 2, 2, 2, 14),
            Block.box(2, 5, 14, 14, 6, 15),
            Block.box(2, 1, 1, 14, 2, 2),
            Block.box(2, 5, 1, 14, 6, 2),
            Block.box(2, 1, 14, 14, 2, 15),
            Block.box(5, 5, 5, 11, 7, 11)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape EMPOWERER_SHAPE = Stream.of(
            Block.box(0, 1, 15, 1, 7, 16),
            Block.box(0, 0, 0, 16, 1, 16),
            Block.box(1, 1, 1, 15, 6, 15),
            Block.box(1, 6, 1, 15, 7, 15),
            Block.box(0, 7, 0, 16, 8, 1),
            Block.box(0, 7, 15, 16, 8, 16),
            Block.box(0, 7, 1, 1, 8, 15),
            Block.box(15, 7, 1, 16, 8, 15),
            Block.box(4, 7, 4, 12, 9, 12),
            Block.box(0, 1, 0, 1, 7, 1),
            Block.box(15, 1, 0, 16, 7, 1),
            Block.box(15, 1, 15, 16, 7, 16),
            Block.box(3, 7, 4, 4, 9, 5),
            Block.box(3, 7, 11, 4, 9, 12),
            Block.box(4, 7, 12, 5, 9, 13),
            Block.box(11, 7, 12, 12, 9, 13),
            Block.box(12, 7, 11, 13, 9, 12),
            Block.box(12, 7, 4, 13, 9, 5),
            Block.box(11, 7, 3, 12, 9, 4),
            Block.box(4, 7, 3, 5, 9, 4)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape ENERGIZER_SHAPE = Stream.of(
            Block.box(0, 1, 15, 1, 15, 16),
            Block.box(0, 15, 0, 1, 16, 16),
            Block.box(15, 15, 0, 16, 16, 16),
            Block.box(1, 15, 0, 15, 16, 1),
            Block.box(1, 15, 15, 15, 16, 16),
            Block.box(1, 0, 15, 15, 1, 16),
            Block.box(1, 0, 0, 15, 1, 1),
            Block.box(15, 0, 0, 16, 1, 16),
            Block.box(0, 0, 0, 1, 1, 16),
            Block.box(15, 1, 15, 16, 15, 16),
            Block.box(15, 1, 0, 16, 15, 1),
            Block.box(0, 1, 0, 1, 15, 1),
            Block.box(1, 14, 1, 15, 15, 15),
            Block.box(1, 0, 1, 15, 2, 15),
            Block.box(14, 2, 1, 15, 14, 15),
            Block.box(1, 2, 1, 2, 14, 15),
            Block.box(2, 2, 14, 14, 14, 15),
            Block.box(2, 2, 1, 14, 14, 2),
            Block.box(10, 15, 5, 13, 16, 7)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape ENERVATOR_SHAPE = Stream.of(
            Block.box(0, 0, 0, 1, 1, 16),
            Block.box(0, 15, 0, 1, 16, 16),
            Block.box(15, 15, 0, 16, 16, 16),
            Block.box(1, 15, 0, 15, 16, 1),
            Block.box(1, 15, 15, 15, 16, 16),
            Block.box(1, 0, 15, 15, 1, 16),
            Block.box(1, 0, 0, 15, 1, 1),
            Block.box(15, 0, 0, 16, 1, 16),
            Block.box(0, 1, 15, 1, 15, 16),
            Block.box(15, 1, 15, 16, 15, 16),
            Block.box(15, 1, 0, 16, 15, 1),
            Block.box(0, 1, 0, 1, 15, 1),
            Block.box(1, 14, 1, 15, 15, 15),
            Block.box(1, 0, 1, 15, 2, 15),
            Block.box(14, 2, 1, 15, 14, 15),
            Block.box(1, 2, 1, 2, 14, 15),
            Block.box(2, 2, 14, 14, 14, 15),
            Block.box(2, 2, 1, 14, 14, 2),
            Block.box(10, 15, 9, 13, 16, 11)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape BARREL_SHAPE = Stream.of(
            Block.box(2, 1, 1, 14, 15, 2),
            Block.box(2, 1, 14, 14, 15, 15),
            Block.box(2, 0, 2, 14, 1, 14),
            Block.box(2, 13, 2, 14, 14, 14),
            Block.box(1, 1, 2, 2, 15, 14),
            Block.box(14, 1, 2, 15, 15, 14)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape FIREWORKS_BOX_SHAPE = Stream.of(
            Block.box(0, 0, 0, 1, 1, 16),
            Block.box(1, 0, 15, 15, 1, 16),
            Block.box(15, 0, 0, 16, 1, 16),
            Block.box(1, 0, 0, 15, 1, 1),
            Block.box(0, 15, 0, 1, 16, 16),
            Block.box(15, 15, 0, 16, 16, 16),
            Block.box(1, 15, 0, 15, 16, 1),
            Block.box(1, 15, 15, 15, 16, 16),
            Block.box(0, 1, 15, 1, 15, 16),
            Block.box(15, 1, 15, 16, 15, 16),
            Block.box(15, 1, 0, 16, 15, 1),
            Block.box(0, 1, 0, 1, 15, 1),
            Block.box(4, 15, 4, 6, 16, 6),
            Block.box(1, 0, 1, 15, 15, 15),
            Block.box(7, 15, 4, 9, 16, 6),
            Block.box(10, 15, 4, 12, 16, 6),
            Block.box(10, 15, 7, 12, 16, 9),
            Block.box(7, 15, 7, 9, 16, 9),
            Block.box(4, 15, 7, 6, 16, 9),
            Block.box(4, 15, 10, 6, 16, 12),
            Block.box(7, 15, 10, 9, 16, 12),
            Block.box(10, 15, 10, 12, 16, 12)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape GLASS_SHAPE = Stream.of(Block.box(15, 0, 1, 16, 1, 15), Block.box(1, 1, 1, 15, 15, 15), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 0, 15, 16, 1, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 0, 1, 1, 1, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape HEAT_COLLECTOR_SHAPE = Stream.of(
            Block.box(15, 4, 4, 16, 5, 12),
            Block.box(0, 0, 0, 1, 1, 16),
            Block.box(1, 0, 15, 15, 1, 16),
            Block.box(15, 0, 0, 16, 1, 16),
            Block.box(1, 0, 0, 15, 1, 1),
            Block.box(0, 15, 0, 1, 16, 16),
            Block.box(15, 15, 0, 16, 16, 16),
            Block.box(1, 15, 0, 15, 16, 1),
            Block.box(1, 15, 15, 15, 16, 16),
            Block.box(0, 1, 15, 1, 15, 16),
            Block.box(15, 1, 15, 16, 15, 16),
            Block.box(15, 1, 0, 16, 15, 1),
            Block.box(0, 1, 0, 1, 15, 1),
            Block.box(4, 13, 4, 12, 14, 12),
            Block.box(15, 10, 4, 16, 11, 12),
            Block.box(15, 6, 4, 16, 7, 12),
            Block.box(15, 8, 4, 16, 9, 12),
            Block.box(4, 10, 15, 12, 11, 16),
            Block.box(4, 8, 15, 12, 9, 16),
            Block.box(4, 6, 15, 12, 7, 16),
            Block.box(4, 4, 15, 12, 5, 16),
            Block.box(0, 10, 4, 1, 11, 12),
            Block.box(0, 4, 4, 1, 5, 12),
            Block.box(0, 6, 4, 1, 7, 12),
            Block.box(0, 8, 4, 1, 9, 12),
            Block.box(4, 10, 0, 12, 11, 1),
            Block.box(4, 8, 0, 12, 9, 1),
            Block.box(4, 6, 0, 12, 7, 1),
            Block.box(4, 4, 0, 12, 5, 1),
            Block.box(2, 14, 2, 5, 15, 14),
            Block.box(5, 14, 2, 11, 15, 5),
            Block.box(5, 14, 11, 11, 15, 14),
            Block.box(11, 14, 2, 14, 15, 14),
            Block.box(2, 0, 2, 14, 1, 14),
            Block.box(1, 0, 2, 2, 15, 14),
            Block.box(14, 0, 2, 15, 15, 14),
            Block.box(1, 0, 1, 15, 15, 2),
            Block.box(1, 0, 14, 15, 15, 15)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape ITEM_VIEWER_SHAPE = Stream.of(Block.box(15, 0, 1, 16, 1, 15), Block.box(1, 1, 1, 15, 15, 15), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 0, 15, 16, 1, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 0, 1, 1, 1, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape HOPPING_ITEM_VIEWER_SHAPE = Stream.of(Block.box(0, 10, 0, 16, 11, 16), Block.box(1, 11, 1, 2, 15, 15), Block.box(14, 11, 1, 15, 15, 15), Block.box(2, 11, 1, 14, 15, 2), Block.box(2, 11, 14, 14, 15, 15), Block.box(4, 4, 4, 12, 10, 12), Block.box(6, 0, 6, 10, 4, 10), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(15, 15, 1, 16, 16, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(0, 11, 0, 1, 15, 1), Block.box(0, 11, 15, 1, 15, 16), Block.box(15, 11, 15, 16, 15, 16), Block.box(15, 11, 0, 16, 15, 1)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape BOOSTER_SHAPE = Stream.of(Block.box(5, 12, 12, 11, 13, 13), Block.box(6, 0, 6, 10, 16, 10), Block.box(5, 2, 5, 11, 3, 11), Block.box(5, 4, 12, 11, 5, 13), Block.box(5, 6, 12, 11, 7, 13), Block.box(5, 8, 12, 11, 9, 13), Block.box(5, 10, 12, 11, 11, 13), Block.box(5, 4, 3, 11, 5, 4), Block.box(5, 6, 3, 11, 7, 4), Block.box(5, 8, 3, 11, 9, 4), Block.box(5, 10, 3, 11, 11, 4), Block.box(5, 12, 3, 11, 13, 4), Block.box(3, 4, 5, 4, 5, 11), Block.box(3, 6, 5, 4, 7, 11), Block.box(3, 8, 5, 4, 9, 11), Block.box(3, 10, 5, 4, 11, 11), Block.box(3, 12, 5, 4, 13, 11), Block.box(12, 4, 5, 13, 5, 11), Block.box(12, 6, 5, 13, 7, 11), Block.box(12, 8, 5, 13, 9, 11), Block.box(12, 10, 5, 13, 11, 11), Block.box(12, 12, 5, 13, 13, 11), Block.box(5, 14, 5, 11, 15, 11), Block.box(4, 4, 11, 5, 5, 12), Block.box(4, 6, 11, 5, 7, 12), Block.box(4, 8, 11, 5, 9, 12), Block.box(4, 10, 11, 5, 11, 12), Block.box(4, 12, 11, 5, 13, 12), Block.box(4, 4, 4, 5, 5, 5), Block.box(4, 6, 4, 5, 7, 5), Block.box(4, 8, 4, 5, 9, 5), Block.box(4, 10, 4, 5, 11, 5), Block.box(4, 12, 4, 5, 13, 5), Block.box(11, 4, 4, 12, 5, 5), Block.box(11, 6, 4, 12, 7, 5), Block.box(11, 8, 4, 12, 9, 5), Block.box(11, 10, 4, 12, 11, 5), Block.box(11, 12, 4, 12, 13, 5), Block.box(11, 4, 11, 12, 5, 12), Block.box(11, 6, 11, 12, 7, 12), Block.box(11, 8, 11, 12, 9, 12), Block.box(11, 10, 11, 12, 11, 12), Block.box(11, 12, 11, 12, 13, 12)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape PLAYER_INTERFACE_SHAPE = Stream.of(Block.box(15, 0, 1, 16, 1, 15), Block.box(1, 1, 1, 15, 15, 15), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 0, 15, 16, 1, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 0, 1, 1, 1, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape COLLECTOR_SHAPE = Stream.of(Block.box(0, 0, 0, 1, 1, 16), Block.box(1, 0, 15, 15, 1, 16), Block.box(15, 0, 0, 16, 1, 16), Block.box(1, 0, 0, 15, 1, 1), Block.box(0, 15, 0, 1, 16, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 15, 15, 15, 16, 16), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(1, 1, 4, 2, 4, 12), Block.box(14, 1, 4, 15, 4, 12), Block.box(4, 1, 1, 12, 4, 2), Block.box(4, 1, 14, 12, 4, 15), Block.box(4, 14, 12, 12, 15, 14), Block.box(1, 12, 4, 2, 15, 12), Block.box(14, 12, 4, 15, 15, 12), Block.box(4, 12, 1, 12, 15, 2), Block.box(4, 12, 14, 12, 15, 15), Block.box(4, 14, 2, 12, 15, 4), Block.box(1, 1, 12, 2, 15, 14), Block.box(14, 1, 2, 15, 15, 4), Block.box(1, 1, 1, 4, 15, 2), Block.box(12, 1, 14, 15, 15, 15), Block.box(12, 14, 2, 14, 15, 14), Block.box(1, 1, 2, 2, 15, 4), Block.box(14, 1, 12, 15, 15, 14), Block.box(12, 1, 1, 15, 15, 2), Block.box(1, 1, 14, 4, 15, 15), Block.box(2, 14, 2, 4, 15, 14), Block.box(2, 2, 2, 14, 14, 14), Block.box(1, 0, 1, 15, 1, 15)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape SUPPRESSOR_SHAPE = Stream.of(Block.box(15, 15, 0, 16, 16, 16), Block.box(0, 0, 0, 1, 1, 16), Block.box(1, 0, 15, 15, 1, 16), Block.box(15, 0, 0, 16, 1, 16), Block.box(1, 0, 0, 15, 1, 1), Block.box(0, 15, 0, 1, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 15, 15, 15, 16, 16), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(1, 14, 1, 15, 15, 15), Block.box(1, 1, 1, 15, 2, 15), Block.box(9, 13, 9, 13, 16, 13), Block.box(9, 2, 9, 13, 3, 13), Block.box(3, 13, 9, 7, 16, 13), Block.box(3, 2, 9, 7, 3, 13), Block.box(9, 13, 3, 13, 16, 7), Block.box(9, 2, 3, 13, 3, 7), Block.box(3, 13, 3, 7, 16, 7), Block.box(3, 2, 3, 7, 3, 7), Block.box(4, 3, 10, 6, 13, 12), Block.box(10, 3, 10, 12, 13, 12), Block.box(10, 3, 4, 12, 13, 6), Block.box(4, 3, 4, 6, 13, 6)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    static final VoxelShape RELAY_SHAPE = Stream.of(Block.box(6, 4, 6, 7, 6, 7), Block.box(1, 0, 1, 15, 1, 15), Block.box(4, 2, 4, 12, 4, 12), Block.box(9, 4, 9, 10, 6, 10), Block.box(6, 4, 9, 7, 6, 10), Block.box(3, 1, 12, 4, 5, 13), Block.box(12, 1, 12, 13, 5, 13), Block.box(3, 1, 3, 4, 5, 4), Block.box(12, 1, 3, 13, 5, 4), Block.box(3, 4, 4, 4, 5, 12), Block.box(3, 1, 4, 4, 2, 12), Block.box(12, 4, 4, 13, 5, 12), Block.box(12, 1, 4, 13, 2, 12), Block.box(4, 4, 12, 12, 5, 13), Block.box(4, 4, 3, 12, 5, 4), Block.box(4, 1, 12, 12, 2, 13), Block.box(4, 1, 3, 12, 2, 4), Block.box(9, 4, 6, 10, 6, 7), Block.box(7, 4, 7, 9, 6, 9), Block.box(7, 6, 7, 9, 10, 9), Block.box(6.5, 5, 7, 7, 6, 9), Block.box(6.5, 7, 7, 7, 7.5, 9), Block.box(6.5, 9, 7, 7, 9.5, 9), Block.box(9, 5, 7, 9.5, 6, 9), Block.box(9, 7, 7, 9.5, 7.5, 9), Block.box(9, 9, 7, 9.5, 9.5, 9), Block.box(7, 5, 6.5, 9, 6, 7), Block.box(7, 7, 6.5, 9, 7.5, 7), Block.box(7, 9, 6.5, 9, 9.5, 7), Block.box(7, 5, 9, 9, 6, 9.5), Block.box(7, 7, 9, 9, 7.5, 9.5), Block.box(7, 9, 9, 9, 9.5, 9.5)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    static final class CoalGeneratorShapes {
        static final VoxelShape NORTH = Stream.of(Block.box(0, 15, 0, 1, 16, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 15, 15, 15, 16, 16), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(2, 0, 2, 14, 1, 14), Block.box(5, 14, 6, 11, 15, 7), Block.box(5, 14, 8, 11, 15, 9), Block.box(5, 14, 10, 11, 15, 14), Block.box(5, 14, 2, 11, 15, 5), Block.box(11, 14, 2, 14, 15, 14), Block.box(2, 14, 2, 5, 15, 14), Block.box(1, 0, 2, 2, 15, 14), Block.box(14, 0, 2, 15, 15, 14), Block.box(1, 0, 14, 15, 15, 15), Block.box(3, 11, 0, 13, 12, 1), Block.box(5, 3, 1, 6, 8, 2), Block.box(10, 3, 1, 11, 8, 2), Block.box(3, 8, 1, 13, 15, 2), Block.box(3, 0, 1, 13, 3, 2), Block.box(1, 0, 1, 3, 15, 2), Block.box(13, 0, 1, 15, 15, 2), Block.box(5, 13, 5, 11, 14, 10), Block.box(2, 3, 2, 14, 8, 3), Block.box(0, 0, 15, 1, 1, 16), Block.box(15, 0, 15, 16, 1, 16), Block.box(15, 0, 0, 16, 1, 1), Block.box(0, 0, 0, 1, 1, 1)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape EAST = Stream.of(Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(15, 15, 1, 16, 16, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(2, 0, 2, 14, 1, 14), Block.box(9, 14, 5, 10, 15, 11), Block.box(7, 14, 5, 8, 15, 11), Block.box(2, 14, 5, 6, 15, 11), Block.box(11, 14, 5, 14, 15, 11), Block.box(2, 14, 11, 14, 15, 14), Block.box(2, 14, 2, 14, 15, 5), Block.box(2, 0, 1, 14, 15, 2), Block.box(2, 0, 14, 14, 15, 15), Block.box(1, 0, 1, 2, 15, 15), Block.box(15, 11, 3, 16, 12, 13), Block.box(14, 3, 5, 15, 8, 6), Block.box(14, 3, 10, 15, 8, 11), Block.box(14, 8, 3, 15, 15, 13), Block.box(14, 0, 3, 15, 3, 13), Block.box(14, 0, 1, 15, 15, 3), Block.box(14, 0, 13, 15, 15, 15), Block.box(6, 13, 5, 11, 14, 11), Block.box(13, 3, 2, 14, 8, 14), Block.box(0, 0, 0, 1, 1, 1), Block.box(0, 0, 15, 1, 1, 16), Block.box(15, 0, 15, 16, 1, 16), Block.box(15, 0, 0, 16, 1, 1)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SOUTH = Stream.of(Block.box(15, 15, 0, 16, 16, 16), Block.box(0, 15, 0, 1, 16, 16), Block.box(1, 15, 15, 15, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(2, 0, 2, 14, 1, 14), Block.box(5, 14, 9, 11, 15, 10), Block.box(5, 14, 7, 11, 15, 8), Block.box(5, 14, 2, 11, 15, 6), Block.box(5, 14, 11, 11, 15, 14), Block.box(2, 14, 2, 5, 15, 14), Block.box(11, 14, 2, 14, 15, 14), Block.box(14, 0, 2, 15, 15, 14), Block.box(1, 0, 2, 2, 15, 14), Block.box(1, 0, 1, 15, 15, 2), Block.box(3, 11, 15, 13, 12, 16), Block.box(10, 3, 14, 11, 8, 15), Block.box(5, 3, 14, 6, 8, 15), Block.box(3, 8, 14, 13, 15, 15), Block.box(3, 0, 14, 13, 3, 15), Block.box(13, 0, 14, 15, 15, 15), Block.box(1, 0, 14, 3, 15, 15), Block.box(5, 13, 6, 11, 14, 11), Block.box(2, 3, 13, 14, 8, 14), Block.box(15, 0, 0, 16, 1, 1), Block.box(0, 0, 0, 1, 1, 1), Block.box(0, 0, 15, 1, 1, 16), Block.box(15, 0, 15, 16, 1, 16)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape WEST = Stream.of(Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 1, 1, 16, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(2, 0, 2, 14, 1, 14), Block.box(6, 14, 5, 7, 15, 11), Block.box(8, 14, 5, 9, 15, 11), Block.box(10, 14, 5, 14, 15, 11), Block.box(2, 14, 5, 5, 15, 11), Block.box(2, 14, 2, 14, 15, 5), Block.box(2, 14, 11, 14, 15, 14), Block.box(2, 0, 14, 14, 15, 15), Block.box(2, 0, 1, 14, 15, 2), Block.box(14, 0, 1, 15, 15, 15), Block.box(0, 11, 3, 1, 12, 13), Block.box(1, 3, 10, 2, 8, 11), Block.box(1, 3, 5, 2, 8, 6), Block.box(1, 8, 3, 2, 15, 13), Block.box(1, 0, 3, 2, 3, 13), Block.box(1, 0, 13, 2, 15, 15), Block.box(1, 0, 1, 2, 15, 3), Block.box(5, 13, 5, 10, 14, 11), Block.box(2, 3, 2, 3, 8, 14), Block.box(15, 0, 15, 16, 1, 16), Block.box(15, 0, 0, 16, 1, 1), Block.box(0, 0, 0, 1, 1, 1), Block.box(0, 0, 15, 1, 1, 16)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }

    static class CoffeeMachineShapes {
        static final VoxelShape NORTH = Stream.of(
                Block.box(13, 2, 4, 14, 3, 5),
                Block.box(1, 0, 1, 15, 1, 15),
                Block.box(7, 1, 8, 14, 9, 14),
                Block.box(6, 9, 3, 15, 11, 15),
                Block.box(8, 11, 8, 13, 13, 13),
                Block.box(10, 8, 4, 11, 9, 5),
                Block.box(12, 2, 2, 13, 7, 7),
                Block.box(13, 11, 7, 14, 14, 14),
                Block.box(8, 11, 7, 13, 14, 8),
                Block.box(14, 1, 7, 15, 9, 8),
                Block.box(3, 3, 10, 4, 5, 11),
                Block.box(3, 2, 10, 7, 3, 11),
                Block.box(3, 3, 12, 4, 5, 13),
                Block.box(2, 5, 9, 5, 11, 14),
                Block.box(2, 11, 11, 4, 12, 13),
                Block.box(1, 1, 11, 2, 12, 13),
                Block.box(9, 2, 6, 12, 7, 7),
                Block.box(8, 1, 2, 13, 2, 7),
                Block.box(13, 5, 4, 14, 6, 5),
                Block.box(14, 2, 4, 15, 6, 5),
                Block.box(7, 11, 7, 8, 14, 14),
                Block.box(8, 11, 13, 13, 14, 14),
                Block.box(14, 1, 14, 15, 9, 15),
                Block.box(6, 1, 14, 7, 9, 15),
                Block.box(6, 1, 7, 7, 9, 8),
                Block.box(3, 2, 12, 7, 3, 13),
                Block.box(8, 2, 2, 9, 7, 7),
                Block.box(9, 2, 2, 12, 7, 3)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape EAST = Stream.of(
                Block.box(11, 2, 13, 12, 3, 14),
                Block.box(1, 0, 1, 15, 1, 15),
                Block.box(2, 1, 7, 8, 9, 14),
                Block.box(1, 9, 6, 13, 11, 15),
                Block.box(3, 11, 8, 8, 13, 13),
                Block.box(11, 8, 10, 12, 9, 11),
                Block.box(9, 2, 12, 14, 7, 13),
                Block.box(2, 11, 13, 9, 14, 14),
                Block.box(8, 11, 8, 9, 14, 13),
                Block.box(8, 1, 14, 9, 9, 15),
                Block.box(5, 3, 3, 6, 5, 4),
                Block.box(5, 2, 3, 6, 3, 7),
                Block.box(3, 3, 3, 4, 5, 4),
                Block.box(2, 5, 2, 7, 11, 5),
                Block.box(3, 11, 2, 5, 12, 4),
                Block.box(3, 1, 1, 5, 12, 2),
                Block.box(9, 2, 9, 10, 7, 12),
                Block.box(9, 1, 8, 14, 2, 13),
                Block.box(11, 5, 13, 12, 6, 14),
                Block.box(11, 2, 14, 12, 6, 15),
                Block.box(2, 11, 7, 9, 14, 8),
                Block.box(2, 11, 8, 3, 14, 13),
                Block.box(1, 1, 14, 2, 9, 15),
                Block.box(1, 1, 6, 2, 9, 7),
                Block.box(8, 1, 6, 9, 9, 7),
                Block.box(3, 2, 3, 4, 3, 7),
                Block.box(9, 2, 8, 14, 7, 9),
                Block.box(13, 2, 9, 14, 7, 12)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SOUTH = Stream.of(
                Block.box(2, 2, 11, 3, 3, 12),
                Block.box(1, 0, 1, 15, 1, 15),
                Block.box(2, 1, 2, 9, 9, 8),
                Block.box(1, 9, 1, 10, 11, 13),
                Block.box(3, 11, 3, 8, 13, 8),
                Block.box(5, 8, 11, 6, 9, 12),
                Block.box(3, 2, 9, 4, 7, 14),
                Block.box(2, 11, 2, 3, 14, 9),
                Block.box(3, 11, 8, 8, 14, 9),
                Block.box(1, 1, 8, 2, 9, 9),
                Block.box(12, 3, 5, 13, 5, 6),
                Block.box(9, 2, 5, 13, 3, 6),
                Block.box(12, 3, 3, 13, 5, 4),
                Block.box(11, 5, 2, 14, 11, 7),
                Block.box(12, 11, 3, 14, 12, 5),
                Block.box(14, 1, 3, 15, 12, 5),
                Block.box(4, 2, 9, 7, 7, 10),
                Block.box(3, 1, 9, 8, 2, 14),
                Block.box(2, 5, 11, 3, 6, 12),
                Block.box(1, 2, 11, 2, 6, 12),
                Block.box(8, 11, 2, 9, 14, 9),
                Block.box(3, 11, 2, 8, 14, 3),
                Block.box(1, 1, 1, 2, 9, 2),
                Block.box(9, 1, 1, 10, 9, 2),
                Block.box(9, 1, 8, 10, 9, 9),
                Block.box(9, 2, 3, 13, 3, 4),
                Block.box(7, 2, 9, 8, 7, 14),
                Block.box(4, 2, 13, 7, 7, 14)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape WEST = Stream.of(
                Block.box(4, 2, 2, 5, 3, 3),
                Block.box(1, 0, 1, 15, 1, 15),
                Block.box(8, 1, 2, 14, 9, 9),
                Block.box(3, 9, 1, 15, 11, 10),
                Block.box(8, 11, 3, 13, 13, 8),
                Block.box(4, 8, 5, 5, 9, 6),
                Block.box(2, 2, 3, 7, 7, 4),
                Block.box(7, 11, 2, 14, 14, 3),
                Block.box(7, 11, 3, 8, 14, 8),
                Block.box(7, 1, 1, 8, 9, 2),
                Block.box(10, 3, 12, 11, 5, 13),
                Block.box(10, 2, 9, 11, 3, 13),
                Block.box(12, 3, 12, 13, 5, 13),
                Block.box(9, 5, 11, 14, 11, 14),
                Block.box(11, 11, 12, 13, 12, 14),
                Block.box(11, 1, 14, 13, 12, 15),
                Block.box(6, 2, 4, 7, 7, 7),
                Block.box(2, 1, 3, 7, 2, 8),
                Block.box(4, 5, 2, 5, 6, 3),
                Block.box(4, 2, 1, 5, 6, 2),
                Block.box(7, 11, 8, 14, 14, 9),
                Block.box(13, 11, 3, 14, 14, 8),
                Block.box(14, 1, 1, 15, 9, 2),
                Block.box(14, 1, 9, 15, 9, 10),
                Block.box(7, 1, 9, 8, 9, 10),
                Block.box(12, 2, 9, 13, 3, 13),
                Block.box(2, 2, 7, 7, 7, 8),
                Block.box(2, 2, 4, 3, 7, 7)
                ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }

    // TODO (Rid): Add Shape
    static class BlockBreakerShapes {
        static final VoxelShape SHAPE_U = Stream.of(Block.box(1, 1, 1, 15, 15, 15), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 0, 15, 16, 1, 16), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(0, 1, 0, 1, 15, 1), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 15, 1, 1, 16, 15), Block.box(0, 0, 1, 1, 1, 15), Block.box(15, 0, 1, 16, 1, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 3, 9, 16, 13, 13), Block.box(15, 3, 3, 16, 13, 7), Block.box(0, 3, 9, 1, 13, 13), Block.box(0, 3, 3, 1, 13, 7), Block.box(5, 15, 5, 11, 16, 11), Block.box(3, 15, 6, 5, 16, 10), Block.box(11, 15, 6, 13, 16, 10)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_D = Stream.of(Block.box(1, 1, 1, 15, 15, 15), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 0, 15, 16, 1, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(15, 1, 15, 16, 15, 16), Block.box(0, 0, 1, 1, 1, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 0, 1, 16, 1, 15), Block.box(15, 3, 3, 16, 13, 7), Block.box(15, 3, 9, 16, 13, 13), Block.box(0, 3, 3, 1, 13, 7), Block.box(0, 3, 9, 1, 13, 13), Block.box(5, 0, 5, 11, 1, 11), Block.box(3, 0, 6, 5, 1, 10), Block.box(11, 0, 6, 13, 1, 10)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_N = Stream.of(Block.box(1, 1, 1, 15, 15, 15), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 0, 15, 16, 1, 16), Block.box(0, 15, 1, 1, 16, 15), Block.box(0, 0, 1, 1, 1, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 0, 1, 16, 1, 15), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(15, 9, 3, 16, 13, 13), Block.box(15, 3, 3, 16, 7, 13), Block.box(0, 9, 3, 1, 13, 13), Block.box(0, 3, 3, 1, 7, 13), Block.box(5, 5, 0, 11, 11, 1), Block.box(3, 6, 0, 5, 10, 1), Block.box(11, 6, 0, 13, 10, 1)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_E = Stream.of(Block.box(1, 1, 1, 15, 15, 15), Block.box(15, 15, 0, 16, 16, 16), Block.box(15, 0, 0, 16, 1, 16), Block.box(0, 15, 0, 1, 16, 16), Block.box(0, 0, 0, 1, 1, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 0, 0, 15, 1, 1), Block.box(1, 15, 15, 15, 16, 16), Block.box(1, 0, 15, 15, 1, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(3, 9, 15, 13, 13, 16), Block.box(3, 3, 15, 13, 7, 16), Block.box(3, 9, 0, 13, 13, 1), Block.box(3, 3, 0, 13, 7, 1), Block.box(15, 5, 5, 16, 11, 11), Block.box(15, 6, 3, 16, 10, 5), Block.box(15, 6, 11, 16, 10, 13)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_S = Stream.of(Block.box(1, 1, 1, 15, 15, 15), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 0, 15, 16, 1, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 0, 0, 16, 1, 1), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 0, 1, 16, 1, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(0, 0, 1, 1, 1, 15), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(0, 9, 3, 1, 13, 13), Block.box(0, 3, 3, 1, 7, 13), Block.box(15, 9, 3, 16, 13, 13), Block.box(15, 3, 3, 16, 7, 13), Block.box(5, 5, 15, 11, 11, 16), Block.box(11, 6, 15, 13, 10, 16), Block.box(3, 6, 15, 5, 10, 16)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_W = Stream.of(Block.box(1, 1, 1, 15, 15, 15), Block.box(0, 15, 0, 1, 16, 16), Block.box(0, 0, 0, 1, 1, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(15, 0, 0, 16, 1, 16), Block.box(1, 15, 15, 15, 16, 16), Block.box(1, 0, 15, 15, 1, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 0, 0, 15, 1, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(3, 9, 0, 13, 13, 1), Block.box(3, 3, 0, 13, 7, 1), Block.box(3, 9, 15, 13, 13, 16), Block.box(3, 3, 15, 13, 7, 16), Block.box(0, 5, 5, 1, 11, 11), Block.box(0, 6, 11, 1, 10, 13), Block.box(0, 6, 3, 1, 10, 5)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }

    static class FarmerShapes {
        static final VoxelShape SHAPE_N = Stream.of(Block.box(11, 14, 4, 12, 15, 5), Block.box(0, 0, 0, 1, 1, 16), Block.box(1, 0, 15, 15, 1, 16), Block.box(15, 0, 0, 16, 1, 16), Block.box(1, 0, 0, 15, 1, 1), Block.box(0, 15, 0, 1, 16, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 15, 15, 15, 16, 16), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(4, 11, 4, 12, 12, 12), Block.box(4, 14, 4, 5, 15, 5), Block.box(3, 12, 5, 4, 14, 11), Block.box(12, 12, 5, 13, 14, 11), Block.box(5, 12, 3, 11, 14, 4), Block.box(5, 12, 12, 11, 14, 13), Block.box(11, 12, 11, 12, 14, 12), Block.box(11, 12, 4, 12, 14, 5), Block.box(4, 12, 4, 5, 14, 5), Block.box(4, 12, 11, 5, 14, 12), Block.box(4, 14, 11, 5, 15, 12), Block.box(11, 14, 11, 12, 15, 12), Block.box(2, 14, 2, 4, 15, 14), Block.box(4, 14, 2, 12, 15, 4), Block.box(4, 14, 12, 12, 15, 14), Block.box(12, 14, 2, 14, 15, 14), Block.box(2, 0, 2, 14, 1, 14), Block.box(1, 0, 2, 2, 15, 14), Block.box(14, 0, 2, 15, 15, 14), Block.box(1, 0, 1, 5, 15, 2), Block.box(5, 5, 2, 11, 11, 3), Block.box(5, 0, 1, 11, 5, 2), Block.box(5, 11, 1, 11, 15, 2), Block.box(11, 0, 1, 15, 15, 2), Block.box(1, 0, 14, 15, 15, 15)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_E = Stream.of(Block.box(11, 14, 11, 12, 15, 12), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 0, 1, 1, 1, 15), Block.box(0, 0, 15, 16, 1, 16), Block.box(15, 0, 1, 16, 1, 15), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(15, 15, 1, 16, 16, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(4, 11, 4, 12, 12, 12), Block.box(11, 14, 4, 12, 15, 5), Block.box(5, 12, 3, 11, 14, 4), Block.box(5, 12, 12, 11, 14, 13), Block.box(12, 12, 5, 13, 14, 11), Block.box(3, 12, 5, 4, 14, 11), Block.box(4, 12, 11, 5, 14, 12), Block.box(11, 12, 11, 12, 14, 12), Block.box(11, 12, 4, 12, 14, 5), Block.box(4, 12, 4, 5, 14, 5), Block.box(4, 14, 4, 5, 15, 5), Block.box(4, 14, 11, 5, 15, 12), Block.box(2, 14, 2, 14, 15, 4), Block.box(12, 14, 4, 14, 15, 12), Block.box(2, 14, 4, 4, 15, 12), Block.box(2, 14, 12, 14, 15, 14), Block.box(2, 0, 2, 14, 1, 14), Block.box(2, 0, 1, 14, 15, 2), Block.box(2, 0, 14, 14, 15, 15), Block.box(14, 0, 1, 15, 15, 5), Block.box(13, 5, 5, 14, 11, 11), Block.box(14, 0, 5, 15, 5, 11), Block.box(14, 11, 5, 15, 15, 11), Block.box(14, 0, 11, 15, 15, 15), Block.box(1, 0, 1, 2, 15, 15)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_S = Stream.of(Block.box(4, 14, 11, 5, 15, 12), Block.box(15, 0, 0, 16, 1, 16), Block.box(1, 0, 0, 15, 1, 1), Block.box(0, 0, 0, 1, 1, 16), Block.box(1, 0, 15, 15, 1, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(0, 15, 0, 1, 16, 16), Block.box(1, 15, 15, 15, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(4, 11, 4, 12, 12, 12), Block.box(11, 14, 11, 12, 15, 12), Block.box(12, 12, 5, 13, 14, 11), Block.box(3, 12, 5, 4, 14, 11), Block.box(5, 12, 12, 11, 14, 13), Block.box(5, 12, 3, 11, 14, 4), Block.box(4, 12, 4, 5, 14, 5), Block.box(4, 12, 11, 5, 14, 12), Block.box(11, 12, 11, 12, 14, 12), Block.box(11, 12, 4, 12, 14, 5), Block.box(11, 14, 4, 12, 15, 5), Block.box(4, 14, 4, 5, 15, 5), Block.box(12, 14, 2, 14, 15, 14), Block.box(4, 14, 12, 12, 15, 14), Block.box(4, 14, 2, 12, 15, 4), Block.box(2, 14, 2, 4, 15, 14), Block.box(2, 0, 2, 14, 1, 14), Block.box(14, 0, 2, 15, 15, 14), Block.box(1, 0, 2, 2, 15, 14), Block.box(11, 0, 14, 15, 15, 15), Block.box(5, 5, 13, 11, 11, 14), Block.box(5, 0, 14, 11, 5, 15), Block.box(5, 11, 14, 11, 15, 15), Block.box(1, 0, 14, 5, 15, 15), Block.box(1, 0, 1, 15, 15, 2)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_W = Stream.of(Block.box(4, 14, 4, 5, 15, 5), Block.box(0, 0, 15, 16, 1, 16), Block.box(15, 0, 1, 16, 1, 15), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 0, 1, 1, 1, 15), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 1, 1, 16, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(4, 11, 4, 12, 12, 12), Block.box(4, 14, 11, 5, 15, 12), Block.box(5, 12, 12, 11, 14, 13), Block.box(5, 12, 3, 11, 14, 4), Block.box(3, 12, 5, 4, 14, 11), Block.box(12, 12, 5, 13, 14, 11), Block.box(11, 12, 4, 12, 14, 5), Block.box(4, 12, 4, 5, 14, 5), Block.box(4, 12, 11, 5, 14, 12), Block.box(11, 12, 11, 12, 14, 12), Block.box(11, 14, 11, 12, 15, 12), Block.box(11, 14, 4, 12, 15, 5), Block.box(2, 14, 12, 14, 15, 14), Block.box(2, 14, 4, 4, 15, 12), Block.box(12, 14, 4, 14, 15, 12), Block.box(2, 14, 2, 14, 15, 4), Block.box(2, 0, 2, 14, 1, 14), Block.box(2, 0, 14, 14, 15, 15), Block.box(2, 0, 1, 14, 15, 2), Block.box(1, 0, 11, 2, 15, 15), Block.box(2, 5, 5, 3, 11, 11), Block.box(1, 0, 5, 2, 5, 11), Block.box(1, 11, 5, 2, 15, 11), Block.box(1, 0, 1, 2, 15, 5), Block.box(14, 0, 1, 15, 15, 15)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }
    // TODO (Rid): Fix Shape
    static class FluidCollectorShapes {
        static final VoxelShape SHAPE_U = Stream.of(Block.box(1, 1, 1, 15, 15, 15), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 0, 15, 16, 1, 16), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(0, 1, 0, 1, 15, 1), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 15, 1, 1, 16, 15), Block.box(0, 0, 1, 1, 1, 15), Block.box(15, 0, 1, 16, 1, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 3, 6, 16, 13, 10), Block.box(0, 3, 6, 1, 13, 10), Block.box(5, 15, 5, 11, 16, 11), Block.box(3, 15, 6, 5, 16, 10), Block.box(11, 15, 6, 13, 16, 10), Block.box(6, 15, 11, 10, 16, 13), Block.box(6, 15, 3, 10, 16, 5)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_D = Stream.of(Block.box(1, 1, 1, 15, 15, 15), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 0, 15, 16, 1, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(15, 1, 15, 16, 15, 16), Block.box(0, 0, 1, 1, 1, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 0, 1, 16, 1, 15), Block.box(15, 3, 6, 16, 13, 10), Block.box(0, 3, 6, 1, 13, 10), Block.box(5, 0, 5, 11, 1, 11), Block.box(3, 0, 6, 5, 1, 10), Block.box(11, 0, 6, 13, 1, 10), Block.box(6, 0, 3, 10, 1, 5), Block.box(6, 0, 11, 10, 1, 13)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_N = Stream.of(Block.box(1, 1, 1, 15, 15, 15), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 0, 15, 16, 1, 16), Block.box(0, 15, 1, 1, 16, 15), Block.box(0, 0, 1, 1, 1, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 0, 1, 16, 1, 15), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(15, 6, 3, 16, 10, 13), Block.box(0, 6, 3, 1, 10, 13), Block.box(5, 5, 0, 11, 11, 1), Block.box(3, 6, 0, 5, 10, 1), Block.box(11, 6, 0, 13, 10, 1), Block.box(6, 11, 0, 10, 13, 1), Block.box(6, 3, 0, 10, 5, 1)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_E = Stream.of(Block.box(1, 1, 1, 15, 15, 15), Block.box(15, 15, 0, 16, 16, 16), Block.box(15, 0, 0, 16, 1, 16), Block.box(0, 15, 0, 1, 16, 16), Block.box(0, 0, 0, 1, 1, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 0, 0, 15, 1, 1), Block.box(1, 15, 15, 15, 16, 16), Block.box(1, 0, 15, 15, 1, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(3, 6, 15, 13, 10, 16), Block.box(3, 6, 0, 13, 10, 1), Block.box(15, 5, 5, 16, 11, 11), Block.box(15, 6, 3, 16, 10, 5), Block.box(15, 6, 11, 16, 10, 13), Block.box(15, 11, 6, 16, 13, 10), Block.box(15, 3, 6, 16, 5, 10)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_S = Stream.of(Block.box(1, 1, 1, 15, 15, 15), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 0, 15, 16, 1, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 0, 0, 16, 1, 1), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 0, 1, 16, 1, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(0, 0, 1, 1, 1, 15), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(0, 6, 3, 1, 10, 13), Block.box(15, 6, 3, 16, 10, 13), Block.box(5, 5, 15, 11, 11, 16), Block.box(11, 6, 15, 13, 10, 16), Block.box(3, 6, 15, 5, 10, 16), Block.box(6, 11, 15, 10, 13, 16), Block.box(6, 3, 15, 10, 5, 16)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_W = Stream.of(Block.box(1, 1, 1, 15, 15, 15), Block.box(0, 15, 0, 1, 16, 16), Block.box(0, 0, 0, 1, 1, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(15, 0, 0, 16, 1, 16), Block.box(1, 15, 15, 15, 16, 16), Block.box(1, 0, 15, 15, 1, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 0, 0, 15, 1, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(3, 6, 0, 13, 10, 1), Block.box(3, 6, 15, 13, 10, 16), Block.box(0, 5, 5, 1, 11, 11), Block.box(0, 6, 11, 1, 10, 13), Block.box(0, 6, 3, 1, 10, 5), Block.box(0, 11, 6, 1, 13, 10), Block.box(0, 3, 6, 1, 5, 10)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }

    static class FurnaceDoubleShapes {
        static final VoxelShape SHAPE_N = Stream.of(
                Block.box(0, 0, 0, 16, 1, 16),
                Block.box(0, 15, 0, 1, 16, 16),
                Block.box(15, 15, 0, 16, 16, 16),
                Block.box(1, 15, 0, 15, 16, 1),
                Block.box(1, 15, 15, 15, 16, 16),
                Block.box(0, 1, 15, 1, 15, 16),
                Block.box(15, 1, 15, 16, 15, 16),
                Block.box(15, 1, 0, 16, 15, 1),
                Block.box(0, 1, 0, 1, 15, 1),
                Block.box(1, 1, 2, 2, 15, 14),
                Block.box(14, 1, 2, 15, 15, 14),
                Block.box(1, 1, 14, 15, 15, 15),
                Block.box(4, 7, 1, 12, 15, 2),
                Block.box(4, 1, 1, 12, 4, 2),
                Block.box(1, 1, 1, 4, 15, 2),
                Block.box(12, 1, 1, 15, 15, 2),
                Block.box(4, 4, 2, 12, 7, 3),
                Block.box(2, 14, 2, 14, 15, 14)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_E = Stream.of(
                Block.box(0, 0, 0, 16, 1, 16),
                Block.box(0, 15, 0, 16, 16, 1),
                Block.box(0, 15, 15, 16, 16, 16),
                Block.box(15, 15, 1, 16, 16, 15),
                Block.box(0, 15, 1, 1, 16, 15),
                Block.box(0, 1, 0, 1, 15, 1),
                Block.box(0, 1, 15, 1, 15, 16),
                Block.box(15, 1, 15, 16, 15, 16),
                Block.box(15, 1, 0, 16, 15, 1),
                Block.box(2, 1, 1, 14, 15, 2),
                Block.box(2, 1, 14, 14, 15, 15),
                Block.box(1, 1, 1, 2, 15, 15),
                Block.box(14, 7, 4, 15, 15, 12),
                Block.box(14, 1, 4, 15, 4, 12),
                Block.box(14, 1, 1, 15, 15, 4),
                Block.box(14, 1, 12, 15, 15, 15),
                Block.box(13, 4, 4, 14, 7, 12),
                Block.box(2, 14, 2, 14, 15, 14)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_S = Stream.of(
                Block.box(0, 0, 0, 16, 1, 16),
                Block.box(15, 15, 0, 16, 16, 16),
                Block.box(0, 15, 0, 1, 16, 16),
                Block.box(1, 15, 15, 15, 16, 16),
                Block.box(1, 15, 0, 15, 16, 1),
                Block.box(15, 1, 0, 16, 15, 1),
                Block.box(0, 1, 0, 1, 15, 1),
                Block.box(0, 1, 15, 1, 15, 16),
                Block.box(15, 1, 15, 16, 15, 16),
                Block.box(14, 1, 2, 15, 15, 14),
                Block.box(1, 1, 2, 2, 15, 14),
                Block.box(1, 1, 1, 15, 15, 2),
                Block.box(4, 7, 14, 12, 15, 15),
                Block.box(4, 1, 14, 12, 4, 15),
                Block.box(12, 1, 14, 15, 15, 15),
                Block.box(1, 1, 14, 4, 15, 15),
                Block.box(4, 4, 13, 12, 7, 14),
                Block.box(2, 14, 2, 14, 15, 14)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_W = Stream.of(
                Block.box(0, 0, 0, 16, 1, 16),
                Block.box(0, 15, 15, 16, 16, 16),
                Block.box(0, 15, 0, 16, 16, 1),
                Block.box(0, 15, 1, 1, 16, 15),
                Block.box(15, 15, 1, 16, 16, 15),
                Block.box(15, 1, 15, 16, 15, 16),
                Block.box(15, 1, 0, 16, 15, 1),
                Block.box(0, 1, 0, 1, 15, 1),
                Block.box(0, 1, 15, 1, 15, 16),
                Block.box(2, 1, 14, 14, 15, 15),
                Block.box(2, 1, 1, 14, 15, 2),
                Block.box(14, 1, 1, 15, 15, 15),
                Block.box(1, 7, 4, 2, 15, 12),
                Block.box(1, 1, 4, 2, 4, 12),
                Block.box(1, 1, 12, 2, 15, 15),
                Block.box(1, 1, 1, 2, 15, 4),
                Block.box(2, 4, 4, 3, 7, 12),
                Block.box(2, 14, 2, 14, 15, 14)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }

    static final class GrinderShapes {
        static final VoxelShape SHAPE_N = Stream.of(Block.box(0, 0, 0, 1, 1, 16), Block.box(14, 12, 4, 15, 15, 12), Block.box(1, 0, 4, 2, 4, 12), Block.box(14, 0, 4, 15, 4, 12), Block.box(4, 13, 4, 12, 14, 12), Block.box(11, 14, 4, 12, 15, 5), Block.box(4, 14, 4, 5, 15, 5), Block.box(3, 12, 5, 4, 14, 11), Block.box(12, 12, 5, 13, 14, 11), Block.box(5, 12, 3, 11, 14, 4), Block.box(5, 12, 12, 11, 14, 13), Block.box(11, 12, 11, 12, 14, 12), Block.box(11, 12, 4, 12, 14, 5), Block.box(4, 12, 4, 5, 14, 5), Block.box(4, 12, 11, 5, 14, 12), Block.box(4, 14, 11, 5, 15, 12), Block.box(11, 14, 11, 12, 15, 12), Block.box(2, 14, 2, 4, 15, 14), Block.box(4, 14, 2, 12, 15, 4), Block.box(4, 14, 12, 12, 15, 14), Block.box(12, 14, 2, 14, 15, 14), Block.box(2, 0, 2, 14, 1, 14), Block.box(1, 0, 2, 2, 15, 4), Block.box(14, 0, 2, 15, 15, 4), Block.box(1, 0, 12, 2, 15, 14), Block.box(14, 0, 12, 15, 15, 14), Block.box(1, 0, 1, 15, 15, 2), Block.box(1, 0, 14, 15, 15, 15), Block.box(13, 4, 4, 14, 12, 12), Block.box(2, 4, 4, 3, 12, 12), Block.box(3, 8, 0, 6, 10, 1), Block.box(1, 0, 15, 15, 1, 16), Block.box(15, 0, 0, 16, 1, 16), Block.box(1, 0, 0, 15, 1, 1), Block.box(1, 12, 4, 2, 15, 12), Block.box(0, 15, 0, 1, 16, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 15, 15, 15, 16, 16), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_E = Stream.of(Block.box(0, 0, 0, 16, 1, 1), Block.box(4, 12, 14, 12, 15, 15), Block.box(4, 0, 1, 12, 4, 2), Block.box(4, 0, 14, 12, 4, 15), Block.box(4, 13, 4, 12, 14, 12), Block.box(11, 14, 11, 12, 15, 12), Block.box(11, 14, 4, 12, 15, 5), Block.box(5, 12, 3, 11, 14, 4), Block.box(5, 12, 12, 11, 14, 13), Block.box(12, 12, 5, 13, 14, 11), Block.box(3, 12, 5, 4, 14, 11), Block.box(4, 12, 11, 5, 14, 12), Block.box(11, 12, 11, 12, 14, 12), Block.box(11, 12, 4, 12, 14, 5), Block.box(4, 12, 4, 5, 14, 5), Block.box(4, 14, 4, 5, 15, 5), Block.box(4, 14, 11, 5, 15, 12), Block.box(2, 14, 2, 14, 15, 4), Block.box(12, 14, 4, 14, 15, 12), Block.box(2, 14, 4, 4, 15, 12), Block.box(2, 14, 12, 14, 15, 14), Block.box(2, 0, 2, 14, 1, 14), Block.box(12, 0, 1, 14, 15, 2), Block.box(12, 0, 14, 14, 15, 15), Block.box(2, 0, 1, 4, 15, 2), Block.box(2, 0, 14, 4, 15, 15), Block.box(14, 0, 1, 15, 15, 15), Block.box(1, 0, 1, 2, 15, 15), Block.box(4, 4, 13, 12, 12, 14), Block.box(4, 4, 2, 12, 12, 3), Block.box(15, 8, 3, 16, 10, 6), Block.box(0, 0, 1, 1, 1, 15), Block.box(0, 0, 15, 16, 1, 16), Block.box(15, 0, 1, 16, 1, 15), Block.box(4, 12, 1, 12, 15, 2), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(15, 15, 1, 16, 16, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_S = Stream.of(Block.box(15, 0, 0, 16, 1, 16), Block.box(1, 12, 4, 2, 15, 12), Block.box(14, 0, 4, 15, 4, 12), Block.box(1, 0, 4, 2, 4, 12), Block.box(4, 13, 4, 12, 14, 12), Block.box(4, 14, 11, 5, 15, 12), Block.box(11, 14, 11, 12, 15, 12), Block.box(12, 12, 5, 13, 14, 11), Block.box(3, 12, 5, 4, 14, 11), Block.box(5, 12, 12, 11, 14, 13), Block.box(5, 12, 3, 11, 14, 4), Block.box(4, 12, 4, 5, 14, 5), Block.box(4, 12, 11, 5, 14, 12), Block.box(11, 12, 11, 12, 14, 12), Block.box(11, 12, 4, 12, 14, 5), Block.box(11, 14, 4, 12, 15, 5), Block.box(4, 14, 4, 5, 15, 5), Block.box(12, 14, 2, 14, 15, 14), Block.box(4, 14, 12, 12, 15, 14), Block.box(4, 14, 2, 12, 15, 4), Block.box(2, 14, 2, 4, 15, 14), Block.box(2, 0, 2, 14, 1, 14), Block.box(14, 0, 12, 15, 15, 14), Block.box(1, 0, 12, 2, 15, 14), Block.box(14, 0, 2, 15, 15, 4), Block.box(1, 0, 2, 2, 15, 4), Block.box(1, 0, 14, 15, 15, 15), Block.box(1, 0, 1, 15, 15, 2), Block.box(2, 4, 4, 3, 12, 12), Block.box(13, 4, 4, 14, 12, 12), Block.box(10, 8, 15, 13, 10, 16), Block.box(1, 0, 0, 15, 1, 1), Block.box(0, 0, 0, 1, 1, 16), Block.box(1, 0, 15, 15, 1, 16), Block.box(14, 12, 4, 15, 15, 12), Block.box(15, 15, 0, 16, 16, 16), Block.box(0, 15, 0, 1, 16, 16), Block.box(1, 15, 15, 15, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_W = Stream.of(Block.box(0, 0, 15, 16, 1, 16), Block.box(4, 12, 1, 12, 15, 2), Block.box(4, 0, 14, 12, 4, 15), Block.box(4, 0, 1, 12, 4, 2), Block.box(4, 13, 4, 12, 14, 12), Block.box(4, 14, 4, 5, 15, 5), Block.box(4, 14, 11, 5, 15, 12), Block.box(5, 12, 12, 11, 14, 13), Block.box(5, 12, 3, 11, 14, 4), Block.box(3, 12, 5, 4, 14, 11), Block.box(12, 12, 5, 13, 14, 11), Block.box(11, 12, 4, 12, 14, 5), Block.box(4, 12, 4, 5, 14, 5), Block.box(4, 12, 11, 5, 14, 12), Block.box(11, 12, 11, 12, 14, 12), Block.box(11, 14, 11, 12, 15, 12), Block.box(11, 14, 4, 12, 15, 5), Block.box(2, 14, 12, 14, 15, 14), Block.box(2, 14, 4, 4, 15, 12), Block.box(12, 14, 4, 14, 15, 12), Block.box(2, 14, 2, 14, 15, 4), Block.box(2, 0, 2, 14, 1, 14), Block.box(2, 0, 14, 4, 15, 15), Block.box(2, 0, 1, 4, 15, 2), Block.box(12, 0, 14, 14, 15, 15), Block.box(12, 0, 1, 14, 15, 2), Block.box(1, 0, 1, 2, 15, 15), Block.box(14, 0, 1, 15, 15, 15), Block.box(4, 4, 2, 12, 12, 3), Block.box(4, 4, 13, 12, 12, 14), Block.box(0, 8, 10, 1, 10, 13), Block.box(15, 0, 1, 16, 1, 15), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 0, 1, 1, 1, 15), Block.box(4, 12, 14, 12, 15, 15), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 1, 1, 16, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }

    static final class LampPowererShapes {
        static final VoxelShape SHAPE_N = Stream.of(Block.box(0, 0, 0, 1, 1, 16), Block.box(0, 15, 0, 1, 16, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 15, 15, 15, 16, 16), Block.box(1, 0, 15, 15, 1, 16), Block.box(1, 0, 0, 15, 1, 1), Block.box(15, 0, 0, 16, 1, 16), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(3, 3, 15, 13, 13, 16), Block.box(1, 14, 1, 15, 15, 15), Block.box(1, 1, 1, 15, 2, 15), Block.box(14, 2, 1, 15, 14, 15), Block.box(1, 2, 1, 2, 14, 15), Block.box(2, 2, 14, 14, 14, 15), Block.box(2, 2, 1, 14, 14, 2), Block.box(0, 7, 7, 1, 9, 10), Block.box(15, 7, 6, 16, 9, 9)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_E = Stream.of(Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(15, 15, 1, 16, 16, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(0, 0, 1, 1, 1, 15), Block.box(15, 0, 1, 16, 1, 15), Block.box(0, 0, 15, 16, 1, 16), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 3, 3, 1, 13, 13), Block.box(1, 14, 1, 15, 15, 15), Block.box(1, 1, 1, 15, 2, 15), Block.box(1, 2, 14, 15, 14, 15), Block.box(1, 2, 1, 15, 14, 2), Block.box(1, 2, 2, 2, 14, 14), Block.box(14, 2, 2, 15, 14, 14), Block.box(6, 7, 0, 9, 9, 1), Block.box(7, 7, 15, 10, 9, 16)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_S = Stream.of(Block.box(15, 0, 0, 16, 1, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(0, 15, 0, 1, 16, 16), Block.box(1, 15, 15, 15, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 0, 0, 15, 1, 1), Block.box(1, 0, 15, 15, 1, 16), Block.box(0, 0, 0, 1, 1, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(3, 3, 0, 13, 13, 1), Block.box(1, 14, 1, 15, 15, 15), Block.box(1, 1, 1, 15, 2, 15), Block.box(1, 2, 1, 2, 14, 15), Block.box(14, 2, 1, 15, 14, 15), Block.box(2, 2, 1, 14, 14, 2), Block.box(2, 2, 14, 14, 14, 15), Block.box(15, 7, 6, 16, 9, 9), Block.box(0, 7, 7, 1, 9, 10)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_W = Stream.of(Block.box(0, 0, 15, 16, 1, 16), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 1, 1, 16, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 0, 1, 16, 1, 15), Block.box(0, 0, 1, 1, 1, 15), Block.box(0, 0, 0, 16, 1, 1), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 3, 3, 16, 13, 13), Block.box(1, 14, 1, 15, 15, 15), Block.box(1, 1, 1, 15, 2, 15), Block.box(1, 2, 1, 15, 14, 2), Block.box(1, 2, 14, 15, 14, 15), Block.box(14, 2, 2, 15, 14, 14), Block.box(1, 2, 2, 2, 14, 14), Block.box(7, 7, 15, 10, 9, 16), Block.box(6, 7, 0, 9, 9, 1)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }

    static final class OilGeneratorShapes {
        static final VoxelShape SHAPE_N = Stream.of(Block.box(4, 3, 1.5, 12, 4, 2), Block.box(0, 15, 0, 1, 16, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 15, 15, 15, 16, 16), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(12, 3, 1, 13, 4, 2), Block.box(3, 3, 1, 4, 4, 2), Block.box(3, 7, 1, 4, 8, 2), Block.box(12, 7, 1, 13, 8, 2), Block.box(4, 10, 0.5, 6, 11, 1), Block.box(4, 13, 0.5, 6, 14, 1), Block.box(3, 11, 0.5, 4, 13, 1), Block.box(6, 11, 0.5, 7, 13, 1), Block.box(4, 11, 0, 6, 13, 1), Block.box(5, 5, 1.5, 6, 6, 2), Block.box(6, 4, 1.5, 7, 5, 2), Block.box(10, 5, 1.5, 11, 6, 2), Block.box(9, 6, 1.5, 10, 7, 2), Block.box(4, 7, 1.5, 12, 8, 2), Block.box(3, 4, 1.5, 4, 7, 2), Block.box(12, 4, 1.5, 13, 7, 2), Block.box(2, 0, 2, 14, 1, 14), Block.box(5, 14, 6, 11, 15, 7), Block.box(5, 14, 8, 11, 15, 9), Block.box(5, 14, 10, 11, 15, 14), Block.box(5, 14, 2, 11, 15, 5), Block.box(11, 14, 2, 14, 15, 14), Block.box(2, 14, 2, 5, 15, 14), Block.box(1, 0, 2, 2, 15, 14), Block.box(14, 0, 2, 15, 15, 14), Block.box(1, 0, 14, 15, 15, 15), Block.box(3, 8, 1, 13, 15, 2), Block.box(3, 0, 1, 13, 3, 2), Block.box(1, 0, 1, 3, 15, 2), Block.box(13, 0, 1, 15, 15, 2), Block.box(5, 13, 5, 11, 14, 10), Block.box(2, 3, 2, 14, 8, 3), Block.box(0, 0, 15, 1, 1, 16), Block.box(15, 0, 15, 16, 1, 16), Block.box(15, 0, 0, 16, 1, 1), Block.box(0, 0, 0, 1, 1, 1)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_E = Stream.of(Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(15, 15, 1, 16, 16, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(14, 3, 12, 15, 4, 13), Block.box(14, 3, 3, 15, 4, 4), Block.box(14, 7, 3, 15, 8, 4), Block.box(14, 7, 12, 15, 8, 13), Block.box(15, 10, 4, 15.5, 11, 6), Block.box(15, 13, 4, 15.5, 14, 6), Block.box(15, 11, 3, 15.5, 13, 4), Block.box(15, 11, 6, 15.5, 13, 7), Block.box(15, 11, 4, 16, 13, 6), Block.box(14, 5, 5, 14.5, 6, 6), Block.box(14, 4, 6, 14.5, 5, 7), Block.box(14, 5, 10, 14.5, 6, 11), Block.box(14, 6, 9, 14.5, 7, 10), Block.box(14, 3, 4, 14.5, 4, 12), Block.box(14, 7, 4, 14.5, 8, 12), Block.box(14, 4, 3, 14.5, 7, 4), Block.box(14, 4, 12, 14.5, 7, 13), Block.box(2, 0, 2, 14, 1, 14), Block.box(9, 14, 5, 10, 15, 11), Block.box(7, 14, 5, 8, 15, 11), Block.box(2, 14, 5, 6, 15, 11), Block.box(11, 14, 5, 14, 15, 11), Block.box(2, 14, 11, 14, 15, 14), Block.box(2, 14, 2, 14, 15, 5), Block.box(2, 0, 1, 14, 15, 2), Block.box(2, 0, 14, 14, 15, 15), Block.box(1, 0, 1, 2, 15, 15), Block.box(14, 8, 3, 15, 15, 13), Block.box(14, 0, 3, 15, 3, 13), Block.box(14, 0, 1, 15, 15, 3), Block.box(14, 0, 13, 15, 15, 15), Block.box(6, 13, 5, 11, 14, 11), Block.box(13, 3, 2, 14, 8, 14), Block.box(0, 0, 0, 1, 1, 1), Block.box(0, 0, 15, 1, 1, 16), Block.box(15, 0, 15, 16, 1, 16), Block.box(15, 0, 0, 16, 1, 1)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_S = Stream.of(Block.box(15, 15, 0, 16, 16, 16), Block.box(0, 15, 0, 1, 16, 16), Block.box(1, 15, 15, 15, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(3, 3, 14, 4, 4, 15), Block.box(12, 3, 14, 13, 4, 15), Block.box(12, 7, 14, 13, 8, 15), Block.box(3, 7, 14, 4, 8, 15), Block.box(10, 10, 15, 12, 11, 15.5), Block.box(10, 13, 15, 12, 14, 15.5), Block.box(12, 11, 15, 13, 13, 15.5), Block.box(9, 11, 15, 10, 13, 15.5), Block.box(10, 11, 15, 12, 13, 16), Block.box(10, 5, 14, 11, 6, 14.5), Block.box(9, 4, 14, 10, 5, 14.5), Block.box(5, 5, 14, 6, 6, 14.5), Block.box(6, 6, 14, 7, 7, 14.5), Block.box(4, 3, 14, 12, 4, 14.5), Block.box(4, 7, 14, 12, 8, 14.5), Block.box(12, 4, 14, 13, 7, 14.5), Block.box(3, 4, 14, 4, 7, 14.5), Block.box(2, 0, 2, 14, 1, 14), Block.box(5, 14, 9, 11, 15, 10), Block.box(5, 14, 7, 11, 15, 8), Block.box(5, 14, 2, 11, 15, 6), Block.box(5, 14, 11, 11, 15, 14), Block.box(2, 14, 2, 5, 15, 14), Block.box(11, 14, 2, 14, 15, 14), Block.box(14, 0, 2, 15, 15, 14), Block.box(1, 0, 2, 2, 15, 14), Block.box(1, 0, 1, 15, 15, 2), Block.box(3, 8, 14, 13, 15, 15), Block.box(3, 0, 14, 13, 3, 15), Block.box(13, 0, 14, 15, 15, 15), Block.box(1, 0, 14, 3, 15, 15), Block.box(5, 13, 6, 11, 14, 11), Block.box(2, 3, 13, 14, 8, 14), Block.box(15, 0, 0, 16, 1, 1), Block.box(0, 0, 0, 1, 1, 1), Block.box(0, 0, 15, 1, 1, 16), Block.box(15, 0, 15, 16, 1, 16)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_W = Stream.of(Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 1, 1, 16, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(1, 3, 3, 2, 4, 4), Block.box(1, 3, 12, 2, 4, 13), Block.box(1, 7, 12, 2, 8, 13), Block.box(1, 7, 3, 2, 8, 4), Block.box(0.5, 10, 10, 1, 11, 12), Block.box(0.5, 13, 10, 1, 14, 12), Block.box(0.5, 11, 12, 1, 13, 13), Block.box(0.5, 11, 9, 1, 13, 10), Block.box(0, 11, 10, 1, 13, 12), Block.box(1.5, 5, 10, 2, 6, 11), Block.box(1.5, 4, 9, 2, 5, 10), Block.box(1.5, 5, 5, 2, 6, 6), Block.box(1.5, 6, 6, 2, 7, 7), Block.box(1.5, 3, 4, 2, 4, 12), Block.box(1.5, 7, 4, 2, 8, 12), Block.box(1.5, 4, 12, 2, 7, 13), Block.box(1.5, 4, 3, 2, 7, 4), Block.box(2, 0, 2, 14, 1, 14), Block.box(6, 14, 5, 7, 15, 11), Block.box(8, 14, 5, 9, 15, 11), Block.box(10, 14, 5, 14, 15, 11), Block.box(2, 14, 5, 5, 15, 11), Block.box(2, 14, 2, 14, 15, 5), Block.box(2, 14, 11, 14, 15, 14), Block.box(2, 0, 14, 14, 15, 15), Block.box(2, 0, 1, 14, 15, 2), Block.box(14, 0, 1, 15, 15, 15), Block.box(1, 8, 3, 2, 15, 13), Block.box(1, 0, 3, 2, 3, 13), Block.box(1, 0, 13, 2, 15, 15), Block.box(1, 0, 1, 2, 15, 3), Block.box(5, 13, 5, 10, 14, 11), Block.box(2, 3, 2, 3, 8, 14), Block.box(15, 0, 15, 16, 1, 16), Block.box(15, 0, 0, 16, 1, 1), Block.box(0, 0, 0, 1, 1, 1), Block.box(0, 0, 15, 1, 1, 16)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }

    static final class MinerShapes {
        static final VoxelShape SHAPE_N = Stream.of(Block.box(0, 1, 15, 1, 15, 16), Block.box(0, 0, 0, 1, 1, 16), Block.box(1, 0, 15, 15, 1, 16), Block.box(15, 0, 0, 16, 1, 16), Block.box(1, 0, 0, 15, 1, 1), Block.box(0, 15, 0, 1, 16, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 15, 15, 15, 16, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(15, 3, 3, 16, 13, 13), Block.box(0, 3, 3, 1, 13, 13), Block.box(4, 11, 4, 12, 12, 12), Block.box(11, 14, 4, 12, 15, 5), Block.box(4, 14, 4, 5, 15, 5), Block.box(3, 12, 5, 4, 14, 11), Block.box(12, 12, 5, 13, 14, 11), Block.box(5, 12, 3, 11, 14, 4), Block.box(5, 12, 12, 11, 14, 13), Block.box(11, 12, 11, 12, 14, 12), Block.box(11, 12, 4, 12, 14, 5), Block.box(4, 12, 4, 5, 14, 5), Block.box(4, 12, 11, 5, 14, 12), Block.box(4, 14, 11, 5, 15, 12), Block.box(11, 14, 11, 12, 15, 12), Block.box(2, 14, 2, 4, 15, 14), Block.box(4, 14, 2, 12, 15, 4), Block.box(4, 14, 12, 12, 15, 14), Block.box(12, 14, 2, 14, 15, 14), Block.box(2, 0, 2, 14, 1, 14), Block.box(1, 0, 2, 2, 15, 14), Block.box(14, 0, 2, 15, 15, 14), Block.box(1, 0, 1, 15, 15, 2), Block.box(1, 0, 14, 15, 15, 15)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_E = Stream.of(Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 0, 1, 1, 1, 15), Block.box(0, 0, 15, 16, 1, 16), Block.box(15, 0, 1, 16, 1, 15), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(15, 15, 1, 16, 16, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(3, 3, 15, 13, 13, 16), Block.box(3, 3, 0, 13, 13, 1), Block.box(4, 11, 4, 12, 12, 12), Block.box(11, 14, 11, 12, 15, 12), Block.box(11, 14, 4, 12, 15, 5), Block.box(5, 12, 3, 11, 14, 4), Block.box(5, 12, 12, 11, 14, 13), Block.box(12, 12, 5, 13, 14, 11), Block.box(3, 12, 5, 4, 14, 11), Block.box(4, 12, 11, 5, 14, 12), Block.box(11, 12, 11, 12, 14, 12), Block.box(11, 12, 4, 12, 14, 5), Block.box(4, 12, 4, 5, 14, 5), Block.box(4, 14, 4, 5, 15, 5), Block.box(4, 14, 11, 5, 15, 12), Block.box(2, 14, 2, 14, 15, 4), Block.box(12, 14, 4, 14, 15, 12), Block.box(2, 14, 4, 4, 15, 12), Block.box(2, 14, 12, 14, 15, 14), Block.box(2, 0, 2, 14, 1, 14), Block.box(2, 0, 1, 14, 15, 2), Block.box(2, 0, 14, 14, 15, 15), Block.box(14, 0, 1, 15, 15, 15), Block.box(1, 0, 1, 2, 15, 15)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_S = Stream.of(Block.box(15, 1, 0, 16, 15, 1), Block.box(15, 0, 0, 16, 1, 16), Block.box(1, 0, 0, 15, 1, 1), Block.box(0, 0, 0, 1, 1, 16), Block.box(1, 0, 15, 15, 1, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(0, 15, 0, 1, 16, 16), Block.box(1, 15, 15, 15, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(0, 3, 3, 1, 13, 13), Block.box(15, 3, 3, 16, 13, 13), Block.box(4, 11, 4, 12, 12, 12), Block.box(4, 14, 11, 5, 15, 12), Block.box(11, 14, 11, 12, 15, 12), Block.box(12, 12, 5, 13, 14, 11), Block.box(3, 12, 5, 4, 14, 11), Block.box(5, 12, 12, 11, 14, 13), Block.box(5, 12, 3, 11, 14, 4), Block.box(4, 12, 4, 5, 14, 5), Block.box(4, 12, 11, 5, 14, 12), Block.box(11, 12, 11, 12, 14, 12), Block.box(11, 12, 4, 12, 14, 5), Block.box(11, 14, 4, 12, 15, 5), Block.box(4, 14, 4, 5, 15, 5), Block.box(12, 14, 2, 14, 15, 14), Block.box(4, 14, 12, 12, 15, 14), Block.box(4, 14, 2, 12, 15, 4), Block.box(2, 14, 2, 4, 15, 14), Block.box(2, 0, 2, 14, 1, 14), Block.box(14, 0, 2, 15, 15, 14), Block.box(1, 0, 2, 2, 15, 14), Block.box(1, 0, 14, 15, 15, 15), Block.box(1, 0, 1, 15, 15, 2)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_W = Stream.of(Block.box(15, 1, 15, 16, 15, 16), Block.box(0, 0, 15, 16, 1, 16), Block.box(15, 0, 1, 16, 1, 15), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 0, 1, 1, 1, 15), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 1, 1, 16, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(3, 3, 0, 13, 13, 1), Block.box(3, 3, 15, 13, 13, 16), Block.box(4, 11, 4, 12, 12, 12), Block.box(4, 14, 4, 5, 15, 5), Block.box(4, 14, 11, 5, 15, 12), Block.box(5, 12, 12, 11, 14, 13), Block.box(5, 12, 3, 11, 14, 4), Block.box(3, 12, 5, 4, 14, 11), Block.box(12, 12, 5, 13, 14, 11), Block.box(11, 12, 4, 12, 14, 5), Block.box(4, 12, 4, 5, 14, 5), Block.box(4, 12, 11, 5, 14, 12), Block.box(11, 12, 11, 12, 14, 12), Block.box(11, 14, 11, 12, 15, 12), Block.box(11, 14, 4, 12, 15, 5), Block.box(2, 14, 12, 14, 15, 14), Block.box(2, 14, 4, 4, 15, 12), Block.box(12, 14, 4, 14, 15, 12), Block.box(2, 14, 2, 14, 15, 4), Block.box(2, 0, 2, 14, 1, 14), Block.box(2, 0, 14, 14, 15, 15), Block.box(2, 0, 1, 14, 15, 2), Block.box(1, 0, 1, 2, 15, 15), Block.box(14, 0, 1, 15, 15, 15)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }

    static final class LeafGeneratorShapes {
        static final VoxelShape SHAPE_N = Stream.of(Block.box(1, 0, 14, 15, 15, 15), Block.box(15, 0, 0, 16, 1, 16), Block.box(1, 0, 0, 15, 1, 1), Block.box(0, 0, 0, 1, 1, 16), Block.box(1, 0, 15, 15, 1, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(0, 15, 0, 1, 16, 16), Block.box(1, 15, 15, 15, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(5, 11, 0, 11, 12, 1), Block.box(0, 11, 5, 1, 12, 11), Block.box(15, 11, 5, 16, 12, 11), Block.box(5, 4, 0, 11, 5, 1), Block.box(0, 4, 5, 1, 5, 11), Block.box(15, 4, 5, 16, 5, 11), Block.box(4, 4, 0, 5, 12, 1), Block.box(0, 4, 4, 1, 12, 5), Block.box(15, 4, 4, 16, 12, 5), Block.box(11, 4, 0, 12, 12, 1), Block.box(0, 4, 11, 1, 12, 12), Block.box(15, 4, 11, 16, 12, 12), Block.box(4, 13, 4, 12, 14, 12), Block.box(4, 14, 11, 5, 15, 12), Block.box(11, 14, 11, 12, 15, 12), Block.box(11, 14, 4, 12, 15, 5), Block.box(4, 14, 4, 5, 15, 5), Block.box(12, 14, 2, 14, 15, 14), Block.box(4, 14, 12, 12, 15, 14), Block.box(4, 14, 2, 12, 15, 4), Block.box(2, 14, 2, 4, 15, 14), Block.box(2, 0, 2, 14, 1, 14), Block.box(1, 0, 1, 15, 15, 2), Block.box(1, 0, 2, 2, 5, 14), Block.box(2, 1, 2, 3, 14, 14), Block.box(1, 11, 2, 2, 15, 14), Block.box(1, 5, 2, 2, 11, 5), Block.box(1, 5, 11, 2, 11, 14), Block.box(13, 1, 2, 14, 14, 14), Block.box(14, 11, 2, 15, 15, 14), Block.box(14, 5, 11, 15, 11, 14), Block.box(14, 5, 2, 15, 11, 5), Block.box(14, 0, 2, 15, 5, 14)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_E = Stream.of(Block.box(1, 0, 1, 2, 15, 15), Block.box(0, 0, 15, 16, 1, 16), Block.box(15, 0, 1, 16, 1, 15), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 0, 1, 1, 1, 15), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 1, 1, 16, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 11, 5, 16, 12, 11), Block.box(5, 11, 0, 11, 12, 1), Block.box(5, 11, 15, 11, 12, 16), Block.box(15, 4, 5, 16, 5, 11), Block.box(5, 4, 0, 11, 5, 1), Block.box(5, 4, 15, 11, 5, 16), Block.box(15, 4, 4, 16, 12, 5), Block.box(11, 4, 0, 12, 12, 1), Block.box(11, 4, 15, 12, 12, 16), Block.box(15, 4, 11, 16, 12, 12), Block.box(4, 4, 0, 5, 12, 1), Block.box(4, 4, 15, 5, 12, 16), Block.box(4, 13, 4, 12, 14, 12), Block.box(4, 14, 4, 5, 15, 5), Block.box(4, 14, 11, 5, 15, 12), Block.box(11, 14, 11, 12, 15, 12), Block.box(11, 14, 4, 12, 15, 5), Block.box(2, 14, 12, 14, 15, 14), Block.box(2, 14, 4, 4, 15, 12), Block.box(12, 14, 4, 14, 15, 12), Block.box(2, 14, 2, 14, 15, 4), Block.box(2, 0, 2, 14, 1, 14), Block.box(14, 0, 1, 15, 15, 15), Block.box(2, 0, 1, 14, 5, 2), Block.box(2, 1, 2, 14, 14, 3), Block.box(2, 11, 1, 14, 15, 2), Block.box(11, 5, 1, 14, 11, 2), Block.box(2, 5, 1, 5, 11, 2), Block.box(2, 1, 13, 14, 14, 14), Block.box(2, 11, 14, 14, 15, 15), Block.box(2, 5, 14, 5, 11, 15), Block.box(11, 5, 14, 14, 11, 15), Block.box(2, 0, 14, 14, 5, 15)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_S = Stream.of(Block.box(1, 0, 1, 15, 15, 2), Block.box(0, 0, 0, 1, 1, 16), Block.box(1, 0, 15, 15, 1, 16), Block.box(15, 0, 0, 16, 1, 16), Block.box(1, 0, 0, 15, 1, 1), Block.box(0, 15, 0, 1, 16, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 15, 15, 15, 16, 16), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(5, 11, 15, 11, 12, 16), Block.box(15, 11, 5, 16, 12, 11), Block.box(0, 11, 5, 1, 12, 11), Block.box(5, 4, 15, 11, 5, 16), Block.box(15, 4, 5, 16, 5, 11), Block.box(0, 4, 5, 1, 5, 11), Block.box(11, 4, 15, 12, 12, 16), Block.box(15, 4, 11, 16, 12, 12), Block.box(0, 4, 11, 1, 12, 12), Block.box(4, 4, 15, 5, 12, 16), Block.box(15, 4, 4, 16, 12, 5), Block.box(0, 4, 4, 1, 12, 5), Block.box(4, 13, 4, 12, 14, 12), Block.box(11, 14, 4, 12, 15, 5), Block.box(4, 14, 4, 5, 15, 5), Block.box(4, 14, 11, 5, 15, 12), Block.box(11, 14, 11, 12, 15, 12), Block.box(2, 14, 2, 4, 15, 14), Block.box(4, 14, 2, 12, 15, 4), Block.box(4, 14, 12, 12, 15, 14), Block.box(12, 14, 2, 14, 15, 14), Block.box(2, 0, 2, 14, 1, 14), Block.box(1, 0, 14, 15, 15, 15), Block.box(14, 0, 2, 15, 5, 14), Block.box(13, 1, 2, 14, 14, 14), Block.box(14, 11, 2, 15, 15, 14), Block.box(14, 5, 11, 15, 11, 14), Block.box(14, 5, 2, 15, 11, 5), Block.box(2, 1, 2, 3, 14, 14), Block.box(1, 11, 2, 2, 15, 14), Block.box(1, 5, 2, 2, 11, 5), Block.box(1, 5, 11, 2, 11, 14), Block.box(1, 0, 2, 2, 5, 14)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_W = Stream.of(Block.box(14, 0, 1, 15, 15, 15), Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 0, 1, 1, 1, 15), Block.box(0, 0, 15, 16, 1, 16), Block.box(15, 0, 1, 16, 1, 15), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(15, 15, 1, 16, 16, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 11, 5, 1, 12, 11), Block.box(5, 11, 15, 11, 12, 16), Block.box(5, 11, 0, 11, 12, 1), Block.box(0, 4, 5, 1, 5, 11), Block.box(5, 4, 15, 11, 5, 16), Block.box(5, 4, 0, 11, 5, 1), Block.box(0, 4, 11, 1, 12, 12), Block.box(4, 4, 15, 5, 12, 16), Block.box(4, 4, 0, 5, 12, 1), Block.box(0, 4, 4, 1, 12, 5), Block.box(11, 4, 15, 12, 12, 16), Block.box(11, 4, 0, 12, 12, 1), Block.box(4, 13, 4, 12, 14, 12), Block.box(11, 14, 11, 12, 15, 12), Block.box(11, 14, 4, 12, 15, 5), Block.box(4, 14, 4, 5, 15, 5), Block.box(4, 14, 11, 5, 15, 12), Block.box(2, 14, 2, 14, 15, 4), Block.box(12, 14, 4, 14, 15, 12), Block.box(2, 14, 4, 4, 15, 12), Block.box(2, 14, 12, 14, 15, 14), Block.box(2, 0, 2, 14, 1, 14), Block.box(1, 0, 1, 2, 15, 15), Block.box(2, 0, 14, 14, 5, 15), Block.box(2, 1, 13, 14, 14, 14), Block.box(2, 11, 14, 14, 15, 15), Block.box(2, 5, 14, 5, 11, 15), Block.box(11, 5, 14, 14, 11, 15), Block.box(2, 1, 2, 14, 14, 3), Block.box(2, 11, 1, 14, 15, 2), Block.box(11, 5, 1, 14, 11, 2), Block.box(2, 5, 1, 5, 11, 2), Block.box(2, 0, 1, 14, 5, 2)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }

    static final class LavaFactoryShapes {
        static final VoxelShape SHAPE_N = Stream.of(Block.box(0, 0, 0, 1, 1, 16), Block.box(0, 15, 0, 1, 16, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 15, 15, 15, 16, 16), Block.box(1, 0, 15, 15, 1, 16), Block.box(1, 0, 0, 15, 1, 1), Block.box(15, 0, 0, 16, 1, 16), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(12, 15, 5, 13, 16, 11), Block.box(3, 15, 5, 4, 16, 11), Block.box(11, 14, 11, 12, 16, 12), Block.box(11, 14, 4, 12, 16, 5), Block.box(4, 14, 11, 5, 16, 12), Block.box(4, 14, 4, 5, 16, 5), Block.box(4, 13, 4, 12, 14, 12), Block.box(4, 14, 12, 12, 15, 15), Block.box(4, 14, 1, 12, 15, 4), Block.box(1, 14, 1, 4, 15, 15), Block.box(12, 14, 1, 15, 15, 15), Block.box(1, 1, 1, 15, 2, 15), Block.box(14, 2, 1, 15, 14, 15), Block.box(1, 2, 1, 2, 14, 15), Block.box(2, 2, 14, 14, 14, 15), Block.box(2, 2, 1, 14, 14, 2), Block.box(5, 15, 3, 11, 16, 4), Block.box(5, 15, 12, 11, 16, 13)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_E = Stream.of(Block.box(0, 0, 0, 16, 1, 1), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 15, 16, 16, 16), Block.box(15, 15, 1, 16, 16, 15), Block.box(0, 15, 1, 1, 16, 15), Block.box(0, 0, 1, 1, 1, 15), Block.box(15, 0, 1, 16, 1, 15), Block.box(0, 0, 15, 16, 1, 16), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(5, 15, 12, 11, 16, 13), Block.box(5, 15, 3, 11, 16, 4), Block.box(4, 14, 11, 5, 16, 12), Block.box(11, 14, 11, 12, 16, 12), Block.box(4, 14, 4, 5, 16, 5), Block.box(11, 14, 4, 12, 16, 5), Block.box(4, 13, 4, 12, 14, 12), Block.box(1, 14, 4, 4, 15, 12), Block.box(12, 14, 4, 15, 15, 12), Block.box(1, 14, 1, 15, 15, 4), Block.box(1, 14, 12, 15, 15, 15), Block.box(1, 1, 1, 15, 2, 15), Block.box(1, 2, 14, 15, 14, 15), Block.box(1, 2, 1, 15, 14, 2), Block.box(1, 2, 2, 2, 14, 14), Block.box(14, 2, 2, 15, 14, 14), Block.box(12, 15, 5, 13, 16, 11), Block.box(3, 15, 5, 4, 16, 11)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_S = Stream.of(Block.box(15, 0, 0, 16, 1, 16), Block.box(15, 15, 0, 16, 16, 16), Block.box(0, 15, 0, 1, 16, 16), Block.box(1, 15, 15, 15, 16, 16), Block.box(1, 15, 0, 15, 16, 1), Block.box(1, 0, 0, 15, 1, 1), Block.box(1, 0, 15, 15, 1, 16), Block.box(0, 0, 0, 1, 1, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(15, 1, 15, 16, 15, 16), Block.box(3, 15, 5, 4, 16, 11), Block.box(12, 15, 5, 13, 16, 11), Block.box(4, 14, 4, 5, 16, 5), Block.box(4, 14, 11, 5, 16, 12), Block.box(11, 14, 4, 12, 16, 5), Block.box(11, 14, 11, 12, 16, 12), Block.box(4, 13, 4, 12, 14, 12), Block.box(4, 14, 1, 12, 15, 4), Block.box(4, 14, 12, 12, 15, 15), Block.box(12, 14, 1, 15, 15, 15), Block.box(1, 14, 1, 4, 15, 15), Block.box(1, 1, 1, 15, 2, 15), Block.box(1, 2, 1, 2, 14, 15), Block.box(14, 2, 1, 15, 14, 15), Block.box(2, 2, 1, 14, 14, 2), Block.box(2, 2, 14, 14, 14, 15), Block.box(5, 15, 12, 11, 16, 13), Block.box(5, 15, 3, 11, 16, 4)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_W = Stream.of(Block.box(0, 0, 15, 16, 1, 16), Block.box(0, 15, 15, 16, 16, 16), Block.box(0, 15, 0, 16, 16, 1), Block.box(0, 15, 1, 1, 16, 15), Block.box(15, 15, 1, 16, 16, 15), Block.box(15, 0, 1, 16, 1, 15), Block.box(0, 0, 1, 1, 1, 15), Block.box(0, 0, 0, 16, 1, 1), Block.box(15, 1, 15, 16, 15, 16), Block.box(15, 1, 0, 16, 15, 1), Block.box(0, 1, 0, 1, 15, 1), Block.box(0, 1, 15, 1, 15, 16), Block.box(5, 15, 3, 11, 16, 4), Block.box(5, 15, 12, 11, 16, 13), Block.box(11, 14, 4, 12, 16, 5), Block.box(4, 14, 4, 5, 16, 5), Block.box(11, 14, 11, 12, 16, 12), Block.box(4, 14, 11, 5, 16, 12), Block.box(4, 13, 4, 12, 14, 12), Block.box(12, 14, 4, 15, 15, 12), Block.box(1, 14, 4, 4, 15, 12), Block.box(1, 14, 12, 15, 15, 15), Block.box(1, 14, 1, 15, 15, 4), Block.box(1, 1, 1, 15, 2, 15), Block.box(1, 2, 1, 15, 14, 2), Block.box(1, 2, 14, 15, 14, 15), Block.box(14, 2, 2, 15, 14, 14), Block.box(1, 2, 2, 2, 14, 14), Block.box(3, 15, 5, 4, 16, 11), Block.box(12, 15, 5, 13, 16, 11)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }

    public static final VoxelShape FEEDER_SHAPE = ShapeBuilder.get()
        .add(0, 15, 0, 1, 16, 16).add(15, 15, 0, 16, 16, 16)
        .add(1, 15, 0, 15, 16, 1).add(1, 15, 15, 15, 16, 16).add(1, 0, 15, 15, 1, 16)
        .add(1, 0, 0, 15, 1, 1).add(15, 0, 0, 16, 1, 16).add(0, 0, 0, 1, 1, 16)
        .add(0, 1, 15, 1, 15, 16).add(15, 1, 15, 16, 15, 16).add(15, 1, 0, 16, 15, 1)
        .add(0, 1, 0, 1, 15, 1).add(11, 14, 11, 12, 15, 12).add(11, 14, 4, 12, 15, 5)
        .add(4, 14, 11, 5, 15, 12).add(4, 14, 4, 5, 15, 5).add(4, 13, 4, 12, 14, 12)
        .add(4, 14, 12, 12, 15, 15).add(4, 14, 1, 12, 15, 4).add(1, 14, 1, 4, 15, 15)
        .add(12, 14, 1, 15, 15, 15).add(1, 1, 1, 15, 2, 15).add(14, 2, 1, 15, 14, 15)
        .add(1, 2, 1, 2, 14, 15).add(2, 2, 14, 14, 14, 15).add(2, 2, 1, 14, 14, 2)
        .standardReduceBuild().get();

    public static final VoxelShape SOLIDIFIER_SHAPE = ShapeBuilder.get()
        .add(15, 0, 1, 16, 1, 15).add(1, 1, 1, 15, 15, 15).add(0, 0, 0, 16, 1, 1)
        .add(0, 0, 15, 16, 1, 16).add(0, 15, 0, 16, 16, 1).add(0, 15, 15, 16, 16, 16)
        .add(0, 0, 1, 1, 1, 15).add(0, 15, 1, 1, 16, 15).add(15, 15, 1, 16, 16, 15)
        .add(0, 1, 0, 1, 15, 1).add(0, 1, 15, 1, 15, 16).add(15, 1, 15, 16, 15, 16)
        .add(15, 1, 0, 16, 15, 1)
        .standardReduceBuild().get();

    static final class LaserRelayShapes {
        static final VoxelShape SHAPE_U = Stream.of(Block.box(1, 0, 1, 15, 1, 15), Block.box(3, 1, 3, 13, 5, 13), Block.box(7, 4, 7, 9, 10, 9)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_D = Stream.of(Block.box(1, 15, 1, 15, 16, 15), Block.box(3, 11, 3, 13, 15, 13), Block.box(7, 6, 7, 9, 12, 9)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_N = Stream.of(Block.box(1, 1, 15, 15, 15, 16), Block.box(3, 3, 11, 13, 13, 15), Block.box(7, 7, 6, 9, 9, 12)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_E = Stream.of(Block.box(0, 1, 1, 1, 15, 15), Block.box(1, 3, 3, 5, 13, 13), Block.box(4, 7, 7, 10, 9, 9)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_S = Stream.of(Block.box(1, 1, 0, 15, 15, 1), Block.box(3, 3, 1, 13, 13, 5), Block.box(7, 7, 4, 9, 9, 10)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
        static final VoxelShape SHAPE_W = Stream.of(Block.box(15, 1, 1, 16, 15, 15), Block.box(11, 3, 3, 15, 13, 13), Block.box(6, 7, 7, 12, 9, 9)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }

    static final class TinyTorchShapes {
        static final VoxelShape STANDING_AABB = Block.box(7, 0, 7, 9, 5, 9);
        static final VoxelShape TORCH_NORTH_AABB = Block.box(7, 4, 13, 9, 9, 16);
        static final VoxelShape TORCH_SOUTH_AABB = Block.box(7, 4, 0, 9, 9, 3);
        static final VoxelShape TORCH_WEST_AABB = Block.box(13, 4, 7, 16, 9, 9);
        static final VoxelShape TORCH_EAST_AABB = Block.box(0, 4, 7, 3, 9, 9);
    }

    public static class ShapeBuilder {
        Stream.Builder<VoxelShape> shapes = Stream.builder();

        public ShapeBuilder add(double x1, double y1, double z1, double x2, double y2, double z2) {
            this.shapes.add(Block.box(x1, y1, z1, x2, y2, z2));
            return this;
        }

        public Stream<VoxelShape> build() {
            return this.shapes.build();
        }

        public Optional<VoxelShape> standardReduceBuild() {
            return this.shapes.build().reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR));
        }

        public static ShapeBuilder get() {
            return new ShapeBuilder();
        }
    }
}

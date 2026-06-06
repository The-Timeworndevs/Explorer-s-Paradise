package net.tws.explorers_paradise.common;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.explorers_paradise.ExPMain;

public class ExPBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ExPMain.MODID);

    //Boolean to prevent suffocation
    private static boolean never(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return false;
    }

    //Block registries
    public static final DeferredBlock<LeavesBlock> BROWN_SPRUCE_LEAVES = BLOCKS.register("brown_spruce_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).strength(0.2f).randomTicks().noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(ExPBlocks::never).sound(SoundType.GRASS)));
    public static final DeferredBlock<LeavesBlock> YELLOW_BIRCH_LEAVES = BLOCKS.register("yellow_birch_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(DyeColor.YELLOW).strength(0.2f).randomTicks().noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(ExPBlocks::never).sound(SoundType.GRASS)));
    public static final DeferredBlock<LeavesBlock> ORANGE_OAK_LEAVES = BLOCKS.register("orange_oak_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(DyeColor.ORANGE).strength(0.2f).randomTicks().noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(ExPBlocks::never).sound(SoundType.GRASS)));
    public static final DeferredBlock<LeavesBlock> RED_OAK_LEAVES = BLOCKS.register("red_oak_leaves", ()-> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(DyeColor.RED).strength(0.2f).randomTicks().noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(ExPBlocks::never).sound(SoundType.GRASS)));

    //BlockItem registries
    public static final DeferredItem<BlockItem> BROWN_SPRUCE_LEAVES_ITEM = ExPItems.ITEMS.registerSimpleBlockItem("brown_spruce_leaves", BROWN_SPRUCE_LEAVES);
    public static final DeferredItem<BlockItem> YELLOW_BIRCH_LEAVES_ITEM = ExPItems.ITEMS.registerSimpleBlockItem("yellow_birch_leaves", YELLOW_BIRCH_LEAVES);
    public static final DeferredItem<BlockItem> ORANGE_OAK_LEAVES_ITEM = ExPItems.ITEMS.registerSimpleBlockItem("orange_oak_leaves", ORANGE_OAK_LEAVES);
    public static final DeferredItem<BlockItem> RED_OAK_LEAVES_ITEM = ExPItems.ITEMS.registerSimpleBlockItem("red_oak_leaves", RED_OAK_LEAVES);

}

package net.tws.explorers_paradise.common;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.explorers_paradise.ExPMain;
import net.tws.explorers_paradise.common.blocks.FlammableLeavesBlock;
import net.tws.explorers_paradise.common.blocks.FlammableLogBlock;

public class ExPBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ExPMain.MODID);

    //Boolean to prevent suffocation
    private static boolean never(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return false;
    }

    //Block registries

    //Vanilla block variants
    public static final DeferredBlock<FlammableLeavesBlock> BROWN_SPRUCE_LEAVES = BLOCKS.register("brown_spruce_leaves", ()-> new FlammableLeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).strength(0.2f).randomTicks().noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(ExPBlocks::never).sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY).isRedstoneConductor(ExPBlocks::never)));
    public static final DeferredBlock<FlammableLeavesBlock> YELLOW_BIRCH_LEAVES = BLOCKS.register("yellow_birch_leaves", ()-> new FlammableLeavesBlock(BlockBehaviour.Properties.of().mapColor(DyeColor.YELLOW).strength(0.2f).randomTicks().noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(ExPBlocks::never).sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY).isRedstoneConductor(ExPBlocks::never)));
    public static final DeferredBlock<FlammableLeavesBlock> ORANGE_OAK_LEAVES = BLOCKS.register("orange_oak_leaves", ()-> new FlammableLeavesBlock(BlockBehaviour.Properties.of().mapColor(DyeColor.ORANGE).strength(0.2f).randomTicks().noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(ExPBlocks::never).sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY).isRedstoneConductor(ExPBlocks::never)));
    public static final DeferredBlock<FlammableLeavesBlock> RED_OAK_LEAVES = BLOCKS.register("red_oak_leaves", ()-> new FlammableLeavesBlock(BlockBehaviour.Properties.of().mapColor(DyeColor.RED).strength(0.2f).randomTicks().noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(ExPBlocks::never).sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY).isRedstoneConductor(ExPBlocks::never)));

    //Custom wood types
    public static final DeferredBlock<FlammableLeavesBlock> PINE_LEAVES = BLOCKS.register("pine_leaves", ()-> new FlammableLeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).strength(0.2f).randomTicks().noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(ExPBlocks::never).sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY).isRedstoneConductor(ExPBlocks::never)));
    public static final DeferredBlock<FlammableLogBlock> PINE_LOG = BLOCKS.register("pine_log", () -> new FlammableLogBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).strength(2.0f).instrument(NoteBlockInstrument.BASS).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<FlammableLogBlock> PINE_WOOD = BLOCKS.register("pine_wood", () -> new FlammableLogBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).strength(2.0f).instrument(NoteBlockInstrument.BASS).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<FlammableLogBlock> STRIPPED_PINE_LOG = BLOCKS.register("stripped_pine_log", () -> new FlammableLogBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).strength(2.0f).instrument(NoteBlockInstrument.BASS).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<FlammableLogBlock> STRIPPED_PINE_WOOD = BLOCKS.register("stripped_pine_wood", () -> new FlammableLogBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).strength(2.0f).instrument(NoteBlockInstrument.BASS).ignitedByLava().sound(SoundType.WOOD)));

    //BlockItem registries


    //Vanilla block variants
    public static final DeferredItem<BlockItem> BROWN_SPRUCE_LEAVES_ITEM = ExPItems.ITEMS.registerSimpleBlockItem("brown_spruce_leaves", BROWN_SPRUCE_LEAVES);
    public static final DeferredItem<BlockItem> YELLOW_BIRCH_LEAVES_ITEM = ExPItems.ITEMS.registerSimpleBlockItem("yellow_birch_leaves", YELLOW_BIRCH_LEAVES);
    public static final DeferredItem<BlockItem> ORANGE_OAK_LEAVES_ITEM = ExPItems.ITEMS.registerSimpleBlockItem("orange_oak_leaves", ORANGE_OAK_LEAVES);
    public static final DeferredItem<BlockItem> RED_OAK_LEAVES_ITEM = ExPItems.ITEMS.registerSimpleBlockItem("red_oak_leaves", RED_OAK_LEAVES);

    //Custom wood types
    public static final DeferredItem<BlockItem> PINE_LEAVES_ITEM = ExPItems.ITEMS.registerSimpleBlockItem("pine_leaves", PINE_LEAVES);
    public static final DeferredItem<BlockItem> PINE_LOG_ITEM = ExPItems.ITEMS.registerSimpleBlockItem("pine_log", PINE_LOG);
    public static final DeferredItem<BlockItem> PINE_WOOD_ITEM = ExPItems.ITEMS.registerSimpleBlockItem("pine_wood", PINE_WOOD);
    public static final DeferredItem<BlockItem> STRIPPED_PINE_LOG_ITEM = ExPItems.ITEMS.registerSimpleBlockItem("stripped_pine_log", STRIPPED_PINE_LOG);
    public static final DeferredItem<BlockItem> STRIPPED_PINE_WOOD_ITEM = ExPItems.ITEMS.registerSimpleBlockItem("stripped_pine_wood", STRIPPED_PINE_WOOD);

}

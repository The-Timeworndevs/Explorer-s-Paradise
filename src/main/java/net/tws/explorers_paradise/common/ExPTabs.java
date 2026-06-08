package net.tws.explorers_paradise.common;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.explorers_paradise.ExPMain;

public class ExPTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExPMain.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXPLORERS_PARADISE = CREATIVE_MODE_TABS.register("explorers_paradise", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.explorers_paradise.main"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ExPItems.EXPLORERS_PARADISE.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ExPBlocks.BROWN_SPRUCE_LEAVES_ITEM.get());
                output.accept(ExPBlocks.YELLOW_BIRCH_LEAVES_ITEM.get());
                output.accept(ExPBlocks.ORANGE_OAK_LEAVES_ITEM.get());
                output.accept(ExPBlocks.RED_OAK_LEAVES_ITEM.get());
                output.accept(ExPBlocks.PINE_LEAVES_ITEM.get());
                output.accept(ExPBlocks.PINE_LOG_ITEM.get());
            }).build());
}

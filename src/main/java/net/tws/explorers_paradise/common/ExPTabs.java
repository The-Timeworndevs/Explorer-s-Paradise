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
            }).build());
}

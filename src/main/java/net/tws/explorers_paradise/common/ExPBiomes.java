package net.tws.explorers_paradise.common;


import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.tws.explorers_paradise.ExPMain;

public class ExPBiomes {

    public static final ResourceKey<Biome> BOREAL_FOREST = register("boreal_forest");

    public static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(ExPMain.MODID, name));
    }

}

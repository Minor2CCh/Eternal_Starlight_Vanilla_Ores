package com.Minor2CCh.eternal_starlight_vo;

import com.Minor2CCh.eternal_starlight_vo.config.StarlightConfigLoader;
import com.Minor2CCh.eternal_starlight_vo.registry.OreBlocks;
import com.Minor2CCh.eternal_starlight_vo.registry.OreItems;
import com.Minor2CCh.eternal_starlight_vo.registry.StarlightCreativeModeTab;
import net.minecraft.resources.ResourceLocation;

public final class Eternal_starlight_vo {
    public static final String MOD_ID = "eternal_starlight_vo";

    public static void init() {
        StarlightConfigLoader.load();
        OreBlocks.init();
        OreItems.init();
        StarlightCreativeModeTab.init();
    }
    public static ResourceLocation of(String id){
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, id);
    }
}

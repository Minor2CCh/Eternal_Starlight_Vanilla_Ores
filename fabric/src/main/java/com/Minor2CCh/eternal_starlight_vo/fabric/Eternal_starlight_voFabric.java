package com.Minor2CCh.eternal_starlight_vo.fabric;

import com.Minor2CCh.eternal_starlight_vo.Eternal_starlight_vo;
import com.Minor2CCh.eternal_starlight_vo.config.StarlightConfigLoader;
import com.Minor2CCh.eternal_starlight_vo.fabric.platform.FabricPlatform;
import com.Minor2CCh.eternal_starlight_vo.fabric.worldgen.StarlightGenerateOres;
import net.fabricmc.api.ModInitializer;

public final class Eternal_starlight_voFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        StarlightConfigLoader.load();
        Eternal_starlight_vo.init(new FabricPlatform());
        StarlightGenerateOres.init();
    }
}

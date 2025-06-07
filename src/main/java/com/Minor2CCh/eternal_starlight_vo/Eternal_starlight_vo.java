package com.Minor2CCh.eternal_starlight_vo;

import com.Minor2CCh.eternal_starlight_vo.config.StarlightConfig;
import net.fabricmc.api.ModInitializer;

public class Eternal_starlight_vo implements ModInitializer {
    public static final String MOD_ID = "eternal_starlight_vo";
    @Override
    public void onInitialize() {
        OreBlocks.initialize();

        StarlightConfig.initialize();
        StarlightGenerateOres.initialize();
    }
}

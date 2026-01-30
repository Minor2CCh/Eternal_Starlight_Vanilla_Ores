package com.Minor2CCh.eternal_starlight_vo.neoforge.registry;

import com.Minor2CCh.eternal_starlight_vo.neoforge.config.ConfigFlagCondition;
import com.Minor2CCh.eternal_starlight_vo.neoforge.platform.NeoForgePlatform;
import com.mojang.serialization.MapCodec;
import net.neoforged.neoforge.common.conditions.ICondition;

import java.util.function.Supplier;

public class StarlightConditions {
    @SuppressWarnings("unused")
    public static final Supplier<MapCodec<? extends ICondition>> CONFIG_FLAG =
            NeoForgePlatform.CONDITIONS.register("config_flag",
                    () -> ConfigFlagCondition.CODEC);
    public static void init(){

    }
}

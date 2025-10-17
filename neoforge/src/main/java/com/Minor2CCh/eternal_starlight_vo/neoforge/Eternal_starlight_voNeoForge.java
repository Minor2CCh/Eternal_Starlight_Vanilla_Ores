package com.Minor2CCh.eternal_starlight_vo.neoforge;

import com.Minor2CCh.eternal_starlight_vo.Eternal_starlight_vo;
import com.Minor2CCh.eternal_starlight_vo.neoforge.platform.NeoForgePlatform;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Eternal_starlight_vo.MOD_ID)
public final class Eternal_starlight_voNeoForge {
    public Eternal_starlight_voNeoForge(IEventBus modEventBus) {
        Eternal_starlight_vo.init(new NeoForgePlatform());
        NeoForgePlatform.registryInit(modEventBus);
    }
}

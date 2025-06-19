package com.Minor2CCh.eternal_starlight_vo.tag;

import com.Minor2CCh.eternal_starlight_vo.Eternal_starlight_vo;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

import static net.minecraft.resources.ResourceLocation.fromNamespaceAndPath;

public class StarlightBiomeTag {
    public static final TagKey<Biome> IN_ETERNAL_STARLIGHT = of("in_eternal_starlight");

    private StarlightBiomeTag() {

    }

    private static TagKey<Biome> of(String id) {
        return TagKey.create(Registries.BIOME, fromNamespaceAndPath(Eternal_starlight_vo.MODID, id));
    }
}

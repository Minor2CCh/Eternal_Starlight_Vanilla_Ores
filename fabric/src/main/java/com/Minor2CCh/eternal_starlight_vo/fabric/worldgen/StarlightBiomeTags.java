package com.Minor2CCh.eternal_starlight_vo.fabric.worldgen;

import com.Minor2CCh.eternal_starlight_vo.Eternal_starlight_vo;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class StarlightBiomeTags {
    public static final TagKey<Biome> IN_ETERNAL_STARLIGHT = of("in_eternal_starlight");
    public static final TagKey<Biome> EXTRA_IRON_ORE = of("extra_iron_ore");
    public static final TagKey<Biome> EXTRA_COAL_ORE = of("extra_coal_ore");
    public static final TagKey<Biome> EXTRA_COPPER_ORE = of("extra_copper_ore");
    public static final TagKey<Biome> EXTRA_GOLD_ORE = of("extra_gold_ore");
    public static final TagKey<Biome> EXTRA_LAPIS_ORE = of("extra_lapis_ore");
    public static final TagKey<Biome> EXTRA_EMERALD_ORE = of("extra_emerald_ore");
    public static final TagKey<Biome> EXTRA_DIAMOND_ORE = of("extra_diamond_ore");
    public static final TagKey<Biome> EXTRA_QUARTZ_ORE = of("extra_quartz_ore");
    private StarlightBiomeTags() {
    }

    private static TagKey<Biome> of(String id) {
        return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Eternal_starlight_vo.MOD_ID, id));
    }
}

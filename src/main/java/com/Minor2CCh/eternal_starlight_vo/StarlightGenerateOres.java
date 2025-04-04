package com.Minor2CCh.eternal_starlight_vo;

import com.Minor2CCh.eternal_starlight_vo.tag.StarLightBiomeTag;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class StarlightGenerateOres {
    public static final RegistryKey<PlacedFeature> STARLIGHT_IRON_ORE_PLACED_KEY = register("starlight_ore_iron_middle");
    public static final RegistryKey<PlacedFeature> STARLIGHT_IRON_ORE_SMALL_PLACED_KEY = register("starlight_ore_iron_small");
    public static final RegistryKey<PlacedFeature> STARLIGHT_IRON_ORE_UPPER_PLACED_KEY = register("starlight_ore_iron_upper");
    public static final RegistryKey<PlacedFeature> STARLIGHT_COAL_ORE_LOWER_PLACED_KEY = register("starlight_ore_coal_lower");
    public static final RegistryKey<PlacedFeature> STARLIGHT_COAL_ORE_UPPER_PLACED_KEY = register("starlight_ore_coal_upper");
    public static final RegistryKey<PlacedFeature> STARLIGHT_COPPER_ORE_PLACED_KEY = register("starlight_ore_copper");
    public static final RegistryKey<PlacedFeature> STARLIGHT_GOLD_ORE_PLACED_KEY = register("starlight_ore_gold");
    public static final RegistryKey<PlacedFeature> STARLIGHT_GOLD_ORE_LOWER_PLACED_KEY = register("starlight_ore_gold_lower");
    public static final RegistryKey<PlacedFeature> STARLIGHT_LAPIS_ORE_PLACED_KEY = register("starlight_ore_lapis");
    public static final RegistryKey<PlacedFeature> STARLIGHT_LAPIS_ORE_BURIED_PLACED_KEY = register("starlight_ore_lapis_buried");
    public static final RegistryKey<PlacedFeature> STARLIGHT_EMERALD_ORE_PLACED_KEY = register("starlight_ore_emerald");
    public static final RegistryKey<PlacedFeature> STARLIGHT_DIAMOND_ORE_PLACED_KEY = register("starlight_ore_diamond");
    public static final RegistryKey<PlacedFeature> STARLIGHT_DIAMOND_BURIED_ORE_PLACED_KEY = register("starlight_ore_diamond_buried");
    public static final RegistryKey<PlacedFeature> STARLIGHT_DIAMOND_LARGE_ORE_PLACED_KEY = register("starlight_ore_diamond_large");
    public static final RegistryKey<PlacedFeature> STARLIGHT_DIAMOND_MEDIUM_ORE_PLACED_KEY = register("starlight_ore_diamond_medium");
    public static final RegistryKey<PlacedFeature> STARLIGHT_IRON_ORE_EXTRA_PLACED_KEY = register("starlight_ore_iron_extra");
    public static final RegistryKey<PlacedFeature> STARLIGHT_COAL_ORE_EXTRA_PLACED_KEY = register("starlight_ore_coal_extra");
    public static final RegistryKey<PlacedFeature> STARLIGHT_COPPER_ORE_EXTRA_PLACED_KEY = register("starlight_ore_copper_extra");
    public static final RegistryKey<PlacedFeature> STARLIGHT_GOLD_ORE_EXTRA_PLACED_KEY = register("starlight_ore_gold_extra");
    public static final RegistryKey<PlacedFeature> STARLIGHT_LAPIS_ORE_EXTRA_PLACED_KEY = register("starlight_ore_lapis_extra");
    public static final RegistryKey<PlacedFeature> STARLIGHT_EMERALD_ORE_EXTRA_PLACED_KEY = register("starlight_ore_emerald_extra");
    public static final RegistryKey<PlacedFeature> STARLIGHT_DIAMOND_ORE_EXTRA_PLACED_KEY = register("starlight_ore_diamond_extra");
    public static final RegistryKey<PlacedFeature> STARLIGHT_DIAMOND_ORE_EXTRA2_PLACED_KEY = register("starlight_ore_diamond_extra2");

    public static RegistryKey<PlacedFeature> register(String id) {
        Identifier oreID = Identifier.of(Eternal_starlight_vo.MOD_ID, id);

        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, oreID);
    }
    public static void initialize() {
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.IN_ETERNAL_STARLIGHT), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_IRON_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.IN_ETERNAL_STARLIGHT), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_IRON_ORE_SMALL_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.IN_ETERNAL_STARLIGHT), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_IRON_ORE_UPPER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.IN_ETERNAL_STARLIGHT), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_COAL_ORE_LOWER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.IN_ETERNAL_STARLIGHT), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_COAL_ORE_UPPER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.IN_ETERNAL_STARLIGHT), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_COPPER_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.IN_ETERNAL_STARLIGHT), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_GOLD_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.IN_ETERNAL_STARLIGHT), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_GOLD_ORE_LOWER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.IN_ETERNAL_STARLIGHT), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_LAPIS_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.IN_ETERNAL_STARLIGHT), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_LAPIS_ORE_BURIED_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.IN_ETERNAL_STARLIGHT), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_EMERALD_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.IN_ETERNAL_STARLIGHT), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_DIAMOND_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.IN_ETERNAL_STARLIGHT), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_DIAMOND_BURIED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.IN_ETERNAL_STARLIGHT), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_DIAMOND_LARGE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.IN_ETERNAL_STARLIGHT), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_DIAMOND_MEDIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.EXTRA_IRON_ORE), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_IRON_ORE_EXTRA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.EXTRA_COAL_ORE), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_COAL_ORE_EXTRA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.EXTRA_COPPER_ORE), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_COPPER_ORE_EXTRA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.EXTRA_GOLD_ORE), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_GOLD_ORE_EXTRA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.EXTRA_LAPIS_ORE), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_LAPIS_ORE_EXTRA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.EXTRA_EMERALD_ORE), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_EMERALD_ORE_EXTRA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.EXTRA_DIAMOND_ORE), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_DIAMOND_ORE_EXTRA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(StarLightBiomeTag.EXTRA_DIAMOND_ORE), GenerationStep.Feature.UNDERGROUND_ORES, STARLIGHT_DIAMOND_ORE_EXTRA2_PLACED_KEY);
    }
}

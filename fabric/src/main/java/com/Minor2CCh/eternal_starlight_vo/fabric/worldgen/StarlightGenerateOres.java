package com.Minor2CCh.eternal_starlight_vo.fabric.worldgen;

import com.Minor2CCh.eternal_starlight_vo.Eternal_starlight_vo;
import com.Minor2CCh.eternal_starlight_vo.config.StarlightConfigLoader;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class StarlightGenerateOres {
    public static final ResourceKey<PlacedFeature> STARLIGHT_IRON_ORE_PLACED_KEY = register("starlight_ore_iron_middle");
    public static final ResourceKey<PlacedFeature> STARLIGHT_IRON_ORE_SMALL_PLACED_KEY = register("starlight_ore_iron_small");
    public static final ResourceKey<PlacedFeature> STARLIGHT_IRON_ORE_UPPER_PLACED_KEY = register("starlight_ore_iron_upper");
    public static final ResourceKey<PlacedFeature> STARLIGHT_COAL_ORE_LOWER_PLACED_KEY = register("starlight_ore_coal_lower");
    public static final ResourceKey<PlacedFeature> STARLIGHT_COAL_ORE_UPPER_PLACED_KEY = register("starlight_ore_coal_upper");
    public static final ResourceKey<PlacedFeature> STARLIGHT_COPPER_ORE_PLACED_KEY = register("starlight_ore_copper");
    public static final ResourceKey<PlacedFeature> STARLIGHT_GOLD_ORE_PLACED_KEY = register("starlight_ore_gold");
    public static final ResourceKey<PlacedFeature> STARLIGHT_GOLD_ORE_LOWER_PLACED_KEY = register("starlight_ore_gold_lower");
    public static final ResourceKey<PlacedFeature> STARLIGHT_LAPIS_ORE_PLACED_KEY = register("starlight_ore_lapis");
    public static final ResourceKey<PlacedFeature> STARLIGHT_LAPIS_ORE_BURIED_PLACED_KEY = register("starlight_ore_lapis_buried");
    public static final ResourceKey<PlacedFeature> STARLIGHT_EMERALD_ORE_PLACED_KEY = register("starlight_ore_emerald");
    public static final ResourceKey<PlacedFeature> STARLIGHT_DIAMOND_ORE_PLACED_KEY = register("starlight_ore_diamond");
    public static final ResourceKey<PlacedFeature> STARLIGHT_DIAMOND_BURIED_ORE_PLACED_KEY = register("starlight_ore_diamond_buried");
    public static final ResourceKey<PlacedFeature> STARLIGHT_DIAMOND_LARGE_ORE_PLACED_KEY = register("starlight_ore_diamond_large");
    public static final ResourceKey<PlacedFeature> STARLIGHT_DIAMOND_MEDIUM_ORE_PLACED_KEY = register("starlight_ore_diamond_medium");
    public static final ResourceKey<PlacedFeature> STARLIGHT_QUARTZ_ORE_PLACED_KEY = register("starlight_ore_quartz");
    public static final ResourceKey<PlacedFeature> STARLIGHT_IRON_ORE_EXTRA_PLACED_KEY = register("starlight_ore_iron_extra");
    public static final ResourceKey<PlacedFeature> STARLIGHT_COAL_ORE_EXTRA_PLACED_KEY = register("starlight_ore_coal_extra");
    public static final ResourceKey<PlacedFeature> STARLIGHT_COPPER_ORE_EXTRA_PLACED_KEY = register("starlight_ore_copper_extra");
    public static final ResourceKey<PlacedFeature> STARLIGHT_GOLD_ORE_EXTRA_PLACED_KEY = register("starlight_ore_gold_extra");
    public static final ResourceKey<PlacedFeature> STARLIGHT_LAPIS_ORE_EXTRA_PLACED_KEY = register("starlight_ore_lapis_extra");
    public static final ResourceKey<PlacedFeature> STARLIGHT_EMERALD_ORE_EXTRA_PLACED_KEY = register("starlight_ore_emerald_extra");
    public static final ResourceKey<PlacedFeature> STARLIGHT_DIAMOND_ORE_EXTRA_PLACED_KEY = register("starlight_ore_diamond_extra");
    public static final ResourceKey<PlacedFeature> STARLIGHT_DIAMOND_ORE_EXTRA2_PLACED_KEY = register("starlight_ore_diamond_extra2");
    public static final ResourceKey<PlacedFeature> STARLIGHT_QUARTZ_ORE_EXTRA_PLACED_KEY = register("starlight_ore_quartz_extra");

    public static final ResourceKey<PlacedFeature> STARLIGHT_IRON_ORE_PLACED_KEY_LITE = register("lite/starlight_ore_iron");
    public static final ResourceKey<PlacedFeature> STARLIGHT_COAL_ORE_PLACED_KEY_LITE = register("lite/starlight_ore_coal");
    public static final ResourceKey<PlacedFeature> STARLIGHT_COPPER_ORE_PLACED_KEY_LITE = register("lite/starlight_ore_copper");
    public static final ResourceKey<PlacedFeature> STARLIGHT_GOLD_ORE_PLACED_KEY_LITE = register("lite/starlight_ore_gold");
    public static final ResourceKey<PlacedFeature> STARLIGHT_LAPIS_ORE_PLACED_KEY_LITE = register("lite/starlight_ore_lapis");
    public static final ResourceKey<PlacedFeature> STARLIGHT_EMERALD_ORE_PLACED_KEY_LITE = register("lite/starlight_ore_emerald");
    public static final ResourceKey<PlacedFeature> STARLIGHT_DIAMOND_ORE_PLACED_KEY_LITE = register("lite/starlight_ore_diamond");
    public static final ResourceKey<PlacedFeature> STARLIGHT_QUARTZ_ORE_PLACED_KEY_LITE = register("lite/starlight_ore_quartz");
    public static final ResourceKey<PlacedFeature> STARLIGHT_IRON_ORE_EXTRA_PLACED_KEY_LITE = register("lite/starlight_ore_iron_extra");
    public static final ResourceKey<PlacedFeature> STARLIGHT_COAL_ORE_EXTRA_PLACED_KEY_LITE = register("lite/starlight_ore_coal_extra");
    public static final ResourceKey<PlacedFeature> STARLIGHT_COPPER_ORE_EXTRA_PLACED_KEY_LITE = register("lite/starlight_ore_copper_extra");
    public static final ResourceKey<PlacedFeature> STARLIGHT_GOLD_ORE_EXTRA_PLACED_KEY_LITE = register("lite/starlight_ore_gold_extra");
    public static final ResourceKey<PlacedFeature> STARLIGHT_LAPIS_ORE_EXTRA_PLACED_KEY_LITE = register("lite/starlight_ore_lapis_extra");
    public static final ResourceKey<PlacedFeature> STARLIGHT_EMERALD_ORE_EXTRA_PLACED_KEY_LITE = register("lite/starlight_ore_emerald_extra");
    public static final ResourceKey<PlacedFeature> STARLIGHT_DIAMOND_ORE_EXTRA_PLACED_KEY_LITE = register("lite/starlight_ore_diamond_extra");
    public static final ResourceKey<PlacedFeature> STARLIGHT_QUARTZ_ORE_EXTRA_PLACED_KEY_LITE = register("lite/starlight_ore_quartz_extra");

    public static ResourceKey<PlacedFeature> register(String id) {
        ResourceLocation oreID = Eternal_starlight_vo.of(id);

        return ResourceKey.create(Registries.PLACED_FEATURE, oreID);
    }
    public static void init() {
        //default
        if(!StarlightConfigLoader.getConfig().getReduceOres()){
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_IRON_ORE_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_IRON_ORE_SMALL_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_IRON_ORE_UPPER_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_COAL_ORE_LOWER_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_COAL_ORE_UPPER_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_COPPER_ORE_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_GOLD_ORE_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_GOLD_ORE_LOWER_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_LAPIS_ORE_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_LAPIS_ORE_BURIED_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_EMERALD_ORE_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_DIAMOND_ORE_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_DIAMOND_BURIED_ORE_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_DIAMOND_LARGE_ORE_PLACED_KEY);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_DIAMOND_MEDIUM_ORE_PLACED_KEY);
            if(StarlightConfigLoader.getConfig().getGenerateQuartz()) {
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_QUARTZ_ORE_PLACED_KEY);
            }
            if(StarlightConfigLoader.getConfig().getExtraOrePerBiome()){
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_IRON_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_IRON_ORE_EXTRA_PLACED_KEY);
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_COAL_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_COAL_ORE_EXTRA_PLACED_KEY);
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_COPPER_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_COPPER_ORE_EXTRA_PLACED_KEY);
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_GOLD_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_GOLD_ORE_EXTRA_PLACED_KEY);
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_LAPIS_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_LAPIS_ORE_EXTRA_PLACED_KEY);
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_EMERALD_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_EMERALD_ORE_EXTRA_PLACED_KEY);
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_DIAMOND_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_DIAMOND_ORE_EXTRA_PLACED_KEY);
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_DIAMOND_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_DIAMOND_ORE_EXTRA2_PLACED_KEY);
                if(StarlightConfigLoader.getConfig().getGenerateQuartz()) {
                    BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_QUARTZ_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_QUARTZ_ORE_EXTRA_PLACED_KEY);
                }
            }
            //reduce version
        }else{
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_IRON_ORE_PLACED_KEY_LITE);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_COAL_ORE_PLACED_KEY_LITE);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_COPPER_ORE_PLACED_KEY_LITE);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_GOLD_ORE_PLACED_KEY_LITE);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_LAPIS_ORE_PLACED_KEY_LITE);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_EMERALD_ORE_PLACED_KEY_LITE);
            BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_DIAMOND_ORE_PLACED_KEY_LITE);
            if(StarlightConfigLoader.getConfig().getGenerateQuartz()) {
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.IN_ETERNAL_STARLIGHT), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_QUARTZ_ORE_PLACED_KEY_LITE);
            }
            if(StarlightConfigLoader.getConfig().getExtraOrePerBiome()) {
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_IRON_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_IRON_ORE_EXTRA_PLACED_KEY_LITE);
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_COAL_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_COAL_ORE_EXTRA_PLACED_KEY_LITE);
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_COPPER_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_COPPER_ORE_EXTRA_PLACED_KEY_LITE);
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_GOLD_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_GOLD_ORE_EXTRA_PLACED_KEY_LITE);
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_LAPIS_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_LAPIS_ORE_EXTRA_PLACED_KEY_LITE);
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_EMERALD_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_EMERALD_ORE_EXTRA_PLACED_KEY_LITE);
                BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_DIAMOND_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_DIAMOND_ORE_EXTRA_PLACED_KEY_LITE);
                if(StarlightConfigLoader.getConfig().getGenerateQuartz()) {
                    BiomeModifications.addFeature(BiomeSelectors.tag(StarlightBiomeTags.EXTRA_QUARTZ_ORE), GenerationStep.Decoration.UNDERGROUND_ORES, STARLIGHT_QUARTZ_ORE_EXTRA_PLACED_KEY_LITE);
                }
            }
        }
    }
}

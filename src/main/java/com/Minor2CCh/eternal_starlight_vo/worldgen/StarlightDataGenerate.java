package com.Minor2CCh.eternal_starlight_vo.worldgen;

import com.Minor2CCh.eternal_starlight_vo.Eternal_starlight_vo;
import com.Minor2CCh.eternal_starlight_vo.tag.StarlightBiomeTag;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class StarlightDataGenerate extends DatapackBuiltinEntriesProvider {
    public static final ResourceKey<BiomeModifier> ADD_FEATURES_EXAMPLE = ResourceKey.create(
            NeoForgeRegistries.Keys.BIOME_MODIFIERS,
            ResourceLocation.fromNamespaceAndPath(Eternal_starlight_vo.MODID, "starlight_ore_coal_extra") // The registry name
    );
    public static final ResourceKey<PlacedFeature> EXAMPLE_PLACED_FEATURE = ResourceKey.create(
            Registries.PLACED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(Eternal_starlight_vo.MODID, "starlight_ore_coal_extra")
    );


    public StarlightDataGenerate(PackOutput output, CompletableFuture<RegistrySetBuilder.PatchedRegistries> registries, Consumer<BiConsumer<ResourceKey<?>, ICondition>> conditionsBuilder, Set<String> modIds) {
        super(output, registries, conditionsBuilder, modIds);
    }
    public static void init(){
        RegistrySetBuilder BUILDER = new RegistrySetBuilder().add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, bootstrap -> {
            // Lookup any necessary registries.
            // Static registries only need to be looked up if you need to grab the tag data.
            HolderGetter<Biome> biomes = bootstrap.lookup(Registries.BIOME);
            HolderGetter<PlacedFeature> placedFeatures = bootstrap.lookup(Registries.PLACED_FEATURE);

            // Register the biome modifiers.

            bootstrap.register(ADD_FEATURES_EXAMPLE,
                    new BiomeModifiers.AddFeaturesBiomeModifier(
                            // The biome(s) to generate within
                            biomes.getOrThrow(StarlightBiomeTag.IN_ETERNAL_STARLIGHT),
                            // The feature(s) to generate within the biomes
                            HolderSet.direct(placedFeatures.getOrThrow(EXAMPLE_PLACED_FEATURE)),
                            // The generation step
                            GenerationStep.Decoration.UNDERGROUND_ORES
                    )
            );
        });


    }
}

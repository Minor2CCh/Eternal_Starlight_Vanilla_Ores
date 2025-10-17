package com.Minor2CCh.eternal_starlight_vo.fabric.platform;

import com.Minor2CCh.eternal_starlight_vo.Eternal_starlight_vo;
import com.Minor2CCh.eternal_starlight_vo.platform.ModPlatform;
import com.Minor2CCh.eternal_starlight_vo.registry.StarlightCreativeModeTab;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import java.nio.file.Path;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class FabricPlatform implements ModPlatform {
    @Override
    public ModLoader getModLoader() {
        return ModLoader.FABRIC;
    }

    @Override
    public <T extends Block> Supplier<T> blockRegister(String id, Supplier<T> block) {
        T blockInfo = block.get();
        ResourceLocation blockID = Eternal_starlight_vo.of(id);
        Registry.register(BuiltInRegistries.BLOCK, blockID, blockInfo);
        return () -> blockInfo;
    }

    @Override
    public <T extends Item> Supplier<T> itemRegister(String id, Supplier<T> item) {
        T itemInfo = item.get();
        ResourceLocation blockID = Eternal_starlight_vo.of(id);
        Registry.register(BuiltInRegistries.ITEM, blockID, itemInfo);
        return () -> itemInfo;
    }

    @Override
    public Supplier<CreativeModeTab> creativeModeTabRegister(String id, Supplier<ItemStack> stack, BiConsumer<CreativeModeTab.ItemDisplayParameters, CreativeModeTab.Output> createTab) {
        CreativeModeTab tab = StarlightCreativeModeTab.createBuilder(FabricItemGroup.builder(), id, stack, createTab);
        ResourceKey<CreativeModeTab> key = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Eternal_starlight_vo.of(id));
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, key, tab);
        return () -> tab;
    }

    @Override
    public Path getConfigPath() {
        return FabricLoader.getInstance().getConfigDir();
    }

    @Override
    public boolean isModLoaded(String id) {
        return FabricLoader.getInstance().isModLoaded(id);
    }
}

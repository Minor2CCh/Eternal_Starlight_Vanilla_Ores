package com.Minor2CCh.eternal_starlight_vo.neoforge.platform;

import com.Minor2CCh.eternal_starlight_vo.Eternal_starlight_vo;
import com.Minor2CCh.eternal_starlight_vo.platform.ModPlatform;
import com.Minor2CCh.eternal_starlight_vo.registry.StarlightCreativeModeTab;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.nio.file.Path;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class NeoForgePlatform implements ModPlatform {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Eternal_starlight_vo.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Eternal_starlight_vo.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Eternal_starlight_vo.MOD_ID);
    @Override
    public ModLoader getModLoader() {
        return ModLoader.NEOFORGE;
    }

    @Override
    public <T extends Block> Supplier<T> blockRegister(String id, Supplier<T> block) {
        return BLOCKS.register(id, block);
    }

    @Override
    public <T extends Item> Supplier<T> itemRegister(String id, Supplier<T> item) {
        return ITEMS.register(id, item);
    }

    @Override
    public Supplier<CreativeModeTab> creativeModeTabRegister(String id, Supplier<ItemStack> stack, BiConsumer<CreativeModeTab.ItemDisplayParameters, CreativeModeTab.Output> createTab) {
        return CREATIVE_MODE_TABS.register(id, () -> StarlightCreativeModeTab.createBuilder(CreativeModeTab.builder(), id, stack, createTab));
    }

    @Override
    public Path getConfigPath() {
        return FMLPaths.CONFIGDIR.get();
    }

    @Override
    public boolean isModLoaded(String id) {
        return ModList.get().isLoaded(id);
    }

    public static void registryInit(IEventBus modEventBus){
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}

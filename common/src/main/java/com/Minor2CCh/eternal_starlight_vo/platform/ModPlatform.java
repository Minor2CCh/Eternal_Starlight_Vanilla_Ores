package com.Minor2CCh.eternal_starlight_vo.platform;

import net.minecraft.Util;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import java.nio.file.Path;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

@SuppressWarnings("unused")
public interface ModPlatform {
    ModPlatform INSTANCE = Util.make(() -> {
        final ServiceLoader<ModPlatform> loader = ServiceLoader.load(ModPlatform.class);
        final Iterator<ModPlatform> iterator = loader.iterator();
        if (!iterator.hasNext()) {
            throw new RuntimeException("Platform instance not found!");
        } else {
            final ModPlatform platform = iterator.next();
            if (iterator.hasNext()) {
                throw new RuntimeException("More than one platform instance was found!");
            }
            return platform;
        }
    });
    enum ModLoader{
        NEOFORGE,
        FABRIC
    }
    interface QuadConsumer<A, B, C, D> {
        void accept(A a, B b, C c, D d);
    }
    ModLoader getModLoader();
    <T extends Block> Supplier<T> blockRegister(String id, Supplier<T> block);
    <T extends Item> Supplier<T> itemRegister(String id, Supplier<T> item);
    Supplier<CreativeModeTab> creativeModeTabRegister(String id, Supplier<ItemStack> stack, BiConsumer<CreativeModeTab.ItemDisplayParameters, CreativeModeTab.Output> createTab);
    Path getConfigPath();
    boolean isModLoaded(String id);
}

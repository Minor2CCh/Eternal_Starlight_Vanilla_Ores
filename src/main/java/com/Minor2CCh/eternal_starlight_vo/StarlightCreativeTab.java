package com.Minor2CCh.eternal_starlight_vo;

import com.Minor2CCh.eternal_starlight_vo.block.OreBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class StarlightCreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Eternal_starlight_vo.MODID);
    public static final Supplier<CreativeModeTab> TAB_ETERNAL_STARLIGHT = CREATIVE_MODE_TABS.register(Eternal_starlight_vo.MODID,
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.eternal_starlight_vo"))
                    .icon(() -> new ItemStack(OreBlocks.VOIDSTONE_EMERALD_ORE.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(OreBlocks.GRIMSTONE_IRON_ORE.get());
                        output.accept(OreBlocks.VOIDSTONE_IRON_ORE.get());
                        output.accept(OreBlocks.ETERNAL_ICE_IRON_ORE.get());
                        output.accept(OreBlocks.HAZE_ICE_IRON_ORE.get());
                        output.accept(OreBlocks.GRIMSTONE_COAL_ORE.get());
                        output.accept(OreBlocks.VOIDSTONE_COAL_ORE.get());
                        output.accept(OreBlocks.ETERNAL_ICE_COAL_ORE.get());
                        output.accept(OreBlocks.HAZE_ICE_COAL_ORE.get());
                        output.accept(OreBlocks.GRIMSTONE_COPPER_ORE.get());
                        output.accept(OreBlocks.VOIDSTONE_COPPER_ORE.get());
                        output.accept(OreBlocks.ETERNAL_ICE_COPPER_ORE.get());
                        output.accept(OreBlocks.HAZE_ICE_COPPER_ORE.get());
                        output.accept(OreBlocks.GRIMSTONE_GOLD_ORE.get());
                        output.accept(OreBlocks.VOIDSTONE_GOLD_ORE.get());
                        output.accept(OreBlocks.ETERNAL_ICE_GOLD_ORE.get());
                        output.accept(OreBlocks.HAZE_ICE_GOLD_ORE.get());
                        output.accept(OreBlocks.GRIMSTONE_LAPIS_ORE.get());
                        output.accept(OreBlocks.VOIDSTONE_LAPIS_ORE.get());
                        output.accept(OreBlocks.ETERNAL_ICE_LAPIS_ORE.get());
                        output.accept(OreBlocks.HAZE_ICE_LAPIS_ORE.get());
                        output.accept(OreBlocks.GRIMSTONE_EMERALD_ORE.get());
                        output.accept(OreBlocks.VOIDSTONE_EMERALD_ORE.get());
                        output.accept(OreBlocks.ETERNAL_ICE_EMERALD_ORE.get());
                        output.accept(OreBlocks.HAZE_ICE_EMERALD_ORE.get());
                        output.accept(OreBlocks.GRIMSTONE_DIAMOND_ORE.get());
                        output.accept(OreBlocks.VOIDSTONE_DIAMOND_ORE.get());
                        output.accept(OreBlocks.ETERNAL_ICE_DIAMOND_ORE.get());
                        output.accept(OreBlocks.HAZE_ICE_DIAMOND_ORE.get());
                    }).build());
    public static void initialize(IEventBus modEventBus){
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}

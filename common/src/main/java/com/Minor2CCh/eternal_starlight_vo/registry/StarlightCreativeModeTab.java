package com.Minor2CCh.eternal_starlight_vo.registry;

import com.Minor2CCh.eternal_starlight_vo.Eternal_starlight_vo;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

@SuppressWarnings("unused")
public class StarlightCreativeModeTab {
    public static final Supplier<CreativeModeTab> TAB_ETERNAL_STARLIGHT_VO = Eternal_starlight_vo.PLATFORM.creativeModeTabRegister(
            "tab",
            () -> new ItemStack(OreItems.VOIDSTONE_EMERALD_ORE.get()),
            (parameters, output) ->{
                output.accept(OreItems.GRIMSTONE_IRON_ORE.get());
                output.accept(OreItems.VOIDSTONE_IRON_ORE.get());
                output.accept(OreItems.ETERNAL_ICE_IRON_ORE.get());
                output.accept(OreItems.HAZE_ICE_IRON_ORE.get());
                output.accept(OreItems.GRIMSTONE_COAL_ORE.get());
                output.accept(OreItems.VOIDSTONE_COAL_ORE.get());
                output.accept(OreItems.ETERNAL_ICE_COAL_ORE.get());
                output.accept(OreItems.HAZE_ICE_COAL_ORE.get());
                output.accept(OreItems.GRIMSTONE_COPPER_ORE.get());
                output.accept(OreItems.VOIDSTONE_COPPER_ORE.get());
                output.accept(OreItems.ETERNAL_ICE_COPPER_ORE.get());
                output.accept(OreItems.HAZE_ICE_COPPER_ORE.get());
                output.accept(OreItems.GRIMSTONE_GOLD_ORE.get());
                output.accept(OreItems.VOIDSTONE_GOLD_ORE.get());
                output.accept(OreItems.ETERNAL_ICE_GOLD_ORE.get());
                output.accept(OreItems.HAZE_ICE_GOLD_ORE.get());
                output.accept(OreItems.GRIMSTONE_LAPIS_ORE.get());
                output.accept(OreItems.VOIDSTONE_LAPIS_ORE.get());
                output.accept(OreItems.ETERNAL_ICE_LAPIS_ORE.get());
                output.accept(OreItems.HAZE_ICE_LAPIS_ORE.get());
                output.accept(OreItems.GRIMSTONE_EMERALD_ORE.get());
                output.accept(OreItems.VOIDSTONE_EMERALD_ORE.get());
                output.accept(OreItems.ETERNAL_ICE_EMERALD_ORE.get());
                output.accept(OreItems.HAZE_ICE_EMERALD_ORE.get());
                output.accept(OreItems.GRIMSTONE_DIAMOND_ORE.get());
                output.accept(OreItems.VOIDSTONE_DIAMOND_ORE.get());
                output.accept(OreItems.ETERNAL_ICE_DIAMOND_ORE.get());
                output.accept(OreItems.HAZE_ICE_DIAMOND_ORE.get());
                output.accept(OreItems.GRIMSTONE_QUARTZ_ORE.get());
                output.accept(OreItems.VOIDSTONE_QUARTZ_ORE.get());
                output.accept(OreItems.ETERNAL_ICE_QUARTZ_ORE.get());
                output.accept(OreItems.HAZE_ICE_QUARTZ_ORE.get());
            }

    );
    public static CreativeModeTab createBuilder(CreativeModeTab.Builder builder, String id, Supplier<ItemStack> iconStack, BiConsumer<CreativeModeTab.ItemDisplayParameters, CreativeModeTab.Output> createTab){
        return builder
                .title(Component.translatable((String.format("itemGroup.%s.%s", Eternal_starlight_vo.MOD_ID, id))))
                .icon(iconStack)
                .displayItems(createTab::accept).build();
    }
    public static void init(){
    }
}

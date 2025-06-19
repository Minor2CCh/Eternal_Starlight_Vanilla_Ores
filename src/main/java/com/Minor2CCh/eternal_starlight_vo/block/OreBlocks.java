package com.Minor2CCh.eternal_starlight_vo.block;

import com.Minor2CCh.eternal_starlight_vo.Eternal_starlight_vo;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Supplier;


public class OreBlocks {
    public static final DeferredBlock<Block> GRIMSTONE_IRON_ORE =
            registerBlock("grimstone_iron_ore",
                    () -> new DropExperienceBlock(ConstantInt.of(0),BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> VOIDSTONE_IRON_ORE =
            registerBlock("voidstone_iron_ore",
                    () -> new DropExperienceBlock(ConstantInt.of(0),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> ETERNAL_ICE_IRON_ORE =
            registerBlock("eternal_ice_iron_ore",
                    () -> new DropExperienceBlock(ConstantInt.of(0),BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).sound(SoundType.GLASS).mapColor(MapColor.ICE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> HAZE_ICE_IRON_ORE =
            registerBlock("haze_ice_iron_ore",
                    () -> new DropExperienceBlock(ConstantInt.of(0),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).sound(SoundType.GLASS).mapColor(MapColor.ICE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> GRIMSTONE_COAL_ORE =
            registerBlock("grimstone_coal_ore",
                    () -> new DropExperienceBlock(UniformInt.of(0, 2),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> VOIDSTONE_COAL_ORE =
            registerBlock("voidstone_coal_ore",
                    () -> new DropExperienceBlock(UniformInt.of(0, 2),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COAL_ORE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> ETERNAL_ICE_COAL_ORE =
            registerBlock("eternal_ice_coal_ore",
                    () -> new DropExperienceBlock(UniformInt.of(0, 2),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE).sound(SoundType.GLASS).mapColor(MapColor.ICE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> HAZE_ICE_COAL_ORE =
            registerBlock("haze_ice_coal_ore",
                    () -> new DropExperienceBlock(UniformInt.of(0, 2),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COAL_ORE).sound(SoundType.GLASS).mapColor(MapColor.ICE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> GRIMSTONE_COPPER_ORE =
            registerBlock("grimstone_copper_ore",
                    () -> new DropExperienceBlock(ConstantInt.of(0),BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_ORE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> VOIDSTONE_COPPER_ORE =
            registerBlock("voidstone_copper_ore",
                    () -> new DropExperienceBlock(ConstantInt.of(0),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COPPER_ORE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> ETERNAL_ICE_COPPER_ORE =
            registerBlock("eternal_ice_copper_ore",
                    () -> new DropExperienceBlock(ConstantInt.of(0),BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_ORE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> HAZE_ICE_COPPER_ORE =
            registerBlock("haze_ice_copper_ore",
                    () -> new DropExperienceBlock(ConstantInt.of(0),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COPPER_ORE).sound(SoundType.GLASS).mapColor(MapColor.ICE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> GRIMSTONE_GOLD_ORE =
            registerBlock("grimstone_gold_ore",
                    () -> new DropExperienceBlock(ConstantInt.of(0),BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> VOIDSTONE_GOLD_ORE =
            registerBlock("voidstone_gold_ore",
                    () -> new DropExperienceBlock(ConstantInt.of(0),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_GOLD_ORE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> ETERNAL_ICE_GOLD_ORE =
            registerBlock("eternal_ice_gold_ore",
                    () -> new DropExperienceBlock(ConstantInt.of(0),BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE).sound(SoundType.GLASS).mapColor(MapColor.ICE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> HAZE_ICE_GOLD_ORE =
            registerBlock("haze_ice_gold_ore",
                    () -> new DropExperienceBlock(ConstantInt.of(0),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_GOLD_ORE).sound(SoundType.GLASS).mapColor(MapColor.ICE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> GRIMSTONE_LAPIS_ORE =
            registerBlock("grimstone_lapis_ore",
                    () -> new DropExperienceBlock(UniformInt.of(2, 5),BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_ORE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> VOIDSTONE_LAPIS_ORE =
            registerBlock("voidstone_lapis_ore",
                    () -> new DropExperienceBlock(UniformInt.of(2, 5),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_LAPIS_ORE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> ETERNAL_ICE_LAPIS_ORE =
            registerBlock("eternal_ice_lapis_ore",
                    () -> new DropExperienceBlock(UniformInt.of(2, 5),BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_ORE).sound(SoundType.GLASS).mapColor(MapColor.ICE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> HAZE_ICE_LAPIS_ORE =
            registerBlock("haze_ice_lapis_ore",
                    () -> new DropExperienceBlock(UniformInt.of(2, 5),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_LAPIS_ORE).sound(SoundType.GLASS).mapColor(MapColor.ICE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> GRIMSTONE_EMERALD_ORE =
            registerBlock("grimstone_emerald_ore",
                    () -> new DropExperienceBlock(UniformInt.of(3, 7),BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> VOIDSTONE_EMERALD_ORE =
            registerBlock("voidstone_emerald_ore",
                    () -> new DropExperienceBlock(UniformInt.of(3, 7),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_EMERALD_ORE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> ETERNAL_ICE_EMERALD_ORE =
            registerBlock("eternal_ice_emerald_ore",
                    () -> new DropExperienceBlock(UniformInt.of(3, 7),BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE).sound(SoundType.GLASS).mapColor(MapColor.ICE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> HAZE_ICE_EMERALD_ORE =
            registerBlock("haze_ice_emerald_ore",
                    () -> new DropExperienceBlock(UniformInt.of(3, 7),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_EMERALD_ORE).sound(SoundType.GLASS).mapColor(MapColor.ICE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> GRIMSTONE_DIAMOND_ORE =
            registerBlock("grimstone_diamond_ore",
                    () -> new DropExperienceBlock(UniformInt.of(3, 7),BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> VOIDSTONE_DIAMOND_ORE =
            registerBlock("voidstone_diamond_ore",
                    () -> new DropExperienceBlock(UniformInt.of(3, 7),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> ETERNAL_ICE_DIAMOND_ORE =
            registerBlock("eternal_ice_diamond_ore",
                    () -> new DropExperienceBlock(UniformInt.of(3, 7),BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).sound(SoundType.GLASS).mapColor(MapColor.ICE))
                    , new Item.Properties());
    public static final DeferredBlock<Block> HAZE_ICE_DIAMOND_ORE =
            registerBlock("haze_ice_diamond_ore",
                    () -> new DropExperienceBlock(UniformInt.of(3, 7),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE).sound(SoundType.GLASS).mapColor(MapColor.ICE))
                    , new Item.Properties());

    public static void initialize(){

    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String idPath, Supplier<T> block, Item.Properties itemProperties) {
        DeferredBlock<T> result = Eternal_starlight_vo.BLOCKS.register(idPath, block);
        Eternal_starlight_vo.ITEMS.register(idPath,
                () -> new BlockItem(result.get(), itemProperties));
        return result;
    }
}

package com.Minor2CCh.eternal_starlight_vo;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class OreBlocks {
    public static final Block GRIMSTONE_IRON_ORE = register(
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(Blocks.IRON_ORE)),
            "grimstone_iron_ore", true);
    public static final Block VOIDSTONE_IRON_ORE = register(
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE)),
            "voidstone_iron_ore", true);
    public static final Block ETERNAL_ICE_IRON_ORE = register(
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(Blocks.IRON_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "eternal_ice_iron_ore", true);
    public static final Block HAZE_ICE_IRON_ORE = register(
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "haze_ice_iron_ore", true);
    public static final Block GRIMSTONE_COAL_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.copy(Blocks.COAL_ORE)),
            "grimstone_coal_ore", true);
    public static final Block VOIDSTONE_COAL_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE)),
            "voidstone_coal_ore", true);
    public static final Block ETERNAL_ICE_COAL_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.copy(Blocks.COAL_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "eternal_ice_coal_ore", true);
    public static final Block HAZE_ICE_COAL_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(0, 2),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "haze_ice_coal_ore", true);
    public static final Block GRIMSTONE_COPPER_ORE = register(
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(Blocks.COPPER_ORE)),
            "grimstone_copper_ore", true);
    public static final Block VOIDSTONE_COPPER_ORE = register(
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE)),
            "voidstone_copper_ore", true);
    public static final Block ETERNAL_ICE_COPPER_ORE = register(
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(Blocks.COPPER_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "eternal_ice_copper_ore", true);
    public static final Block HAZE_ICE_COPPER_ORE = register(
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "haze_ice_copper_ore", true);
    public static final Block GRIMSTONE_GOLD_ORE = register(
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(Blocks.GOLD_ORE)),
            "grimstone_gold_ore", true);
    public static final Block VOIDSTONE_GOLD_ORE = register(
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)),
            "voidstone_gold_ore", true);
    public static final Block ETERNAL_ICE_GOLD_ORE = register(
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(Blocks.GOLD_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "eternal_ice_gold_ore", true);
    public static final Block HAZE_ICE_GOLD_ORE = register(
            new ExperienceDroppingBlock(ConstantIntProvider.create(0),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "haze_ice_gold_ore", true);
    public static final Block GRIMSTONE_LAPIS_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)),
            "grimstone_lapis_ore", true);
    public static final Block VOIDSTONE_LAPIS_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE)),
            "voidstone_lapis_ore", true);
    public static final Block ETERNAL_ICE_LAPIS_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "eternal_ice_lapis_ore", true);
    public static final Block HAZE_ICE_LAPIS_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "haze_ice_lapis_ore", true);
    public static final Block GRIMSTONE_EMERALD_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)),
            "grimstone_emerald_ore", true);
    public static final Block VOIDSTONE_EMERALD_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)),
            "voidstone_emerald_ore", true);
    public static final Block ETERNAL_ICE_EMERALD_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "eternal_ice_emerald_ore", true);
    public static final Block HAZE_ICE_EMERALD_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "haze_ice_emerald_ore", true);
    public static final Block GRIMSTONE_DIAMOND_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)),
            "grimstone_diamond_ore", true);
    public static final Block VOIDSTONE_DIAMOND_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)),
            "voidstone_diamond_ore", true);
    public static final Block ETERNAL_ICE_DIAMOND_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "eternal_ice_diamond_ore", true);
    public static final Block HAZE_ICE_DIAMOND_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "haze_ice_diamond_ore", true);
    public static final Block GRIMSTONE_QUARTZ_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F)),
            "grimstone_quartz_ore", true);
    public static final Block VOIDSTONE_QUARTZ_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.copy(GRIMSTONE_QUARTZ_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)),
            "voidstone_quartz_ore", true);
    public static final Block ETERNAL_ICE_QUARTZ_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.copy(GRIMSTONE_QUARTZ_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "eternal_ice_quartz_ore", true);
    public static final Block HAZE_ICE_QUARTZ_ORE = register(
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.copy(VOIDSTONE_QUARTZ_ORE)
                            .mapColor(MapColor.PALE_PURPLE).sounds(BlockSoundGroup.GLASS)),
            "haze_ice_quartz_ore", true);
    public static final RegistryKey<ItemGroup> ETERNAL_STARLIGHT_VO_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Eternal_starlight_vo.MOD_ID, "minium_item_group"));
    public static final ItemGroup ETERNAL_STARLIGHT_VO_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(VOIDSTONE_EMERALD_ORE))
            .displayName(Text.translatable(String.format("itemGroup.%s.%s", Eternal_starlight_vo.MOD_ID, "eternal_starlight_vo_item")))
            .build();

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(Eternal_starlight_vo.MOD_ID, name);
        if (shouldRegisterItem) {
            Item.Settings ItemProperty = new Item.Settings();
            BlockItem blockItem = new BlockItem(block, ItemProperty);
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);

    }
    public static Block register(Block block, String name) {
        return register(block, name, false);

    }
    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, ETERNAL_STARLIGHT_VO_ITEM_GROUP_KEY, ETERNAL_STARLIGHT_VO_ITEM_GROUP);
        ItemGroupEvents.modifyEntriesEvent(ETERNAL_STARLIGHT_VO_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(GRIMSTONE_IRON_ORE);
            itemGroup.add(VOIDSTONE_IRON_ORE);
            itemGroup.add(ETERNAL_ICE_IRON_ORE);
            itemGroup.add(HAZE_ICE_IRON_ORE);
            itemGroup.add(GRIMSTONE_COAL_ORE);
            itemGroup.add(VOIDSTONE_COAL_ORE);
            itemGroup.add(ETERNAL_ICE_COAL_ORE);
            itemGroup.add(HAZE_ICE_COAL_ORE);
            itemGroup.add(GRIMSTONE_COPPER_ORE);
            itemGroup.add(VOIDSTONE_COPPER_ORE);
            itemGroup.add(ETERNAL_ICE_COPPER_ORE);
            itemGroup.add(HAZE_ICE_COPPER_ORE);
            itemGroup.add(GRIMSTONE_GOLD_ORE);
            itemGroup.add(VOIDSTONE_GOLD_ORE);
            itemGroup.add(ETERNAL_ICE_GOLD_ORE);
            itemGroup.add(HAZE_ICE_GOLD_ORE);
            itemGroup.add(GRIMSTONE_LAPIS_ORE);
            itemGroup.add(VOIDSTONE_LAPIS_ORE);
            itemGroup.add(ETERNAL_ICE_LAPIS_ORE);
            itemGroup.add(HAZE_ICE_LAPIS_ORE);
            itemGroup.add(GRIMSTONE_EMERALD_ORE);
            itemGroup.add(VOIDSTONE_EMERALD_ORE);
            itemGroup.add(ETERNAL_ICE_EMERALD_ORE);
            itemGroup.add(HAZE_ICE_EMERALD_ORE);
            itemGroup.add(GRIMSTONE_DIAMOND_ORE);
            itemGroup.add(VOIDSTONE_DIAMOND_ORE);
            itemGroup.add(ETERNAL_ICE_DIAMOND_ORE);
            itemGroup.add(HAZE_ICE_DIAMOND_ORE);
            itemGroup.add(GRIMSTONE_QUARTZ_ORE);
            itemGroup.add(VOIDSTONE_QUARTZ_ORE);
            itemGroup.add(ETERNAL_ICE_QUARTZ_ORE);
            itemGroup.add(HAZE_ICE_QUARTZ_ORE);

        });

    }
}

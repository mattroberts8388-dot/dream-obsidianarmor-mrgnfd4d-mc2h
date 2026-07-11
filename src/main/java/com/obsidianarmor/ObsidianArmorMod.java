package com.obsidianarmor;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ObsidianArmorMod implements ModInitializer {
    public static final String MOD_ID = "obsidianarmor";

    public static final Item OBSIDIAN_INGOT = new Item(new FabricItemSettings());

    public static final ArmorItem OBSIDIAN_HELMET =
            new ObsidianArmorItem(ObsidianArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final ArmorItem OBSIDIAN_CHESTPLATE =
            new ObsidianArmorItem(ObsidianArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
    public static final ArmorItem OBSIDIAN_LEGGINGS =
            new ObsidianArmorItem(ObsidianArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new FabricItemSettings());
    public static final ArmorItem OBSIDIAN_BOOTS =
            new ObsidianArmorItem(ObsidianArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new FabricItemSettings());

    public static final RegistryKey<ItemGroup> OBSIDIAN_GROUP_KEY =
            RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "obsidian_group"));

    public static final ItemGroup OBSIDIAN_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(OBSIDIAN_INGOT))
            .displayName(Text.translatable("itemGroup.obsidianarmor.obsidian_group"))
            .build();

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "obsidian_ingot"), OBSIDIAN_INGOT);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "obsidian_helmet"), OBSIDIAN_HELMET);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "obsidian_chestplate"), OBSIDIAN_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "obsidian_leggings"), OBSIDIAN_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "obsidian_boots"), OBSIDIAN_BOOTS);

        Registry.register(Registries.ITEM_GROUP, OBSIDIAN_GROUP_KEY, OBSIDIAN_GROUP);

        ItemGroupEvents.modifyEntriesEvent(OBSIDIAN_GROUP_KEY).register(entries -> {
            entries.add(OBSIDIAN_INGOT);
            entries.add(OBSIDIAN_HELMET);
            entries.add(OBSIDIAN_CHESTPLATE);
            entries.add(OBSIDIAN_LEGGINGS);
            entries.add(OBSIDIAN_BOOTS);
        });
    }
}
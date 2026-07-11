package com.obsidianarmor;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ObsidianArmorItem extends ArmorItem {
    public ObsidianArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, net.minecraft.entity.Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if (world.isClient) {
            return;
        }
        if (!(entity instanceof PlayerEntity player)) {
            return;
        }
        // Only apply effects when the full obsidian armor set is worn.
        if (hasFullObsidianSet(player)) {
            applyEffect(player, StatusEffects.FIRE_RESISTANCE, 220, 0);
            applyEffect(player, StatusEffects.SLOWNESS, 220, 0);
        }
    }

    private static boolean hasFullObsidianSet(PlayerEntity player) {
        ItemStack head = player.getInventory().getArmorStack(3);
        ItemStack chest = player.getInventory().getArmorStack(2);
        ItemStack legs = player.getInventory().getArmorStack(1);
        ItemStack feet = player.getInventory().getArmorStack(0);
        return head.getItem() == ObsidianArmorMod.OBSIDIAN_HELMET
                && chest.getItem() == ObsidianArmorMod.OBSIDIAN_CHESTPLATE
                && legs.getItem() == ObsidianArmorMod.OBSIDIAN_LEGGINGS
                && feet.getItem() == ObsidianArmorMod.OBSIDIAN_BOOTS;
    }

    private static void applyEffect(PlayerEntity player, StatusEffect effect, int duration, int amplifier) {
        StatusEffectInstance current = player.getStatusEffect(effect);
        if (current == null || current.getDuration() < 20) {
            player.addStatusEffect(new StatusEffectInstance(effect, duration, amplifier, false, false, true));
        }
    }
}
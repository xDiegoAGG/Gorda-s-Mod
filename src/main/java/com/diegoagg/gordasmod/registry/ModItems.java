package com.diegoagg.gordasmod.registry;

import com.diegoagg.gordasmod.GordasMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item GORDA_SPAWN_EGG = Registry.register(
            Registries.ITEM,
            Identifier.of(GordasMod.MOD_ID, "spawn_gorda"),
            new SpawnEggItem(ModEntities.GORDA, 0xFFFFFF, 0x000000, new Item.Settings())
    );

    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS)
                .register(entries -> entries.add(GORDA_SPAWN_EGG));
    }
}
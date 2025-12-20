package com.diegoagg.gordasmod.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.WolfEntity;

public class ModEntityAttributes {

    public static void register() {
        // Traer atributos del lobo de Minecraft como base

        DefaultAttributeContainer.Builder gordaAttributes = WolfEntity.createWolfAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0D);
        FabricDefaultAttributeRegistry.register(ModEntities.GORDA, gordaAttributes);
    }
}
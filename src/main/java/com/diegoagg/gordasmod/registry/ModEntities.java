package com.diegoagg.gordasmod.registry;

import com.diegoagg.gordasmod.GordasMod;
import com.diegoagg.gordasmod.entity.GordaEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<GordaEntity> GORDA = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(GordasMod.MOD_ID, "gorda"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GordaEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 0.85f))
                    .build()
    );

    public static void register() {
        // solo fuerza la carga
    }
}
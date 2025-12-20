package com.diegoagg.gordasmod.registry;

import com.diegoagg.gordasmod.entity.GordaEntity;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnLocationTypes;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class ModSpawns {

    public static void register() {

        // BIOMAS DONDE SPAWNEA LA GORDA

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.TAIGA, BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.SNOWY_TAIGA, BiomeKeys.FOREST, BiomeKeys.BIRCH_FOREST),
                SpawnGroup.CREATURE,
                ModEntities.GORDA,
                5,   // weight
                1,   // min group
                2    // max group
        );

        // RESTRICCIONES DE SPAWN

        SpawnRestriction.register(ModEntities.GORDA, SpawnLocationTypes.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, GordaEntity::canNaturalSpawn);
    }
}
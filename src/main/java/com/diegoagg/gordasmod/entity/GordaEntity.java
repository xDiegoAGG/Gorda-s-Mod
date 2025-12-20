package com.diegoagg.gordasmod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.world.World;

public class GordaEntity extends WolfEntity {
    public GordaEntity(EntityType<? extends WolfEntity> entityType, World world) {
        super(entityType, world);
    }
}
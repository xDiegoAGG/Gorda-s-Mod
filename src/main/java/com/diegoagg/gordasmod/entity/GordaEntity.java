package com.diegoagg.gordasmod.entity;

import com.diegoagg.gordasmod.entity.goal.FollowCatGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldAccess;

public class GordaEntity extends WolfEntity {

    public GordaEntity(EntityType<? extends WolfEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals(){
        super.initGoals();
        this.goalSelector.add(8, new FollowCatGoal(this));
    }

    public static boolean canNaturalSpawn(EntityType<GordaEntity> type, WorldAccess world, SpawnReason reason, BlockPos pos, Random random) {
    // Animales: solo en bloques donde pueden spawnear animales (pasto/tierra etc.)
    boolean validGround = world.getBlockState(pos.down()).isIn(BlockTags.ANIMALS_SPAWNABLE_ON);

    // Esto evita spawns en agua/aire raro
    boolean validVanilla = AnimalEntity.isValidNaturalSpawn(type, world, reason, pos, random);

    return validGround && validVanilla;
}
}
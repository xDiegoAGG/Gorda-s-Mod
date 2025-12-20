package com.diegoagg.gordasmod.entity;

import com.diegoagg.gordasmod.entity.goal.FollowCatGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.world.World;

public class GordaEntity extends WolfEntity {

    public GordaEntity(EntityType<? extends WolfEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals(){
        super.initGoals();
        this.goalSelector.add(8, new FollowCatGoal(this));
    }
}
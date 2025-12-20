package com.diegoagg.gordasmod.entity.goal;

import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.passive.WolfEntity;

import java.util.EnumSet;
import java.util.List;

public class FollowCatGoal extends Goal {

    private final WolfEntity wolf;
    private CatEntity targetCat;

    private static final double SPEED = 1.2;
    private static final double RANGE = 10.0;

    public FollowCatGoal(WolfEntity wolf) {
        this.wolf = wolf;
        this.setControls(EnumSet.of(Control.MOVE));
    }

    @Override
    public boolean canStart() {
        List<CatEntity> cats = wolf.getWorld()
                .getEntitiesByClass(
                        CatEntity.class,
                        wolf.getBoundingBox().expand(RANGE),
                        cat -> true
                );

        if (cats.isEmpty()) return false;

        targetCat = cats.get(0);
        return true;
    }

    @Override
    public boolean shouldContinue() {
        return targetCat != null
                && targetCat.isAlive()
                && wolf.squaredDistanceTo(targetCat) > 2.0;
    }

    @Override
    public void start() {
        wolf.getNavigation().startMovingTo(targetCat, SPEED);
    }

    @Override
    public void stop() {
        targetCat = null;
        wolf.getNavigation().stop();
    }

    @Override
    public void tick() {
        if (targetCat != null) {
            wolf.getNavigation().startMovingTo(targetCat, SPEED);
        }
    }
}

package com.diegoagg.gordasmod;

import com.diegoagg.gordasmod.registry.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.WolfEntityRenderer;

public class GordasModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Registrarle a la gorda el renderer del lobo provisionalmente
        EntityRendererRegistry.register(ModEntities.GORDA, WolfEntityRenderer::new);
    }
}

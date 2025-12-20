package com.diegoagg.gordasmod;

import com.diegoagg.gordasmod.client.model.GordaModel;
import com.diegoagg.gordasmod.client.render.GordaRenderer;
import com.diegoagg.gordasmod.registry.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class GordasModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Registrar el modelo layer
        EntityModelLayerRegistry.registerModelLayer(
            GordaModel.MODEL_LAYER,
            GordaModel::getTexturedModelData
        );

        // Registrar el renderer personalizado de La Gorda
        EntityRendererRegistry.register(
            ModEntities.GORDA,
            GordaRenderer::new
        );
    }
}

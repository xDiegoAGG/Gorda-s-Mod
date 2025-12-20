package com.diegoagg.gordasmod.client.render;

import com.diegoagg.gordasmod.client.model.GordaModel;
import com.diegoagg.gordasmod.entity.GordaEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GordaRenderer extends MobEntityRenderer<GordaEntity, GordaModel> {

    private static final Identifier TEXTURE =
            Identifier.of("gordas-mod", "textures/entity/gorda.png");

    public GordaRenderer(EntityRendererFactory.Context context) {
        super(context, new GordaModel(context.getPart(GordaModel.MODEL_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(GordaEntity entity) {
        return TEXTURE;
    }
}

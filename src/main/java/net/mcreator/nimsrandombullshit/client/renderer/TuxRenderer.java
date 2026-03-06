
package net.mcreator.nimsrandombullshit.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.nimsrandombullshit.entity.TuxEntity;
import net.mcreator.nimsrandombullshit.client.model.Modelpeguin;

import com.mojang.blaze3d.vertex.PoseStack;

public class TuxRenderer extends MobRenderer<TuxEntity, Modelpeguin<TuxEntity>> {
	public TuxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpeguin<TuxEntity>(context.bakeLayer(Modelpeguin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(TuxEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.25f, 1.25f, 1.25f);
	}

	@Override
	public ResourceLocation getTextureLocation(TuxEntity entity) {
		return new ResourceLocation("nims_random_bullshit:textures/entities/tux.png");
	}
}

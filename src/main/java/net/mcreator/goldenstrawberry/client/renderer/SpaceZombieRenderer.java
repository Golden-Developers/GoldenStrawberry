
package net.mcreator.goldenstrawberry.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.goldenstrawberry.entity.SpaceZombieEntity;

public class SpaceZombieRenderer extends MobRenderer<SpaceZombieEntity, CreeperModel<SpaceZombieEntity>> {
	public SpaceZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpaceZombieEntity entity) {
		return new ResourceLocation("goldenstrawberry:textures/entities/creeper.png");
	}
}

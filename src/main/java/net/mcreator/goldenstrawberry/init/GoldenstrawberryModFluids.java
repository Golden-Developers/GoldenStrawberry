
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.goldenstrawberry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.goldenstrawberry.fluid.SpaceFluidFluid;
import net.mcreator.goldenstrawberry.fluid.OuterSpaceFluidFluid;
import net.mcreator.goldenstrawberry.GoldenstrawberryMod;

public class GoldenstrawberryModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, GoldenstrawberryMod.MODID);
	public static final RegistryObject<FlowingFluid> SPACE_FLUID = REGISTRY.register("space_fluid", () -> new SpaceFluidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_SPACE_FLUID = REGISTRY.register("flowing_space_fluid", () -> new SpaceFluidFluid.Flowing());
	public static final RegistryObject<FlowingFluid> OUTER_SPACE_FLUID = REGISTRY.register("outer_space_fluid", () -> new OuterSpaceFluidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_OUTER_SPACE_FLUID = REGISTRY.register("flowing_outer_space_fluid", () -> new OuterSpaceFluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SPACE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SPACE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(OUTER_SPACE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_OUTER_SPACE_FLUID.get(), RenderType.translucent());
		}
	}
}


/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.goldenstrawberry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.goldenstrawberry.fluid.types.SpaceFluidFluidType;
import net.mcreator.goldenstrawberry.fluid.types.OuterSpaceFluidFluidType;
import net.mcreator.goldenstrawberry.GoldenstrawberryMod;

public class GoldenstrawberryModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, GoldenstrawberryMod.MODID);
	public static final RegistryObject<FluidType> SPACE_FLUID_TYPE = REGISTRY.register("space_fluid", () -> new SpaceFluidFluidType());
	public static final RegistryObject<FluidType> OUTER_SPACE_FLUID_TYPE = REGISTRY.register("outer_space_fluid", () -> new OuterSpaceFluidFluidType());
}

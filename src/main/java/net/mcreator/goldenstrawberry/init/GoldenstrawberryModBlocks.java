
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.goldenstrawberry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.goldenstrawberry.block.SpaceRoseBlock;
import net.mcreator.goldenstrawberry.block.SpacePortalBlock;
import net.mcreator.goldenstrawberry.block.SpaceFluidBlock;
import net.mcreator.goldenstrawberry.block.SpaceBlockBlock;
import net.mcreator.goldenstrawberry.block.OuterSpaceFluidBlock;
import net.mcreator.goldenstrawberry.GoldenstrawberryMod;

public class GoldenstrawberryModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GoldenstrawberryMod.MODID);
	public static final RegistryObject<Block> SPACE_ROSE = REGISTRY.register("space_rose", () -> new SpaceRoseBlock());
	public static final RegistryObject<Block> SPACE_FLUID = REGISTRY.register("space_fluid", () -> new SpaceFluidBlock());
	public static final RegistryObject<Block> SPACE_BLOCK = REGISTRY.register("space_block", () -> new SpaceBlockBlock());
	public static final RegistryObject<Block> SPACE_PORTAL = REGISTRY.register("space_portal", () -> new SpacePortalBlock());
	public static final RegistryObject<Block> OUTER_SPACE_FLUID = REGISTRY.register("outer_space_fluid", () -> new OuterSpaceFluidBlock());
}

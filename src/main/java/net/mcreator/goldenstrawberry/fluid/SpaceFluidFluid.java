
package net.mcreator.goldenstrawberry.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.goldenstrawberry.init.GoldenstrawberryModItems;
import net.mcreator.goldenstrawberry.init.GoldenstrawberryModFluids;
import net.mcreator.goldenstrawberry.init.GoldenstrawberryModFluidTypes;
import net.mcreator.goldenstrawberry.init.GoldenstrawberryModBlocks;

public abstract class SpaceFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> GoldenstrawberryModFluidTypes.SPACE_FLUID_TYPE.get(), () -> GoldenstrawberryModFluids.SPACE_FLUID.get(),
			() -> GoldenstrawberryModFluids.FLOWING_SPACE_FLUID.get()).explosionResistance(100f).tickRate(6).bucket(() -> GoldenstrawberryModItems.SPACE_FLUID_BUCKET.get()).block(() -> (LiquidBlock) GoldenstrawberryModBlocks.SPACE_FLUID.get());

	private SpaceFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SpaceFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SpaceFluidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}

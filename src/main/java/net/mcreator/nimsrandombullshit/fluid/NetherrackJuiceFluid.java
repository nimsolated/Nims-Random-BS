
package net.mcreator.nimsrandombullshit.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.nimsrandombullshit.init.NimsRandomBullshitModItems;
import net.mcreator.nimsrandombullshit.init.NimsRandomBullshitModFluids;
import net.mcreator.nimsrandombullshit.init.NimsRandomBullshitModFluidTypes;
import net.mcreator.nimsrandombullshit.init.NimsRandomBullshitModBlocks;

public abstract class NetherrackJuiceFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> NimsRandomBullshitModFluidTypes.NETHERRACK_JUICE_TYPE.get(), () -> NimsRandomBullshitModFluids.NETHERRACK_JUICE.get(),
			() -> NimsRandomBullshitModFluids.FLOWING_NETHERRACK_JUICE.get()).explosionResistance(100f).bucket(() -> NimsRandomBullshitModItems.NETHERRACK_JUICE_BUCKET.get())
			.block(() -> (LiquidBlock) NimsRandomBullshitModBlocks.NETHERRACK_JUICE.get());

	private NetherrackJuiceFluid() {
		super(PROPERTIES);
	}

	public static class Source extends NetherrackJuiceFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NetherrackJuiceFluid {
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

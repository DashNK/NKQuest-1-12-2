package net.mcreator.nkquest.procedure;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;

import net.mcreator.nkquest.block.BlockRemoveWater;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureFinishGorgeGen extends ElementsNkquest.ModElement {
	public ProcedureFinishGorgeGen(ElementsNkquest instance) {
		super(instance, 120);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure FinishGorgeGen!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure FinishGorgeGen!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure FinishGorgeGen!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure FinishGorgeGen!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double timer = 0;
		if (((timer) == 0)) {
			for (int index0 = 0; index0 < (int) (1); index0++) {
				timer = (double) ((timer) + 1);
			}
			if ((((timer) == 1) && (Biome.REGISTRY.getNameForObject(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
					.equals(new ResourceLocation("nkquest:gorge"))))) {
				world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockRemoveWater.block.getDefaultState(), 3);
				timer = (double) 0;
			}
		}
	}
}

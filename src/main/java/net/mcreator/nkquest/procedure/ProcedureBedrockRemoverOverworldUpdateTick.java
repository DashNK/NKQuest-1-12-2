package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.nkquest.block.BlockCrustrock;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureBedrockRemoverOverworldUpdateTick extends ElementsNkquest.ModElement {
	public ProcedureBedrockRemoverOverworldUpdateTick(ElementsNkquest instance) {
		super(instance, 386);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BedrockRemoverOverworldUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BedrockRemoverOverworldUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BedrockRemoverOverworldUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BedrockRemoverOverworldUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCrustrock.block.getDefaultState(), 3);
	}
}
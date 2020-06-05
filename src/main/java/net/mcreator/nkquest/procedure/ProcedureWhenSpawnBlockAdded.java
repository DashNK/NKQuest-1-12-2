package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.nkquest.block.BlockShellContainer;
import net.mcreator.nkquest.block.BlockMindsetInvContainer;
import net.mcreator.nkquest.block.BlockMindbendContainer;
import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureWhenSpawnBlockAdded extends ElementsNkquest.ModElement {
	public ProcedureWhenSpawnBlockAdded(ElementsNkquest instance) {
		super(instance, 131);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WhenSpawnBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WhenSpawnBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WhenSpawnBlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WhenSpawnBlockAdded!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		NkquestVariables.WorldVariables.get(world).DashShellContainerX = (double) x;
		NkquestVariables.WorldVariables.get(world).syncData(world);
		NkquestVariables.WorldVariables.get(world).DashShellContainerY = (double) (y - 1);
		NkquestVariables.WorldVariables.get(world).syncData(world);
		NkquestVariables.WorldVariables.get(world).DashShellContainerZ = (double) z;
		NkquestVariables.WorldVariables.get(world).syncData(world);
		NkquestVariables.MapVariables.get(world).MindsetX = (double) x;
		NkquestVariables.MapVariables.get(world).syncData(world);
		NkquestVariables.MapVariables.get(world).MindsetY = (double) (y - 2);
		NkquestVariables.MapVariables.get(world).syncData(world);
		NkquestVariables.MapVariables.get(world).MinddsetZ = (double) z;
		NkquestVariables.MapVariables.get(world).syncData(world);
		NkquestVariables.MapVariables.get(world).MindbendX = (double) x;
		NkquestVariables.MapVariables.get(world).syncData(world);
		NkquestVariables.MapVariables.get(world).MindbendY = (double) (y - 3);
		NkquestVariables.MapVariables.get(world).syncData(world);
		NkquestVariables.MapVariables.get(world).MindbendZ = (double) z;
		NkquestVariables.MapVariables.get(world).syncData(world);
		if ((((world.getBlockState(new BlockPos((int) (NkquestVariables.WorldVariables.get(world).DashShellContainerX),
				(int) (NkquestVariables.WorldVariables.get(world).DashShellContainerY),
				(int) (NkquestVariables.WorldVariables.get(world).DashShellContainerZ))))
						.getBlock() == BlockShellContainer.block.getDefaultState().getBlock()) == (false))) {
			world.setBlockState(new BlockPos((int) (NkquestVariables.WorldVariables.get(world).DashShellContainerX),
					(int) (NkquestVariables.WorldVariables.get(world).DashShellContainerY),
					(int) (NkquestVariables.WorldVariables.get(world).DashShellContainerZ)), BlockShellContainer.block.getDefaultState(), 3);
		}
		if ((((world.getBlockState(new BlockPos((int) (NkquestVariables.MapVariables.get(world).MindsetX),
				(int) (NkquestVariables.MapVariables.get(world).MindsetY), (int) (NkquestVariables.MapVariables.get(world).MinddsetZ))))
						.getBlock() == BlockMindsetInvContainer.block.getDefaultState().getBlock()) == (false))) {
			world.setBlockState(new BlockPos((int) (NkquestVariables.MapVariables.get(world).MindsetX),
					(int) (NkquestVariables.MapVariables.get(world).MindsetY), (int) (NkquestVariables.MapVariables.get(world).MinddsetZ)),
					BlockMindsetInvContainer.block.getDefaultState(), 3);
		}
		if ((((world.getBlockState(new BlockPos((int) (NkquestVariables.MapVariables.get(world).MindbendX),
				(int) (NkquestVariables.MapVariables.get(world).MindbendY), (int) (NkquestVariables.MapVariables.get(world).MindbendZ))))
						.getBlock() == BlockMindbendContainer.block.getDefaultState().getBlock()) == (false))) {
			world.setBlockState(
					new BlockPos((int) (NkquestVariables.MapVariables.get(world).MindbendX),
							(int) (NkquestVariables.MapVariables.get(world).MindbendY), (int) (NkquestVariables.MapVariables.get(world).MindbendZ)),
					BlockMindbendContainer.block.getDefaultState(), 3);
		}
	}
}

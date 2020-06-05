package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;

import net.mcreator.nkquest.block.BlockMysteryCapsule;
import net.mcreator.nkquest.block.BlockLuckyMysteryCapsule;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureDropMysteryCapsuleItems extends ElementsNkquest.ModElement {
	public ProcedureDropMysteryCapsuleItems(ElementsNkquest instance) {
		super(instance, 454);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DropMysteryCapsuleItems!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DropMysteryCapsuleItems!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DropMysteryCapsuleItems!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DropMysteryCapsuleItems!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double lootchecker = 0;
		boolean itemgiven = false;
		boolean readytobreak = false;
		world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
				.getObject(new ResourceLocation("nkquest:nkquest.block.capsulebreak")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockMysteryCapsule.block.getDefaultState().getBlock())) {
			for (int index0 = 0; index0 < (int) (2); index0++) {
				lootchecker = (double) ((lootchecker) + 1);
				if ((((lootchecker) == 1) && ((Math.random() < 0.1) && ((itemgiven) == (false))))) {
					{
						java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						$_dependencies.put("world", world);
						$_dependencies.put("x", (int) (x));
						$_dependencies.put("y", (int) (y));
						$_dependencies.put("z", (int) (z));
						ProcedureDropMusicDisc.executeProcedure($_dependencies);
					}
				}
				if ((((lootchecker) == 2) || ((itemgiven) == (true)))) {
					readytobreak = (boolean) (true);
				}
			}
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockLuckyMysteryCapsule.block.getDefaultState()
				.getBlock())) {
			for (int index1 = 0; index1 < (int) (2); index1++) {
				lootchecker = (double) ((lootchecker) + 1);
				if ((((lootchecker) == 1) && ((Math.random() < 0.15) && ((itemgiven) == (false))))) {
					{
						java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						$_dependencies.put("world", world);
						$_dependencies.put("x", (int) (x));
						$_dependencies.put("y", (int) (y));
						$_dependencies.put("z", (int) (z));
						ProcedureDropMusicDisc.executeProcedure($_dependencies);
					}
				}
				if ((((lootchecker) == 2) || ((itemgiven) == (true)))) {
					readytobreak = (boolean) (true);
				}
			}
		}
		if (((readytobreak) == (true))) {
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		}
	}
}

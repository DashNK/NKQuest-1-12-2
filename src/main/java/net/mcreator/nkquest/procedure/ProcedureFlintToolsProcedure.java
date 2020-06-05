package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.world.GameType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureFlintToolsProcedure extends ElementsNkquest.ModElement {
	public ProcedureFlintToolsProcedure(ElementsNkquest instance) {
		super(instance, 701);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FlintToolsProcedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure FlintToolsProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure FlintToolsProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure FlintToolsProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure FlintToolsProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).capabilities.isCreativeMode : false) == (false))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) == 0)) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).setGameType(GameType.SURVIVAL);
			}
		}
	}
}

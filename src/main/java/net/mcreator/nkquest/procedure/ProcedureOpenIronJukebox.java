package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.gui.GuiIronJukeboxGUI;
import net.mcreator.nkquest.Nkquest;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureOpenIronJukebox extends ElementsNkquest.ModElement {
	public ProcedureOpenIronJukebox(ElementsNkquest instance) {
		super(instance, 420);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure OpenIronJukebox!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure OpenIronJukebox!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure OpenIronJukebox!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure OpenIronJukebox!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure OpenIronJukebox!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(Nkquest.instance, GuiIronJukeboxGUI.GUIID, world, x, y, z);
	}
}

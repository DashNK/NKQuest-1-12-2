package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.gui.GuiWorldSetup;
import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.Nkquest;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureOpenWizard extends ElementsNkquest.ModElement {
	public ProcedureOpenWizard(ElementsNkquest instance) {
		super(instance, 355);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure OpenWizard!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure OpenWizard!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure OpenWizard!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure OpenWizard!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure OpenWizard!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((NkquestVariables.MapVariables.get(world).FirstPlay) == (true))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).openGui(Nkquest.instance, GuiWorldSetup.GUIID, world, x, y, z);
			NkquestVariables.WorldVariables.get(world).OwnerSet = (boolean) (true);
			NkquestVariables.WorldVariables.get(world).syncData(world);
		}
	}
}

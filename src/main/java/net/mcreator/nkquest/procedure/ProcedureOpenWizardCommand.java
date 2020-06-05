package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.gui.GuiWorldSetup;
import net.mcreator.nkquest.gui.GuiCharacterSelect;
import net.mcreator.nkquest.Nkquest;
import net.mcreator.nkquest.ElementsNkquest;

import java.util.HashMap;

@ElementsNkquest.ModElement.Tag
public class ProcedureOpenWizardCommand extends ElementsNkquest.ModElement {
	public ProcedureOpenWizardCommand(ElementsNkquest instance) {
		super(instance, 360);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure OpenWizardCommand!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure OpenWizardCommand!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure OpenWizardCommand!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure OpenWizardCommand!");
			return;
		}
		if (dependencies.get("cmdparams") == null) {
			System.err.println("Failed to load dependency cmdparams for procedure OpenWizardCommand!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure OpenWizardCommand!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		World world = (World) dependencies.get("world");
		if ((((entity.getEntityData().getBoolean("isOwner")) == (true)) && ((entity instanceof EntityPlayer) == (true)))) {
			if ((((new Object() {
				public String getText() {
					String param = (String) cmdparams.get("0");
					if (param != null) {
						return param;
					}
					return "";
				}
			}.getText())).equals("all"))) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).openGui(Nkquest.instance, GuiWorldSetup.GUIID, world, x, y, z);
			}
		}
		if (((entity instanceof EntityPlayer) == (true))) {
			if ((((new Object() {
				public String getText() {
					String param = (String) cmdparams.get("0");
					if (param != null) {
						return param;
					}
					return "";
				}
			}.getText())).equals("character"))) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).openGui(Nkquest.instance, GuiCharacterSelect.GUIID, world, x, y, z);
			}
		}
	}
}

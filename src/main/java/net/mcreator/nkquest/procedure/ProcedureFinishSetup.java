package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureFinishSetup extends ElementsNkquest.ModElement {
	public ProcedureFinishSetup(ElementsNkquest instance) {
		super(instance, 358);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FinishSetup!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure FinishSetup!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		NkquestVariables.MapVariables.get(world).FirstPlay = (boolean) (false);
		NkquestVariables.MapVariables.get(world).syncData(world);
		NkquestVariables.WorldVariables.get(world).SetupComplete = (boolean) (true);
		NkquestVariables.WorldVariables.get(world).syncData(world);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).closeScreen();
	}
}

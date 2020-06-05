package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.item.ItemDashToken;
import net.mcreator.nkquest.ElementsNkquest;

import ibxm.Player;

@ElementsNkquest.ModElement.Tag
public class ProcedureSwitchAbility extends ElementsNkquest.ModElement {
	public ProcedureSwitchAbility(ElementsNkquest instance) {
		super(instance, 71);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SwitchAbility!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SwitchAbility!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		double Ability = 0;
		String Player = "";
		if (((entity instanceof EntityPlayerMP) == ((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemDashToken.block, (int) (1)))
				: false))) {
			Ability = (double) ((Ability) + 1);
			Player = (String) "Dash";
			if ((((Ability) == 1) && (((Player)).equals("Dash")))) {
				if (entity instanceof EntityPlayer && !world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString(("" + ("Mode set to \"Rush\""))), (true));
				}
			}
			if ((((Ability) == 2) && (((Player)).equals("Dash")))) {
				if (entity instanceof EntityPlayer && !world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString(("" + ("Mode set to \"Boost\""))), (true));
				}
			}
			if ((((Ability) == 3) && (((Player)).equals("Dash")))) {
				Ability = (double) 0;
			}
		}
	}
}

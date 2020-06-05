package net.mcreator.nkquest.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.item.ItemStarArmor;
import net.mcreator.nkquest.item.ItemIceSword;
import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSelectShade extends ElementsNkquest.ModElement {
	public ProcedureSelectShade(ElementsNkquest instance) {
		super(instance, 487);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SelectShade!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getEntityData().setDouble("characterID", 3);
		NkquestVariables.CharacterID = (double) 3;
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemIceSword.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemStarArmor.boots, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).closeScreen();
	}
}

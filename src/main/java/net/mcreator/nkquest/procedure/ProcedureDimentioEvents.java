package net.mcreator.nkquest.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.item.ItemMagicBlast;
import net.mcreator.nkquest.item.ItemDimentioMask;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureDimentioEvents extends ElementsNkquest.ModElement {
	public ProcedureDimentioEvents(ElementsNkquest instance) {
		super(instance, 259);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DimentioEvents!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemMagicBlast.block, (int) (1)))
				: false))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemMagicBlast.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).capabilities.allowFlying = ((entity instanceof EntityPlayer)
					? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemDimentioMask.helmet, (int) (1)))
					: false);
			((EntityPlayer) entity).sendPlayerAbilities();
		}
	}
}

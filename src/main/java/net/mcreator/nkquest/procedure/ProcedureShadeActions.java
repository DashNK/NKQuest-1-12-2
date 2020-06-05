package net.mcreator.nkquest.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.item.ItemIceBall;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureShadeActions extends ElementsNkquest.ModElement {
	public ProcedureShadeActions(ElementsNkquest instance) {
		super(instance, 482);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ShadeActions!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double timer = 0;
		if (((timer) == 0)) {
			for (int index0 = 0; index0 < (int) (1); index0++) {
				timer = (double) ((timer) + 1);
				if (((timer) == 1)) {
					if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemIceBall.block, (int) (1)).getItem()) == (false))) {
						if (entity instanceof EntityPlayer)
							((EntityPlayer) entity).addExperienceLevel(-((int) 1));
						if (entity instanceof EntityPlayer)
							((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemIceBall.block, (int) (1)).getItem(), -1, (int) 1,
									null);
					}
					timer = (double) 0;
				}
			}
		}
	}
}

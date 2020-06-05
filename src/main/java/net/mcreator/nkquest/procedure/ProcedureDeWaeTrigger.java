package net.mcreator.nkquest.procedure;

import net.minecraft.world.WorldServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.nkquest.ElementsNkquest;

import java.util.Iterator;

@ElementsNkquest.ModElement.Tag
public class ProcedureDeWaeTrigger extends ElementsNkquest.ModElement {
	public ProcedureDeWaeTrigger(ElementsNkquest instance) {
		super(instance, 324);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DeWaeTrigger!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(Items.COMPASS, (int) (1))) : false)
				&& ((((entity instanceof EntityPlayerMP) && (entity.world instanceof WorldServer))
						? ((EntityPlayerMP) entity).getAdvancements()
								.getProgress(
										((WorldServer) entity.world).getAdvancementManager().getAdvancement(new ResourceLocation("nkquest:dewae")))
								.isDone()
						: false) == (false)))) {
			if (entity instanceof EntityPlayerMP) {
				Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
						.getAdvancement(new ResourceLocation("nkquest:dewae"));
				AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemaningCriteria().iterator();
					while (_iterator.hasNext()) {
						String _criterion = (String) _iterator.next();
						((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
					}
				}
			}
		}
	}
}

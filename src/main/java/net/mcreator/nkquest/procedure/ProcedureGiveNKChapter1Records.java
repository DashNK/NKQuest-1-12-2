package net.mcreator.nkquest.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.item.ItemNK_LightningLift3Disc;
import net.mcreator.nkquest.item.ItemNK_LightningLift2Disc;
import net.mcreator.nkquest.item.ItemNK_LightningLift1Disc;
import net.mcreator.nkquest.item.ItemNK_HijinxHeights3Disc;
import net.mcreator.nkquest.item.ItemNK_HiJinxHeights2Disc;
import net.mcreator.nkquest.item.ItemNK_HiJinxHeights1Disc;
import net.mcreator.nkquest.item.ItemNK_GreatGorge3Disc;
import net.mcreator.nkquest.item.ItemNK_CargoCanyon3Disc;
import net.mcreator.nkquest.item.ItemNK_CargoCanyon2Disc;
import net.mcreator.nkquest.item.ItemNK_CargoCanyon1Disc;
import net.mcreator.nkquest.item.ItemNKGreatGorge2Disc;
import net.mcreator.nkquest.item.ItemNKGreatGorge1Disc;
import net.mcreator.nkquest.item.ItemMusicBagNKChapter1;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureGiveNKChapter1Records extends ElementsNkquest.ModElement {
	public ProcedureGiveNKChapter1Records(ElementsNkquest instance) {
		super(instance, 440);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GiveNKChapter1Records!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double timer = 0;
		if (((timer) == 0)) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemMusicBagNKChapter1.block, (int) (1)).getItem(), -1, (int) 1,
						null);
			for (int index0 = 0; index0 < (int) (10); index0++) {
				timer = (double) ((timer) + 1);
			}
			if (((timer) == 10)) {
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemNKGreatGorge1Disc.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemNKGreatGorge2Disc.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemNK_GreatGorge3Disc.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemNK_CargoCanyon1Disc.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemNK_CargoCanyon2Disc.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemNK_CargoCanyon3Disc.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemNK_LightningLift1Disc.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemNK_LightningLift2Disc.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemNK_LightningLift3Disc.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemNK_HiJinxHeights1Disc.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemNK_HiJinxHeights2Disc.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemNK_HijinxHeights3Disc.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
			}
		}
	}
}

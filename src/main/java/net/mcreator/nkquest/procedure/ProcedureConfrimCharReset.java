package net.mcreator.nkquest.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.item.ItemTrinityToken;
import net.mcreator.nkquest.item.ItemShadeToken;
import net.mcreator.nkquest.item.ItemPunioToken;
import net.mcreator.nkquest.item.ItemPetchToken;
import net.mcreator.nkquest.item.ItemLukeToken;
import net.mcreator.nkquest.item.ItemLuigiFanToken;
import net.mcreator.nkquest.item.ItemIzzyToken;
import net.mcreator.nkquest.item.ItemDashToken;
import net.mcreator.nkquest.item.ItemChaosAngelToken;
import net.mcreator.nkquest.item.ItemBryanToken;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureConfrimCharReset extends ElementsNkquest.ModElement {
	public ProcedureConfrimCharReset(ElementsNkquest instance) {
		super(instance, 216);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ConfrimCharReset!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemDashToken.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemPetchToken.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemShadeToken.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemPunioToken.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemTrinityToken.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemBryanToken.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemLukeToken.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemLuigiFanToken.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemChaosAngelToken.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemIzzyToken.block, (int) (1)).getItem(), -1, (int) 1, null);
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).closeScreen();
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			ProcedureOpenCharacterMenu.executeProcedure($_dependencies);
		}
	}
}

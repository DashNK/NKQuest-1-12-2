package net.mcreator.nkquest.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.item.ItemTrinityToken;
import net.mcreator.nkquest.item.ItemSpeedSlayer;
import net.mcreator.nkquest.item.ItemPunioToken;
import net.mcreator.nkquest.item.ItemMindBlade;
import net.mcreator.nkquest.item.ItemLukeToken;
import net.mcreator.nkquest.item.ItemLuigiFanToken;
import net.mcreator.nkquest.item.ItemLightSword;
import net.mcreator.nkquest.item.ItemIzzyToken;
import net.mcreator.nkquest.item.ItemIceSword;
import net.mcreator.nkquest.item.ItemFireHammer;
import net.mcreator.nkquest.item.ItemEmeraldPurple;
import net.mcreator.nkquest.item.ItemDashEquip;
import net.mcreator.nkquest.item.ItemChaosAngelToken;
import net.mcreator.nkquest.item.ItemBryanToken;
import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedurePlayerSelectedClick extends ElementsNkquest.ModElement {
	public ProcedurePlayerSelectedClick(ElementsNkquest instance) {
		super(instance, 177);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PlayerSelectedClick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getEntityData().getBoolean("isDash")) == (true))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemSpeedSlayer.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemDashEquip.body, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemDashEquip.boots, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).closeScreen();
		}
		if (((entity.getEntityData().getBoolean("isPetch")) == (true))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).closeScreen();
		}
		if ((((NkquestVariables.Player)).equals("Shade"))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemIceSword.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
		}
		if ((((NkquestVariables.Player)).equals("Punio"))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemPunioToken.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).closeScreen();
		}
		if ((((NkquestVariables.Player)).equals("Trinity"))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemTrinityToken.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemMindBlade.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).closeScreen();
		}
		if ((((NkquestVariables.Player)).equals("Bryan"))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemBryanToken.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).closeScreen();
		}
		if ((((NkquestVariables.Player)).equals("Luke"))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemLukeToken.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemFireHammer.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).closeScreen();
		}
		if ((((NkquestVariables.Player)).equals("LuigiFan456"))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemLuigiFanToken.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemLightSword.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).closeScreen();
		}
		if ((((NkquestVariables.Player)).equals("Chaos Angel"))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemChaosAngelToken.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemEmeraldPurple.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).closeScreen();
		}
		if ((((NkquestVariables.Player)).equals("Izzy"))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemIzzyToken.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).closeScreen();
		}
		if ((((NkquestVariables.Player)).equals("Custom"))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).closeScreen();
		}
		NkquestVariables.Player = (String) "";
	}
}

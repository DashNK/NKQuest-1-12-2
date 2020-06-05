package net.mcreator.nkquest.procedure;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.item.ItemSpeedSlayerStrike;
import net.mcreator.nkquest.item.ItemSpeedSlayer;
import net.mcreator.nkquest.item.ItemDashShellItem;
import net.mcreator.nkquest.item.ItemDashEquip;
import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureOpenExternalInventoryOnKeyPressed extends ElementsNkquest.ModElement {
	public ProcedureOpenExternalInventoryOnKeyPressed(ElementsNkquest instance) {
		super(instance, 128);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure OpenExternalInventoryOnKeyPressed!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure OpenExternalInventoryOnKeyPressed!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure OpenExternalInventoryOnKeyPressed!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure OpenExternalInventoryOnKeyPressed!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure OpenExternalInventoryOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean rightclick = false;
		boolean giveshellitem = false;
		boolean giveshellarmor = false;
		boolean givespeedslayerstrike = false;
		boolean givespeedslayer = false;
		boolean giveicesword = false;
		boolean giveiceswordicestorm = false;
		if (((entity instanceof EntityPlayer) && (((entity.isSneaking()) == (false))
				&& (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(ItemDashShellItem.block, (int) (1)).getItem())))) {
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("world", world);
				$_dependencies.put("x", (int) ((NkquestVariables.WorldVariables.get(world).DashShellContainerX)));
				$_dependencies.put("y", (int) ((NkquestVariables.WorldVariables.get(world).DashShellContainerY)));
				$_dependencies.put("z", (int) ((NkquestVariables.WorldVariables.get(world).DashShellContainerZ)));
				ProcedureOpenDashShell.executeProcedure($_dependencies);
			}
		}
		if ((entity instanceof EntityPlayer)) {
			if ((((entity.isSneaking()) == (true))
					&& (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemDashShellItem.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemDashShellItem.block, (int) (1)).getItem(), -1, (int) 1,
							null);
				giveshellarmor = (boolean) (true);
			}
			if ((((entity.isSneaking()) == (true))
					&& (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemDashEquip.body, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemDashEquip.body, (int) (1)).getItem(), -1, (int) 1, null);
				giveshellitem = (boolean) (true);
			}
		}
		if (((giveshellitem) == (true))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemDashShellItem.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			giveshellitem = (boolean) (false);
		}
		if (((giveshellarmor) == (true))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemDashEquip.body, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			giveshellarmor = (boolean) (false);
		}
		if ((entity instanceof EntityPlayer)) {
			if ((((entity.isSneaking()) == (true))
					&& (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemSpeedSlayerStrike.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemSpeedSlayerStrike.block, (int) (1)).getItem(), -1, (int) 1,
							null);
				givespeedslayer = (boolean) (true);
			}
			if ((((entity.isSneaking()) == (true))
					&& (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemSpeedSlayer.block, (int) (1)).getItem()))) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemSpeedSlayer.block, (int) (1)).getItem(), -1, (int) 1,
							null);
				givespeedslayerstrike = (boolean) (true);
			}
		}
		if (((givespeedslayerstrike) == (true))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemSpeedSlayerStrike.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			givespeedslayerstrike = (boolean) (false);
		}
		if (((givespeedslayer) == (true))) {
			if (entity instanceof EntityPlayer) {
				ItemStack _setstack = new ItemStack(ItemSpeedSlayer.block, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
			}
			givespeedslayer = (boolean) (false);
		}
	}

	@SubscribeEvent
	public void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		EntityPlayer entity = event.getEntityPlayer();
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
		World world = event.getWorld();
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}

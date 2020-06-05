package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.nkquest.item.ItemDashEquip;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSpecialActions extends ElementsNkquest.ModElement {
	public ProcedureSpecialActions(ElementsNkquest instance) {
		super(instance, 502);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SpecialActions!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getEntityData().getBoolean("isDash")) == (true))) {
			if ((((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(0) : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemDashEquip.body, (int) (1)).getItem())
					|| (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(1) : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemDashEquip.body, (int) (1)).getItem()))
					|| ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(2) : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemDashEquip.body, (int) (1)).getItem())
							|| (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
									.getItem() == new ItemStack(ItemDashEquip.body, (int) (1)).getItem())))) {
				if (((entity.getEntityData().getBoolean("dashInShell")) == (false))) {
					if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
						entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
							@Override
							public String getName() {
								return "";
							}

							@Override
							public boolean canUseCommand(int permission, String command) {
								return true;
							}

							@Override
							public World getEntityWorld() {
								return entity.world;
							}

							@Override
							public MinecraftServer getServer() {
								return entity.world.getMinecraftServer();
							}

							@Override
							public boolean sendCommandFeedback() {
								return false;
							}

							@Override
							public BlockPos getPosition() {
								return entity.getPosition();
							}

							@Override
							public Vec3d getPositionVector() {
								return new Vec3d(entity.posX, entity.posY, entity.posZ);
							}

							@Override
							public Entity getCommandSenderEntity() {
								return entity;
							}
						}, "mpm url @p textures/player/dash_hide.png");
					}
					if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
						entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
							@Override
							public String getName() {
								return "";
							}

							@Override
							public boolean canUseCommand(int permission, String command) {
								return true;
							}

							@Override
							public World getEntityWorld() {
								return entity.world;
							}

							@Override
							public MinecraftServer getServer() {
								return entity.world.getMinecraftServer();
							}

							@Override
							public boolean sendCommandFeedback() {
								return false;
							}

							@Override
							public BlockPos getPosition() {
								return entity.getPosition();
							}

							@Override
							public Vec3d getPositionVector() {
								return new Vec3d(entity.posX, entity.posY, entity.posZ);
							}

							@Override
							public Entity getCommandSenderEntity() {
								return entity;
							}
						}, "mpm animation @p crawling");
					}
					entity.getEntityData().setBoolean("dashInShell", (true));
				}
			}
		}
	}
}

package net.mcreator.nkquest.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.nkquest.item.ItemIceBall;
import net.mcreator.nkquest.ElementsNkquest;

import java.util.Collection;

@ElementsNkquest.ModElement.Tag
public class ProcedureActionManager extends ElementsNkquest.ModElement {
	public ProcedureActionManager(ElementsNkquest instance) {
		super(instance, 263);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ActionManager!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getEntityData().getBoolean("isDash")) == (true))) {
			if ((((entity.getEntityData().getBoolean("dashInShell")) == (true)) && (((new Object() {
				boolean check() {
					if (entity instanceof EntityLivingBase) {
						Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
						for (PotionEffect effect : effects) {
							if (effect.getPotion() == MobEffects.REGENERATION)
								return true;
						}
					}
					return false;
				}
			}.check()) == (false)) && (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).experienceLevel : 0) > 0)))) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).addExperienceLevel(-((int) 1));
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) 600, (int) 1, (false), (false)));
			}
			if ((((entity.isSprinting()) == (true)) && (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).experienceLevel : 0) > 0))) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).addExperienceLevel(-((int) 1));
				if (((entity.getEntityData().getBoolean("dashBoosting")) == (false))) {
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
						}, "stopsound @a master nkquest:nkquest.master.dash_boost2");
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
						}, "playsound nkquest:nkquest.master.dash_boost2 master @a");
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
						}, "playsound nkquest:nkquest.ambient.dash_boost ambient @a");
					}
					entity.getEntityData().setBoolean("dashBoosting", (true));
				}
			}
		}
		if (((entity.getEntityData().getBoolean("isShade")) == (true))) {
			if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem())) {
				if (entity instanceof EntityPlayer) {
					ItemStack _setstack = new ItemStack(ItemIceBall.block, (int) (1));
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
				}
			}
		}
	}
}

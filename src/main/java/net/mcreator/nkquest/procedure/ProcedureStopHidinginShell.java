package net.mcreator.nkquest.procedure;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureStopHidinginShell extends ElementsNkquest.ModElement {
	public ProcedureStopHidinginShell(ElementsNkquest instance) {
		super(instance, 503);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure StopHidinginShell!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double xpos = 0;
		double ypos = 0;
		double zpos = 0;
		double curHealth = 0;
		if ((((entity.getEntityData().getBoolean("isDash")) == (true)) && ((entity.getEntityData().getBoolean("dashInShell")) == (true)))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 1, (int) 255, (false), (false)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 1, (int) 255, (false), (false)));
			entity.setInWeb();
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
			xpos = (double) (entity.posX);
			ypos = (double) (entity.posY);
			zpos = (double) (entity.posZ);
			entity.setPositionAndUpdate((xpos), (ypos), (zpos));
			if (((entity.getEntityData().getBoolean("healing")) == (false))) {
				curHealth = (double) ((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHealth() : -1);
				entity.getEntityData().setBoolean("healing", (true));
			}
			if (((entity.motionY) > 2)) {
				entity.getEntityData().setBoolean("dashInShell", (false));
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
			}
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, (int) 1, (int) 255, (false), (false)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 1, (int) 255, (false), (false)));
			entity.setInWeb();
			entity.setInWeb();
			entity.setInWeb();
			entity.setInWeb();
		}
		if (((((entity.getEntityData().getBoolean("isDash")) == (true)) && ((entity.getEntityData().getBoolean("dashInShell")) == (true)))
				&& ((entity.isSneaking()) == (true)))) {
			if (((entity.getEntityData().getBoolean("hasStarBoots")) == (false))) {
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
					}, "mpm url @p textures/player/dash_noshell_oldboots.png");
				}
				entity.getEntityData().setBoolean("dashInShell", (false));
				entity.getEntityData().setBoolean("healing", (false));
			}
			if (((entity.getEntityData().getBoolean("hasStarBoots")) == (true))) {
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
					}, "mpm url @p textures/player/dash_noshell_starboots.png");
				}
				entity.getEntityData().setBoolean("dashInShell", (false));
				entity.getEntityData().setBoolean("healing", (false));
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			int i = (int) entity.posX;
			int j = (int) entity.posY;
			int k = (int) entity.posZ;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}

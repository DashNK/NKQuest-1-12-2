package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.nkquest.potion.PotionIceStormPotion;
import net.mcreator.nkquest.ElementsNkquest;

import java.util.Collection;

@ElementsNkquest.ModElement.Tag
public class ProcedureIceStormTrigger extends ElementsNkquest.ModElement {
	public ProcedureIceStormTrigger(ElementsNkquest instance) {
		super(instance, 485);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure IceStormTrigger!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure IceStormTrigger!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure IceStormTrigger!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure IceStormTrigger!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure IceStormTrigger!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double timer = 0;
		if (((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z)) * 100.f) < -0.5)) {
			entity.getEntityData().setDouble("iceStormPower", 4);
		}
		if ((((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z)) * 100.f) < 0.5)
				&& ((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z))
						* 100.f) > -0.4))) {
			entity.getEntityData().setDouble("iceStormPower", 3);
		}
		if ((((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z)) * 100.f) < 1.5)
				&& ((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z))
						* 100.f) > 0.4))) {
			entity.getEntityData().setDouble("iceStormPower", 2);
		}
		if (((world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z)) * 100.f) > 1.5)) {
			entity.getEntityData().setDouble("iceStormPower", 1);
		}
		if (((entity.getEntityData().getBoolean("isShade")) == (true))) {
			if (((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).experienceLevel : 0) > (entity.getEntityData()
					.getDouble("iceStormPower")))
					&& (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).capabilities.isCreativeMode : false) == (false)))) {
				if (((new Object() {
					boolean check() {
						if (entity instanceof EntityLivingBase) {
							Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
							for (PotionEffect effect : effects) {
								if (effect.getPotion() == PotionIceStormPotion.potion)
									return true;
							}
						}
						return false;
					}
				}.check()) == (false))) {
					for (int index0 = 0; index0 < (int) (((1 + (entity.getEntityData().getDouble("iceStormPower")))
							* (entity.getEntityData().getDouble("iceStormPower")))); index0++) {
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
							}, "weather2 storm create hail");
						}
					}
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).addExperienceLevel(-((int) (entity.getEntityData().getDouble("iceStormPower"))));
					entity.getEntityData().setBoolean("iceStorm", (true));
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).addPotionEffect(
								new PotionEffect(PotionIceStormPotion.potion, (int) (300 * ((entity.getEntityData().getDouble("iceStormPower")) * 2)),
										(int) ((entity.getEntityData().getDouble("iceStormPower")) - 1), (false), (false)));
					{
						java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						$_dependencies.put("entity", entity);
						ProcedureIceStormTImer.executeProcedure($_dependencies);
					}
				}
			}
			if (((new Object() {
				boolean check() {
					if (entity instanceof EntityLivingBase) {
						Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
						for (PotionEffect effect : effects) {
							if (effect.getPotion() == PotionIceStormPotion.potion)
								return true;
						}
					}
					return false;
				}
			}.check()) == (false))) {
				for (int index1 = 0; index1 < (int) (((1 + (entity.getEntityData().getDouble("iceStormPower")))
						* (entity.getEntityData().getDouble("iceStormPower")))); index1++) {
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
						}, "weather2 storm create hail");
					}
				}
				if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).capabilities.isCreativeMode : false) == (true))) {
					entity.getEntityData().setBoolean("iceStorm", (true));
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).addPotionEffect(
								new PotionEffect(PotionIceStormPotion.potion, (int) (300 * ((entity.getEntityData().getDouble("iceStormPower")) * 2)),
										(int) ((entity.getEntityData().getDouble("iceStormPower")) - 1), (false), (false)));
					{
						java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
						$_dependencies.put("entity", entity);
						ProcedureIceStormTImer.executeProcedure($_dependencies);
					}
				}
			}
		}
	}
}

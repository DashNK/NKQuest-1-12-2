package net.mcreator.nkquest.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.DimensionManager;

import net.minecraft.world.WorldServer;
import net.minecraft.world.World;
import net.minecraft.world.Teleporter;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.world.WorldTutorial;
import net.mcreator.nkquest.gui.GuiWorldSetup;
import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.Nkquest;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureFirstJoinDetector extends ElementsNkquest.ModElement {
	public ProcedureFirstJoinDetector(ElementsNkquest instance) {
		super(instance, 350);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FirstJoinDetector!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure FirstJoinDetector!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure FirstJoinDetector!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure FirstJoinDetector!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure FirstJoinDetector!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double timer = 0;
		if (((timer) == 0)) {
			for (int index0 = 0; index0 < (int) (40); index0++) {
				timer = (double) ((timer) + 1);
			}
			if (((timer) == 40)) {
				if (((NkquestVariables.WorldVariables.get(world).SetupComplete) == (false))) {
					if (((NkquestVariables.WorldVariables.get(world).OwnerSet) == (false))) {
						if (((NkquestVariables.WorldVariables.get(world).SetupSkipped) == (false))) {
							NkquestVariables.WorldVariables.get(world).OwnerSet = (boolean) (true);
							NkquestVariables.WorldVariables.get(world).syncData(world);
							entity.getEntityData().setBoolean("isOwner", (true));
							if ((((world.provider.getDimension()) == (WorldTutorial.DIMID)) == (false))) {
								if (!entity.world.isRemote && !entity.isRiding() && !entity.isBeingRidden() && entity instanceof EntityPlayerMP) {
									int dimensionID = WorldTutorial.DIMID;
									class TeleporterDirect extends Teleporter {
										public TeleporterDirect(WorldServer worldserver) {
											super(worldserver);
										}

										@Override
										public void placeInPortal(Entity entity, float yawrotation) {
										}

										@Override
										public boolean placeInExistingPortal(Entity entity, float yawrotation) {
											return true;
										}

										@Override
										public boolean makePortal(Entity entity) {
											return true;
										}
									}
									EntityPlayerMP _player = (EntityPlayerMP) entity;
									_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID,
											new TeleporterDirect(_player.getServerWorld()));
									_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
											DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1,
											DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(), _player.rotationYaw,
											_player.rotationPitch);
								}
							}
							if (entity instanceof EntityLivingBase)
								((EntityLivingBase) entity)
										.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, (int) 1, (int) 1, (false), (false)));
							if (entity instanceof EntityPlayer)
								((EntityPlayer) entity).openGui(Nkquest.instance, GuiWorldSetup.GUIID, world, x, y, z);
						}
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent event) {
		Entity entity = event.player;
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", (int) entity.posX);
		dependencies.put("y", (int) entity.posY);
		dependencies.put("z", (int) entity.posZ);
		dependencies.put("world", entity.world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}

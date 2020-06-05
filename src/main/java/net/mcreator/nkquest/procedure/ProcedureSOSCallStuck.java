package net.mcreator.nkquest.procedure;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureSOSCallStuck extends ElementsNkquest.ModElement {
	public ProcedureSOSCallStuck(ElementsNkquest instance) {
		super(instance, 696);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SOSCallStuck!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SOSCallStuck!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SOSCallStuck!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SOSCallStuck!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double height = 0;
		double sossearching = 0;
		double cooldown = 0;
		if ((((entity instanceof EntityPlayer) == (true)) && (((entity.getEntityData().getBoolean("sosactive")) == (false))
				&& ((entity.getEntityData().getBoolean("sossearching")) == (false))))) {
			entity.getEntityData().setBoolean("sossearching", (true));
			if (((cooldown) == 0)) {
				for (int index0 = 0; index0 < (int) (10); index0++) {
					cooldown = (double) ((cooldown) + 1);
					if ((((cooldown) > 9) == (true))) {
						entity.getEntityData().setDouble("sosheight", ((entity.getEntityData().getDouble("sosheight")) + 1));
						cooldown = (double) 0;
						if ((((cooldown) > 9) == (true))) {
							if (((((world.isAirBlock(new BlockPos((int) x, (int) ((entity.posY) - 1.5), (int) z))) == (false))
									&& (((world.canSeeSky(new BlockPos((int) x, (int) ((entity.posY) - 1.5), (int) z))) == (true))
											|| ((world.canSeeSky(new BlockPos((int) x, (int) ((entity.posY) - 0.5), (int) z))) == (true))))
									&& (((((world.isAirBlock(new BlockPos((int) (x + 1), (int) (entity.posY), (int) z))) == (false))
											&& ((world.isAirBlock(new BlockPos((int) (x - 1), (int) (entity.posY), (int) z))) == (false)))
											&& (((world.isAirBlock(new BlockPos((int) x, (int) (entity.posY), (int) (z + 1)))) == (false))
													&& ((world.isAirBlock(new BlockPos((int) x, (int) (entity.posY), (int) (z - 1)))) == (false))))
											&& ((((world.isAirBlock(new BlockPos((int) (x + 1), (int) ((entity.posY) + 1), (int) z))) == (false))
													&& ((world
															.isAirBlock(new BlockPos((int) (x - 1), (int) ((entity.posY) + 1), (int) z))) == (false)))
													&& (((world
															.isAirBlock(new BlockPos((int) x, (int) ((entity.posY) + 1), (int) (z + 1)))) == (false))
															&& ((world.isAirBlock(new BlockPos((int) x, (int) ((entity.posY) + 1),
																	(int) (z - 1)))) == (false))))))) {
								if ((((entity.getEntityData().getBoolean("sosactive")) == (false)) && ((entity instanceof EntityPlayer) == (true)))) {
									if (entity instanceof EntityPlayer && !world.isRemote) {
										((EntityPlayer) entity).sendStatusMessage(new TextComponentString((""
												+ ("It seems you have fallen down a hole. Use this S.O.S. Charm to return to the surface? some XP may be lost!"))),
												(false));
									}
									entity.getEntityData().setBoolean("sosactive", (true));
								}
								if (((world.canSeeSky(
										new BlockPos((int) x, (int) (entity.getEntityData().getDouble("sosheight")), (int) z))) == (true))) {
									entity.getEntityData().setBoolean("sosactive", (true));
									entity.getEntityData().setDouble("sosheight", (height));
								}
							}
							if (((height) > 256)) {
								height = (double) 0;
							}
						}
					}
				}
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

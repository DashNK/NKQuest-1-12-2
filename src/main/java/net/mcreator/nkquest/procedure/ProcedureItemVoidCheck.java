package net.mcreator.nkquest.procedure;

import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.block.BlockItemVoidBlock;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureItemVoidCheck extends ElementsNkquest.ModElement {
	public ProcedureItemVoidCheck(ElementsNkquest instance) {
		super(instance, 702);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ItemVoidCheck!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ItemVoidCheck!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if ((((entity.getEntityData().getBoolean("doItemVoid")) == (true))
				&& ((world.getBlockState(new BlockPos((int) (entity.getEntityData().getDouble("xItemVoid")),
						(int) (entity.getEntityData().getDouble("yItemVoid")), (int) (entity.getEntityData().getDouble("zItemVoid")))))
								.getBlock() == Blocks.AIR.getDefaultState().getBlock()))) {
			world.setBlockState(new BlockPos((int) (entity.getEntityData().getDouble("xItemVoid")),
					(int) (entity.getEntityData().getDouble("yItemVoid")), (int) (entity.getEntityData().getDouble("zItemVoid"))),
					BlockItemVoidBlock.block.getDefaultState(), 3);
			entity.getEntityData().setBoolean("doItemVoid", (true));
			entity.getEntityData().setDouble("xItemVoid", 0);
			entity.getEntityData().setDouble("yItemVoid", 0);
			entity.getEntityData().setDouble("zItemVoid", 0);
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

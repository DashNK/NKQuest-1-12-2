package net.mcreator.nkquest.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

import net.mcreator.nkquest.block.BlockCherryLeavesPicked;
import net.mcreator.nkquest.block.BlockCherryLeaves;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureCherryLeavesGrow extends ElementsNkquest.ModElement {
	public ProcedureCherryLeavesGrow(ElementsNkquest instance) {
		super(instance, 53);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CherryLeavesGrow!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CherryLeavesGrow!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CherryLeavesGrow!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CherryLeavesGrow!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double growtimer = 0;
		boolean UseBonemeal = false;
		UseBonemeal = (boolean) (true);
		if (((UseBonemeal) == (true))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCherryLeavesPicked.block.getDefaultState()
					.getBlock())) {
				if ((Math.random() < 0.25)) {
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCherryLeaves.block.getDefaultState(), 3);
				}
			}
			UseBonemeal = (boolean) (false);
		}
		if (((growtimer) < 640)) {
			growtimer = (double) ((growtimer) + 1);
			if (((growtimer) == 640)) {
				if ((Math.random() < 0.05)) {
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockCherryLeaves.block.getDefaultState(), 3);
					growtimer = (double) 0;
				}
			}
		}
	}

	@SubscribeEvent
	public void onBonemeal(BonemealEvent event) {
		EntityPlayer entity = event.getEntityPlayer();
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
		World world = event.getWorld();
		ItemStack itemstack = event.getStack();
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("itemstack", itemstack);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}

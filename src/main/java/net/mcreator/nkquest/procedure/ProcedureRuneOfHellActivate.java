package net.mcreator.nkquest.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.item.ItemRuneOfHell;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureRuneOfHellActivate extends ElementsNkquest.ModElement {
	public ProcedureRuneOfHellActivate(ElementsNkquest instance) {
		super(instance, 39);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RuneOfHellActivate!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RuneOfHellActivate!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RuneOfHellActivate!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RuneOfHellActivate!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RuneOfHellActivate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.FLINT_AND_STEEL, (int) (1)).getItem())
				&& (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock())
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())
								&& (((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == Blocks.OBSIDIAN
										.getDefaultState().getBlock())
										|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.OBSIDIAN
												.getDefaultState().getBlock()))
										|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.OBSIDIAN
												.getDefaultState().getBlock())
												|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
														.getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock())))
										|| ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.OBSIDIAN
												.getDefaultState().getBlock())
												|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))
														.getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock()))
												|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
														.getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock())
														|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))
																.getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock())))))))) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.playSound((EntityPlayer) null, x, y, z,
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.flintandsteel.use")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		}
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemRuneOfHell.block, (int) (1)).getItem())
				&& (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock())
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())
								&& (((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == Blocks.OBSIDIAN
										.getDefaultState().getBlock())
										|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.OBSIDIAN
												.getDefaultState().getBlock()))
										|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.OBSIDIAN
												.getDefaultState().getBlock())
												|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
														.getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock())))
										|| ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.OBSIDIAN
												.getDefaultState().getBlock())
												|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))
														.getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock()))
												|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
														.getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock())
														|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))
																.getBlock() == Blocks.OBSIDIAN.getDefaultState().getBlock())))))))) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.FIRE.getDefaultState(), 3);
			world.playSound((EntityPlayer) null, x, y, z,
					(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.flintandsteel.use")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
			if ((!((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).capabilities.isCreativeMode : false))) {
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemRuneOfHell.block, (int) (1)).getItem(), -1, (int) 1, null);
			}
		}
	}

	@SubscribeEvent
	public void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
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

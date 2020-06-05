package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;

import net.mcreator.nkquest.item.ItemNK_LightningLift3Disc;
import net.mcreator.nkquest.item.ItemNK_LightningLift2Disc;
import net.mcreator.nkquest.item.ItemNK_LightningLift1Disc;
import net.mcreator.nkquest.item.ItemNK_HijinxHeights3Disc;
import net.mcreator.nkquest.item.ItemNK_HiJinxHeights2Disc;
import net.mcreator.nkquest.item.ItemNK_HiJinxHeights1Disc;
import net.mcreator.nkquest.item.ItemNK_GreatGorge3Disc;
import net.mcreator.nkquest.item.ItemNK_CargoCanyon3Disc;
import net.mcreator.nkquest.item.ItemNK_CargoCanyon2Disc;
import net.mcreator.nkquest.item.ItemNK_CargoCanyon1Disc;
import net.mcreator.nkquest.item.ItemNKGreatGorge2Disc;
import net.mcreator.nkquest.item.ItemNKGreatGorge1Disc;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureDropMusicDisc extends ElementsNkquest.ModElement {
	public ProcedureDropMusicDisc(ElementsNkquest instance) {
		super(instance, 475);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DropMusicDisc!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DropMusicDisc!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DropMusicDisc!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DropMusicDisc!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double lootitem = 0;
		double trigger = 0;
		if (((trigger) == 0)) {
			for (int index0 = 0; index0 < (int) (13); index0++) {
				trigger = (double) 1;
				lootitem = (double) ((lootitem) + 1);
				if ((((lootitem) == 1) && (Math.random() < 0.06))) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemNKGreatGorge1Disc.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					break;
				}
				if ((((lootitem) == 2) && (Math.random() < 0.06))) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemNKGreatGorge2Disc.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					break;
				}
				if ((((lootitem) == 3) && (Math.random() < 0.06))) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemNK_GreatGorge3Disc.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					break;
				}
				if ((((lootitem) == 4) && (Math.random() < 0.06))) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemNK_CargoCanyon1Disc.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					break;
				}
				if ((((lootitem) == 5) && (Math.random() < 0.06))) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemNK_CargoCanyon2Disc.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					break;
				}
				if ((((lootitem) == 6) && (Math.random() < 0.06))) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemNK_CargoCanyon3Disc.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					break;
				}
				if ((((lootitem) == 7) && (Math.random() < 0.06))) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemNK_LightningLift1Disc.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					break;
				}
				if ((((lootitem) == 8) && (Math.random() < 0.06))) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemNK_LightningLift2Disc.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					break;
				}
				if ((((lootitem) == 9) && (Math.random() < 0.06))) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemNK_LightningLift3Disc.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					break;
				}
				if ((((lootitem) == 10) && (Math.random() < 0.06))) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemNK_HiJinxHeights1Disc.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					break;
				}
				if ((((lootitem) == 11) && (Math.random() < 0.06))) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemNK_HiJinxHeights2Disc.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					break;
				}
				if ((((lootitem) == 12) && (Math.random() < 0.06))) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemNK_HijinxHeights3Disc.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
					break;
				}
				if (((lootitem) == 13)) {
					lootitem = (double) 0;
					trigger = (double) 0;
				}
			}
		}
	}
}

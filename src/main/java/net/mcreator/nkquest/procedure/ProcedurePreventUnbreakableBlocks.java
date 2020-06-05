package net.mcreator.nkquest.procedure;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.GameType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;

import net.mcreator.nkquest.item.ItemTwigglylimb;
import net.mcreator.nkquest.item.ItemSurvivalistMultitool;
import net.mcreator.nkquest.item.ItemFlintShovel;
import net.mcreator.nkquest.item.ItemFlintSaw;
import net.mcreator.nkquest.item.ItemFlintPickaxe;
import net.mcreator.nkquest.item.ItemFlintAxe;
import net.mcreator.nkquest.ElementsNkquest;

import java.util.Collection;

@ElementsNkquest.ModElement.Tag
public class ProcedurePreventUnbreakableBlocks extends ElementsNkquest.ModElement {
	public ProcedurePreventUnbreakableBlocks(ElementsNkquest instance) {
		super(instance, 699);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PreventUnbreakableBlocks!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure PreventUnbreakableBlocks!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure PreventUnbreakableBlocks!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure PreventUnbreakableBlocks!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PreventUnbreakableBlocks!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double timer = 0;
		boolean isAlreadyAdventureMode = false;
		boolean timeractive = false;
		if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).capabilities.isCreativeMode : false) == (false))) {
			if (((((((OreDictionary.containsMatch(false, OreDictionary.getOres("logWood"),
					(new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())))) == (true))
					|| ((OreDictionary.containsMatch(false, OreDictionary.getOres("logs"),
							(new ItemStack((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())))) == (true)))
					&& ((new Object() {
						boolean check() {
							if (entity instanceof EntityLivingBase) {
								Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
								for (PotionEffect effect : effects) {
									if (effect.getPotion() == MobEffects.MINING_FATIGUE)
										return true;
								}
							}
							return false;
						}
					}.check()) == (false)))
					&& (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemSurvivalistMultitool.block, (int) (1)).getItem()) == (false))
							&& (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getItem() == new ItemStack(ItemFlintSaw.block, (int) (1)).getItem()) == (false))
									&& ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
											.getItem() == new ItemStack(ItemFlintPickaxe.block, (int) (1)).getItem()) == (false)))))
					&& ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemFlintAxe.block, (int) (1)).getItem()) == (false))
							&& ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getItem() == new ItemStack(ItemFlintShovel.block, (int) (1)).getItem()) == (false)))
							&& ((((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getItem() == new ItemStack(Items.WOODEN_HOE, (int) (1)).getItem()) == (false))
									&& ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
											.getItem() == new ItemStack(Items.WOODEN_AXE, (int) (1)).getItem()) == (false)))
									&& (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
											.getItem() == new ItemStack(Items.WOODEN_SHOVEL, (int) (1)).getItem()) == (false))
											&& ((((entity instanceof EntityLivingBase)
													? ((EntityLivingBase) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)
															.getItem() == new ItemStack(Items.WOODEN_PICKAXE, (int) (1)).getItem()) == (false))))))) {
				entity.getEntityData().setBoolean("hasFatigue", (true));
				entity.getEntityData().setBoolean("doItemVoid", (true));
				entity.getEntityData().setDouble("xItemVoid", x);
				entity.getEntityData().setDouble("yItemVoid", y);
				entity.getEntityData().setDouble("zItemVoid", z);
				for (int index0 = 0; index0 < (int) (10); index0++) {
					if (((entity.getEntityData().getBoolean("hasFatigue")) == (true))) {
						timer = (double) ((timer) + 1);
						if (entity instanceof EntityPlayer)
							((EntityPlayer) entity).setGameType(GameType.ADVENTURE);
						if (entity instanceof EntityLivingBase) {
							((EntityLivingBase) entity).swingArm(EnumHand.MAIN_HAND);
						}
						if (((timer) > 9)) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
									(world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), 3);
							if (entity instanceof EntityPlayer)
								((EntityPlayer) entity).setGameType(GameType.SURVIVAL);
							if (entity instanceof EntityLivingBase) {
								((EntityLivingBase) entity).swingArm(EnumHand.MAIN_HAND);
							}
							timer = (double) 0;
							entity.getEntityData().setBoolean("hasFatigue", (false));
						}
					}
				}
			}
			if (((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getMaterial() == Material.LEAVES) == (true)) && ((new Object() {
				public boolean getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "limbSpawned")) == (false)))) {
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("limbSpawned", (true));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
				if (((Math.random() < 0.25) == (true))) {
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemTwigglylimb.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
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

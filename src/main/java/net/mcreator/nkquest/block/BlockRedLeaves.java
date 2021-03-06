
package net.mcreator.nkquest.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.nkquest.procedure.ProcedureChromaLeavesShift;
import net.mcreator.nkquest.creativetab.TabModTab;
import net.mcreator.nkquest.ElementsNkquest;

import java.util.Random;

@ElementsNkquest.ModElement.Tag
public class BlockRedLeaves extends ElementsNkquest.ModElement {
	@GameRegistry.ObjectHolder("nkquest:redleaves")
	public static final Block block = null;
	public BlockRedLeaves(ElementsNkquest instance) {
		super(instance, 90);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("redleaves"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("nkquest:redleaves", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.LEAVES);
			setUnlocalizedName("redleaves");
			setSoundType(SoundType.PLANT);
			setHarvestLevel("axe", 1);
			setHardness(1F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabModTab.tab);
		}

		@Override
		public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
			super.onBlockAdded(world, pos, state);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			world.scheduleUpdate(new BlockPos(x, y, z), this, this.tickRate(world));
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			super.updateTick(world, pos, state, random);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				ProcedureChromaLeavesShift.executeProcedure($_dependencies);
			}
			world.scheduleUpdate(new BlockPos(x, y, z), this, this.tickRate(world));
		}
	}
}

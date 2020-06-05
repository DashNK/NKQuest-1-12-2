
package net.mcreator.nkquest.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.nkquest.procedure.ProcedureDimentioEvents;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ItemDimentioMask extends ElementsNkquest.ModElement {
	@GameRegistry.ObjectHolder("nkquest:dimentiomaskhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("nkquest:dimentiomaskbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("nkquest:dimentiomasklegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("nkquest:dimentiomaskboots")
	public static final Item boots = null;
	public ItemDimentioMask(ElementsNkquest instance) {
		super(instance, 257);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DIMENTIOMASK", "nkquest:dimmask", 0, new int[]{0, 0, 0, 0}, 0, null, 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureDimentioEvents.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("dimentiomaskhelmet").setRegistryName("dimentiomaskhelmet").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("nkquest:dimentiomaskhelmet", "inventory"));
	}
}

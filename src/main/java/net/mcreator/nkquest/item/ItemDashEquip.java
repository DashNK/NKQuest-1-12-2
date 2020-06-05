
package net.mcreator.nkquest.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.nkquest.procedure.ProcedureShellEvents;
import net.mcreator.nkquest.creativetab.TabModTab;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ItemDashEquip extends ElementsNkquest.ModElement {
	@GameRegistry.ObjectHolder("nkquest:dashequiphelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("nkquest:dashequipbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("nkquest:dashequiplegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("nkquest:dashequipboots")
	public static final Item boots = null;
	public ItemDashEquip(ElementsNkquest instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DASHEQUIP", "nkquest:dash01_", 0, new int[]{0, 0, 0, 0}, 0,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureShellEvents.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("dashequipbody").setRegistryName("dashequipbody").setCreativeTab(TabModTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("dashequipboots")
				.setRegistryName("dashequipboots").setCreativeTab(TabModTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("nkquest:dashequipbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("nkquest:dashequipboots", "inventory"));
	}
}

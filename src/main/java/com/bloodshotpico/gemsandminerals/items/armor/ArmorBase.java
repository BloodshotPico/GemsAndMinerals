package com.bloodshotpico.gemsandminerals.items.armor;

import com.bloodshotpico.gemsandminerals.Main;
import com.bloodshotpico.gemsandminerals.init.ModItems;
import com.bloodshotpico.gemsandminerals.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel
{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		 setUnlocalizedName(name);
		 setRegistryName(name);
		 setCreativeTab(Main.CombatTab);
		 
		 ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}

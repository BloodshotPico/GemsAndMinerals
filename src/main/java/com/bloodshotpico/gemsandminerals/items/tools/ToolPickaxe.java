package com.bloodshotpico.gemsandminerals.items.tools;

import com.bloodshotpico.gemsandminerals.Main;
import com.bloodshotpico.gemsandminerals.init.ModItems;
import com.bloodshotpico.gemsandminerals.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolPickaxe extends ItemPickaxe implements IHasModel
{

	public ToolPickaxe(String name, ToolMaterial material) 
	{
	 super(material);
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 setCreativeTab(Main.ToolsTab);
	 
	 ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}

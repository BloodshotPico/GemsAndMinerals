package com.bloodshotpico.gemsandminerals.items.tools;

import com.bloodshotpico.gemsandminerals.Main;
import com.bloodshotpico.gemsandminerals.init.ModItems;
import com.bloodshotpico.gemsandminerals.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSpade extends ItemSpade implements IHasModel
{
	public ToolSpade(String name, ToolMaterial material) 
	{
	 super(material);
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 setCreativeTab(CreativeTabs.TOOLS);
	 
	 ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}

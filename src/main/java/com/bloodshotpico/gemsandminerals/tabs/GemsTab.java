package com.bloodshotpico.gemsandminerals.tabs;

import com.bloodshotpico.gemsandminerals.init.ModBlocks;
import com.bloodshotpico.gemsandminerals.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GemsTab extends CreativeTabs
{
	public GemsTab() 
	{
		super("gamgems");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.RUBY);
	}
}

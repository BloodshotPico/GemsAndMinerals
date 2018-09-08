package com.bloodshotpico.gemsandminerals.tabs;

import com.bloodshotpico.gemsandminerals.init.ModBlocks;
import com.bloodshotpico.gemsandminerals.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MainTab extends CreativeTabs
{
	public MainTab() 
	{
		super("gamores");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.RUBY_ORE);
	}
}

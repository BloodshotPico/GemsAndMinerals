package com.bloodshotpico.gemsandminerals.tabs;

import com.bloodshotpico.gemsandminerals.init.ModBlocks;
import com.bloodshotpico.gemsandminerals.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ToolsTab extends CreativeTabs
{
	public ToolsTab() 
	{
		super("gamtools");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.RUBY_PICKAXE);
	}
}

package com.bloodshotpico.gemsandminerals.tabs;

import com.bloodshotpico.gemsandminerals.init.ModBlocks;
import com.bloodshotpico.gemsandminerals.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlocksTab extends CreativeTabs
{
	public BlocksTab() 
	{
		super("gamblocks");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.RUBY_BLOCK);
	}
}

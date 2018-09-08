package com.bloodshotpico.gemsandminerals;

import com.bloodshotpico.gemsandminerals.init.ModRecipes;
import com.bloodshotpico.gemsandminerals.proxy.CommonProxy;
import com.bloodshotpico.gemsandminerals.tabs.MainTab;
import com.bloodshotpico.gemsandminerals.tabs.GemsTab;
import com.bloodshotpico.gemsandminerals.tabs.CombatTab;
import com.bloodshotpico.gemsandminerals.util.Reference;
import com.bloodshotpico.gemsandminerals.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static CreativeTabs MainTab = new MainTab();
	public static CreativeTabs GemsTab = new GemsTab();
	public static CreativeTabs ArmourTab = new CombatTab();
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
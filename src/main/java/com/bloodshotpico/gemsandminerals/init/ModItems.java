package com.bloodshotpico.gemsandminerals.init;

import java.util.ArrayList;
import java.util.List;

import com.bloodshotpico.gemsandminerals.items.ItemBase;
import com.bloodshotpico.gemsandminerals.items.armor.ArmorBase;
import com.bloodshotpico.gemsandminerals.items.tools.ToolAxe;
import com.bloodshotpico.gemsandminerals.items.tools.ToolHoe;
import com.bloodshotpico.gemsandminerals.items.tools.ToolPickaxe;
import com.bloodshotpico.gemsandminerals.items.tools.ToolSpade;
import com.bloodshotpico.gemsandminerals.items.tools.ToolSword;
import com.bloodshotpico.gemsandminerals.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Tier 1 Tool Materials   (MaterialName, HarvestLevel, Durability, Efficiency, Damage, Enchantability)
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 5, 1300, 7.5F, 2.0F, 22);
	public static final ToolMaterial MATERIAL_SAPPHIRE = EnumHelper.addToolMaterial("material_sapphire", 5, 1000, 7.2F, 4.0F, 22);
	public static final ToolMaterial MATERIAL_TOPAZ = EnumHelper.addToolMaterial("material_topaz", 5, 900, 7.1F, 2.0F, 22);
	public static final ToolMaterial MATERIAL_AMETHYST = EnumHelper.addToolMaterial("material_amethyst", 5, 1200, 7.2F, 2.0F, 22);
	
	//Tier 2 Tool Materials   (MaterialName, HarvestLevel, Durability, Efficiency, Damage, Enchantability)
	public static final ToolMaterial MATERIAL_PHOSPHOPHYLLITE = EnumHelper.addToolMaterial("material_phosphophyllite", 6, 2100, 7.9F, 4.0F, 24);
	
	//Tier 3 Tool Materials   (MaterialName, HarvestLevel, Durability, Efficiency, Damage, Enchantability)
	public static final ToolMaterial MATERIAL_ROSE_QUARTZ = EnumHelper.addToolMaterial("material_rose_quartz", 7, 3321, 8.0F, 6.0F, 28);
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Tier 1 Armor Materials (Name, TextureName, Durability, ReductionAmounts, Enchantability, SoundOnEquip, Toughness)
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 14, 
			new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SAPPHIRE = EnumHelper.addArmorMaterial("armor_material_sapphire", Reference.MOD_ID + ":sapphire", 16,
			new int[] {4, 8, 10, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_AMETHYST = EnumHelper.addArmorMaterial("armor_material_amethyst", Reference.MOD_ID + ":amethyst", 14,
			new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_TOPAZ = EnumHelper.addArmorMaterial("armor_material_topaz", Reference.MOD_ID + ":topaz", 14,
			new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	
	//Tier 2 Armor Materials (Name, TextureName, Durability, ReductionAmounts, Enchantability, SoundOnEquip, Toughness)
	public static final ArmorMaterial ARMOR_MATERIAL_PHOSPHOPHYLLITE = EnumHelper.addArmorMaterial("armor_material_phosphophyllite", Reference.MOD_ID + ":phosphophyllite", 18,
			new int[] {6, 10, 14, 6}, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0F);
	
	//Tier 3 Armor Materials (Name, TextureName, Durability, ReductionAmounts, Enchantability, SoundOnEquip, Toughness)
	public static final ArmorMaterial ARMOR_MATERIAL_ROSE_QUARTZ = EnumHelper.addArmorMaterial("armor_material_rose_quartz", Reference.MOD_ID + ":rose_quartz", 14,
			new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Gems
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item TOPAZ = new ItemBase("topaz");
	public static final Item AMETHYST = new ItemBase("amethyst");
	public static final Item PHOSPHOPHYLLITE = new ItemBase("phosphophyllite");
	public static final Item ROSE_QUARTZ = new ItemBase("rose_quartz");
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Armour
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Ruby Armour
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE =new  ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	
	//Sapphire Armour
	public static final Item SAPPHIRE_HELMET = new ArmorBase("sapphire_helmet", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.HEAD);
	public static final Item SAPPHIRE_CHESTPLATE = new ArmorBase("sapphire_chestplate", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPPHIRE_LEGGINGS = new ArmorBase("sapphire_leggings", ARMOR_MATERIAL_SAPPHIRE, 2, EntityEquipmentSlot.LEGS);
	public static final Item SAPPHIRE_BOOTS = new ArmorBase("sapphire_boots", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.FEET);
	
	//Amethyst Armour
	public static final Item AMETHYST_HELMET = new ArmorBase("amethyst_helmet", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.HEAD);
	public static final Item AMETHYST_CHESTPLATE = new ArmorBase("amethyst_chestplate", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.CHEST);
	public static final Item AMETHYST_LEGGINGS = new ArmorBase("amethyst_leggings", ARMOR_MATERIAL_AMETHYST, 2, EntityEquipmentSlot.LEGS);
	public static final Item AMETHYST_BOOTS = new ArmorBase("amethyst_boots", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.FEET);
	
	//Topaz Armour
	public static final Item TOPAZ_HELMET = new ArmorBase("topaz_helmet", ARMOR_MATERIAL_TOPAZ, 1, EntityEquipmentSlot.HEAD);
	public static final Item TOPAZ_CHESTPLATE = new ArmorBase("topaz_chestplate", ARMOR_MATERIAL_TOPAZ, 1, EntityEquipmentSlot.CHEST);
	public static final Item TOPAZ_LEGGINGS = new ArmorBase("topaz_leggings", ARMOR_MATERIAL_TOPAZ, 2, EntityEquipmentSlot.LEGS);
	public static final Item TOPAZ_BOOTS = new ArmorBase("topaz_boots", ARMOR_MATERIAL_TOPAZ, 1, EntityEquipmentSlot.FEET);
	
	//Phosphophyllite Armour
	public static final Item PHOSPHOPHYLLITE_HELMET = new ArmorBase("phosphophyllite_helmet", ARMOR_MATERIAL_PHOSPHOPHYLLITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item PHOSPHOPHYLLITE_CHESTPLATE = new ArmorBase("phosphophyllite_chestplate", ARMOR_MATERIAL_PHOSPHOPHYLLITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item PHOSPHOPHYLLITE_LEGGINGS = new ArmorBase("phosphophyllite_leggings", ARMOR_MATERIAL_PHOSPHOPHYLLITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item PHOSPHOPHYLLITE_BOOTS = new ArmorBase("phosphophyllite_boots", ARMOR_MATERIAL_PHOSPHOPHYLLITE, 1, EntityEquipmentSlot.FEET);
	
	//Rose Quartz Armour
	public static final Item ROSE_QUARTZ_HELMET = new ArmorBase("rose_quartz_helmet", ARMOR_MATERIAL_ROSE_QUARTZ, 1, EntityEquipmentSlot.HEAD);
	public static final Item ROSE_QUARTZ_CHESTPLATE = new ArmorBase("rose_quartz_chestplate", ARMOR_MATERIAL_ROSE_QUARTZ, 1, EntityEquipmentSlot.CHEST);
	public static final Item ROSE_QUARTZ_LEGGINGS = new ArmorBase("rose_quartz_leggings", ARMOR_MATERIAL_ROSE_QUARTZ, 2, EntityEquipmentSlot.LEGS);
	public static final Item ROSE_QUARTZ_BOOTS = new ArmorBase("rose_quartz_boots", ARMOR_MATERIAL_ROSE_QUARTZ, 1, EntityEquipmentSlot.FEET);
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//TOOLS
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//RubyTools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	//Sapphire Tools
	public static final ItemSword SAPPHIRE_SWORD = new ToolSword("sapphire_sword", MATERIAL_SAPPHIRE);
	public static final ItemSpade SAPPHIRE_SHOVEL = new ToolSpade("sapphire_shovel", MATERIAL_SAPPHIRE);
	public static final ItemPickaxe SAPPHIRE_PICKAXE = new ToolPickaxe("sapphire_pickaxe", MATERIAL_SAPPHIRE);
	public static final ItemAxe SAPPHIRE_AXE = new ToolAxe("sapphire_axe", MATERIAL_SAPPHIRE);
	public static final ItemHoe SAPPHIRE_HOE = new ToolHoe("sapphire_hoe", MATERIAL_SAPPHIRE);
	
	//Topaz Tools
	public static final ItemSword TOPAZ_SWORD = new ToolSword("topaz_sword", MATERIAL_TOPAZ);
	public static final ItemSpade TOPAZ_SHOVEL = new ToolSpade("topaz_shovel", MATERIAL_TOPAZ);
	public static final ItemPickaxe TOPAZ_PICKAXE = new ToolPickaxe("topaz_pickaxe", MATERIAL_TOPAZ);
	public static final ItemAxe TOPAZ_AXE = new ToolAxe("topaz_axe", MATERIAL_TOPAZ);
	public static final ItemHoe TOPAZ_HOE = new ToolHoe("topaz_hoe", MATERIAL_TOPAZ);
	
	//Amethyst Tools
	public static final ItemSword AMETHYST_SWORD = new ToolSword("amethyst_sword", MATERIAL_AMETHYST);
	public static final ItemSpade AMETHYST_SHOVEL = new ToolSpade("amethyst_shovel", MATERIAL_AMETHYST);
	public static final ItemPickaxe AMETHYST_PICKAXE = new ToolPickaxe("amethyst_pickaxe", MATERIAL_AMETHYST);
	public static final ItemAxe AMETHYST_AXE = new ToolAxe("amethyst_axe", MATERIAL_AMETHYST);
	public static final ItemHoe AMETHYST_HOE = new ToolHoe("amethyst_hoe", MATERIAL_AMETHYST);
	
	//Phosphophyllite Tools
	public static final ItemSword PHOSPHOPHYLLITE_SWORD = new ToolSword("phosphophyllite_sword", MATERIAL_PHOSPHOPHYLLITE);
	public static final ItemSpade PHOSPHOPHYLLITE_SHOVEL = new ToolSpade("phosphophyllite_shovel", MATERIAL_PHOSPHOPHYLLITE);
	public static final ItemPickaxe PHOSPHOPHYLLITE_PICKAXE = new ToolPickaxe("phosphophyllite_pickaxe", MATERIAL_PHOSPHOPHYLLITE);
	public static final ItemAxe PHOSPHOPHYLLITE_AXE = new ToolAxe("phosphophyllite_axe", MATERIAL_PHOSPHOPHYLLITE);
	public static final ItemHoe PHOSPHOPHYLLITE_HOE = new ToolHoe("phosphophyllite_hoe", MATERIAL_PHOSPHOPHYLLITE);
	
	//Rose Quartz Tools
	public static final ItemSword ROSE_QUARTZ_SWORD = new ToolSword("rose_quartz_sword", MATERIAL_ROSE_QUARTZ);
	public static final ItemSpade ROSE_QUARTZ_SHOVEL = new ToolSpade("rose_quartz_shovel", MATERIAL_ROSE_QUARTZ);
	public static final ItemPickaxe ROSE_QUARTZ_PICKAXE = new ToolPickaxe("rose_quartz_pickaxe", MATERIAL_ROSE_QUARTZ);
	public static final ItemAxe ROSE_QUARTZ_AXE = new ToolAxe("rose_quartz_axe", MATERIAL_ROSE_QUARTZ);
	public static final ItemHoe ROSE_QUARTZ_HOE = new ToolHoe("rose_quartz_hoe", MATERIAL_ROSE_QUARTZ);
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

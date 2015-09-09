package dk.MathiasVO053.RobinSamseCraft;

import dk.MathiasVO053.RobinSamseCraft.ArmorTools.RobinArmor;
import dk.MathiasVO053.RobinSamseCraft.ArmorTools.RsArmor;
import dk.MathiasVO053.RobinSamseCraft.ArmorTools.SamseArmor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ArmorToolReg {
	public static ItemArmor armorRobinHelmet;
	public static ItemArmor armorRobinChestplate;
	public static ItemArmor armorRobinLeggings;
	public static ItemArmor armorRobinBoots;
	//
	public static ItemArmor armorSamseHelmet;
	public static ItemArmor armorSamseChestplate;
	public static ItemArmor armorSamseLeggings;
	public static ItemArmor armorSamseBoots;
	//
	public static ItemArmor armorRobinSamseHelmet;
	public static ItemArmor armorRobinSamseChestplate;
	public static ItemArmor armorRobinSamseLeggings;
	public static ItemArmor armorRobinSamseBoots;
	//
	public static ArmorMaterial RobinArmor = EnumHelper.addArmorMaterial("RobinArmor", Strings.MODID + ":" + "robinsamsecraft:RobinArmor", 28, new int[] {1, 6, 4, 1 }, 8);
	public static ArmorMaterial SamseArmor = EnumHelper.addArmorMaterial("SamseArmor", "robinsamsecraft:SamseArmor", 40, new int[] {1, 5, 3, 1}, 17);
	public static ArmorMaterial RobinsamseArmor = EnumHelper.addArmorMaterial("RobinsamseArmor", "robinsamsecraft:RobinSamseArmor", 37, new int[] {3, 8, 6, 3}, 14);
	//
	public static ToolMaterial RobinMaterial = EnumHelper.addToolMaterial("RobinMaterial", 4, 1394, 12.0F, 4.0F, 8);
	public static ToolMaterial RobinSamseMaterial = EnumHelper.addToolMaterial("RobinSamseMaterial", 4, 1684, 11.0F, 5.0F, 14);
	public static ToolMaterial SamseMaterial = EnumHelper.addToolMaterial("SamseMaterial", 4, 1987, 7.0F, 3.0F, 17);
	//
	public static void init(){
		GameRegistry.registerItem(armorRobinHelmet = new RobinArmor("armorRobinHelmet", RobinArmor, 1, 0), "armorRobinHelmet");
		GameRegistry.registerItem(armorRobinChestplate = new RobinArmor("armorRobinChestplate", RobinArmor, 1, 1), "armorRobinChestplate");
		GameRegistry.registerItem(armorRobinLeggings = new RobinArmor("armorRobinLeggings", RobinArmor, 2, 2), "armorRobinLeggings");
		GameRegistry.registerItem(armorRobinBoots = new RobinArmor("armorRobinBoots", RobinArmor, 1, 3), "armorRobinBoots");
		//
		GameRegistry.registerItem(armorSamseHelmet = new SamseArmor("armorSamseHelmet", SamseArmor, 1, 0), "armorSamseHelmet");
		GameRegistry.registerItem(armorSamseChestplate = new SamseArmor("armorSamseChestplate", SamseArmor, 1, 1), "armorSamseChestplate");
		GameRegistry.registerItem(armorSamseLeggings = new SamseArmor("armorSamseLeggings", SamseArmor, 2, 2), "armorSamseLeggings");
		GameRegistry.registerItem(armorSamseBoots = new SamseArmor("armorSamseBoots", SamseArmor, 1, 3), "armorSamseBoots");
		//
		GameRegistry.registerItem(armorRobinSamseHelmet = new RsArmor("armorRobinSamseHelmet", RobinsamseArmor, 1, 0), "armorRobinSamseHelmet");
		GameRegistry.registerItem(armorRobinSamseChestplate = new RsArmor("armorRobinSamseChestplate", RobinsamseArmor, 1, 1), "armorRobinSamseChestplate");
		GameRegistry.registerItem(armorRobinSamseLeggings = new RsArmor("armorRobinSamseLeggings", RobinsamseArmor, 2, 2), "armorRobinSamseLeggings");
		GameRegistry.registerItem(armorRobinSamseBoots = new RsArmor("armorRobinSamseBoots", RobinsamseArmor, 1, 3), "armorRobinSamseBoots");
	}
	public static void registerRenders(){
		registerRender(armorRobinHelmet);
	}   
	public static void registerRender(ItemArmor item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}

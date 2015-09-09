package dk.MathiasVO053.RobinSamseCraft;

import dk.MathiasVO053.RobinSamseCraft.Items.BurnedRobSamcium;
import dk.MathiasVO053.RobinSamseCraft.Items.BurnedRobnium;
import dk.MathiasVO053.RobinSamseCraft.Items.BurnedSamcium;
import dk.MathiasVO053.RobinSamseCraft.Items.Infucium;
import dk.MathiasVO053.RobinSamseCraft.Items.InfuciumMk2;
import dk.MathiasVO053.RobinSamseCraft.Items.PowerCore;
import dk.MathiasVO053.RobinSamseCraft.Items.RainbowIngot;
import dk.MathiasVO053.RobinSamseCraft.Items.RainbowPowder;
import dk.MathiasVO053.RobinSamseCraft.Items.RobSamciumIngot;
import dk.MathiasVO053.RobinSamseCraft.Items.RobniumIngot;
import dk.MathiasVO053.RobinSamseCraft.Items.SamciumIngot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemReg {

	public static Item RainbowPowder;
	public static Item Infucium;
	public static Item BurnedRobSamcium;
	public static Item BurnedRobnium;
	public static Item BurnedSamcium;
	public static Item RobSamciumIngot;
	public static Item RobniumIngot;
	public static Item SamciumIngot;
	public static Item RainbowIngot;
	public static Item InfuciumMk2;
	public static Item PowerCore;
	
	
	public static void init(){
		RainbowPowder = new RainbowPowder().setUnlocalizedName("RainbowPowder").setCreativeTab(Main.rscTab);
		Infucium = new Infucium().setUnlocalizedName("Infucium").setCreativeTab(Main.rscTab);
		BurnedRobSamcium = new BurnedRobSamcium().setUnlocalizedName("BurnedRobSamcium").setCreativeTab(Main.rscTab);
		BurnedRobnium = new BurnedRobnium().setUnlocalizedName("BurnedRobnium").setCreativeTab(Main.rscTab);
		BurnedSamcium = new BurnedSamcium().setUnlocalizedName("BurnedSamcium").setCreativeTab(Main.rscTab);
		RobSamciumIngot = new RobSamciumIngot().setUnlocalizedName("RobSamciumIngot").setCreativeTab(Main.rscTab);
		RobniumIngot = new RobniumIngot().setUnlocalizedName("RobniumIngot").setCreativeTab(Main.rscTab);
		SamciumIngot = new SamciumIngot().setUnlocalizedName("SamciumIngot").setCreativeTab(Main.rscTab);
		RainbowIngot = new RainbowIngot().setUnlocalizedName("RainbowIngot").setCreativeTab(Main.rscTab);
		InfuciumMk2 = new InfuciumMk2().setUnlocalizedName("InfuciumMk2").setCreativeTab(Main.rscTab);
		PowerCore = new PowerCore().setUnlocalizedName("PowerCore").setCreativeTab(Main.rscTab);
	}
	public static void register(){
		GameRegistry.registerItem(RainbowPowder, "RainbowPowder");
		GameRegistry.registerItem(Infucium, "Infucium");
		GameRegistry.registerItem(BurnedRobSamcium, "BurnedRobSamcium");
		GameRegistry.registerItem(BurnedRobnium, "BurnedRobnium");
		GameRegistry.registerItem(BurnedSamcium, "BurnedSamcium");
		GameRegistry.registerItem(RobSamciumIngot, "RobSamciumIngot");
		GameRegistry.registerItem(RobniumIngot, "RobniumIngot");
		GameRegistry.registerItem(SamciumIngot, "SamciumIngot");
		GameRegistry.registerItem(RainbowIngot, "RainbowIngot");
		GameRegistry.registerItem(InfuciumMk2, "InfuciumMk2");
		GameRegistry.registerItem(PowerCore, "PowerCore");
	}
	public static void registerRenders(){
		registerRender(RainbowPowder);
		registerRender(Infucium);
		registerRender(BurnedRobSamcium);
		registerRender(BurnedRobnium);
		registerRender(BurnedSamcium);
		registerRender(RobSamciumIngot);
		registerRender(RobniumIngot);
		registerRender(SamciumIngot);
		registerRender(RainbowIngot);
		registerRender(InfuciumMk2);
		registerRender(PowerCore);
	}   
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
package dk.MathiasVO053.RobinSamseCraft;

import dk.MathiasVO053.RobinSamseCraft.proxy.ServerProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

		@Mod(modid = Strings.MODID, name = Strings.NAME, version = Strings.VERSION)		
		public class Main {
		
		public static final RobinSamseCraftTab rscTab = new RobinSamseCraftTab("TabRobinsamse");
		
		@SidedProxy(clientSide = Strings.CLIENTPROXY, serverSide = Strings.SERVERPROXY)
		public static ServerProxy proxy;
			
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
			ItemReg.init();
			ItemReg.register();
			ArmorToolReg.init();
	}
	@EventHandler
	public void Init(FMLInitializationEvent event){
		proxy.registerRenders();
	}
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event){
		
	}
}

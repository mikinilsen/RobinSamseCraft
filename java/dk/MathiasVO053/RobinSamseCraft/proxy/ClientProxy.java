package dk.MathiasVO053.RobinSamseCraft.proxy;

import dk.MathiasVO053.RobinSamseCraft.ArmorToolReg;
import dk.MathiasVO053.RobinSamseCraft.ItemReg;

public class ClientProxy extends ServerProxy{
	@Override
	public void registerRenders(){
		ItemReg.registerRenders();
		ArmorToolReg.registerRenders();
	}
}

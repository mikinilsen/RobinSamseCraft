package dk.MathiasVO053.RobinSamseCraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RobinSamseCraftTab extends CreativeTabs {

	public RobinSamseCraftTab(String label) {
		super(label);
		this.setBackgroundImageName("teleport.png");
	}

	@Override
	public Item getTabIconItem() {
		return ItemReg.RainbowPowder;
	}

}
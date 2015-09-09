package dk.MathiasVO053.RobinSamseCraft.ArmorTools;

import dk.MathiasVO053.RobinSamseCraft.ArmorToolReg;
import dk.MathiasVO053.RobinSamseCraft.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SamseArmor extends ItemArmor {
	public SamseArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Main.rscTab);
    }
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack){
		if(player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(0) != null){
			ItemStack helmet = player.getCurrentArmor(3);
			ItemStack boots = player.getCurrentArmor(0);
			ItemStack leggings = player.getCurrentArmor(1);
			ItemStack chest = player.getCurrentArmor(2);
				if(helmet.getItem() == ArmorToolReg.armorSamseHelmet && boots.getItem() == ArmorToolReg.armorSamseBoots && leggings.getItem() == ArmorToolReg.armorSamseLeggings && chest.getItem() == ArmorToolReg.armorSamseChestplate){
					player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 100, 0, false, false));
					player.addPotionEffect(new PotionEffect(Potion.absorption.getId(), 100, 0, false, false));
				}
		}
	}
}
package dk.MathiasVO053.RobinSamseCraft.ArmorTools;

import dk.MathiasVO053.RobinSamseCraft.ArmorToolReg;
import dk.MathiasVO053.RobinSamseCraft.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class RsArmor extends ItemArmor {
	public RsArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
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
				if(helmet.getItem() == ArmorToolReg.armorRobinSamseHelmet && boots.getItem() == ArmorToolReg.armorRobinSamseBoots && leggings.getItem() == ArmorToolReg.armorRobinSamseLeggings && chest.getItem() == ArmorToolReg.armorRobinSamseChestplate){
					player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 100, 0, false, false));

				}
		}
	}
}
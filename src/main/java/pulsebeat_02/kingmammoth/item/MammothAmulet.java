package pulsebeat_02.kingmammoth.item;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import pulsebeat_02.kingmammoth.KingMammoth;

public class MammothAmulet extends Item {
	
	public MammothAmulet() {

		setRegistryName(KingMammoth.MODID, "mammoth_amulet");
		setUnlocalizedName(KingMammoth.MODID + "." + "mammoth_amulet");
		setCreativeTab(KingMammoth.kmTab);

	}
	
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.EPIC;
	}

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		
		tooltip.add("Material used to craft Mammoth Fur.");
		
	}

}

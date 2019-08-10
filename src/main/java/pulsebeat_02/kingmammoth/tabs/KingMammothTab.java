package pulsebeat_02.kingmammoth.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pulsebeat_02.kingmammoth.KingMammoth;
import pulsebeat_02.kingmammoth.init.ModItems;

public class KingMammothTab extends CreativeTabs {
	
	public KingMammothTab() {
		
		super(KingMammoth.MODID);
		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ModItems.Mammoth_Sword);
		
	}

}

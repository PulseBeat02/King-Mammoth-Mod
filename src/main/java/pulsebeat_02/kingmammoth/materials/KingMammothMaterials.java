package pulsebeat_02.kingmammoth.materials;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import pulsebeat_02.kingmammoth.KingMammoth;

public class KingMammothMaterials {

	public static final ArmorMaterial mammoth_armor = EnumHelper.addArmorMaterial(
			KingMammoth.MODID + ":" + "mammoth_armor", KingMammoth.MODID + ":kingmammoth", 1000, new int[] { 4, 7, 8, 5 },
			5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);

}

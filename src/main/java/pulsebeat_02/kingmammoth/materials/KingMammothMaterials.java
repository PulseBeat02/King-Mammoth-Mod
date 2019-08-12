package pulsebeat_02.kingmammoth.materials;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import pulsebeat_02.kingmammoth.KingMammoth;

public class KingMammothMaterials {

	public static final ArmorMaterial mammoth_armor = EnumHelper.addArmorMaterial(
			KingMammoth.MODID + ":" + "mammoth_armor", KingMammoth.MODID + ":king_mammoth_armor", 1000, new int[] { 10, 7, 8, 5 },
			5, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0);
	
	public static final ArmorMaterial crown_model_material = EnumHelper.addArmorMaterial(
			KingMammoth.MODID + ":" + "custom_crown", KingMammoth.MODID + ":king_mammoth_crown_material", 1000, new int[] { 10, 0, 0, 0 },
			5, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0);

}

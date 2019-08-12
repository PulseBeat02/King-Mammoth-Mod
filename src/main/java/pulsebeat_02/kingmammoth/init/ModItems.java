package pulsebeat_02.kingmammoth.init;

import pulsebeat_02.kingmammoth.item.MammothCore;
import pulsebeat_02.kingmammoth.item.MammothFur;
import pulsebeat_02.kingmammoth.item.MammothSword;
import pulsebeat_02.kingmammoth.item.armor.ItemKingMammothArmor;
import pulsebeat_02.kingmammoth.item.crown.KingMammothCrown;
import pulsebeat_02.kingmammoth.materials.KingMammothMaterials;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import pulsebeat_02.kingmammoth.KingMammoth;

@ObjectHolder(KingMammoth.MODID)
public class ModItems {
	
	public static MammothSword mammoth_sword = new MammothSword(ToolMaterial.DIAMOND);
	
	public static ItemKingMammothArmor king_mammoth_boots = new ItemKingMammothArmor(KingMammothMaterials.mammoth_armor, EntityEquipmentSlot.FEET, "king_mammoth_boots");
	public static ItemKingMammothArmor king_mammoth_leggings = new ItemKingMammothArmor(KingMammothMaterials.mammoth_armor, EntityEquipmentSlot.LEGS, "king_mammoth_leggings");
	public static ItemKingMammothArmor king_mammoth_chestplate = new ItemKingMammothArmor(KingMammothMaterials.mammoth_armor, EntityEquipmentSlot.CHEST, "king_mammoth_chestplate");
	
	public static KingMammothCrown king_mammoth_crown = new KingMammothCrown(KingMammothMaterials.crown_model_material, EntityEquipmentSlot.HEAD);
	
	public static MammothFur mammoth_fur = new MammothFur();
	
	public static MammothCore mammoth_core = new MammothCore();

}

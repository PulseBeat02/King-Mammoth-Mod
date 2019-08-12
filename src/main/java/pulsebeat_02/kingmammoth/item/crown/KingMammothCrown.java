package pulsebeat_02.kingmammoth.item.crown;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import pulsebeat_02.kingmammoth.KingMammoth;

public class KingMammothCrown extends ItemArmor {

	CustomCrown crown = new CustomCrown();

	public KingMammothCrown(ArmorMaterial material, EntityEquipmentSlot equipmentSlot) {

		super(material, 0, equipmentSlot);
		setCreativeTab(KingMammoth.kmTab);
		setRegistryName(KingMammoth.MODID + ":" + "king_mammoth_crown");

	}

	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot,
			ModelBiped _default) {

		if (itemStack != ItemStack.EMPTY) {

			if (itemStack.getItem() instanceof ItemArmor) {

				crown = new CustomCrown();
				crown.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;

				crown.isChild = _default.isChild;
				crown.isSneak = _default.isSneak;
				crown.isRiding = _default.isRiding;
				crown.rightArmPose = _default.rightArmPose;
				crown.leftArmPose = _default.leftArmPose;

				return (ModelBiped) crown;

			}

		}
		
		return null;

	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return "kingmammoth:textures/models/armor/king_mammoth_crown_layer_1.png";
	}
}

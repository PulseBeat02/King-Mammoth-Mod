package pulsebeat_02.kingmammoth.item.armor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import pulsebeat_02.kingmammoth.KingMammoth;

public class ItemKingMammothArmor extends ItemArmor {

	public ItemKingMammothArmor(ArmorMaterial material, EntityEquipmentSlot equipmentSlot, String registryName) {

		super(material, 0, equipmentSlot);
		setCreativeTab(KingMammoth.kmTab);
		setRegistryName(registryName);

	}

	@Override
	public void onArmorTick(final World world, final EntityPlayer player, final ItemStack itemStack) {

		if (player.inventory.armorItemInSlot(0) != null
				&& player.inventory.armorItemInSlot(0).getItem().equals(KingMammothArmor.king_mammoth_boots)) {

			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1000000, 5));
			player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1000000, 5));
			player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1000000, 4));
			player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 1000000, 75));

		}

		else if (player.inventory.armorItemInSlot(1) != null
				&& player.inventory.armorItemInSlot(1).getItem().equals(KingMammothArmor.king_mammoth_leggings)) {

			player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 1000000, 5));
			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 1000000, 8));
			player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 1000000, 5));
			player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 1000000, 100));
			player.capabilities.allowFlying = true;

		}

		else if (player.inventory.armorItemInSlot(2) != null
				&& player.inventory.armorItemInSlot(2).getItem().equals(KingMammothArmor.king_mammoth_chestplate)) {

			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 1000000, 5));
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 1000000, 5));
			player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 1000000, 8));
			player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 1000000, 150));

		}

		else if (player.inventory.armorItemInSlot(3) != null
				&& player.inventory.armorItemInSlot(3).getItem().equals(KingMammothArmor.king_mammoth_crown)) {

			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 1000000, 5));
			player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 1000000, 5));
			player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 1000000, 5));
			player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 1000000, 5));
			player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 1000000, 5));
			player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 1000000, 50));

		}

	}

}

package pulsebeat_02.kingmammoth.item;

import java.util.List;
import java.util.UUID;

import javax.annotation.Nullable;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import pulsebeat_02.kingmammoth.KingMammoth;

public class MammothSword extends ItemSword {

	public MammothSword(ToolMaterial material) {

		super(material);

		canRepair = true;
		maxStackSize = 1;
		setHarvestLevel("picaxe", material.getHarvestLevel());
		setCreativeTab(KingMammoth.kmTab);

		setRegistryName(KingMammoth.MODID, "mammoth_sword");
		setUnlocalizedName(KingMammoth.MODID + "." + "mammoth_sword");

	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase target,
			final EntityLivingBase attacker) {
		itemStack.damageItem(1, attacker); // Only reduce the durability by 1 point (like swords do) instead of 2 (like
											// tools do)
		return true;
	}

	@Override
	public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {

		final UUID field_111210_e = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");

		Multimap<String, AttributeModifier> multimap = HashMultimap.create();
		multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(),
				new AttributeModifier(field_111210_e, "Weapon modifier", (double) 1650, 0));

		return multimap;

	}

	@Override
	public void onUpdate(ItemStack item, World world, Entity entity, int par4, boolean par5) {

		EntityPlayer player = (EntityPlayer) entity;

		player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 100000, 5));
		player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 100000, 5));
		player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 1000000, 50));
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 1000000, 50));
		player.capabilities.allowFlying = true;

	}
	
	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		
		tooltip.add("Only held by the ones who have brave souls. - King Mammoth");
		
	}

}

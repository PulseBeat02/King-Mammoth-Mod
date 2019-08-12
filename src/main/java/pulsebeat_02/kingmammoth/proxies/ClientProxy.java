package pulsebeat_02.kingmammoth.proxies;

import javax.annotation.Nullable;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pulsebeat_02.kingmammoth.item.crown.CustomCrown;

public class ClientProxy implements IProxy {
	
	CustomCrown crown = new CustomCrown();

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		// DEBUG
		System.out.println("on Client side");

	}

	@Override
	public void init(FMLInitializationEvent event) {
		// DEBUG
		System.out.println("on Client side");

	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		// DEBUG
		System.out.println("on Client side");
	}

	@Override
	public void serverStarting(FMLServerStartingEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	@Nullable
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(Entity entityLiving, ItemStack itemStack,
			EntityEquipmentSlot armorSlot, ModelBiped _default) {
		
		crown = new CustomCrown();
		crown.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;

		crown.isChild = _default.isChild;
		crown.isSneak = _default.isSneak;
		crown.isRiding = _default.isRiding;
		crown.rightArmPose = _default.rightArmPose;
		crown.leftArmPose = _default.leftArmPose;

		return (ModelBiped) crown;
	}

	@Override
	public void getArmorModel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		// TODO Auto-generated method stub
		return null;
	}

}

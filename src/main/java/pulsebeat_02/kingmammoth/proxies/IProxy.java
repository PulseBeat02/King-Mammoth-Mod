package pulsebeat_02.kingmammoth.proxies;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public interface IProxy<A> {
	/**
	 * Fml life cycle event for Pre-Initialization. Historically (before registry
	 * events) this was where blocks, items, etc. were registered. There are still
	 * things like entities and networking which should still be registered here.
	 *
	 * @param event the event
	 */
	void preInit(FMLPreInitializationEvent event);

	/**
	 * Fml life cycle event for Initialization. This phase is good for registering
	 * event listeners, for registering things that depend on things in pre-init
	 * from other mods (like recipes, advancements and such.)
	 *
	 * @param event the event
	 */
	void init(FMLInitializationEvent event);

	/**
	 * Fml life cycle event Post Initialization. This phase is useful For doing
	 * inter-mod stuff like checking which mods are loaded or if you want a complete
	 * view of things across mods like having a list of all registered items to aid
	 * random item generation.
	 *
	 * @param event the event
	 */
	void postInit(FMLPostInitializationEvent event);

	/**
	 * Fml life cycle event. Server commands should be registered here.
	 *
	 * @param event the event
	 */
	void serverStarting(FMLServerStartingEvent event);

	/*
	 * Thanks to CoolAlias for this tip!
	 */
	/**
	 * Returns a side-appropriate EntityPlayer for use during message handling.
	 *
	 * @param parContext the context
	 * @return the player entity from context
	 */
	
	void getArmorModel();

	String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type);

	ModelBiped getArmorModel(Entity entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot,
			ModelBiped _default);
}
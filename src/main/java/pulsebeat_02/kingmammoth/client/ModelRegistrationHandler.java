package pulsebeat_02.kingmammoth.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import pulsebeat_02.kingmammoth.KingMammoth;
import pulsebeat_02.kingmammoth.init.ModItems;

@EventBusSubscriber(value = Side.CLIENT, modid = KingMammoth.MODID)
public class ModelRegistrationHandler {

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		
		registerModel(ModItems.mammoth_sword, 0);
		
		registerModel(ModItems.king_mammoth_boots, 0);
		registerModel(ModItems.king_mammoth_leggings, 0);
		registerModel(ModItems.king_mammoth_chestplate, 0);
		
		registerModel(ModItems.king_mammoth_crown, 0);
		
		registerModel(ModItems.mammoth_core, 0);
		
		registerModel(ModItems.mammoth_fur, 0);
		
		KingMammoth.LOGGER.info("Models Loaded");
		
	}

	private static void registerModel(Item item, int meta) {
		
		ModelLoader.setCustomModelResourceLocation(item, meta,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}

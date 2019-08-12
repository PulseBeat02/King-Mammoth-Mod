package pulsebeat_02.kingmammoth.client;

import pulsebeat_02.kingmammoth.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import pulsebeat_02.kingmammoth.KingMammoth;

@EventBusSubscriber(value = Side.CLIENT, modid = KingMammoth.MODID)
public class ModelRegistrationHandler {

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		//registerModel(ModItems.mammoth_sword, 0);
	}

	private static void registerModel(Item item, int meta) {
		
		ModelLoader.setCustomModelResourceLocation(item, meta,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}

package pulsebeat_02.kingmammoth.init;

import pulsebeat_02.kingmammoth.KingMammoth;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(KingMammoth.MODID)
public class ModItems {

	public static final Item Mammoth_Sword = null;

	@EventBusSubscriber(modid = KingMammoth.MODID)
	public static class RegistrationHandler {

		@SubscribeEvent
		public static void registerItems(Register<Item> event) {
			final Item[] items = { new Item().setRegistryName(KingMammoth.MODID, "mammoth_sword")
					.setUnlocalizedName(KingMammoth.MODID + "." + "mammoth_sword").setCreativeTab(KingMammoth.kmTab) };

			event.getRegistry().registerAll(items);
		}

	}

}

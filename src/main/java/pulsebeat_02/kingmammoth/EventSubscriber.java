package pulsebeat_02.kingmammoth;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import pulsebeat_02.kingmammoth.block.GoldMammoth;
import pulsebeat_02.kingmammoth.item.MammothCore;
import pulsebeat_02.kingmammoth.item.MammothFur;
import pulsebeat_02.kingmammoth.item.armor.ItemKingMammothArmor;
import pulsebeat_02.kingmammoth.item.crown.KingMammothCrown;
import pulsebeat_02.kingmammoth.materials.KingMammothMaterials;

@EventBusSubscriber(modid = KingMammoth.MODID)
public final class EventSubscriber {

	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = { new GoldMammoth().setRegistryName("gold_mammoth")
				.setUnlocalizedName(KingMammoth.MODID + "." + "gold_mammoth"), };

		event.getRegistry().registerAll(blocks);
	}

	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		
		final ArrayList<Item> items = new ArrayList<Item>();
		
		items.add(new Item().setRegistryName(KingMammoth.MODID, "mammoth_sword")
				.setUnlocalizedName(KingMammoth.MODID + "." + "mammoth_sword").setCreativeTab(CreativeTabs.MISC));
		items.add(new ItemKingMammothArmor(KingMammothMaterials.mammoth_armor, EntityEquipmentSlot.FEET, "king_mammoth_boots"));
		items.add(new ItemKingMammothArmor(KingMammothMaterials.mammoth_armor, EntityEquipmentSlot.LEGS, "king_mammoth_leggings"));
		items.add(new ItemKingMammothArmor(KingMammothMaterials.mammoth_armor, EntityEquipmentSlot.CHEST, "king_mammoth_chestplate"));
		
		items.add(new KingMammothCrown(KingMammothMaterials.crown_model_material, EntityEquipmentSlot.HEAD));
		items.add(new MammothFur());
		items.add(new MammothCore());


		event.getRegistry().registerAll(items.toArray(new Item[items.size()]));
		
	}
}

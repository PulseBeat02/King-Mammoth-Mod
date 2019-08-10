package pulsebeat_02.kingmammoth;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import pulsebeat_02.kingmammoth.tabs.KingMammothTab;

@Mod(modid = KingMammoth.MODID, name = KingMammoth.NAME, version = KingMammoth.VERSION, acceptedMinecraftVersions = KingMammoth.MC_VERSION)

public class KingMammoth {

	public static final String MODID = "kingmammoth";
	public static final String NAME = "King Mammoth";
	public static final String VERSION = "1.0.0";
	public static final String MC_VERSION = "[1.12.2]";

	public static final Logger LOGGER = LogManager.getLogger(KingMammoth.MODID); 
	
	public static final CreativeTabs kmTab = new KingMammothTab();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		OBJLoader.INSTANCE.addDomain(KingMammoth.MODID);

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info(KingMammoth.NAME + " says hi!");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}

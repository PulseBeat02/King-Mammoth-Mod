package pulsebeat_02.kingmammoth.init;

import pulsebeat_02.kingmammoth.item.MammothSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import pulsebeat_02.kingmammoth.KingMammoth;

@ObjectHolder(KingMammoth.MODID)
public class ModItems {

	public static final MammothSword mammoth_sword = new MammothSword(ToolMaterial.DIAMOND);

}

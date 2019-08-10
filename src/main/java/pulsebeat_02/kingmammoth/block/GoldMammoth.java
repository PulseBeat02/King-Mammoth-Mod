package pulsebeat_02.kingmammoth.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import pulsebeat_02.kingmammoth.KingMammoth;

public class GoldMammoth extends Block {
	
	public GoldMammoth() {

		super(Material.IRON);
		
		this.blockHardness = 10;
		this.blockSoundType = SoundType.ANVIL;
		this.translucent = false;
		this.setCreativeTab(KingMammoth.kmTab);
		this.setHarvestLevel("picaxe", 1);

	}
	

}

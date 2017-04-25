package nc.block.fluid;

import me.modmuss50.jsonDestroyer.api.ITexturedFluid;
import nc.Global;
import nc.NuclearCraft;
import nc.proxy.CommonProxy;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class BlockFluid extends BlockFluidBase /*implements ITexturedFluid*/ {
	
	private String name;

	public BlockFluid(Fluid fluid, String name, Material material) {
		super(fluid, material);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(new ResourceLocation(Global.MOD_ID, name));
		setCreativeTab(CommonProxy.TAB_FLUIDS);
	}

	public String getName() {
		return name;
	}
}

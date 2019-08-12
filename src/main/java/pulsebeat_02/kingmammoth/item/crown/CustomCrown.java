package pulsebeat_02.kingmammoth.item.crown;


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CustomCrown extends ModelBiped {
	
    public ModelRenderer shape15;

    public CustomCrown() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.shape15 = new ModelRenderer(this, 64, 0);
        this.shape15.mirror = true;
        this.shape15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape15.addBox(-4.0F, -14.1F, -4.1F, 8, 7, 8, 0.0F);
        
        this.bipedHead.addChild(shape15);
        
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        super.render(entity, f, f1, f2, f3, f4, f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

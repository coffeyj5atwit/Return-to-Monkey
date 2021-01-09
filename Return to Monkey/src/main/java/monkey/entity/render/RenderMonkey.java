package monkey.entity.render;
import monkey.Reference;
import monkey.entity.EntityMonkey;
import monkey.entity.model.monkey;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMonkey extends RenderLiving<EntityMonkey> {
	
	
public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID, ":textures/entity/monkey.png");
	
	public RenderMonkey(RenderManager manager) 
	{
		super(manager, new monkey(), 0.5F);
	}
	
	protected ResourceLocation getEntityTexture(EntityMonkey entity) 
	{
		return TEXTURES;
	}

	protected void applyRotations(EntityMonkey entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}

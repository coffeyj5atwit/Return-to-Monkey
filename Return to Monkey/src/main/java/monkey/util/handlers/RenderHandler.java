package monkey.util.handlers;
import monkey.entity.EntityMonkey;
import monkey.entity.render.RenderMonkey;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityMonkey.class, new IRenderFactory<EntityMonkey>()
		{
			
			@Override
			public Render<? super EntityMonkey> createRenderFor(RenderManager manager) {
				return new RenderMonkey(manager);
			}
		});
	
	
	}
}

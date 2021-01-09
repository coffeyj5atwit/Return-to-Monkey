package monkey.util.handlers;

import monkey.init.EntityInit;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
@EventBusSubscriber
public class RegistryHandler {

	
	public static void preInitRegistries(FMLPreInitializationEvent event)
	
	{
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
	}
	
}

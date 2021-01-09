package monkey;
import monkey.proxy.CommonProxy;
import monkey.util.handlers.RegistryHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name =Reference.NAME, version = Reference.VERSION)
public class Main
{
	@Instance
	public static Main instance;

    
    
    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static CommonProxy proxy;
    
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	RegistryHandler.preInitRegistries(event);
       
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        
        
    }
}
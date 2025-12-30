package net.jeenearall.weapons_of_continent;

import com.mojang.logging.LogUtils;
import net.jeenearall.weapons_of_continent.client.ClientGunHandler;
import net.jeenearall.weapons_of_continent.client.ModCreativeModeTabs;
import net.jeenearall.weapons_of_continent.client.sound.ModSounds;
import net.jeenearall.weapons_of_continent.common.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(WeaponsOfContinent.MODID)
public class WeaponsOfContinent
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "weapons_of_continent";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public WeaponsOfContinent(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();// Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);// Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        ModItems.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModSounds.register(modEventBus);
        modEventBus.addListener(this::onClientSetup);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code

    }
    private void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(ClientGunHandler::setup);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {}

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {

    }
}

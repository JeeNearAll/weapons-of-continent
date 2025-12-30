package net.jeenearall.weapons_of_continent.client;

import net.jeenearall.weapons_of_continent.client.render.curios.IntrusiveHeadsetRenderer;
import net.jeenearall.weapons_of_continent.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import static net.jeenearall.weapons_of_continent.WeaponsOfContinent.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CuriosOnClientSetup {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event)
    {
        CuriosRendererRegistry.register(ModItems.INTRUSIVE_HEADSET.get(), () -> new IntrusiveHeadsetRenderer());
    }
}

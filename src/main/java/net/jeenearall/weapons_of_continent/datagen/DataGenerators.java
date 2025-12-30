package net.jeenearall.weapons_of_continent.datagen;

import net.jeenearall.weapons_of_continent.WeaponsOfContinent;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = WeaponsOfContinent.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new GunGen(packOutput, event.getLookupProvider()));

        generator.addProvider(
                // Tell generator to run only when server data are generating
                event.includeServer(),
                new ModCurioSlotProvider(
                        "weapons_of_continent", packOutput, existingFileHelper, event.getLookupProvider()));
    }
}

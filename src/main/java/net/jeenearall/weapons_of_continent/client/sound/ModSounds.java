package net.jeenearall.weapons_of_continent.client.sound;

import net.jeenearall.weapons_of_continent.WeaponsOfContinent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, WeaponsOfContinent.MODID);

    public static final RegistryObject<SoundEvent> AUTOCANNON_FIRE =
            registerSoundEvents("autocannon_fire");

    public static final RegistryObject<SoundEvent> registerSoundEvents(String name){
        return SOUND_EVENTS.register(name, () ->
                SoundEvent.createVariableRangeEvent(new ResourceLocation(WeaponsOfContinent.MODID, name)));
    }

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register((eventBus));
    }
}


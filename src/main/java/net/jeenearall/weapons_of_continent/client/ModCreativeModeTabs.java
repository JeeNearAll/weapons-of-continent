package net.jeenearall.weapons_of_continent.client;

import net.jeenearall.weapons_of_continent.WeaponsOfContinent;
import net.jeenearall.weapons_of_continent.common.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WeaponsOfContinent.MODID);

    public static final RegistryObject<CreativeModeTab> WEAPONS_OF_CONTINENT_TAB =
            CREATIVE_MODE_TABS.register("weapons_of_continent_tab", () -> CreativeModeTab.builder().icon(
                            () -> new ItemStack(ModItems.ARMORED_AUTHORITY_HELMET.get()))
                    .title(Component.translatable("creativetab.weapons_of_continent"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.ARMORED_AUTHORITY_HELMET.get());
                        pOutput.accept(ModItems.ARMORED_AUTHORITY_CHESTPLATE.get());
                        pOutput.accept(ModItems.ARMORED_AUTHORITY_LEGGINGS.get());
                        pOutput.accept(ModItems.ARMORED_AUTHORITY_BOOTS.get());

                        pOutput.accept(ModItems.VANGUARD_HELMET.get());
                        pOutput.accept(ModItems.VANGUARD_CHESTPLATE.get());
                        pOutput.accept(ModItems.VANGUARD_LEGGINGS.get());
                        pOutput.accept(ModItems.VANGUARD_BOOTS.get());

                        pOutput.accept(ModItems.PROSPECTOR_HELMET.get());
                        pOutput.accept(ModItems.PROSPECTOR_CHESTPLATE.get());
                        pOutput.accept(ModItems.PROSPECTOR_LEGGINGS.get());
                        pOutput.accept(ModItems.PROSPECTOR_BOOTS.get());

                        pOutput.accept(ModItems.INTRUSIVE_HEADSET.get());

                        pOutput.accept(ModItems.AUTOCANNON_B.get());
                        pOutput.accept(ModItems.REVOLVER.get());
                        pOutput.accept(ModItems.AR2.get());

                    }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
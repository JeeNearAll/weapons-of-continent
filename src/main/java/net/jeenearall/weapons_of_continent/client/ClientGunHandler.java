package net.jeenearall.weapons_of_continent.client;


import net.jeenearall.weapons_of_continent.WeaponsOfContinent;
import net.jeenearall.weapons_of_continent.client.render.gun.AR2Model;
import net.jeenearall.weapons_of_continent.client.render.gun.AutocannonBModel;
import net.jeenearall.weapons_of_continent.client.render.gun.RevolverModel;
import net.jeenearall.weapons_of_continent.item.ModItems;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import ttv.migami.jeg.client.render.gun.ModelOverrides;




@Mod.EventBusSubscriber(modid = WeaponsOfContinent.MODID, value = Dist.CLIENT)
public class ClientGunHandler {

    public static void setup() {
        registerModelOverrides();
    }


    private static void registerModelOverrides() {
        ModelOverrides.register(ModItems.REVOLVER.get(), new RevolverModel());
        ModelOverrides.register(ModItems.AUTOCANNON_B.get(), new AutocannonBModel());
        ModelOverrides.register(ModItems.AR2.get(), new AR2Model());
    }
}
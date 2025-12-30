package net.jeenearall.weapons_of_continent.client.render.gun;

import net.jeenearall.weapons_of_continent.WeaponsOfContinent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = WeaponsOfContinent.MODID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public enum SpecialModels {

    REVOLVER("gun/revolver"),
    REVOLVER_MAIN("revolver/main"),
    REVOLVER_CHAMBER("revolver/chamber"),
    REVOLVER_BOLT("revolver/bolt"),

    AUTOCANNON_B("gun/autocannon_b"),

    AR2("gun/ar2"),
    AR2_MAIN("ar2/main"),
    AR2_EJECTOR("ar2/ejector"),
    AR2_MAG("ar2/mag"),
    AR2_EXTENDED_MAG("ar2/extended_mag"),
    AR2_DRUM_MAG("ar2/drum_mag"),
    AR2_LIGHT_STOCK("ar2/light_stock"),
    AR2_TACTICAL_STOCK("ar2/tactical_stock"),
    AR2_WEIGHTED_STOCK("ar2/weighted_stock")
        ;

    /**
     * The location of an item model in the [MOD_ID]/models/special/[NAME] folder
     */
    private final ResourceLocation modelLocation;

    /**
     * Cached model
     */
    private BakedModel cachedModel;

    /**
     * Sets the model's location
     *
     * @param modelName name of the model file
     */
    SpecialModels(String modelName)
    {
        this.modelLocation = new ResourceLocation(WeaponsOfContinent.MODID, "special/" + modelName);
    }

    /**
     * Gets the model
     *
     * @return isolated model
     */
    public BakedModel getModel()
    {
        if(this.cachedModel == null)
        {
            this.cachedModel = Minecraft.getInstance().getModelManager().getModel(this.modelLocation);
        }
        return this.cachedModel;
    }

    /**
     * Registers the special models into the Forge Model Bakery. This is only called once on the
     * load of the game.
     */
    @SubscribeEvent
    public static void registerAdditional(ModelEvent.RegisterAdditional event)
    {
        for(SpecialModels model : values())
        {
            event.register(model.modelLocation);
        }
    }

    /**
     * Clears the cached BakedModel since it's been rebuilt. This is needed since the models may
     * have changed when a resource pack was applied, or if resources are reloaded.
     */
    @SubscribeEvent
    public static void onBake(ModelEvent.BakingCompleted event)
    {
        for(SpecialModels model : values())
        {
            model.cachedModel = null;
        }
    }
}


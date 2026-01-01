package net.jeenearall.weapons_of_continent.client.render.armor;

import net.jeenearall.weapons_of_continent.WeaponsOfContinent;
import net.jeenearall.weapons_of_continent.common.item.armor.AnimatedArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AnimatedArmorRenderer extends GeoArmorRenderer<AnimatedArmorItem> {
    public String resourcePath;
    public AnimatedArmorRenderer(String resourcePath) {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(WeaponsOfContinent.MODID, "armor/" + resourcePath)));
        this.resourcePath = resourcePath;
    }
}
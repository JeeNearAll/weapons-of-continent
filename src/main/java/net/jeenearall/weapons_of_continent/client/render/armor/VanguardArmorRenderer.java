package net.jeenearall.weapons_of_continent.client.render.armor;

import net.jeenearall.weapons_of_continent.WeaponsOfContinent;
import net.jeenearall.weapons_of_continent.common.item.armor.VanguardArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class VanguardArmorRenderer extends GeoArmorRenderer<VanguardArmorItem> {
    public VanguardArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(WeaponsOfContinent.MODID, "armor/vanguard")));
        // Using DefaultedItemGeoModel like this puts our 'location' as item/armor/example armor in the assets folders.
    }
}

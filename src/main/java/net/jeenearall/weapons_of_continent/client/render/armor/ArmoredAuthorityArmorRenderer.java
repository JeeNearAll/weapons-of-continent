package net.jeenearall.weapons_of_continent.client.render.armor;

import net.jeenearall.weapons_of_continent.WeaponsOfContinent;
import net.jeenearall.weapons_of_continent.common.item.armor.ArmoredAuthorityArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ArmoredAuthorityArmorRenderer extends GeoArmorRenderer<ArmoredAuthorityArmorItem> {
    public ArmoredAuthorityArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(WeaponsOfContinent.MODID, "armor/armored_authority")));
        // Using DefaultedItemGeoModel like this puts our 'location' as item/armor/example armor in the assets folders.
    }
}

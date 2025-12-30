package net.jeenearall.weapons_of_continent.datagen;

import net.jeenearall.weapons_of_continent.WeaponsOfContinent;
import net.jeenearall.weapons_of_continent.common.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WeaponsOfContinent.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.ARMORED_AUTHORITY_HELMET);
        simpleItem(ModItems.ARMORED_AUTHORITY_CHESTPLATE);
        simpleItem(ModItems.ARMORED_AUTHORITY_LEGGINGS);
        simpleItem(ModItems.ARMORED_AUTHORITY_BOOTS);
        simpleItem(ModItems.VANGUARD_HELMET);
        simpleItem(ModItems.VANGUARD_CHESTPLATE);
        simpleItem(ModItems.VANGUARD_LEGGINGS);
        simpleItem(ModItems.VANGUARD_BOOTS);
        simpleItem(ModItems.INTRUSIVE_HEADSET);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(WeaponsOfContinent.MODID, "item/" + item.getId().getPath()));
    }
}

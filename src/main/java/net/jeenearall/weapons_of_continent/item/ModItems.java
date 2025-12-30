package net.jeenearall.weapons_of_continent.item;

import net.jeenearall.weapons_of_continent.WeaponsOfContinent;
import net.jeenearall.weapons_of_continent.item.armor.ArmoredAuthorityArmorItem;
import net.jeenearall.weapons_of_continent.item.armor.VanguardArmorItem;
import net.jeenearall.weapons_of_continent.item.curios.IntrusiveHeadsetItem;
import net.jeenearall.weapons_of_continent.item.gun.AnimatedShieldBreakingGunItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ttv.migami.jeg.item.AnimatedGunItem;
import ttv.migami.jeg.item.AnimatedMakeshiftGunItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEM =
            DeferredRegister.create(ForgeRegistries.ITEMS, WeaponsOfContinent.MODID);


    public static final RegistryObject<Item> ARMORED_AUTHORITY_HELMET = ITEM.register("armored_authority_helmet",
            () -> new ArmoredAuthorityArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ARMORED_AUTHORITY_CHESTPLATE = ITEM.register("armored_authority_chestplate",
            () -> new ArmoredAuthorityArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ARMORED_AUTHORITY_LEGGINGS = ITEM.register("armored_authority_leggings",
            () -> new ArmoredAuthorityArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> ARMORED_AUTHORITY_BOOTS = ITEM.register("armored_authority_boots",
            () -> new ArmoredAuthorityArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> VANGUARD_HELMET = ITEM.register("vanguard_helmet",
            () -> new VanguardArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> VANGUARD_CHESTPLATE = ITEM.register("vanguard_chestplate",
            () -> new VanguardArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> VANGUARD_LEGGINGS = ITEM.register("vanguard_leggings",
            () -> new VanguardArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> VANGUARD_BOOTS = ITEM.register("vanguard_boots",
            () -> new VanguardArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> INTRUSIVE_HEADSET = ITEM.register("intrusive_headset",
            ()-> new IntrusiveHeadsetItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<AnimatedGunItem> REVOLVER = ITEM.register("revolver",
            () -> new AnimatedGunItem(new Item.Properties().stacksTo(1)
                    .durability(320).rarity(Rarity.UNCOMMON), "revolver"));
    public static final RegistryObject<AnimatedGunItem> AUTOCANNON_B = ITEM.register("autocannon_b",
            () -> new AnimatedShieldBreakingGunItem(new Item.Properties().stacksTo(1)
                    .durability(1900).rarity(Rarity.EPIC), "autocannon_b"));
    public static final RegistryObject<AnimatedGunItem> AR2 = ITEM.register("ar2",
            () -> new AnimatedGunItem(new Item.Properties().stacksTo(1)
                    .durability(800).rarity(Rarity.EPIC), "ar2"));


    public static void register(IEventBus eventBus) {
        ITEM.register(eventBus);
    }

}

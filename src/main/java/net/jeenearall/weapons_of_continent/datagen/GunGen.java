package net.jeenearall.weapons_of_continent.datagen;

import net.jeenearall.weapons_of_continent.WeaponsOfContinent;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Items;
import ttv.migami.jeg.common.FireMode;
import ttv.migami.jeg.common.GripType;
import ttv.migami.jeg.common.Gun;
import ttv.migami.jeg.common.ReloadType;
import ttv.migami.jeg.init.ModItems;
import ttv.migami.jeg.init.ModSounds;
import ttv.migami.jeg.init.ModTags;

import java.util.concurrent.CompletableFuture;

/**
 * Author: MrCrayfish
 */
public class GunGen extends GunProvider
{
    public GunGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void registerGuns()
    {
        this.addGun(new ResourceLocation(WeaponsOfContinent.MODID, "revolver"), Gun.Builder.create()

                // General
                .setFireMode(FireMode.SEMI_AUTO)
                .setFireRate(3)
                .setGripType(GripType.ONE_HANDED)
                .setRecoilKick(0.23F)
                .setRecoilAngle(2.0F)
                .setAlwaysSpread(false)
                .setSpread(6.0F)
                .setDrawTimer(20)

                // Reloads
                .setMaxAmmo(8)
                .setReloadType(ReloadType.MAG_FED)
                .setReloadTimer(53)

                // Projectile
                .setAmmo(ModItems.PISTOL_AMMO.get())
                .setProjectileVisible(false)
                .setDamage(7.6F)
                .setProjectileSize(0.05F)
                .setHeadshotMultiplier(1.4F)
                .setProjectileSpeed(7F)
                .setProjectileLife(10)
                .setProjectileTrailLengthMultiplier(2)
                .setProjectileTrailColor(0xFFFF00 | 0xFF000000)
                .setProjectileAffectedByGravity(true)
                .setReduceDamageOverLife(true)
                .setEjectsCasing(false)

                // Sounds
                .setFireSound(ModSounds.REVOLVER_FIRE.get())
                .setReloadStart(ModSounds.REV_RELOAD_BULLETS_OUT.get())
                .setReloadLoadSound(ModSounds.REV_RELOAD_BULLET_IN.get())
                .setReloadEndSound(ModSounds.REV_CHAMBER_SPIN.get())
                .setEjectorPullSound(SoundEvents.IRON_TRAPDOOR_OPEN)
                .setEjectorReleaseSound(SoundEvents.IRON_TRAPDOOR_CLOSE)
                .setSilencedFireSound(ModSounds.REVOLVER_SILENCED_FIRE.get())
                .setEnchantedFireSound(ModSounds.REVOLVER_ENCHANTED_FIRE.get())

                // Attachments
                .setMuzzleFlash(0.8, 0, 4.695, -2.785)
                .setZoom(Gun.Modules.Zoom.builder()
                        .setFovModifier(0.6F)
                        .setOffset(0.0, 3.85, -1.75))

                .build());

        this.addGun(new ResourceLocation(WeaponsOfContinent.MODID, "autocannon_b"), Gun.Builder.create()

                // General
                .setFireMode(FireMode.AUTOMATIC)
                .setFireRate(5)
                .setGripType(GripType.MINI_GUN)
                .setRecoilKick(1.5F)
                .setRecoilAngle(3.0F)
                .setAlwaysSpread(true)
                .setProjectileAmount(10)
                .setSpread(5.0F)
                .setDrawTimer(52)
                .setOverheatTimer(100)
                .setShooterPushback(-0.095F)

                // Reloads
                .setMaxAmmo(40)
                .setReloadType(ReloadType.MAG_FED)
                .setReloadTimer(105)

                // Projectile
                .setAmmo(ModItems.PISTOL_AMMO.get())
                .setProjectileVisible(false)
                .setDamage(12F)
                .setProjectileSize(1F)
                .setProjectileSpeed(7.8F)
                .setProjectileLife(10)
                .setProjectileTrailLengthMultiplier(2)
                .setProjectileTrailColor(0xFFFF00 | 0xFF000000)
                .setProjectileAffectedByGravity(true)
                .setEjectsCasing(true)
                .setAdvantage(ModTags.Entities.VERY_HEAVY.location())

                // Sounds
                .setFireSound(net.jeenearall.weapons_of_continent.client.sound.ModSounds.AUTOCANNON_FIRE.get())
                .setReloadStart(ModSounds.AR_RELOAD_MAGAZINE_IN.get())
                .setReloadLoadSound(ModSounds.AR_RELOAD_MAGAZINE_OUT.get())
                .setReloadEndSound(ModSounds.AR_EJECTOR_PULL.get())
                .setEjectorPullSound(ModSounds.AR_EJECTOR_PULL.get())
                .setEjectorReleaseSound(ModSounds.AR_EJECTOR_RELEASE.get())
                .setSilencedFireSound(net.jeenearall.weapons_of_continent.client.sound.ModSounds.AUTOCANNON_FIRE.get())
                .setEnchantedFireSound(net.jeenearall.weapons_of_continent.client.sound.ModSounds.AUTOCANNON_FIRE.get())

                // Attachments
                .setMuzzleFlash(1.0, 0, -0.5, -20)

                .build());

        this.addGun(new ResourceLocation(WeaponsOfContinent.MODID, "ar2"), Gun.Builder.create()
                        .setMuzzleFlash(0.8, 0, 3F, -10.41F)

                        //general
                        .setAlwaysSpread(false)
                        .setDrawTimer(30)
                        .setFireMode(FireMode.AUTOMATIC)
                        .setGripType(GripType.TWO_HANDED)
                        .setFireRate(4)
                        .setRecoilAngle(1.4F)
                        .setRecoilKick(1.95F)
                        .setSpread(13.5F)

                //Attachments
                        .setBarrel(0.8F, 0.0F, 5F, -10F)
                        .setScope(1F, 0F, 4.6F, 4.0F)
                        .setMagazine(0F, 0F, 0F, 0F)
                        .setStock(0F, 0F, 0F, 0F)
                        .setZoom(0.7F, 0F, 3.775F, -0.5F)

                //Projectile
                        .setAdvantage(ModTags.Entities.VERY_HEAVY.location())
                        .setDamage(6.7F)
                        .setEjectsCasing(true)
                        .setProjectileAffectedByGravity(true)
                        .setHeadshotMultiplier(1.3F)
                        .setAmmo(ModItems.RIFLE_AMMO.get())
                        .setProjectileLife(10)
                        .setProjectileSize(0.5F)
                        .setProjectileSpeed(9.5F)
                        .setProjectileTrailColor(-256)
                        .setProjectileTrailLengthMultiplier(2)

                //reloads
                        .setMaxAmmo(30)
                        .setReloadTimer(50)
                        .setReloadType(ReloadType.MAG_FED)

                //sounds
                        .setFireSound(ModSounds.ASSAULT_RIFLE_FIRE.get())
                        .setReloadStart(ModSounds.AR_RELOAD_MAGAZINE_IN.get())
                        .setReloadLoadSound(ModSounds.AR_RELOAD_MAGAZINE_OUT.get())
                        .setReloadEndSound(ModSounds.AR_RELOAD_EJECTOR.get())
                        .setEjectorPullSound(ModSounds.AR_EJECTOR_PULL.get())
                        .setEjectorReleaseSound(ModSounds.AR_EJECTOR_RELEASE.get())
                        .setSilencedFireSound(ModSounds.ASSAULT_RIFLE_SILENCED_FIRE.get())
                        .setEnchantedFireSound(ModSounds.ASSAULT_RIFLE_ENCHANTED_FIRE.get())

                .build());
    }
}

package net.jeenearall.weapons_of_continent.item.gun;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import ttv.migami.jeg.item.AnimatedGunItem;

public class AnimatedShieldBreakingGunItem extends AnimatedGunItem {

    public AnimatedShieldBreakingGunItem(Properties properties, String path) {
        super(properties, path);
    }

    @Override
    public boolean canDisableShield(ItemStack stack, ItemStack shield, LivingEntity entity, LivingEntity attacker) {
        return true;
    }
}

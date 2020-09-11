package net.fabricmc.example.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import net.minecraft.entity.ItemEntity;

@Mixin({ ItemEntity.class })
public abstract class ExampleMixin
{
    @ModifyConstant(method = { "tick" }, constant = { @Constant(intValue = 6000) })
    public int modifyDespawnTime(final int previous) {
        return 24000;
    }
}

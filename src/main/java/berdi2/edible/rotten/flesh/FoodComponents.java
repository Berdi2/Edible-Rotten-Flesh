package berdi2.edible.rotten.flesh;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FoodComponents {
    public static final FoodComponent CLEANED_AND_COOKED_ROTTEN_FLESH = (new FoodComponent.Builder().hunger(3).saturationModifier(
            (float) .8).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 1F).build());
}
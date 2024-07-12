package learningmod.list;

import net.minecraft.component.type.FoodComponent;

public class FoodList {
    public static final FoodComponent Example_Food_Component = new FoodComponent.Builder()
            .nutrition(10).saturationModifier(0.6F).alwaysEdible().build();

}

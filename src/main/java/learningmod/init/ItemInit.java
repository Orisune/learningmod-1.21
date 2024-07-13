package learningmod.init;
import learningmod.list.FoodList;
import learningmod.modid.LearningMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
public class ItemInit{
    public static final Item EXAMPLE_ITEM = register("example_item",new Item(new Item.Settings()));
    public static final Item EXAMPLE_FOOD = register("example_food",new Item(new Item.Settings()
            .food(FoodList.Example_Food_Component)));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, LearningMod.id(name), item);
    }
    public static void load(){
    }
}
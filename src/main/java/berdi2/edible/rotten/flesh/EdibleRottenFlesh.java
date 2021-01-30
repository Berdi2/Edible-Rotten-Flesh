package berdi2.edible.rotten.flesh;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry; 

public class EdibleRottenFlesh implements ModInitializer {

	public static final Item KNIFE = new Item(new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));
	public static final Item ClEANED_ROTTEN_FLESH = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item CLEANED_AND_COOKED_ROTTEN_FLESH = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodComponents.CLEANED_AND_COOKED_ROTTEN_FLESH));

	@Override 
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("ediblerottenflesh","knife"), KNIFE); 
		Registry.register(Registry.ITEM, new Identifier("ediblerottenflesh","cleaned_rotten_flesh"), ClEANED_ROTTEN_FLESH);
		Registry.register(Registry.ITEM, new Identifier("ediblerottenflesh","cleaned_and_cooked_rotten_flesh"), CLEANED_AND_COOKED_ROTTEN_FLESH);
	}
}
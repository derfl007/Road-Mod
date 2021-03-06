package derfl007.roads.init;

import derfl007.roads.Reference;
import derfl007.roads.items.ItemTar;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RoadItems {

	public static Item item_tar;
	
	public static void init() {
		item_tar = new ItemTar();
	}
	
	public static void register() {
		GameRegistry.registerItem(item_tar, item_tar.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		registerRender(item_tar);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));									
	}
}

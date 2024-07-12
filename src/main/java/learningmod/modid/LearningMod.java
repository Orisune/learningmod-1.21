package learningmod.modid;
import learningmod.init.ItemInit;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearningMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("learningmod");
	public static final String Mod_ID = "learningmod";

	@Override
	public void onInitialize() {
			LOGGER.info("Is it working?");
		ItemInit.load();
	}
	public static Identifier id(String Path) {
		return Identifier.of(Mod_ID, Path);
	}
}
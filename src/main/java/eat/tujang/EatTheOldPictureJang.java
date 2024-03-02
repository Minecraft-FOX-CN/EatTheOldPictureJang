package eat.tujang;

import eat.tujang.registry.*;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EatTheOldPictureJang implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "eatujang";
    public static final Logger LOGGER = LoggerFactory.getLogger("eatujang");

    @Override
    public void onInitialize() {
        ModEntities.registerModEntitiesAttribute();
        ModItemGroup.registerModItemGroup();
        ModItems.registerModItems();
        ModBlocks.registerModBlock();
        ModBlockEntities.registerModBlockEntities();
        ModKeyBinding.registerModKeyBinding();
    }
}
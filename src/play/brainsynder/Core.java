package play.brainsynder;

import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {
    private static Core instance;

    public static Core getInstance() {
        return instance;
    }

    @Override public void onEnable() {
        instance = this;
    }
}

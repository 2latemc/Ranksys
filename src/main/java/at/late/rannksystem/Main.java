package at.late.rannksystem;

import at.late.rannksystem.commands.SetRankCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static String prefix = "§c§lRanks §7| §f";

    @Override
    public void onEnable() {
        getCommand("setrank").setExecutor(new SetRankCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

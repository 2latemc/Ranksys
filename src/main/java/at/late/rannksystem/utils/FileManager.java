package at.late.rannksystem.utils;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static File configFile = new File("plugins//RankSystem", "storage.yml");

    public static YamlConfiguration configuration = YamlConfiguration.loadConfiguration(configFile);

    public static void setup() {
        configuration.options().copyDefaults(true);
        saveConfig();
    }


    public static String getServer() {
        return configuration.getString("ThisServerName");
    }

    public static void saveConfig() {
        try {
            configuration.save(configFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
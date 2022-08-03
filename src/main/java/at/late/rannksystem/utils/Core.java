package at.late.rannksystem.utils;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static at.late.rannksystem.Main.prefix;

public class Core {

    public static void setRank(Player player, Ranks rank, CommandSender sender) {
        sender.sendMessage(prefix + "§a" + player + "s rank has been set to " + rank.toString());

        //storage stuff, add to database
    }
}

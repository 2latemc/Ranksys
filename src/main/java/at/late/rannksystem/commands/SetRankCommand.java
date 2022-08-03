package at.late.rannksystem.commands;

import at.late.rannksystem.utils.Core;
import at.late.rannksystem.utils.Ranks;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static at.late.rannksystem.Main.prefix;

public class SetRankCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length != 2) {
            sender.sendMessage(prefix + "§cUsage: /setrank <player> <rank>");
            return false;
        }
        Player target = Bukkit.getPlayer(args[0]);
        if(target == null) {
            sender.sendMessage(prefix + "§cThe player " + args[0] + " is not online.");
            return false;
        }

        switch (args[1].toLowerCase()) {
            case "owner":
                break;
            case "admin":
                break;
            case "supporter":
                break;
            case "moderator":
                break;
            case "player":
                break;
            default:
                sender.sendMessage(prefix + "§cThe rank could not be found!");
                return false;
        }
        Core.setRank(target, Ranks.valueOf(args[1]), sender);
        return false;
    }
}

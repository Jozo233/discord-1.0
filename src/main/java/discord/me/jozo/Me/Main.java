package discord.me.jozo.Me;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("discord")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (player.hasPermission("discord.use")) {
                    player.sendMessage(ChatColor.GREEN + "DISCORD KAKTUSEKPLAY");
                    player.sendMessage(ChatColor.BLUE + "[DISCORD](dsc.gg/kaktusek-play)");
                    player.sendMessage(ChatColor.GREEN + "DISCORD KAKTUSEKPLAY");
                    return true;
                }
                player.sendMessage(ChatColor.GOLD + "Nemáš práva");
            }
            else {
                sender.sendMessage("Hey console");
                return true;

            }
        }
        return false;
    }
}

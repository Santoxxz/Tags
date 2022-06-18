package me.dalyp.tags.tagmanager;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TagsCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("§cComando permitido somente para jogadores.");
        }else{
            Player p = (Player) sender;
            if(args.length == 0){
                if (p.hasPermission("*")){
                    p.sendMessage("§aSuas tags: §6CEO§f, §9Coord§f, §2Equipe§f, §bBuilder§f, §cYouTuber§f, §eSwift§f, §7Normal§f.");
                }else if (p.hasPermission("tag.coord")){
                    p.sendMessage("§aSuas tags: §9Coord§f, §2Equipe§f, §bBuilder§f, §cYouTuber§f, §eSwift§f, §7Normal§f.");
                }else if (p.hasPermission("tag.equipe")){
                    p.sendMessage("§aSuas tags: §2Equipe§f, §bBuilder§f, §cYouTuber§f, §eSwift§f, §7Normal§f.");
                }else if (p.hasPermission("tag.builder")){
                    p.sendMessage("§aSuas tags: §2Builder§f, §cYouTuber§f, §eSwift§f, §7Normal§f.");
                }else if (p.hasPermission("tag.yt")){
                    p.sendMessage("§aSuas tags: §cYouTuber§f, §eSwift§f, §7Normal§f.");
                }else if (p.hasPermission("tag.vip")){
                    p.sendMessage("§aSuas tags: §eSwift§f, §7Normal§f.");
                }else if (p.hasPermission("tag.membro")){
                    p.sendMessage("§aSuas tags: §7Normal§f.");
                }
                return true;
            }
        }
        return false;
    }
}

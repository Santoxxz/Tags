package me.dalyp.tags.tagmanager;

import com.nametagedit.plugin.NametagEdit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TagCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("§cComando permitido somente para jogadores.");
        }else{
            Player p = (Player) sender;
            if(args.length == 0){
                sender.sendMessage("§c * Uso incorreto, utilize: /tag [grupo]");
                return true;
            } else if (args[0].equalsIgnoreCase("ceo")){
                if(p.hasPermission("tag.ceo")){
                    if(p.getDisplayName().contains("CEO")){
                        p.sendMessage("§7* §cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§7* §aSua tag foi alterada para: §6CEO");
                        p.setDisplayName("§6[CEO] §6" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§6[CEO] §6", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("coord")){
                if(p.hasPermission("tag.coord")){
                    if(p.getDisplayName().contains("Coord")){
                        p.sendMessage("§7* §cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§7* §aSua tag foi alterada para: §9Coord");
                        p.setDisplayName("§9[Coord] §9" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§9[Coord] §9", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("equipe")){
                if(p.hasPermission("tag.equipe")){
                    if(p.getDisplayName().contains("Equipe")){
                        p.sendMessage("§7* §cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§7* §aSua tag foi alterada para: §2Equipe");
                        p.setDisplayName("§2[Equipe] §2" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§2[Equipe] §2", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("builder")){
                if(p.hasPermission("tag.builder")){
                    if(p.getDisplayName().contains("Builder")){
                        p.sendMessage("§7* §cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§7* §aSua tag foi alterada para: §bBuilder");
                        p.setDisplayName("§7* §b[Builder] §b" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§b[Builder] §b", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("youtuber")){
                if(p.hasPermission("tag.yt")){
                    if(p.getDisplayName().contains("youtuber")){
                        p.sendMessage("§7* §cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§7* §aSua tag foi alterada para: §cYouTuber");
                        p.setDisplayName("§c[YT] §c" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§c[YT] §c", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("Swift")){
                if(p.hasPermission("tag.swift")){
                    if(p.getDisplayName().contains("Swift")){
                        p.sendMessage("§7* §cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§7* §aSua tag foi alterada para: §eSwift");
                        p.setDisplayName("§e[Swift] §e" + p.getName());
                        NametagEdit.getApi().setNametag(p, "§e[Swift] §e", "");
                    }
                }
            }else if (args[0].equalsIgnoreCase("normal")){
                if(p.hasPermission("tag.membro")){
                    if(p.getDisplayName().contains("Normal")){
                        p.sendMessage("§7* §cVocê já está utilizando esse grupo.");
                    }else{
                        p.sendMessage("§7* §aSua tag foi alterada para: §7Normal");
                        p.setDisplayName("§7 " + p.getName());
                        NametagEdit.getApi().setNametag(p, "§7 ", "");
                    }
                }
            }else{
                p.sendMessage("§7* §cEsta tag não existe, utilize /tags para visualizar todas as tags.");
            }
        }
        return true;
    }
}

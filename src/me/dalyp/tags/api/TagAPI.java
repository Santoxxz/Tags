package me.dalyp.tags.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class TagAPI implements Listener {
    public static int count;

    public static String hasPlayerTag(Player p) {
        if (p.hasPermission("*")) {
            return "§6[CEO] §6";
        } else if (p.hasPermission("tag.coord")) {
            return "§9[Coord] §9";
        } else if (p.hasPermission("tag.equipe")) {
            return "§2§l[Equipe] §2";
        } else if (p.hasPermission("tag.builder")) {
            return "§b[Builder] §b";
        } else if (p.hasPermission("tag.yt")) {
            return "§c[YT] §c";
        } else if (p.hasPermission("tag.swift")) {
            return "§e[Swift] §e";
        } else {
            return (p.hasPermission("tag.membro")) ? "§7" : "§7 ";
        }
    }

    public static String hasPlayerGroup(Player p) {
        if (p.hasPermission("*")) {
            return "§6[CEO] §6";
        } else if (p.hasPermission("tag.coord")) {
            return "§9[Coord] §9";
        } else if (p.hasPermission("tag.equipe")) {
            return "§2§l[Equipe] §2";
        } else if (p.hasPermission("tag.builder")) {
            return "§b[Builder] §b";
        } else if (p.hasPermission("tag.yt")) {
            return "§c[YT] §c";
        } else if (p.hasPermission("tag.swift")) {
            return "§e[Swift] §e";
        } else {
            return (p.hasPermission("tag.membro")) ? "§7" : "§7";
        }
    }

    public static enum tags{
        ADMIN,
        COORD,
        EQUIPE,
        BUILDER,
        YT,
        HEADS,
        MEMBRO;
    }
}

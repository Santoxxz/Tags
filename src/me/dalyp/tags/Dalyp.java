package me.dalyp.tags;

import me.dalyp.tags.api.TagAPI;
import me.dalyp.tags.tagmanager.TagCommand;
import me.dalyp.tags.tagmanager.TagsCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Dalyp extends JavaPlugin {

    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§9[Dalyp] §aConectando com o banco de dados... Iniciado!");

        Bukkit.getPluginManager().registerEvents(new TagAPI(), this);

        getCommand("tag").setExecutor(new TagCommand());
        getCommand("tags").setExecutor(new TagsCommand());
    }
}

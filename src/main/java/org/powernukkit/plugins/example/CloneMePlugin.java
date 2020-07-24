package org.powernukkit.plugins.example;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.command.PluginCommand;
import cn.nukkit.plugin.PluginBase;

public class CloneMePlugin extends PluginBase {
    @Override
    public void onEnable() {
        getLogger().info("Hello world! :D");
        
        // TODO: Make it easier
        // This make the command be executed in a separated class, you need to choose if you want
        // it being executed there or in the onCommand bellow, you can't use both
        // Simple commands are fine in onCommand but complex command might be more organized
        // in their own classes. Also make sure you register this command in plugin.yml
        ((PluginCommand<?>) getCommand("cloneme")).setExecutor(new CloneCommand());
        
        // You must register your listeners to capture events
        // You can make this class implement the Listener itself and invoke registerEvents(this, this)
        // But again, if the listener gets too complicated it might be better to group them in different classes
        getServer().getPluginManager().registerEvents(new CloneListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Goodbye world :(");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // You can also override this command instead of setting an executor in onEnable if you prefer
        return false;
    }
}

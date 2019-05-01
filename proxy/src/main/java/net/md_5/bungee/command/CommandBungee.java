package net.md_5.bungee.command;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class CommandBungee extends Command
{

    public CommandBungee()
    {
        super( "bungee" );
    }

    @Override
    public void execute(CommandSender sender, String[] args)
    {
        sender.sendMessage(ChatColor.GOLD + "This server is running Calcite by Marble." );
        sender.sendMessage(ChatColor.GOLD + "Calcite is a fork of BungeeCord by md_5." );
    }
}

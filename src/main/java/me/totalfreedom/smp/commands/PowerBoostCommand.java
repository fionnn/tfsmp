// 
// Decompiled by Procyon v0.5.36
// 

package me.totalfreedom.smp.commands;

import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PowerBoostCommand implements CommandExecutor
{
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if (!(sender instanceof Player))
        {
            return false;
        }
        final String message = StringUtils.join(args, " ");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "f powerboost faction " + message + " 9999999999");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "f powerboost player " + sender.getName() + " 9999999999");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "f setpower " + sender.getName() + " 9999999999");
        sender.sendMessage(ChatColor.GRAY + "Ok, powerboosted the specified faction: " + ChatColor.GOLD + message + ChatColor.GRAY + ".");
        return true;
    }
}
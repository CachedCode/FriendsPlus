package net.kryptonox.friendsplus.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.kryptonox.friendsplus.FriendsPlus;

public class FriendCommand implements CommandExecutor {

	FriendsPlus plugin;
	public FriendCommand(FriendsPlus plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("friends").setExecutor(this);
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
		
		if(cmd.getLabel().equalsIgnoreCase("Friends")) {
			
		}
		
		return false;
	}

}

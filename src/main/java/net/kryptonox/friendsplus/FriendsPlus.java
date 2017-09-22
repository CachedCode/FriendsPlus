package net.kryptonox.friendsplus;

import org.bukkit.plugin.java.JavaPlugin;

import net.kryptonox.friendsplus.cmd.FriendCommand;

public class FriendsPlus extends JavaPlugin {
	
	public void onEnable() {
		new FriendCommand(this);
	}

}

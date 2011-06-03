package com.Nicogeta.Nicogetrad;

import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.nijiko.permissions.PermissionHandler;
import com.nijikokun.bukkit.Permissions.Permissions;

public class Nicogetrad extends JavaPlugin {
	private static final Logger log = Logger.getLogger("Minecraft");
	public static PermissionHandler Permissions;
	private final NTPlayerListener playerListener = new NTPlayerListener(this);
	public static String currentFilter;
	
	 private void setupPermissions() {
	      Plugin test = this.getServer().getPluginManager().getPlugin("Permissions");

	      if (Nicogetrad.Permissions == null) 
	      {
	          if (test != null) {
	              Nicogetrad.Permissions = ((Permissions)test).getHandler();
	              log.info("Nicogetrad has detected Permissions!");
	          } else {
	             log.info("Nicogetrad has not detected Permissions. Giving command permission to OP.");
	          }
	      }
	  }

	 
	    public void onDisable() {
	    	log.info("Nicogetrad DISABLE");
	    }
		 @Override
	    public void onEnable() {
	    	getCommand("gungan").setExecutor(new GunganFilter(this));
	    	log.info("Nicogetrad ENABLE (by Nicogeta)");
	    	log.info("Nicogetrad 0.5");
	    	currentFilter = "";
	    	PluginManager pm = getServer().getPluginManager();
	    	pm.registerEvent(Event.Type.PLAYER_CHAT, playerListener, Priority.Normal, this);
	    	setupPermissions();
	    }
	    
		public void recordEvent(PlayerLoginEvent event) {
			// TODO Auto-generated method stub
			
		}


}

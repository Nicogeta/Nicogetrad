package com.Nicogeta.Nicogetrad;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@SuppressWarnings("unused")

public class GunganFilter implements CommandExecutor {
	
	private Player player;
	private final Nicogetrad plugin;
	public GunganFilter(Nicogetrad instance){
		plugin = instance;
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
		
		if(sender instanceof Player)
		{
			player = (Player) sender;
			if((Nicogetrad.Permissions == null && player.isOp()) || (Nicogetrad.Permissions != null && Nicogetrad.Permissions.has(player, "Nicogetrad.gungan")))
    		{
	    		if(args.length==0)
				{
	    			if(Nicogetrad.currentFilter.equalsIgnoreCase("gungan"))
	    			{
	    				player.sendMessage("Missa rend :o(");
	        			Nicogetrad.currentFilter = "";
	    			}
	    			else
	    			{
	    				player.sendMessage("Voussa parler GUNGAN !");
	        			Nicogetrad.currentFilter = "gungan";
	    			}
	        		return true;
				}
	        	else
	        	{
	        		player.sendMessage("Hephaistos: T'as écris trop de trucs, pov'gland !");
	        		player.sendMessage("Ecris juste /gungan");
					return true;
	        	}
    		}
			else{
    			player.sendMessage("TOISSA PAS GUNGAN !");
    			return true;
    		}
			
		}
		return false;
	}

}

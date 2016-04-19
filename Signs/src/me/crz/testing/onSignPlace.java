package me.crz.testing;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockPlaceEvent;

public class onSignPlace {
	
	
	
	
	@EventHandler
	public void onPlace(BlockPlaceEvent e){
		
		Player p = e.getPlayer();
		
		Block block = e.getBlock();
		
		p.sendMessage(block.toString());
		
	}
	
	
	

}

package me.crz.testing;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class SignClickListener implements Listener{
	
	@EventHandler
	public void onClick(PlayerInteractEvent e){
		
		
		
		
		Player p = e.getPlayer();
		
	
		if(e.getClickedBlock().getType() == Material.SIGN_POST){
			
			Block block = e.getClickedBlock();
			
			BlockState state = block.getState();
			Sign sign = (Sign)state;
			String signline1 = sign.getLine(0);
			
			p.sendMessage(signline1);
			
		}
		
	}
	
	

}

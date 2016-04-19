package me.crz.testing;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;




public class Main extends JavaPlugin {

	
	public void onEnable() {
		// when server started this runs
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = Logger.getLogger("Minecraft");
		
		
		 
		registerEvents();
		 

		logger.info(pdfFile.getName() + " Has been enabled (V. " + pdfFile.getVersion() + ")");

	}

	public void onDisable() {
		// when server is turning off this runs
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = Logger.getLogger("Minecraft");

		logger.info(pdfFile.getName() + " Has been disabled (V. " + pdfFile.getVersion() + ")");
		
	}
	
	public void registerEvents(){
		
		PluginManager pm = getServer().getPluginManager();

		pm.registerEvents(new SignClickListener(), this);
		
	}

}
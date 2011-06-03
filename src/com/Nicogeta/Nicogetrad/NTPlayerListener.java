package com.Nicogeta.Nicogetrad;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;


public class NTPlayerListener extends PlayerListener {
	
	final Nicogetrad plugin;
	
	public NTPlayerListener(Nicogetrad instance){
		plugin = instance;
	}
	
	public void onPlayerChat(PlayerChatEvent event){
		Player player = event.getPlayer();
    	boolean isExempt = false;
    	if((Nicogetrad.Permissions == null && player.isOp()))
    		isExempt = true;
    	else if(Nicogetrad.Permissions != null && Nicogetrad.Permissions.has(player, "Nicogetrad.exempt"))
    		isExempt = true;
		
	if(!isExempt){	
		String temp = event.getMessage();
		if(Nicogetrad.currentFilter.equalsIgnoreCase("gungan")){
			temp = temp.toLowerCase();
			temp = temp.replaceAll("je", "missa");
			temp = temp.replaceAll("tu", "tissa");
			temp = temp.replaceAll("j'", "missa ");
			temp = temp.replaceAll("chef", "grand papa big boss votre grandeur");
			temp = temp.replaceAll("il", "issa");
			temp = temp.replaceAll("ils", "eussa");
			temp = temp.replaceAll("nous", "noussa");
			temp = temp.replaceAll("vous", "voussa");
			temp = temp.replaceAll("vais", "va");
			temp = temp.replaceAll("menfou", "missa senfiche");
			temp = temp.replaceAll("m'enfou", "missa senfiche");
			temp = temp.replaceAll("accident", "axidente");
			temp = temp.replaceAll("acciedents", "axidentes");
			temp = temp.replaceAll("beaucoup", "boco");
			temp = temp.replaceAll("bcp", "boco");
			temp = temp.replaceAll("cet", "cesta");
			temp = temp.replaceAll("cette", "cesta");
			temp = temp.replaceAll("canon", "boumer");
			temp = temp.replaceAll("problème", "kaha-kaha");
			temp = temp.replaceAll("kaha-kaha", "probleme");
			temp = temp.replaceAll("problemes", "kaha-kaha");
			temp = temp.replaceAll("merde", "kaha-kaha");
			temp = temp.replaceAll("elle", "elsa");
			temp = temp.replaceAll("scuse", "ex-squeezer-mouai");
			temp = temp.replaceAll("désolé", "ex-squeezer-mouai");
			temp = temp.replaceAll("sorry", "ex-squeezer-mouai");
			temp = temp.replaceAll("desole", "ex-squeezer-mouai");
			temp = temp.replaceAll("dsl", "ex-squeezer-mouai");
			temp = temp.replaceAll("scusez", "ex-squeezer-mouai");
			temp = temp.replaceAll("mais ", "ma ");
			temp = temp.replaceAll(" ma ", "missa ");
			temp = temp.replaceAll("moi ", "moissa ");
			temp = temp.replaceAll("mon ", "missa ");
			temp = temp.replaceAll("parler", "perler");
			temp = temp.replaceAll("parle", "perl");
			temp = temp.replaceAll("qui", "quissa");
			temp = temp.replaceAll("quoi", "quoissa");
			temp = temp.replaceAll("attrap", "trapp");
			temp = temp.replaceAll("", "");
			temp = temp.replaceAll("oui", "Ya");
			temp = temp.replaceAll("yop", "Hellihello");
			temp = temp.replaceAll("fort", "maousse");
			temp = temp.replaceAll("animal", "bestaille");
			temp = temp.replaceAll("animaux", "bestailles");
			temp = temp.replaceAll(" le ", " da ");
			temp = temp.replaceAll(" la ", " da ");
			temp = temp.replaceAll(" les ", " da ");
			temp = temp.replaceAll("help", "aidmoi");
			temp = temp.replaceAll("rah", "blblblblblblblbl");
			temp = temp.replaceAll("omg", "oh moye moye");
			temp = temp.replaceAll("robot", "pinguin");
			temp = temp.replaceAll("bot", " pinguin");
			temp = temp.replaceAll("droid", "mekanix");
			temp = temp.replaceAll(" me ", " ");
			temp = temp.replaceAll(" ne ", " ");
			temp = temp.replaceAll("me rends", "rend");
			temp = temp.replaceAll("bombe", "boumas");
			temp = temp.replaceAll("ok", "d'ac");
			temp = temp.replaceAll("d'accord", "d'ac");
			temp = temp.replaceAll(" yeux ", " mirettes ");
			temp = temp.replaceAll(" oeil ", " mirette ");
			temp = temp.replaceAll("petit", "little piccoli");
			temp = temp.replaceAll("réfléchis", "réflexi");
			temp = temp.replaceAll("méchant", "brutalit");
			temp = temp.replaceAll(" stop", " stoppala");
			temp = temp.replaceAll("salut", "saluta");
			temp = temp.replaceAll("non", "qué né niet");
			temp = temp.replaceAll("nop", "qué né niet");
			temp = temp.replaceAll("peur", "chocotte bleu");
			temp = temp.replaceAll("fou", "guedin");
			temp = temp.replaceAll("dingue", "guedin");
			temp = temp.replaceAll("blème", "bisbi");
			temp = temp.replaceAll("blèmes", "bisbis");
			temp = temp.replaceAll("arme", "bomba");
			temp = temp.replaceAll("bon", "bonna");
			temp = temp.replaceAll("beurk", "tektek beurk");
			temp = temp.replaceAll("bwah", "tektek beurk");
			temp = temp.replaceAll("monstre", "monster");
			temp = temp.replaceAll("étranger", "pagungan");
			temp = temp.replaceAll("yeah", "ochouet");
			temp = temp.replaceAll("oh god", "oh moye moye");
			temp = temp.replaceAll("eux", "eussa");
			temp = temp.replaceAll("t'", "tissa ");
			temp = temp.replaceAll("étranger", "pagungan");
			temp = temp.replaceAll("etranger", "pagungan");
			temp = temp.replaceAll("minecart", "limousine");
			temp = temp.replaceAll("vehicule", "limousine");
			System.out.println(temp);
			event.setMessage(temp);
		}
	}
	}
}

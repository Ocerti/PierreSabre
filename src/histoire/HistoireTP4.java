package histoire;

import personnages.Humain;
import personnages.Commerçant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	
	
	public static void main(String[] args) {
		Commerçant marco = new Commerçant("Marco",20);
		Commerçant chonin = new Commerçant("Chonin",18);
		Commerçant kumi = new Commerçant("Kumi",2);
		Yakuza yaku = new Yakuza("yaku le noir",30,"whiskey","warzone");
		Ronin robin = new Ronin("Marco",20,"fanta");
		
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(robin);
	}
	
	

}

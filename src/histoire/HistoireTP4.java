package histoire;

import personnages.Humain;
import personnages.Commer�ant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	
	
	public static void main(String[] args) {
		Commer�ant marco = new Commer�ant("Marco",20);
		Commer�ant chonin = new Commer�ant("Chonin",18);
		Commer�ant kumi = new Commer�ant("Kumi",2);
		Yakuza yaku = new Yakuza("yaku le noir",30,"whiskey","warzone");
		Ronin robin = new Ronin("Marco",20,"fanta");
		
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(robin);
	}
	
	

}

package histoire;

import personnages.Humain;
import personnages.Commerçant;
import personnages.Yakuza;

public class HistoireTP4 {
	
	
	public static void main(String[] args) {
		Humain h = new Humain("Prof",54,"coca");
		h.direBonjour();
		h.acheter("une boisson", 12);
		h.boire();
		h.acheter("un jeu", 2);
		h.acheter("un kimono", 50);
		Commerçant c = new Commerçant("Marco",50);
		c.direBonjour();
		c.seFaireExtorquer();
		c.recevoir(15);
		c.boire();
		Yakuza y = new Yakuza("yaku",30,"eau gazeuse","pop pop girls");
		y.direBonjour();
		y.extorquer(c);
	}
	
	

}

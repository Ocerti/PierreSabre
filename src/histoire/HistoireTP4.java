package histoire;

import personnages.Humain;
import personnages.Commer�ant;

public class HistoireTP4 {
	
	
	public static void main(String[] args) {
		Humain h = new Humain("Prof",54,"coca");
		h.direBonjour();
		h.acheter("une boisson", 12);
		h.boire();
		h.acheter("un jeu", 2);
		h.acheter("un kimono", 50);
		Commer�ant c = new Commer�ant("Marco",50);
		c.direBonjour();
		c.seFaireExtorquer();
		c.recevoir(15);
		c.boire();
	}
	
	

}

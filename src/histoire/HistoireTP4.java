package histoire;

import personnages.Humain;

public class HistoireTP4 {
	
	
	public static void main(String[] args) {
		Humain h = new Humain("Prof",54,"coca");
		h.direBonjour();
		h.acheter("une boisson", 12);
		h.boire();
		h.acheter("un jeu", 2);
		h.acheter("un kimono", 50);
	}
	
	

}

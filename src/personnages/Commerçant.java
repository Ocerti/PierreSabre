package personnages;

public class Commer�ant extends Humain{
	
	public Commer�ant(String nom,int argent) {
		super(nom, argent, "th�");
	}
		
	public int seFaireExtorquer() {
		parler("le monde est vraiment trop injuste");
		return perdreArgent(getArgent());
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler("Je te remercie ronin pour ces " + argent + " sous");
		
	}

}

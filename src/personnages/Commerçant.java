package personnages;

public class Commerçant extends Humain{
	
	public Commerçant(String nom,int argent) {
		super(nom, argent, "thé");
	}
		
	public int seFaireExtorquer() {
		parler("le monde est vraiment tr0p injuste");
		return perdreArgent(getArgent());
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler("Je te remercie ronin pour ces " + argent + " sous");
		
	}

}

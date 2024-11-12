package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int rp;

	public Yakuza(String nom,int argent,String boissonFavorite,String clan) {
		super(nom, argent, boissonFavorite);
		this.clan=clan;
		this.rp=0;	
	}
	
	public int getRp() {
		return rp;
	}
	
	
	public void perdre() {
		perdreArgent(getArgent());
		rp -= 1;
		parler("j'ai tous perdu");
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		rp += 1;
		parler("j'ai gagné");
	}
	
	
	public void extorquer(Commerçant victime) {
		parler("Un faible marchand ?");
		parler(victime.getNom() + " donne moi ton argent");
		int gain = victime.getArgent();
		gagnerArgent(gain);
		victime.seFaireExtorquer();
		rp += 1;
		parler("merci marco pour ces " + gain + " sous , maintenant j'ai " + getArgent() + " sous");
		
	}
	
}

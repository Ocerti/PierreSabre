package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int rp;

	public Yakuza(String nom,int argent,String boissonFavorite,String clan) {
		super(nom, argent, boissonFavorite);
		this.clan=clan;
		this.rp=0;	
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

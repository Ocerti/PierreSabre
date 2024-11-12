package personnages;

public class Ronin extends Humain {
	private int honneur;
	
	public Ronin(String nom,int argent,String boissonFavorite) {
		super(nom, argent, boissonFavorite);
		this.honneur=1;
	}

	
	
	private void donner(Commerçant bénéficiaire) {
		int c= ( getArgent() * 10 / 100);
		bénéficiaire.gagnerArgent(c);
		perdreArgent(c);
	}
	
	private void provoquer(Yakuza adversaire) {
		int force = honneur * 2 ;
		if ( force >= adversaire.getRp () ){
			gagnerArgent(adversaire.getArgent());
			adversaire.perdre();
			honneur += 1;
			parler("j'ai gagneé");
		}else {
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
			honneur -= 1;
			parler("j'ai perdu");
		}
		
	}
	
	
}

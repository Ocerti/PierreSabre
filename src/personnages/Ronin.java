package personnages;

public class Ronin extends Humain {
	private int honneur;
	
	public Ronin(String nom,int argent,String boissonFavorite) {
		super(nom, argent, boissonFavorite);
		this.honneur=1;
	}

	
	
	private void donner(Commer�ant b�n�ficiaire) {
		int c= ( getArgent() * 10 / 100);
		b�n�ficiaire.gagnerArgent(c);
		perdreArgent(c);
	}
	
	private void provoquer(Yakuza adversaire) {
		int force = honneur * 2 ;
		if ( force >= adversaire.getRp () ){
			gagnerArgent(adversaire.getArgent());
			adversaire.perdre();
			honneur += 1;
			parler("j'ai gagne�");
		}else {
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
			honneur -= 1;
			parler("j'ai perdu");
		}
		
	}
	
	
}

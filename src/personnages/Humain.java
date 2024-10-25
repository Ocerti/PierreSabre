package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boissonFavorite;
	
	public Humain(String nom,int argent,String boissonFavorite) {
		this.nom=nom;
		this.argent=argent;
		this.boissonFavorite=boissonFavorite; 
		
	}
	
	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	
	protected int gagnerArgent(int gain) {
		assert gain >= 0 ;
		return argent += gain;
	}
	
	protected int perdreArgent(int perte) {
		assert perte >= 0 ;
		return argent -= perte ;
	}
	
	//private String prendreParole() { 
	//	return "L' Humain " + nom + " : ";

	//}
	
	public void parler(String texte) {
		System.out.println("« " + texte + "»");
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+ nom + " et j'aime boire du " + boissonFavorite)  ;
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+ boissonFavorite + "! GLOUPS !" );
	}
	
	public int acheter(String bien,int prix) {
		if (prix <= argent) {
			parler("J'ai "+ argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			return perdreArgent(prix);
		}else {
				parler("Je n'ai plus que "+ argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous");
				return argent;
			}
		
	}
}





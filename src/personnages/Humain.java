package personnages;


public class Humain {

	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	

	public String getnom() {
		return nom;
	}
	
	public String getboisson(){
		return boisson;
	}
	
	public int getargent(){
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println("(" + nom + ") "+ texte + "");
	}
	
	
	public void direBonjour(){
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}
	
	public void boire(){
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS!");
	}
	
	public void acheter(String bien, int prix) {
		parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offir un "
				+ bien + " à " + prix +" sous");
		perdreArgent(prix);
		parler("Je n'ai plus que " + argent + " sous en poche.");
	}
	
	public int gagnerArgent(int gain) {
		argent = argent + gain;
		return argent;
	}
	
	public int perdreArgent(int perte) {
		argent = argent - perte;
		return argent;
	}
}


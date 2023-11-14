package personnages;

public class Ronin extends Humain{
	
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent, int honneur) {
		super(nom, boisson, argent);
		this.honneur = honneur;
	}
	
	public int gethonneur(){
		return honneur;
	}
	
	public void donner(Commercant com) {
		double don = getargent()*0.1;
		direBonjour();
		perdreArgent((int)don);
		com.gagnerArgent((int)don);
		parler(com.getnom() + " prend ces " + don + " sous");
		com.parler(don + " sous! Je te remercie généreux donateur!");
	}
	
	public int gagnerhonneur(){
		honneur += 1;
		return honneur;
	}
	
	public int perdrehonneur() {
		honneur-=1;
		return honneur;
	}
	
	public void provoquer(Yakuza yakuza) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchant!");
		int forceRonin = gethonneur()*2;
		if (forceRonin >= yakuza.getReputation()) {
			yakuza.perdre(this);
		}
		else {
			yakuza.gagner(this);
		}
	}
}

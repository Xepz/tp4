package personnages;

public class Yakuza extends Humain {

	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boisson, int argent, String clan, int reputation) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = reputation;
	}

	public String getClan() {
		return clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tien, tien, ne serait-il pas un failbe marchant qui passe par là ?");
		parler(""+ victime.getnom() + ", si tu tiens à la vie donne moi ta bourse !");
		gagnerArgent(victime.getargent());
		int ar = victime.getargent();
		victime.sefaireExtorquer(victime.getargent());
		parler("J'ai piqué les " + ar + " sous de " + victime.getnom() +
				" , ce qui me fais " + getargent() + " sous dans ma poche. Hi! Hi!");
		
	}
	
	public int perdre(Ronin ronin) {
		ronin.gagnerArgent(getargent());
		ronin.gagnerhonneur();
		ronin.parler("Je t'ai eu petit yakuza!");
		parler("J'ai perdu mon duel et mes "+getargent()+" sous, snif ... J'ai déshonoré le clan de " + getClan());
		perdreArgent(getargent());
		
		return getargent();
	}
		
		
	public int gagner(Ronin ronin) {
		ronin.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
		ronin.perdrehonneur();
		gagnerArgent(ronin.getargent());
		parler("Ce ronin pensait vraiment battre " + getnom() + " du clan " + getClan() + 
				" ? Je l'ai dépouillé de ses " + ronin.getargent() + " sous");
		ronin.perdreArgent(ronin.getargent());
		
		return getargent();
	}
}


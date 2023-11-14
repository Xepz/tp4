package personnages;

public class Commercant extends Humain{

	
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	
	public void sefaireExtorquer(int p){
		int ar = perdreArgent(p);
		if (ar < 1) {
			parler("J'ai tous perdu! Le monde est trop injuste");
		}
		else {
			parler("Il me reste " + ar + " sous");
		}
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler("" + argent + " sous! Je te remercie généreux donateur ");
	}
	
}

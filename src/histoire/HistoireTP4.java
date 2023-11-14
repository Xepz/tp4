package histoire;

import personnages.*;

public class HistoireTP4 {

	public static void main (String[] args) {
	Humain homme = new Humain("Prof","kambucha",54);
	homme.direBonjour();
	homme.acheter("boisson",12);
	homme.boire();
	homme.acheter("jeu",2);
	
	
	Commercant commercant = new Commercant("Marco",20);
	commercant.direBonjour();
	commercant.sefaireExtorquer(20);
	commercant.recevoir(15);
	commercant.boire();
	
	
	Yakuza yakuza = new Yakuza("Yaku Le noir","whisky",30,"Warsong",4);
	Commercant victime = new Commercant("Marco",15);
	yakuza.direBonjour();
	yakuza.extorquer(victime);
	
	
	Ronin ronin = new Ronin("Roro","shochu",60,1);
	ronin.donner(victime);
	ronin.provoquer(yakuza);
	}
}

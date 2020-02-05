package com.sq.MagiWorld;

public class AttaqueGuerrier implements Attaque {	
	
	private String description;

	public AttaqueGuerrier() {
	}

	public String attaqueBasique(Personnage joueur1, Personnage joueur2) {
		description= joueur1.getNomJoueur() + "utilise Coup d'épée et inflige " + joueur1.getForce()  + " dommages." ;
		joueur2.setVie(joueur2.getVie()-joueur1.getForce());
		return description;
	}

	public String attaqueSpeciale(Personnage joueur1, Personnage joueur2) {
		description= joueur1.getNomJoueur() + "utilise Coup de rage et inflige" + joueur1.getForce() * 2 + "de dommages. " ;
		description= "\n" + joueur1.getNomJoueur() + "perd" + joueur1.getForce()/2 + "en vitalité.";
		joueur2.setVie(joueur2.getVie() - (joueur1.getForce()*2));
		joueur1.setVie(joueur1.getVie() - (joueur1.getForce()/2));
		return description;
	}
}
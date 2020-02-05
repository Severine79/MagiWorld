package com.sq.MagiWorld;

public class AttaqueMage implements Attaque {
	
	private String description; 
	
	public AttaqueMage(){};

	public String attaqueBasique(Personnage joueur1, Personnage joueur2) {
		// Boule de feu
		description = joueur1.getNomJoueur()+" utilise Boule de feu et inflige "+ joueur1.getIntelligence() + "dommages";
		joueur2.setVie(joueur2.getVie()-joueur1.getVie());
        return description;
	}

	public String attaqueSpeciale(Personnage joueur1, Personnage joueur2) {
		description = joueur1.getNomJoueur() + " utilise Soin et gagne " + (joueur1.getIntelligence() * 2) + "en vitalité.";
	
		if(joueur1.getVie()+(joueur1.getIntelligence()*2) <= joueur1.getVieInitiale()) {
			joueur1.setVie(joueur1.getVie() + joueur1.getIntelligence() * 2);	
			
		}else {			
			joueur1.setVie(joueur1.getVieInitiale());
		}	
		return description;			
	}	

}

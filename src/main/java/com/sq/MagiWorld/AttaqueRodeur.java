package com.sq.MagiWorld;

public class AttaqueRodeur implements Attaque {
	
	private String description; 
	
	public AttaqueRodeur() {
	}
	
	public String attaqueBasique(Personnage joueur1, Personnage joueur2) {
		description = joueur1.getNomJoueur()+ " utilise Tir à l'arc et inflige " + joueur2.getAgilite() + "dommages.";
		joueur2.setVie(joueur2.getVie()-joueur1.getAgilite());
		return description;
	}
	public String attaqueSpeciale(Personnage joueur1, Personnage joueur2) {
		description = joueur1.getNomJoueur() + "utilise Concentration et gagne " + joueur1.getNiveau()/2 + " points en agilité";
		joueur1.setAgilite(joueur1.getAgilite() + joueur1.getNiveau()/2);		
		return description;
	}
	
}
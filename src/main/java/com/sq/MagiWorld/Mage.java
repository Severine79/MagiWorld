package com.sq.MagiWorld;

public class Mage extends Personnage {	
	
	/* Constructeur */
	
	public Mage() {
	}

	public Mage(int niveau, int force, int agilite, int intelligence, String nomJoueur) {
		super(niveau, force, agilite, intelligence, nomJoueur);
		this.nomJoueur = "Mage"; 
	}

	/* Methodes */
	@Override
	public String attaqueBasique(Personnage personnage) {
		String resultat = getAttaque().attaqueBasique(this,personnage);
        return resultat;
	}

	@Override
	public String attaqueSpeciale(Personnage personnage) {
		String resultat = getAttaque().attaqueSpeciale(this,personnage);
        return resultat;
	}


}

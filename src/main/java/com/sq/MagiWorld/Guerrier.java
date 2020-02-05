package com.sq.MagiWorld;

public class Guerrier extends Personnage  {
	
	

	public Guerrier() {
	}

	public Guerrier(int niveau, int force, int agilite, int intelligence, String nomJoueur) {
		super(niveau, force, agilite, intelligence, nomJoueur);
		this.nomJoueur= "Guerrier";
	}

	@Override
	public String attaqueBasique(Personnage personnage) {
		String resultat=personnage.getAttaque().attaqueBasique(this, personnage);
		return resultat;
	}

	@Override
	public String attaqueSpeciale(Personnage personnage) {
		String resultat=personnage.getAttaque().attaqueSpeciale(this, personnage);
		return resultat;
	}
}

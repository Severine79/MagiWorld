package com.sq.MagiWorld;

public class Rodeur extends Personnage  {
	
	public Rodeur( ) {		
	}	

	public Rodeur(int niveau, int force, int agilite, int intelligence, String nomJoueur) {
		super(niveau, force, agilite, intelligence, nomJoueur);
		this.nomJoueur = "Rôdeur"; 
	}

	@Override
	public String attaqueBasique(Personnage personnage) {
		String resultat = personnage.getAttaque().attaqueBasique(this, personnage);
		return resultat;
	}

	@Override
	public String attaqueSpeciale(Personnage personnage) {
		String resultat = personnage.getAttaque().attaqueSpeciale(this, personnage);
		return resultat;
	}
	
	


}

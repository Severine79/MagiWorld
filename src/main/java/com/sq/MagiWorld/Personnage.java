package com.sq.MagiWorld;

public abstract class Personnage {
	protected int niveau;
	protected int vie;
	protected int vieInitiale;
	protected int force;
	protected int agilite;
	protected int intelligence;
	protected String nomJoueur;
	
	protected Attaque attaque;
	
	//Constructeur
	public Personnage() {
	}

	public Personnage(int niveau, int vie, int force, int agilite, int intelligence, String nomJoueur) {
		if ((force + agilite + intelligence == niveau) && (niveau > 0 && niveau <= 100)) {
			this.niveau = niveau;			
			this.force = force;
			this.agilite = agilite;
			this.intelligence = intelligence;
			this.nomJoueur = nomJoueur;
			this.vie = niveau * 5;
			this.vieInitiale = vie;
			
		}else if (((force + agilite + intelligence < niveau)|| (force + agilite + intelligence > niveau)) && (force + agilite + intelligence <=100)) {
			this.niveau = force + agilite + intelligence;			
			this.force = force;
			this.agilite = agilite;
			this.intelligence = intelligence;
			this.nomJoueur = nomJoueur;
			this.vie = niveau * 5;
			this.vieInitiale = vie;			
		} else {
            System.out.println("Impossible d'instancier le personnage avec ces parametres !");
        }
	};
	
	//Methodes
	
}



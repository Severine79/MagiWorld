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
	
	public abstract String attaqueBasique(Personnage personnage);
	public abstract String attaqueSpeciale(Personnage personnage);

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public int getVieInitiale() {
		return vieInitiale;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getAgilite() {
		return agilite;
	}

	public void setAgilite(int agilite) {
		this.agilite = agilite;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public String getNomJoueur() {
		return nomJoueur;
	}

	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}

	public Attaque getAttaque() {
		return attaque;
	}

	public void setAttaque(Attaque attaque) {
		this.attaque = attaque;
	}
	 
	@Override
    public String toString() {
        return "Woarg ! Je suis le "+nomJoueur+ " niveau: " + niveau + " je possède : " + vie + 
        		" de vitalité" + force + " de force, " + agilite + " d'agilité et " + intelligence + "d'intelligence.";
    }
	 
	
}



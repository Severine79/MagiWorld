package com.sq.MagiWorld;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		bienvenue();
        List<Personnage> personnage = new NouveauxJoueurs().setUp();
        System.out.println(new Jeu(pers).play());
    }
    
    private static void bienvenue(){
        System.out.println("Bienvenue à MagiWorld !\n");
    }    
}   
		

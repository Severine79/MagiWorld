package com.sq.MagiWorld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class NouveauxJoueurs {
	private  final Scanner sc = new Scanner(System.in);
    private  Personnage joueur1, joueur2;
    private final  List<Personnage> joueurs = new ArrayList();
    private  int joueur ;
    private  boolean bonneReponse;
    
    /**
     * Boucle de sélection des personnages du jeu
     * @return 
     */
    public List<Personnage> setUp() {
               
        //Boucle de choix des personnages
        for( joueur = 1; joueur <= 2; joueur++) { 
            System.out.println("Création du personnage du joueur N° "+joueur);
            System.out.println("Veuillez choisir la classe de votre Personnage : 1 - Guerrier : 2 - Rôdeur : 3 - Mage");
            int person ;
            boolean bonneReponse;
            do {
                try {
                    person = sc.nextInt();
                    if(person < 1 || person > 3) {
                    	bonneReponse = false;
                        System.out.println("Vous devez saisir un nombre entre 1, 2 et 3 !");
                    } else {       
                    	bonneReponse = true;
                        displaySelectedPerson(person);
                        setUpPlayerAttributs(joueur,person);
                    }
                } catch (InputMismatchException e) {
                    sc.next();
                    System.out.println("Vous devez saisir un nombre !");
                    bonneReponse = false;
                }
            } while (!bonneReponse);            
        }  
        return joueurs;
    }
    
    /**
     * Affiche les types de personnages à choisir
    */
	private void displaySelectedPerson(int person) {
		switch(person) {
			case 1:
	            System.out.println("Vous avez choisi un Guerrier !\n");
	            break;
	        case 2:
	            System.out.println("Vous avez choisi un Rôdeur !\n");
	            break;
	        case 3:
	            System.out.println("Vous avez choisi un Mage !\n");
	            break;
	        default:
	            System.out.println("Vous n'avez pas choisi un bon numéro ! \n");
	            break;
		}		
	}   
    
	/**
     * Pour chauqe joueur, saisie des attributs de chaque personnage.
     */
	private void setUpPlayerAttributs(int joueur, int person) {
		List<String> listAttributs = Arrays.asList( "Niveau", "Force", "Agilité","Intelligence");
        final List<Integer> listAttributsInt = new ArrayList();    
        
        listAttributs .stream().forEach(new Consumer<String>() {
			public void accept(String attr) { 
			    System.out.println("Tapez le nombre de : " +attr  ); 
			    bonneReponse = false;
			     int att;
			    do{
			        try {
			            
			            att = sc.nextInt();
			            if(att < 0 || att > 100) {
			            	bonneReponse = false;
			                System.out.println("Vous devez saisir un nombre compris entre 0 et 100!");
			            } else {    
			            	listAttributsInt.add(att);
			                 bonneReponse = true;
			            }
			            
			        } catch (InputMismatchException e) {
			            sc.next();
			            System.out.println("Vous devez saisir un nombre !");
			            bonneReponse = false;
			        }
			    } while (!bonneReponse);
			}
		});
		
	}
	
	     
}

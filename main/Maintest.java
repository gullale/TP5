package main;

import java.util.Scanner;

public class Maintest {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		double rayon=sc.nextDouble();
		System.out.println("affiche "+rayon);
		
		double calculPI=rayon*Math.PI;
		System.out.println("resultat "+calculPI);
		
		double aire=rayon*rayon*Math.PI;
		System.out.println("resultat de l'aire est "+ aire);
		
		double longeur=sc.nextDouble();
		double volume=aire*longeur;
		System.out.println("resultat volume est "+ volume);
	}

	
	
}

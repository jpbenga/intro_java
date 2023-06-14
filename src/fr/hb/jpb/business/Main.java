package fr.hb.jpb.business;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double RATE = 0.621371;
		String unit = "";
		
		do {
			System.out.println("Bienvenue souhaitez vous convertir en miles ou en km? (m=miles, k=km) ");
			unit = sc.next();
			
			if(!unit.equals("m") && !unit.equals("k")) {
				System.out.println("Seul la lettre m ou la lettre k sont autorisés");	
			}
			
			
		}while(!unit.equals("m") && !unit.equals("k"));
			
			
			System.out.println("Veuillez saisir la distance: ");
			double dist = sc.nextDouble();
			
				
			if(unit.equals("m")) {
				System.out.println("Une distance de "+dist+ " kilomètres vaut "+dist / RATE+ " miles");
			}else {
				System.out.println("Une distance de "+dist+ " miles vaut "+dist * RATE+ " kilomètres");	
			}
		sc.close();
	}
}

package ejercicios;

import java.util.Scanner;

public class Trabajo_de_clase_aprender_IF {

	public static void main(String[] args) {
		
		int edad=0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la edad de la persona");
		
		edad = sc.nextInt();
		
		if (edad >= 18) {
			
			System.out.println("La persona es una adulto");
		 
			if (edad>66)
			
			System.out.println ("Además la persona es una jubilado");
		}
		else {
			
			System.out.println ("La persona es menor de edad");
		
			if (edad> 13) {
				
				System.out.println("Además la persona es un adolescente");
				
				} else if (edad>3) {
					
					System.out.println("Además la persona es un niño");
				}
		}
				

	}

}

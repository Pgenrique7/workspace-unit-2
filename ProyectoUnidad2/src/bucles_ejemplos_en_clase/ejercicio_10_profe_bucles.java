package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class ejercicio_10_profe_bucles {

	public static void main(String[] args) {

		int num=0;
		//suponemos que el numero es primo
		boolean esPrimo=true;
		Scanner sc= new Scanner ( System.in);
		
		System.out.println("Introduza un numero para ver si es primo ");
		num=sc.nextInt();
		
		for (int i=2 ; i<num/2 && esPrimo; i++) {
			
			//si encontramos un numero entre dos 
			//  y el numero -1 que lo divide
			//ya no es primo
			if (num%i==0) {
				esPrimo=false;
				//el break es poco elegante 
				//break;
			}
			
			
		}
		if (esPrimo) {
			
			System.out.println("El numero "+ num + " es primo ");
			
		}
		else {
			
			System.out.println("El numero "+ num + " no es primo");
		}


	}

}

package ejercicios_bucles;

import java.util.Scanner;

public class Ejercicio_3_bucles_Profe {
	
	// Se pide un programa que reciba por pantalla modelo coches y precios. El programa terminara cuando el precio
	// de un coche sea 0. El programa contará el numero de coches introducidos y lo mostrara por pantalla, mostrar el coche su modelo y valor del coche 
	// mas caro y mas barato, asi como la media de todos los precios.

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		double precioCoche=0, media=0, sumaPrecioCoche=0;
		double precioCocheMax=0, precioCocheMin=Integer.MAX_VALUE;
		int numCoches=0;
		String modeloCoche="", modeloCocheMax="", modeloCocheMin="";
		
		
		System.out.println("Introduzca el modelo del coche:");
		
		modeloCoche=sc.nextLine();
		
		
		System.out.println("Introduce el precio del coche: ");
		
		precioCoche=sc.nextDouble();
		
		while(precioCoche!=0) {
			
			numCoches++;
			
			if(precioCoche<precioCocheMin) {
				precioCocheMin=precioCoche;
				modeloCocheMin=modeloCoche;
			}
			if(precioCoche>precioCocheMax) {
				precioCocheMax=precioCoche;
				modeloCocheMax=modeloCoche;
			}
			
			System.out.println("Introduzca el modelo del coche:");
			
			modeloCoche=sc.next();
			
			
			System.out.println("Introduce el precio del coche: ");
			
			precioCoche=sc.nextDouble();
			
			sumaPrecioCoche+=precioCoche;
			
		}
		
		if (numCoches>0) {
			
			System.out.println("El modelo del coche mas caro es: "+ modeloCocheMax + " y su precio es de : "+ precioCocheMax);
			System.out.println("El modelo del coche mas caro es: "+ modeloCocheMin + " y su precio es de : "+ precioCocheMin);
			
			System.out.println("Media de notas: "+ (double)(media= (double)sumaPrecioCoche/numCoches));
	
		}
		
	}
}

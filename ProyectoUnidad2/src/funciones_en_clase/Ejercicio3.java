package funciones_en_clase;

import java.util.Scanner;

public class Ejercicio3 {

	static double temperaturaMedia(double minimo, double maximo) {
		
		
		
		return (maximo+minimo)/2;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		double minimo=0;
		double maximo=0;
		System.out.println("Dime el numero de dias que quieres calcular la media de la temperatura");
		
		int dias = sc.nextInt();
		
		for (int i=0; i<dias; i ++) {
			
			System.out.println("Introduce la temperatura minima");
			minimo=sc.nextDouble();
			System.out.println("Introduce la temperatura maxima");
			maximo=sc.nextDouble();
			
			System.out.println("La media de temperatura es de " +temperaturaMedia(minimo, maximo) + " grados");
		}

	}

}

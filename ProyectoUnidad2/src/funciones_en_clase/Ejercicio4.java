package funciones_en_clase;

import java.util.Scanner;

public class Ejercicio4 {
		
	static double funcion(double x) {
		
		
		return Math.pow(x, 3)+2*x-3;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Dale un valor a x");
		double x=sc.nextDouble();

		System.out.println("El resultado de la funcion es "+funcion(x));
	}

}

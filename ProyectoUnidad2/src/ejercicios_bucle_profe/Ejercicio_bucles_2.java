package ejercicios_bucle_profe;

import java.util.Scanner;

public class Ejercicio_bucles_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int pene=1;
		
		System.out.println("Introduce un numero: ");
		n=sc.nextInt();
		
		while (pene<n) {
			System.out.println("Vuelta "+ pene);
			pene++ ;
		}
		System.out.println ("Vuelta " + n);
	}

}

package ejemplos_clase;

import java.util.Scanner;

public class Ejercicio_2_9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num ;
		System.out.println("Este programa te dice las cifars que tiene el número introducido:");
		System.out.println("Introduce un número");
		num= sc.nextInt();
		if (num/10.0<1) {
			System.out.println("El número tiene 1 cirfra");
		}else if (num/10.0>=1 && num/10.0<10) {
			System.out.println("El número tiene 2 cirfras");
		}else if (num/10.0>=10 && num/10.0<100) {
			System.out.println("El número tiene 3 cirfras");
		}else if (num/10.0>=100 && num/10.0<1000) {
			System.out.println("El número tiene 4 cifras");
		}else if (num/10.0>=1000 && num/10.0<10000) {
			System.out.println("El número tiene 5 cifras");
		}
		else {
			System.out.println("El número tiene mas de 5 cifras");
		}
	}

}

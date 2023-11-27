package ejemplos_clase;

import java.util.Scanner;

public class Ejercicio_2_2 {

	public static void main(String[] args) {
		
		int num1, num2 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número");
		num1 = sc.nextInt();
		System.out.println("Escribe otro número");
		num2 = sc.nextInt();
		
		if (num1==num2) {
			System.out.println("Los números son iguales");
		} else {
			System.out.println("Los números no son iguales");
		}
	}

}

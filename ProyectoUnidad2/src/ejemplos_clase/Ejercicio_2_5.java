package ejemplos_clase;

import java.util.Scanner;

public class Ejercicio_2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2 ;
		System.out.println("Introduce un número");
		num1 = sc.nextInt();
		System.out.println("Introduce otro número");
		num2 = sc.nextInt();
		if (num1>num2) {
			System.out.println(num1+"  " +num2);
		} else {
			System.out.println(num2+"  " +num1);
		}
	}

}

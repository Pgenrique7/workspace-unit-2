package ejemplos_clase;

import java.util.Scanner;

public class EjemploSwitchSencillo {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int num;
		System.out.println("Introduzca un número:");
		num= sc.nextInt();
		switch (num) {
		case 1: System.out.println("Has introducido el 1");
			break;
		case 2: System.out.println("Has introducido el 2");
			break;
			
		default:
			System.out.println("Has introducido otro numero distinto de 1 y 2");
		}

	}

}

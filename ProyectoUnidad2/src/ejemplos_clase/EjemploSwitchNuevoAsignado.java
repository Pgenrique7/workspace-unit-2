package ejemplos_clase;

import java.util.Scanner;

public class EjemploSwitchNuevoAsignado {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int num, resultado;
		System.out.println("Introduzca un número:");
		num= sc.nextInt();
		
		resultado= switch (num) {
		case 1 -> num+1;
		case 2 -> { System.out.println("Has introducido el 2");
			System.out.println("Aqui si hace falta las llaves");
			yield num+2;
			}
			default ->7;
		};

	}

}

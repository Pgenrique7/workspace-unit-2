package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Number, resto, sum;
		System.out.println("Calculadora de numero que hay que sumar para que dos numeros sean múltiplos:");
		System.out.println("Introduce a number:");
		Number= sc.nextInt();
		System.out.println("Introduce a number:");
		
		resto= Number%7;
		sum= 7-resto;
		Number+= sum;
		System.out.println("The number " + Number + " is multiple of seven");
	}

}

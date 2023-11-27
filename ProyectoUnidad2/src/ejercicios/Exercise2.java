package ejercicios;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Number, resto, sum;
		System.out.println("Multiple number of seven:");
		System.out.println("Introduce a number:");
		Number= sc.nextInt();
		// Imagina que introduces 12 de resto tengo 5
		resto= Number%7;
		// sum 7-5= 2 =< 12+2 14 que es un multiplo de 7
		sum= 7-resto;
		// es lo mismo que num+=sum; que num=num+sum
		Number+= sum;
		System.out.println("The number " + Number + " is multiple of seven");
	}

}

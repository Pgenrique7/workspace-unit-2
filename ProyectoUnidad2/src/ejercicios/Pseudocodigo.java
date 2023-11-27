package ejercicios;

import java.util.Scanner;

public class Pseudocodigo {

	public static void main(String[] args) {
		int CAN1,CAN2, SUM;
		Scanner sc= new Scanner(System.in);
		System.out.println("Sum of 2 numbers:");
		System.out.println("Introduce a number 1:");
		CAN1= sc.nextInt();
		System.out.println("Introduce a number 2:");
		CAN2= sc.nextInt();
		SUM= CAN1+ CAN2;
		System.out.println("The result is: " + SUM);
	}

}

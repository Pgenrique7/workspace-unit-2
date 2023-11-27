package ejemplos_clase;

import java.util.Scanner;

public class EjerciciosCondicionales_3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int año;
		System.out.println("Introduzca un año");
		año= sc.nextInt();
		if ((año % 4 ==0 && año % 100 !=0) || (año%100==0 && año%400==0)) {
			System.out.println("El año es bisiesto");
		}
		else {
			System.out.println("El año no es bisiesto");
		}
	}
}

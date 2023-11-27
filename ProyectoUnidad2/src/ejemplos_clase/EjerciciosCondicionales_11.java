package ejemplos_clase;

import java.util.Scanner;

public class EjerciciosCondicionales_11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int rentaAnual;
		System.out.println("Introduzca su renta anual");
		rentaAnual= sc.nextInt();
		if (rentaAnual<=10000) {
			System.out.println("Le corresponde un impositivo del 5%");
			
		}else if (rentaAnual>10000 && rentaAnual<=20000) {
			System.out.println("Le corresponde un impositivo del 15%");
			
		}else if (rentaAnual>20000 && rentaAnual<=35000) {
			System.out.println("Le corresponde un impositivo del 20%");
			
		}else if (rentaAnual>35000 && rentaAnual<=60000) {
			System.out.println("Le corresponde un impositivo del 30%");
		} 
		else {
			System.out.println("Le corresponde un impositivo del 45%");
		}
	}

}

package ejemplos_clase;

import java.util.Scanner;

public class EjercicioSwitchDiaSemana {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.println("Introduzca un número");
		num= sc.nextInt();
		switch (num) {
			case 1: System.out.println("El dia de la semana es lunes");
			break;
			case 2: System.out.println("El dia de la semana es martes");
			break;
			case 3: System.out.println("El dia de la semana es miercoles");
			break;
			case 4: System.out.println("El dia de la semana es jueves");
			break;
			case 5: System.out.println("El dia de la semana es viernes");
			break;
			case 6: System.out.println("El dia de la semana es sábado");
			break;
			case 7: System.out.println("El dia de la semana es domingo");
			break;
			
		default: System.out.println("No es ningun dia de la semana");
		}
	

	}

}

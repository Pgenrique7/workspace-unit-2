package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class Ejercicio_Bucle_Lirbo_3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int edad;
		int sum=0;
		double media;
		int numalumnos=0;
		int numAdultoAlumno=0;
		
		System.out.println("Introduce la edad de los alumnos de la clase (Deja de contar la edad de los alumnos cuando pongas 0 o menor):");
		edad=sc.nextInt();
		
		while (edad>0){
			//acumulamos edades sumando
			sum=sum+edad;
			//Contamos el numero de alumnos
			numalumnos++;
			if (edad>=18) {
				//Contamos el numero de alumnos mayores de edad
				numAdultoAlumno++;
			}
			
			System.out.println("Introduce la edad de otro alumno");
			edad=sc.nextInt();
			
			
			
		} 
		
		// Los resultados finales se muestran al salir de los bucles
		// en el bucle se recogen los datos y se acumula y se cuenta
		
		media= (double) sum/numalumnos;
		System.out.println("La suma de edades de la clase es "+ sum + " y la media " + media);
		System.out.println("Numero total de alumnos= " + numalumnos);
		System.out.println("Hay =  " + numAdultoAlumno + " mayores de edad");
		
		

	}

}

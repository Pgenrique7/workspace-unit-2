package ejemplos_clase;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_2_17and18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // captura de pantalla de el ejercicio del maestro, corregir despues
		Scanner sc= new Scanner(System.in);
		Random rand= new Random();
		int suma;
		int solucion;
		int numeroRandom =rand.nextInt(1, 99);
		int numeroRandom2 =rand.nextInt(1, 99);
		int operacion = random.nextInt(1,3);
		switch (operacion) {
		case 1 :
			System.out.println("")
		}
	
		
		System.out.println("¿Que quieres hacer, sumar, restar o multiplicar?");
		CUENTA= sc.next();
		if (CUENTA= sumar) {
			System.out.println("Introduce el resultado de la suma de los siguientes numeros:");
			System.out.println(numeroRandom+ " + "+numeroRandom2+" =");
			suma= sc.nextInt();
			
			if (suma==(numeroRandom+numeroRandom2)) {
				System.out.println("Has acertado, sabes sumar!!");
			} else {
				System.out.println("Has fallado... No sabes ni sumar");
			}
		}
		
		System.out.println("Introduce el resultado de la suma de los siguientes numeros:");
		System.out.println(numeroRandom+ " + "+numeroRandom2+" =");
		suma= sc.nextInt();
		
		if (suma==(numeroRandom+numeroRandom2)) {
			System.out.println("Has acertado, sabes sumar!!");
		} else {
			System.out.println("Has fallado... No sabes ni sumar");
		}
	}

}

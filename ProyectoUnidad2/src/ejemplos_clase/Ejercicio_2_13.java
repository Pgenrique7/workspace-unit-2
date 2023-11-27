package ejemplos_clase;

import java.util.Scanner;

public class Ejercicio_2_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int comidaDiaria, numAnimales, kilosPorAnimal, comidaFinal;
		System.out.println("Introuce la cantidad de comida que has comprado en kg");
		comidaDiaria= sc.nextInt();
		System.out.println("Introuce el número de animales que tienes que alimentar");
		numAnimales= sc.nextInt();
		System.out.println("Introuce el número de kilos que come de media cada animal");
		kilosPorAnimal= sc.nextInt();
		if (comidaDiaria>numAnimales*kilosPorAnimal) {
			System.out.println("Hay alimento suficiente suficiente");
		} else {
			comidaFinal=(kilosPorAnimal*numAnimales)-comidaDiaria;
			System.out.println("Faltan "+comidaDiaria+" Kg para que haya suficiente alimento.");
		}
	}

}

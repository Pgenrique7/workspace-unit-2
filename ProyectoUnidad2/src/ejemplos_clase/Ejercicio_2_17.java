package ejemplos_clase;

import java.util.Random;
import java.util.Scanner;

	public class Ejercicio_2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Random rand= new Random();
		int suma;
		//double numeroRandomDouble= 100*rand.nextDouble()-1;
		//double numeroRandomDouble2= rand.nextDouble(1.0,99.0);
		int numeroRandom =rand.nextInt(1, 99);
		int numeroRandom2 =rand.nextInt(1, 99);
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
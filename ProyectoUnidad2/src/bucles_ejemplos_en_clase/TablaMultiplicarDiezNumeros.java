package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class TablaMultiplicarDiezNumeros {

	public static void main(String[] args) {
		
		
		//Calcular la tabla de multiplicar del 1 hasta el 10
		//Por ejemplo para el 3
		//3x1=3
		//3x2=6 etc
		
		
		for(int i=1; i<=10; i++) {
			
			System.out.println("Tabla de multiplicar para el " + i);
			System.out.println("----------------------------------------");
			
			for (int j=1; j<=10 ; j++) {
				
				System.out.println(i+ "x"+ j + "=" + (i*j));
			}
			
			System.out.println("***************************************");
		}
	}

}
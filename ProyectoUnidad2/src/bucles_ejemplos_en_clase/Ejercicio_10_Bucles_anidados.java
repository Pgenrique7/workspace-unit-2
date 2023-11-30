package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class Ejercicio_10_Bucles_anidados {

	public static void main(String[] args) {
		// Hacer un programa qe recogidas las filas y las columnas por teclado dibuje una 
		//tabla de corcehtes commo la siguietne. Por ejemplo si las filas son 6 y las columnas son 5
		//Usar el caracter \t para hacer el tabulador. Usad bucles anidados

		Scanner scanner = new Scanner(System.in);
		
		int numeroColumnas=0;
		int numeroFilas=0;
		
        System.out.println("Ingresa el numero de filas ");
        	numeroFilas = scanner.nextInt();
        	
        System.out.println("Ingresa el numero de columnas ");
        	numeroColumnas = scanner.nextInt();
        	
        for(int i=1; i<=numeroFilas;i++) {
        	 
        	
        	for(int j=1; j<=numeroColumnas; j++) {
        		
        		System.out.print("# \t");
        	}
        	System.out.println();
        }
	}

}

package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class Ejercicio_12_Bucles_anidados {

	public static void main(String[] args) {
		// Ecribir un programa que pida al usuario un numero entero y que muestre por 
		//pantalla un triangulo rectangulo como el de mas abajo, de altura el numero introducido.

		Scanner scanner = new Scanner(System.in);
		
		int altura=0;
		
        System.out.println("Ingresa la altura de tu triangulo rectangulo: ");
        	altura = scanner.nextInt();
        
        	for(int i=1; i<=altura;i++) {
        		
        		for(int j=1; j<=i;j++) {
        			
        			System.out.print("*");
        		}
        		
        		 System.out.println();
        	}
       
	}

}

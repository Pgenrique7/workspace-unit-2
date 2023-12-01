package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class Ejercicio_12_bucles_ingles {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int altura=0;
		int numero=1;
		
        System.out.println("Ingresa la altura de tu triangulo rectangulo de numeros : ");
        	altura = scanner.nextInt();
        
        	for(int i=1; i<=altura;i++) {
        		
        		for (int j=1; j<=i; j++) {
        			
        			System.out.print(numero+"   ");
        			numero++;
        		}
        		
        		 System.out.println();
        	}
       

	}




}



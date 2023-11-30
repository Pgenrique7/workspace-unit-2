package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class Ejercicio_13_bucles_anidados {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 * que tenemos en este ejercicio en cada fila
		 * los i numeros impares hasta el 1 decreciente
		 * 
		 * 
		 * fila 5:   9 7 5 3 1
		 * hacemos 5 impares 
		 * 
		 * 
		 * 
		 * 1				i=1 desde j=1 hasta 1
		 * 3 1				i=2 desde j=2 hasta 1
		 * 5 3 1			i=3 desde j=3 hasta 1
		 * 7 5 3 1			i=4 desde j=4 hasta 1
		 * 9 7 5 3 1 		i=5 desde j=5 hasta 1
		 * 
		 * 						ESCRIBIR 2*j-1
		 * 
		 * ya sabemos que hacer impares hacia atras
		 * calcular el 9 e ir decrementando hacya
		 * el 1 de dos en dos
		 * 
		 * */
		
	Scanner scanner = new Scanner(System.in);
		
		int altura=0;
		
        System.out.println("Ingresa la altura de tu triangulo rectangulo de numeros impares: ");
        	altura = scanner.nextInt();
        
        	for(int i=1; i<=altura;i++) {
        		
        		for (int j=1; j>=i; j++) {
        			
        			int impares=(2*j)-1;
        			
        			System.out.print(impares);
        		}
        		
        		 System.out.println();
        	}
       

	}

}

package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class TablaMultiplicarBucleFor {

	public static void main(String[] args) {
		
		int num=0;
		
		Scanner sc= new Scanner(System.in);
		
		//Que el programa se quede en un bucle while hasta que 
		// el usuario incluya un numero entre 1 y 10
		
		System.out.println("Escribe un numero entre el 1 y el 10");
		
		num = sc.nextInt();
		//nos uqedamos en el bucle hasta que el numero sea 
		//un numero entre el 1 y 10
		// porque las tablas de multiplicar las queremos entre uno y 10
		while(num<1 || num>10) {
			
			System.out.println("Error. Debes escribir un numero entre el 1 y 10");
			
			num = sc.nextInt();
		}
		
		for (int i=1; i<=10 ; i++) {
			
			System.out.println(num+ "x"+ i + "=" + (num*i));
		}

	}

}

package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class Ejercicio_Bucles_Libro_3_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("Introduce un número distinto de cero (con un cero se termina el programa)");
		num=sc.nextInt();
		
		
	while(num!=0) {
		
		if (num>0) {
			
			System.out.println("El numero "+ num + " es positivo");
			
		} else {
			
			System.out.println("El numero "+ num + " es negativo");
			
		}
		
		if (num%2==0) {
			
			System.out.println("El numero "+num+" es par");
			
		}else {
			
			System.out.println("El numero "+num+" es impar");
			
		}
		System.out.println("El cuadrado del numero " + num + " es "+ (num*num) );
		
	}
	
		// Esta mal tengo que corregirlo !!!
		
	}

}

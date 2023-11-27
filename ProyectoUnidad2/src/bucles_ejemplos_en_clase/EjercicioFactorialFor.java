package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class EjercicioFactorialFor {

	public static void main(String[] args) {
		
		int num=0;
		int resultadoFactorial=1;
		
		//Ejemplo el factorial de 4 es 4!= 1x2x3x4
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce un numero entero para calcular el factorial");
		
		num = sc.nextInt();
	
		//la variable i es de tipo contador
		
		for (int i=1; i<=num; i++ ) {
			
			resultadoFactorial=resultadoFactorial*i;
			
		}
		
		System.out.println("El facorial de "+ num + " es = " + resultadoFactorial);
	}

}

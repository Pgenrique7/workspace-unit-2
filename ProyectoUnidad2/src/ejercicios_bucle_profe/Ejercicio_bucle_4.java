package ejercicios_bucle_profe;

import java.util.Scanner;

public class Ejercicio_bucle_4 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n ;
	  int f= 1;
	  int resultado=1 ;
	  System.out.println("Introduce un numero:");
	  n=sc.nextInt();
	  
	  while(f<n) {
		  resultado=resultado*f;
		  f++;
		  
		
	  }
	  System.out.println("El resultado es: " + resultado);
	}

}
//Esta mal tengo que corregirlo !!
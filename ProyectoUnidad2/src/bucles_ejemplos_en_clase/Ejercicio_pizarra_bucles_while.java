package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class Ejercicio_pizarra_bucles_while {

	public static void main(String[] args) {

		int n=0;
		double nAux=0.0; //variable auxiliar
		int contador=1; //contador es 1 ya que la ultaim vez que hay que contar el valor de nAux será 0
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce numero entero para saber sus cifras");
		
		n=sc.nextInt();
		
		nAux=n;
		
		while (nAux>0) {
			
			nAux=nAux/10;
			contador ++;
		
		}
		
		

		System.out.println("El numero de cifras de "+ n + " es "+ contador);
		
		//Deberes para el fin de semana
		// uyna vez sabidas ñas cifras del numero 
		// mostrar cada cifra separada por comas
		//para el numero 2345
		// debemos mostrar 2,3,4,5
		// con un for
		
		for(int i=contador-1 ; i>=0; i--) {
			
		}
		
	}
	
}

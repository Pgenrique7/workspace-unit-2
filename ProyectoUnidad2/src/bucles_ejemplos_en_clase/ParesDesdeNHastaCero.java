package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class ParesDesdeNHastaCero {

	public static void main(String[] args) {
		// Vamos a mostrar los pares desde n hasta 0

		int num=0;
		int numAux=0;

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce numero entero para mostrar pares hasta el cero");
		
		num=sc.nextInt();
		numAux=num;
		
		if(numAux%2!=0) {
			
			numAux--;
			
			for(int i=numAux; i>=0; i=i-2) {
				
			}
			
		}
	
	}

}

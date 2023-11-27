package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class Ejercicio_bucles_libro_3_4 {

	public static void main(String[] args) {
		//el programa termina cuando metas -1 de altura
		//los arboles se identifican con numero empezando desde el 0 ( es una variable contador llamada etiqueta)
		// el programa nos pide el arbol mas alto ( es un maximo llamada max altura) 
		// necesitamos quedarnos con la etiqueta o el numero del arbol mas alto para ello creamos una varibale llamada maxAlturaEtiqueta
		// La altura la pongo yo, y la etiqueta al empezar desde 0 se va contando a partir de este
		
		
		Scanner sc = new Scanner(System.in);
		
		//altura del arbol introducida por mi
		int altura;
		// el numero que tiene la etiqueta
		int numEtiqueta=0;
		// La altura maxima
		int maxAltura=0;
		//el primer maximo es la primera etiqueta, el primer arbol, 0
		int maxEtiqueta=numEtiqueta;
		
		System.out.println("Introduce la altura del arbol, el programa solo se acabara cuando introduzcas -1 como altura de arbol");
		altura= sc.nextInt();
		
		while (altura!=-1) {
			
			if (altura>maxAltura) {
				
				maxAltura= altura;
				maxEtiqueta=numEtiqueta;
				
			}
			numEtiqueta++;
			System.out.println("Introduce una altura para el arbol");
			
			altura= sc.nextInt();
			
			
		}
		
		System.out.println("El arbol con etiqueta "+ maxEtiqueta+ " tiene altura "+ maxAltura);
		

	}

}

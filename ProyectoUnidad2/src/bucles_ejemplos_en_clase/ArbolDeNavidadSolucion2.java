package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class ArbolDeNavidadSolucion2 {

	public static void main(String[] args) {
		// Con cadenas 
		
		int altura=0;
		int anchura=0;
		String tree="";
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce la altura de tu arbol navideño");
		
		/*
		 *      *
  		 *     ***
  		 *    *****
 		 * 	
 		 * conclucsion la anchura es la altura por dos menos uno
		 * 
		 * 
		 * 
		 * 
		 * */
		
		altura= sc.nextInt();

		
		for (int i=1 ; i<=altura; i++) {
			//bucle para pintar blancos
			
			for (int j=1; j<=altura-i; j++) {
			
	
					tree=tree+" ";
							
			}
			
			for (int k=1; k<=(2*i)-1; k++) {
				
				tree=tree+"*";
				
			}
		
			
			
			tree=tree+"\n";
		}
		
		System.out.println(tree);


	}

}

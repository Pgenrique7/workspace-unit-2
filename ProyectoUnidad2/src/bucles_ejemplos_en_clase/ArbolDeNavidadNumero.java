package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class ArbolDeNavidadNumero {

	public static void main(String[] args) {
		// Con cadenas 
		
		int altura=0;
		int anchura=0;
		int cont=1;
		String tree="";
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce la altura de tu arbol navideño");
		
		
		altura= sc.nextInt();
		anchura=2*altura-1;
		
		for (int i=1 ; i<=altura; i++) {
			
			for (int j=1; j<=altura; j++) {
			//el bucle de dentro se encarga de imprimir cada fila
				
				if(j<=altura-i) {
					tree=tree+" ";
				}
				else {
					
					tree=tree+" "+cont;
					cont++;
				}

							
			}
			
			//el bucle de fuera se encarga de salatar de linea
			//System.out.println();
			
			
			tree=tree+"\n";
		}
		
		System.out.println(tree);


	}

}

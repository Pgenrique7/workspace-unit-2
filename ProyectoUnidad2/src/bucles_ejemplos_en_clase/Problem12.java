package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		
		
		/*
		 * 			j columnas
		 * 
		 * i filas	1
		 * 			2	3
		 * 			4	5	6
		 * 			7	8	9	10	
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		int cont=1;
		int height=0;
		String tree="";
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the tree height");
		
		height= sc.nextInt();
		
		for (int i=1 ; i<=height; i++) {
			
			for (int j=1; j<=i; j++) {
			//el bucle de dentro se encarga de imprimir cada fila
				
				tree=tree+cont+"   ";
				// como es un numero y una cadena el numeor me va a transformar la cadena
				cont++;
				
			}
			
			//el bucle de fuera se encarga de salatar de linea
			//System.out.println();
			
			
			tree=tree+"\n";
		}
		
		System.out.println(tree);

	}

}

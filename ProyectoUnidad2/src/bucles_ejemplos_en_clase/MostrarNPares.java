package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class MostrarNPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		
		n= sc.nextInt();
		
		for(int i=0; i<=(2*n-1); i=i+2) {
			
			if (i+2> (2*n-1)) {
				System.out.print(i);
			}
		
			else {
				System.out.print(i+",");
			}
			
		}
		
	}



}


package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class Num_5_loop {

	public static void main(String[] args) {
		
		int n=0;
		int Resultado=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce a number");
		
		n= sc.nextInt();
		
		
		for(int i=0; i<=n; i++) {
			
			Resultado=i;
			
			System.out.println("The cube of the number "+i+ " is= "+Math.pow(Resultado,3));
			
		}

	}

}

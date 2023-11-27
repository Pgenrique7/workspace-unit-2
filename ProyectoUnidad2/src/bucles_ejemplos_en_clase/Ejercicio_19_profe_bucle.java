package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class Ejercicio_19_profe_bucle {

	public static void main(String[] args) {
		
		int n=0;
		Double sum=0.0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce a number n to put the n harmonic");
		n=sc.nextInt();
		
		for(int i=1; i<=n; i++){
			
			if(i==n) {
				System.out.println(1.0/i  );
			}
			else {
				System.out.print(1.0/i +",");
			}
			sum=sum+1.0/i;
		}
		
		System.out.println("The sum of the first n harmonic terms is: "+ sum);
	}

}

package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class Ejercicio_21_profe_bucles {

	public static void main(String[] args) {
		
		int n=0;
		int sum=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un numero para calcular la serie");
		n=sc.nextInt();
		
		for(int i=1; i<=n; i++){
			
			if(i==n) {
				System.out.println((5*i-3));
			}
			else {
				System.out.print((5*i-3)+",");
			}
			sum=sum+(5*i-3);
		}
		
		System.out.println("La suma de los n primeros terminos es= "+ sum);
	}

}

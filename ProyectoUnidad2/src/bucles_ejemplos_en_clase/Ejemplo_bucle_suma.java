package bucles_ejemplos_en_clase;

import java.util.Scanner;
/** hacemos un bucle que pide numeros por pantalla al
 * usuario y los suma. El bucle acabará cuando introduzcamos
 * el numero cero.
 * 
 * 
 * 
 */
public class Ejemplo_bucle_suma {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num=0;
		int sum=0;
		//el profre quiere variable max y min
		int max;
		int min;
		
		
		
		//probar con el 24, -7, 19,11
		System.out.println("Introduce un numero distinto de cero para sumar");
		System.out.println("Si el número es cero el programa acaba.");
		
		num=sc.nextInt();
		
		max=num;
		min=num;
		
		while (num!=0) {
			sum=sum+num; //sum+=num
			
			System.out.println("Introduce otro número");
			num=sc.nextInt();
			
			if (num>max)
				max=num;
			if (num< min && num!=0)
				min=num;
		
		}
		
		
		System.out.println("El resultado de la suma es: "+ sum );
		System.out.println("El maximo es: " + max + " y el minimo es: " + min);
		
	}

}

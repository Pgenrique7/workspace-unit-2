package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class EjemploDoWhileSumas {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		int num=0;
		int sum=0;
		//En la clase integer tenemos utilizades para integer
		// como el valor maximo o el minimo
		// poenmos como max el entero mas pequeñño con el fin de que
		// el maximo sea un numero de los que introduzcamos
		// igual que con el minimo
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		System.out.println("Introduce numeros distinto de cero para sumar");
		// como el do while se ejecuta al menos una vez no hace falta
		// pedir numeros fuera y dentro del bucle como haciamos con 
		// el while 
		System.out.println("El programa deja de sumar los numero cuando pongas cero");
		
		do {
			System.out.println ("Introduce un número");
			num=sc.nextInt();
			sum=sum+num;
			
			
			if (num>max && num!=0)
				max=num;
			if (num< min && num!=0)
				min=num;
			
			
		}while(num!=0); {
			
			System.out.println("El resultado de la suma es: "+ sum );
			System.out.println("El maximo es: " + max + " y el minimo es: " + min);
		
		} 
		
	}

}

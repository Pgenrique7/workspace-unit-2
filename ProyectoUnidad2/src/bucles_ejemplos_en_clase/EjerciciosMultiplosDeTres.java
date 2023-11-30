package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class EjerciciosMultiplosDeTres {

	
	/*El programa va a coger un numero n por pantalla
	 * y va a mostrar desde n hasta 3 todos los multiplos de tres
	 * 
	 * 
	 * normal con decremento 1
	 * 
	 * 
	 * pensando como mejorar el algoritmo con programación dinamica
	 * para hacer decremento tres */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num=0;
		int multTresCercano=0;
        
        System.out.println("Ingresa un número para que desde ese numero hasta 3 te muestre todos los multiplos de tres: ");
        	num = scanner.nextInt();

        
        System.out.println("Version fuerza bruta");	
        for(int i=num; i>=3 ; i-- ) {
        	
        	if(i%3==0) {
        		System.out.print(i+", ");
        	}
        	
        	
        	
        
        }
  
        System.out.println("version eficiente");
        
        multTresCercano = num - (num%3);
    	for (int i=multTresCercano; i>=3; i=i-3) {
    		
    		System.out.print(i+", ");
    	}
	}

}

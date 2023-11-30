package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class Ejercicio_7_bucles_DEBERES {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero=0;
        // Contador de el exponente
        int contadorExponente = 0;
        //Variable axuliar para no modificar la varible original
        int numeroAux=0;
        int cifra=0;
        //esta va a ser la variavle acumulador
        //Sumamos todas las potencias de dos
        double numDecimal=0.0;
        
        //coger el numero por pantalla
        System.out.println("Ingresa un número binario para pasarlo a decimal: ");
        	numero = scanner.nextInt();

        	numeroAux = numero;  

       while (numeroAux!=0) {
    	   
    	   cifra = numeroAux%10;
    	   
    	   //Si la cira es cero no hace falta sumar, porque cualquier numero multiplicado por 0 es 0
    	   if(cifra!=0) {
    		   
    	   numDecimal= numDecimal + cifra*Math.pow(2.0, contadorExponente);
    	   numeroAux=numeroAux/10;
    	   contadorExponente++;
    	   }
    	   
       }
       
       System.out.println("El numero binario "+numero+" en decimal es: "+ numDecimal);
       
      
	}
	
}
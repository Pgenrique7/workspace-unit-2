package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class Ejercicio_7_bucles_DEBERES {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero=0;
        // Contador del número de cifras 
        int contadorCifras = 0;
        //Variable axuliar para no modificar la varible original
        int numeroAux=0;
        
        System.out.println("Ingresa un número binario para pasarlo a decimal: ");
        	numero = scanner.nextInt();

        	numeroAux = numero;  

        for (; numeroAux != 0; numeroAux /= 10) {
            contadorCifras++;
        }

       
        System.out.println("El número de cifras en " + numero + " es: " + contadorCifras);
	}
	
}
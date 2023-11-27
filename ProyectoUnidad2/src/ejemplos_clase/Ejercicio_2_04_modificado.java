package ejemplos_clase;

import java.util.*;
/* Un programa que nos diga
 *EL numero es casi cero positivo
 *casi cero negativo o no es casi-cero
 */
public class Ejercicio_2_04_modificado {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.US); 

      System.out.print("Introduzca un número real positivo o negativo: ");
      
      double num = sc.nextDouble();
      
      if ((num>0) && (num < 1)) {
    	  
         System.out.println("El número es casi-cero positivo");
         
      } else if ((num>0) && (num > -1)){
    	  
    	  	System.out.println("El número es casi-cero negativo");
    	  	
      } else if (num==0) {
    	  
    	  	System.out.println("El número es cero");
    	  	
      } else {
    	  
    	  	System.out.println("No es un casi-cero");
    	  	
      }
   }
}
package funciones_en_clase;

import java.util.Scanner;

public class Ejercicio_1 {
	
	
	static boolean esMultiplo (int num1, int num2) {
		
		
		//No hace falta hacer variables siempre 
		//puedo devolver el valor true o false
		//directamente porque num1%num2==0 es una expresion booleana
		//boolean esMult =num1%num2==0;
		
		//return esMult;
		
		return num1%num2==0;
		
	}
	
	static void nombreEnPantalla (String nombre) {
		
		System.out.println("Hola "+ nombre+ ". ¿Como estas?");
		
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		String nombre="";
		int num1, num2;
		
		System.out.println("Escribe tu nombre");
		
		nombre=sc.next();
		
		nombreEnPantalla(nombre);
		
		
		// Los procedimientos no devuelven nada no se pueden asginar, las funciones
		// si porque devuelven un valor String nombreYTexto= nombreEnPantalla(nombre); 
		
		
		System.out.println("Introduce un numero");
		num1=sc.nextInt();
		
		System.out.println("Introduce otro numero");
		num2=sc.nextInt();
		
		//Las funciones devuelvlen valores y se pueden asignar a variables
		boolean esMult=esMultiplo(num1,num2);
		System.out.println(num1 + " y "+num2+ " son multiplos "+ esMult);
		
		
		//hacerlo con un if
		// La manera correcta es llamar a la funcion directamente 
		// cuantas mas asignaciones menos 
		
		if (esMultiplo (num1, num2)) {
			
			System.out.println(num1 + " y "+num2+ " son multiplos ");
		}else
			System.out.println(num1 + " y "+num2+ " no son multiplos ");
		
	}

}

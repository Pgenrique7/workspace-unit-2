package ejemplos_clase;

import java.util.Scanner;

public class Ejercicio_2_8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Double a, b, c, x1, x2, raiz;
		System.out.println("Calculadora de ecuaciones de segundo grado");
		System.out.println("Introduce la variable a");
		a=sc.nextDouble();
		System.out.println("Introduce la variable b");
		b=sc.nextDouble();
		System.out.println("Introduce la variable c");
		c=sc.nextDouble();
		raiz=Math.pow(b, 2)-4*a*c;
		if (raiz>0) {
			x1= ((-b)+Math.sqrt /*math.sqrt es la manera de hacer raiz cuadrada*/(Math.pow(b, 2)/*Math.pow es la manera de 
			poner elevados*/+4*a*c))/(2*a) ;
			x2= ((-b)-Math.sqrt(Math.pow(b, 2)+4*a*c))/(2*a) ;
			System.out.println("Hay dos soluciones que son: "+x1+" , "+x2);
		} else if (raiz==0) {
			x1=-b/(2*a);
			System.out.println("Hay una solucion que es: "+x1);
			} else {
				System.out.println("No hay solución");
			}
	}

}

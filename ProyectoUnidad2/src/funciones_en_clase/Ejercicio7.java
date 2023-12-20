package funciones_en_clase;

import java.util.Scanner;

public class Ejercicio7 {
	
	
	static long potencia (long base, long exponente) {
		long resultado=1;
		
		for (long i=0; i<exponente; i++) {
			
			resultado*=base;
			
		}
		return resultado;
		
	}
	
	
	static long factorial (long numFact) {
		long resultado=1;
		
		
		for (long i=1; i<=numFact; i++) {
			
			resultado*=numFact;
			
		}
		
		return resultado;
	}
	
	
	static double senX(long x, long precision) {
		
		double
	}
	
	
	static double Termino(double x, double n) {
		
		
		
		
		return 1;
		
			
	}
	
	static double nTermino (long x, long n) {
		
		return potencia(x,n)/ (double) factorial(n);
		
	}
	
	
	
	static double funcionE (long x, long precision ) {
		double sumaTerminos=0.0;
		
		for (long i=0; i<=precision; i++ ) {
			
			//sumaTerminos+= potencia (x,i)/ (double) factorial(i);
			sumaTerminos+= potencia(x,i);
			
		}
		
		
		return sumaTerminos;
	}

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);

		System.out.println("E elevado a " + )
		
		
	}

}

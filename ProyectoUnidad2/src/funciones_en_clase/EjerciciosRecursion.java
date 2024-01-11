package funciones_en_clase;

public class EjerciciosRecursion {
	
	
	public static int sumaNPrimerosNumeros(int n) {
		
		//caso base
		
		if (n==0)
			return 0;
		
		//definición recursiva
		
			
		return n + sumaNPrimerosNumeros(n-1);
	}

	
	
	static void imprimeDeNaUno (int n) {
		
		if (n==0) {
			
			return;
		}
		
		else {
			
			System.out.println(n);
			
			imprimeDeNaUno (n-1);
			
		}
	}
	
	static void imprimeDeUnoAN(int n) {
		
		
	if (n==0) {
			
			return;
		}
		
		else {
			
			
			imprimeDeUnoAN (n-1);
			
			System.out.println(n);
			
			
		}
	
	}
		
	
	static int contDigitos(int number) {
		
		if (number==0) {
			
			return 0;
		}
		
		else {
			
			return 1+ contDigitos(number/10);
		}
		
		
	}
	
	static void invertirNumero(int numero) {
		
		if (numero==0) {
			return;
		}
		
		else {
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(sumaNPrimerosNumeros (4));
		
		
		System.out.println();
		
		
		imprimeDeNaUno(5);
		
		
		System.out.println();
		
		
		imprimeDeUnoAN(5);
		
		System.out.println();
		
		System.out.println(contDigitos (1234));
		

	}

}

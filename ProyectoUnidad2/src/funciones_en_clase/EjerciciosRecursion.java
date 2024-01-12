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
	
	private static int invertirNumero(int numero, int resultado) {
		
		
		int digit=0;
		
		
		if (numero==0) {
			return resultado;
		}
		
		else {
			
			digit = numero%10;
			resultado= digit + resultado*10;
			numero=numero/10;
			
			
			return invertirNumero (numero, resultado);
			
			
		}
		
	}
	
	public static int sumaNPrimerosNumerosMejorado (int n) {
		
		
		return sumaNPrimerosNumerosAux (n,0);
	}
	
	
	private static int sumaNPrimerosNumerosAux (int n, int acumulador) {
		
		if (n==0) {
			
			return acumulador;
		}
		
		else {
			
			return sumaNPrimerosNumerosAux(n-1, acumulador+n);
		}
		
	}
	
	public static int terminoFibonacci (int n) {
		
		if (n==0||n==1) {
			
			return 1;
		}
		else {
			
			return terminoFibonacci(n-1)+terminoFibonacci(n-2);
		}
		
	}
	//para casa hacer la version mejoradad de termino fibonacci con programacion dinamica y funcion auxiliar
	
	// para cassa hacer la version mejorada con programacion dinamica y funcion auxiliar de la suma de n 
	// terminos fibonacci
	
	
	//suponemos que a es mayor que b
	public static int MCD (int a, int b) {
		
		if (b==0) {
			
			return a;
		}
		else {
			
			return MCD(b, a%b);
		}
		
		
	}
	
	
	public static int MCDMejorado (int a, int b) {
		
		
		if (a>=b) {
			
			return MCD (a,b);
		}
		
		else {
			
			return MCD(b,a);
		}
	}
	
	
	public static int maximoComunDivisor (int a, int b) {

        int max, min, temp;

        max = a>=b?a:b;
        min= a<b?a:b;

        while (min > 0) {
            temp = min; 
            min = max % min;
            a = temp;
        }
        return a;

    }
	
	public static int mcm (int a, int b) {
		
		
		return a*b/maximoComunDivisor(a,b);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(sumaNPrimerosNumeros (4));
		
		
		System.out.println();
		
		
		imprimeDeNaUno(5);
		
		
		System.out.println();
		
		
		imprimeDeUnoAN(5);
		
		System.out.println();
		
		System.out.println(contDigitos (1234));
		
		System.out.println();
		
		System.out.println(terminoFibonacci(6));

	}

}

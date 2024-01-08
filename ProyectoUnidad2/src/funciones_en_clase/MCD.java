package funciones_en_clase;

public class MCD {

	//tenemos nuestra funcion mcd con dos parametros int a e int b, pero no sabemos cual es mayor o menor por eso debemos 
	//hacer un 
	//int max=(a>=b)?a:b; e 
	//int min (a<b)? a:b; (los dos putnos son operadores ternarios donde, si la condicion se cumple sale a y si no se
	//cumple sale b para eso se utiliza ?a:b)

	
	
	//MCD (20,16)= MCD ( 16, 4) = MCD (4,0)
	//	max= 20;
	//	min= 16;
	//			max= 16;
	//			min= 4;
	//							max= 4;
	// 							min= 0; Cuando el min es igual a 0 salimos del bucle
	
	
	
	static int MCD (int a, int b ) {
		
		int aux;
		int max=(a>=b)?a:b;
		int min=(a<b)?a:b;
		
		while (min>0) {
			
			aux=min;
			min =max%min;
			a= aux;
		}
		return a;
	}
	
	// procedimiento para mostrar la simplificacion de una fracción
	/* pasamo la fraccion 18/20 resultado sea 18/20 = 9/10 
	 * 
	 * 
	 * Modularidad -> usamos el mcd para simplicficar la fraccion (dividimos el problema en subproblemas)
	 * 
	 * */
	
	public void simplificarFraccion(int numerador, int denominador) {
		
		
		MCD(numerador, denominador);
		int resultadoNumerador;
		int resultadoDenominador;
		
	
		
	}
	
	
	//int rotateOne (int number)
	//input= 5376
	//output= 6537
	
	static int rotateOneToTheRight (int number) {
		
		int numDigits = countDigits (number);
		int digit=0;
		int result=0;

		digit= number%10; //-> sacamos el ultimo digito que en este caso es el 6
		
		
		//Transformamos 6 en 6000
		result= (int) (digit*Math.pow(10,numDigits-1));
		
		
		// obtenemos el resto del numero de 5376 a 537 dividiendo entre 10
		number= number/10;
		
		//sumamos el result al numero 6000+537
		
		result= result+number;
		
		return result;
	}
	
	

	//int rotateNToTheRight (int number, int n)
	//input= 5376, 2
	//output= 7653
	
	static int rotateNToTheRight (int number, int n) {
		
		int numDigits = countDigits (number);
		int digit=0;
		int result=0;
		int position=0;
		
		n=n%numDigits;

		while (number>0) {
			
			digit= number%10; //-> sacamos el ultimo digito 
		
		
		
		//Transformamos el ultimo numero
		result= (int) (digit*Math.pow(10,numDigits-1));
		
		
		// obtenemos el resto del numero 
		number= number/10;
		
		//sumamos el result al numero 6000+537
		
		result= result+number;
		
		cont ++;
		}

		
		return result;
		
	}
	
	
	
	public static void main(String[] args) {
	
	}

}

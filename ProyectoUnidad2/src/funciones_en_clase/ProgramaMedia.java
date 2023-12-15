package funciones_en_clase;

import java.util.Scanner;

public class ProgramaMedia {
	
							//	parámetros formales
	public static double media( int x , int y ) {
	
	double calculo;
	
	calculo = (double) (x + y)  / 2;    
	return calculo;
	//También se puede poner Return  ((x + y)  / 2)
	}
	
	public static double constantesiete() {
		
		
		return 7.0;
		
	}

	public static double constanteSiete () {


        return 7.0;

    }

    public static double funcionPow (int base, int exponente) {

        double resultado = 1;

        for (int i=1; i<= exponente ;i++) {

            resultado*=base;
        }

        return resultado;
    }
    
    
    public static long factorial (int n) {
    	
    	return 1;
    	
    }
    
    
    
    //suma todos los numeors entre min y max
    public static int sumaNumerosEnRango(int min, int max) {
    	
    	int resultado=0;
    	
    	return resultado;
    	
    }
    
    public static boolean esMayor (int a, int b) {
    	
    	return a>b?true:false;
    }
    
    
    public static int sumaNumerosParesEnRango (int min, int max) {
    	
    	int resultado=0;
    	
    	if(min%2==1) {
    		
    		min++;
    		
    	}
    	
    	for(int i=min ; i<=max; i+=2) {
    		
    	resultado+=i;
    		
    	}
    	
    	return resultado;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		double result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el primer Numero");
		num1= sc.nextInt();
		
		System.out.println( "Dame el segundo Numero");
		num2= sc.nextInt();
		result=media(num1,num2);

	 //parámetros ACTUALES O REALES n1 y n2

		System.out.println( "La media es:" + result) ;


	}

}

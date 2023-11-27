package bucles_ejemplos_en_clase;

public class EjemploBucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable contador
		int i=0;
		//variable tipo acumulador, en este caso suma
		int sum=0;
		//variable tipo maximo
		int max;
		//variable tipo minimo
		int min;
		
		max=i;
		min=i;
		
		while (i<10) {
			
			System.out.println("El valor del contador es: "+ i);
			sum+=i; //sum=sum+i
			i=i+1;
			//i++
			
			if (i>max)
					max=i;
			if (i< min)
				min=i;
			
		}
		System.out.println("Suma de los numeros de 0 a " + (i-1)+" es " + sum);
		
		System.out.println("El maximo es: "+ max+ " y el minimo es: "+ min);
	}

}

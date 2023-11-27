package ejemplos_clase;

public class EjemploDivisionEntera {

	public static void main(String[] args) {
		
		int num1=3;
		
		int num2=9;
		
		//División entera, cuidado si el dividendo es mas pequeño que el divisor nos da 0
		System.out.println(num1/num2);
		System.out.println(num1%num2);

		
		//División decimal con enteros
		System.out.println(num1/(num2*1.0));
		System.out.println(num1%(double)num2);
		System.out.println((double)num1%num2);
		
	}

}

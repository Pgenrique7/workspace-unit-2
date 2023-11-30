package bucles_ejemplos_en_clase;

public class Ejercicio_9_Bucles_anidados {

	public static void main(String[] args) {
		
		//Haced un programa que con bucles anidaddo imprima por pantalla lo siguiente
		//Usar el caracter \t para hacer el tabulador en el salto entre Externo e Interno
		
		for (int i=1; i<=3; i++) {
			
			System.out.print("Externo : " + i);
			
			for(int j=1; j<=2; j++) {
				
				System.out.print("\t  Interno: " +j );
			}
			System.out.println("");
		}

	}

}

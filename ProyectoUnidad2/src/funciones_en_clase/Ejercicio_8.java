package funciones_en_clase;

public class Ejercicio_8 {

	
	static double distanciaEntreDosPuntos (double x1, double y1, double x2, double y2 ) {
		
		
		return Math.sqrt(Math.pow((x2-x1),2)+Math.pow(y2-y1, 2));
		
	}
	
	public static void main(String[] args) {
		
		System.out.println( distanciaEntreDosPuntos(1,3,2,4));
	}

}

package funciones_en_clase;

public class Ejercicios_funciones_10_01 {

	
	
	 public static int contarCifras(int numero) {
	        String numeroStr = Integer.toString(numero);
	        
	        return numeroStr.length();
	    }
	 
	 
	 
	
	static int  quitarPorDetras(int num, int numEliminados) {
		
		
		for (int i=0; i<numEliminados; i++) {
			
			num=num/10;
			
		}
		
		
		return num;
	}
	
	
	static int quitarPorDelante (int num, int numEliminados) {
		
		int numCifras=contarCifras(num);
		int elevado;
		int numAux;
		
		
		elevado= numCifras-numEliminados;
		
		numAux=(int) (num/Math.pow(10,elevado));
		
		numAux= (int) (numAux*Math.pow(10, elevado));
		
		num=num-numAux;
		
		return num;
	}
	
	
	static int pegaPorDetras (int num, int numPegado) {
		
		int numCifrasPegado=contarCifras(numPegado);
		
		int numAux;
		
		
		
		
		return num;
	}
	
	static int pegaPorDelante (int num,int numPegado) {
		
		
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println(quitarPorDetras(4142,2));
		System.out.println(quitarPorDelante(893239, 3));
	}

}

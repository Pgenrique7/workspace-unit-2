package funciones_en_clase;

public class Ejercicio_10_Funciones {
	
	
	static double numeroSegundos(int horas, int minutos, int segundos) {
		
		int segundosHoras;
		int segundosMinutos;
		int resultado;
		
		segundosHoras=horas*3600;
		segundosMinutos=minutos*60;
		
		
		resultado= segundosHoras+segundosMinutos+segundos;
		
		
		return resultado;
		
		
		
	}

	static double numeroSegundos(int segundos) {
		
		int horas;
		int sobrasHora;
		int minutos;
		int segundosRest;
		
		horas= segundos/3600;
		sobrasHora=segundos%3600;
			
		minutos=sobrasHora/60;
		segundosRest=sobrasHora%60;
		
		
		return 0;
	}
	
	
	public static void main(String[] args) {

		
		

	}

}

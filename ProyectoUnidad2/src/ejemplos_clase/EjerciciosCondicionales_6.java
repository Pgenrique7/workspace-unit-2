package ejemplos_clase;

import java.util.Scanner;

public class EjerciciosCondicionales_6 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x, y;
		System.out.println("Introduzca la coordenada x:");
		x= sc.nextInt();
		System.out.println("Introduzca la coordenada y:");
		y= sc.nextInt();
		if (x>0 && y>0) {
			
			System.out.println("Se encuentra en el primer cuadrante");
			
		}else if (x<0 && y>0) {
			System.out.println("Se encuentra en el segundo cuadrante");
			
		}else if (x<0 && y<0) {
			System.out.println("Se encuentra en el tercer cuadrante");
			
		}else if (x>0 && y<0) {
			System.out.println("Se encuentra en el cuarto cuadrante");
			
		}else if (x==0 && (y>0||y<0)) {
			System.out.println("Se encuentra en el eje vertical");
			
		}else if ((x>0 || x<0) && y==0) {
			System.out.println("Se encuentra en el eje horizontal");
		} 
		
		else {
			System.out.println("Se encuentra en el origen");
		}
	}
}

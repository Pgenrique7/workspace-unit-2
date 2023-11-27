package ejemplos_clase;

import java.util.Scanner;

public class Ejercicio_2_15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int base, altura, area;
		System.out.println("Introduce la base del triangulo");
		base= sc.nextInt();
		System.out.println("Introduce la altura del triangulo");
		altura= sc.nextInt();
		if (base<0 || altura<0) {
			System.out.println("No se puede hacer el area de un triangulo con base o altura negativa");
		} else {
			area=(base*altura)/2;
			System.out.println("La base del triangulo es= "+ area);
		}
	}

}

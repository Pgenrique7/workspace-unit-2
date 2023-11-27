package ejercicios_bucles;

import java.util.Scanner;

public class Maximo_minimo_notas {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		String nombreAlumnoMax="", nombreAlumnoMin="", nombreAlumno="";
		String curso="";
		
		int maxNota=0, minNota=10, notaAlumno; //maximo y minimo
		int sumaNotas=0; //acumulador
		int numAlumnos=0; //contador
		double media=0.0; //
		
		System.out.println("Introduzca el curso");
		
		curso = sc.nextLine();
		
		System.out.println("Introduzca el nombre del alumno");
		
		nombreAlumno = sc.nextLine();
		
		System.out.println("Introduzca la nota del alumno");
		
		notaAlumno = sc.nextInt();
		maxNota=notaAlumno;
		minNota=notaAlumno;
		
		
		while (!nombreAlumno.equals("fin")) {
			
			numAlumnos++;
			
			if (notaAlumno>=maxNota) {
				maxNota=notaAlumno;
				nombreAlumnoMax=nombreAlumno;
				
			}
			if (notaAlumno<=minNota) {
				minNota=notaAlumno;
				nombreAlumnoMin=nombreAlumno;
				
			}
			
			System.out.println("Introduzca el nombre del alumno");
			
			nombreAlumno = sc.next();
			
			System.out.println("Introduzca la nota del alumno");
			
			notaAlumno = sc.nextInt();
			
			sumaNotas+=notaAlumno;
			
			
			
		}
		
		if (numAlumnos>0) {
			
			System.out.println("Curso: " + curso);
			
			System.out.println("Alumno con maxima nota: "+ nombreAlumnoMax + " Nota: "+ maxNota);
			System.out.println("Alumno con minima nota: "+ nombreAlumnoMin + " Nota: "+ minNota);
			
			System.out.println("Media de notas: "+ (double)(media= (double)sumaNotas/numAlumnos));
		}
		
	}

}

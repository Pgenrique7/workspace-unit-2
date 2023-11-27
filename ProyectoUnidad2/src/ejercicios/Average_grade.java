package ejercicios;

import java.util.Scanner;

public class Average_grade {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Double Trimestral1, Trimestral2, Trimestral3, AverageGradeDecimals;
		int AverageGradeNoDecimals;
		System.out.println("Calculator of average grade of the course");
		System.out.println("Introduce your first trimestral grade:");
		Trimestral1= sc.nextDouble();
		System.out.println("Introduce your second trimestral grade:");
		Trimestral2= sc.nextDouble();
		System.out.println("Introduce your third trimestral grade:");
		Trimestral3= sc.nextDouble();
		AverageGradeNoDecimals= (int) (Trimestral1+Trimestral2+Trimestral3)/3;
		AverageGradeDecimals= (Trimestral1+Trimestral2+Trimestral3)/3;
		System.out.println("Your average grade with decimals is "+ AverageGradeDecimals + " and your average grade without decimals is: "+ AverageGradeNoDecimals);
	}
}

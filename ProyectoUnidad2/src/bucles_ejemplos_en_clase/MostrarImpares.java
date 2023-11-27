package bucles_ejemplos_en_clase;

import java.util.Scanner;

public class MostrarImpares {

    public static void main(String[] args) {
        
        // Initialize variables
        int n = 0;
        
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number:");
        
        // Read the entered number
        n = sc.nextInt();
        
        // Loop to print odd numbers up to (2*n-1)
        for (int i = 1; i <= (2 * n - 1); i = i + 2) {
            
            // Check if the next odd number is the last one
            if (i + 2 > (2 * n - 1)) {
                // If it's the last one, print without a comma
                System.out.print(i);
            } else {
                // If it's not the last one, print with a comma
                System.out.print(i + ",");
            }
            
        }
        
    }

}

/* Explanation:

Variable Initialization: int n = 0; initializes an integer variable n to 0.

Scanner Object Creation: Scanner sc = new Scanner(System.in); 

creates a Scanner object named sc to read user input from the console.

User Input: System.out.println("Enter a number:"); prompts the user to enter a number, 

and n = sc.nextInt(); reads the entered number and stores it in the variable n.

For Loop: for (int i = 1; i <= (2 * n - 1); i = i + 2) is a loop that 

iterates over odd numbers starting from 1 up to (2 * n - 1) with a step size of 2.

Printing Odd Numbers: Inside the loop, there's an if-else statement to determine whether 

the current odd number is the last one in the sequence (2 * n - 1).

If it's the last one, it prints the number without a comma.

If it's not the last one, it prints the number with a comma.


What it do?
The program effectively takes a user-input number n, calculates the odd numbers up to (2 * n - 1), and prints them separated by commas.*/
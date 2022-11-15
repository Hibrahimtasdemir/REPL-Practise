package f_ConditionalSentence;

import java.util.Scanner;

public class repl031 {
	// For you to do:
		// Write a java program that prints out True if ( x * y ) return a positive
		// value. Else prints out False if (x * y) return a negative value.

		// Step 1: Your program should ask "Please enter first number" - for the 1st
		// number and "Please enter second number" - for the 2nd number.

		// Step 2: Create the if condition to check if the multiplication of x and y
		// values is positive or negative.

		// Step 3: If it is a positive value - user will get True, if it is negative
		// value - user will get False.

		// IMPORTANT: Must use a Scanner class
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		
		int num = scan.nextInt();
		
		System.out.println("Please enter second nummer");
		
		int num1 = scan.nextInt();
		
		int result = num * num1;
		
		if(result >0 ) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}

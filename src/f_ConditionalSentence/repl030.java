package f_ConditionalSentence;

import java.util.Scanner;

public class repl030 {
	// For you to do:
		// Write a program to take values of length and width from the user and
		// check if the shape of an object is square or rectangle.

		// Examples:

		// Please enter the length 18
		// Please enter the width 16
		// The shape of your object is rectangle

		// Please enter the length 16

		// Please enter the width 16

		// The shape of your object is square
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the lenght");
		int lenght = input.nextInt();
		
		System.out.println("Please enter the width");
		
		int width = input.nextInt();
		
		if (lenght ==width) {
			System.out.println("the shape of your object is square");
		}else {
			System.out.println("the shape of your object is rectangle");
		}
	}
}

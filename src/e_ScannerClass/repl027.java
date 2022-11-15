package e_ScannerClass;

import java.util.Scanner;

public class repl027 {
	// For you to do:
		// Write a program to take a statement input from the user and print it.

		// Hint: by statement we mean a sentence(any).
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter your sentence");
	String family = scan.nextLine();
	System.out.println(family);
	}
}

package e_ScannerClass;

import java.util.Scanner;

public class repl024 {
	// Must use the Scanner Class
		// For you to do:
		// Write a program to take user name, age and mobile number in single line.

		// First Output: "Enter your name"
		// Second Output: "Enter your mobile number"
		// Third Output: "Enter your age"

		// Final Output:
		// "Your name is ___ , your age is ___ and your mobile number is (___)-___-____"
public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter your name");
	String name = scan.nextLine();
	System.out.println("Enter your mobile number");
	int mobileNumber = scan.nextInt();
	System.out.println("enter your age");
	int age = scan.nextInt();
	System.out.println("Your name is " + name + "," + " your  mobile number is " + mobileNumber + " your age is " + age);
	
}
}

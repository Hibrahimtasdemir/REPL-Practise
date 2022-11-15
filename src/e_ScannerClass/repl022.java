package e_ScannerClass;

import java.util.Scanner;

public class repl022 {
	//For you to do: 
			//Write  a program that takes user's first name and surname.
			//First input: "Please Enter First Name" should print first input.
			//Second input:"Please Enter Surname" should print second input.
			//Final Output: 
			//Print both first name and surname on one line. Make sure there is a space between First Name and Surname.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		
		System.out.println("Enter your surname");
		
		String surname = scan.nextLine();
		System.out.println(name + " " + surname);
}
}

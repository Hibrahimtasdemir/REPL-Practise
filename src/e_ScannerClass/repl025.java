package e_ScannerClass;

import java.util.Scanner;

public class repl025 {
	// For you to do:
		// Create a Scanner class
		// Create a program that will ask user to input boolean value
		// "Input the boolean value"
		// If the input is True or False, then the output should look like below:
		// Output: "The value is __true/false____"
public static void main(String[] args) {
	
	Scanner obj = new Scanner (System.in);
	System.out.println("Input the boolean value");
	boolean name = obj.nextBoolean();
	System.out.println(" The value is " + name);
}

}

package f_ConditionalSentence;

import java.util.Scanner;

public class repl028 {
	// For you to do:
		// The variable "name" holds a String user input
		// Write a conditional statement starting on line 9 that does the following:
		// If name is equal to "Chen", print "teacher"
		// For any other input, print "student"
		// Hint: for your if condition use if(name.equals("Chen")) - we haven't
		// study it yet, but this is code to compare Strings. We will cover this
		// topic soon.
	
	public static void main(String[] args) {
		
		String name = "Chen";
		if (name.equals("Chen")) {
			System.out.println("Student");
		}else {
			System.out.println("teacher");
		}
		System.out.println("Second Way");
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Input : ");
		
		String name1 = scan.nextLine();
		if (name1.equals("Chen")) {
			System.out.println("student");
			
		}else {
			System.out.println("teacher");
		}
	}

}

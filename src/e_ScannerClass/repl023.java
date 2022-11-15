package e_ScannerClass;

import java.util.Scanner;

public class repl023 {
	//Must use the Scanner Class
		//For you to do: 
		//Write a program that asks the user's age. 
		//Then display it by adding 10 (i.e age + 10) in your final output. 
		//Output: "Your age after 10 years is ". 
		//Remember to put the value in your final output with 10 years added to it.
public static void main(String[] args) {
	
	Scanner user = new Scanner (System.in);
	System.out.println("Please enter your age");
int age = user.nextInt();
int ageFuture = age+10;
System.out.println("Your age after 10 years is " + ageFuture);
}
}

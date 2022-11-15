package g_LogicalOperators;

import java.util.Scanner;

public class repl036 {
	//For you to do:
		//	Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"  
		//	and make the comparisons:

		//	    if int1 and int2 are equal and word1 and word2 are equal, output "AND"
		//	    if int1 and int2 are equal or word1 and word2 are equal, output "OR"
		//	    if int1 and int2 are not equal and word1 and word2 are not equal, output "
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter two Srings");
	String word1 = scan.nextLine();
	String word2 = scan.nextLine();
	
	System.out.println("Please enter two numbers");
	int int1 = scan.nextInt();
	int int2 = scan.nextInt();
	
	if (int1 ==int2 && word1.equals(word2)) {
		System.out.println("AND");
	}else if(int1 == int2 || word1.equals(word2)) {
		System.out.println("OR");
	}else if ((int1!=int2) && (word1!=word2)) {
		System.out.println("NONE");
	}
}
}

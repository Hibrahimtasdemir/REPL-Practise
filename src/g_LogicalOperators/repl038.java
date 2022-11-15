package g_LogicalOperators;

import java.util.Scanner;

public class repl038 {
	public static void main(String[] args) {
		//For you to do:
		//	Prompt user with a question: "Is it weekend?"
		//	If it is not a weekend --> subject="Manual testing"
		//	Otherwise --> subject="Java"

		//	Output: "Today you will be learning ____"
		Scanner scan = new Scanner(System.in);
		System.out.println("Is it weekend?");
		boolean weekend = scan.nextBoolean();
		if (!weekend) {
			System.out.println("Manuel Testing");
		}else 
		{System.out.println("Java");}
		
	}

}

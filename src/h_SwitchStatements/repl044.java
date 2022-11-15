package h_SwitchStatements;

import java.util.Scanner;

public class repl044 {
	// For you to do:
		// Step 1: You have variable iSwitch=6;

		// Step 2: Do the switch for the other cases but for your value it should
		// print out "Not in the list"

		// Output: "Not in the list"

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a number ");
			int iSwitch = scan.nextInt();
			switch (iSwitch) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			default:
				System.out.println("Not in the list");
				break;
			}
		}

}

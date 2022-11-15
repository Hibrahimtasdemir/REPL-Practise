package f_ConditionalSentence;

import java.util.Scanner;

public class repl032 {
	// For you to do:
		// Write a program that shows if you input a number it will display a month
		// with corresponding number, and if you input a number out of bounds (12)
		// it will display invalid. Display the months to be displayed on my output.

		// IMPORTANT: use Scanner Class

		// Example:
		// 1 will display January
		// 2 will display February
		// 3 will display March
		// 4 will display April
		// 5 will display May
		// 6 will display June
		// 7 will display July
		// 8 will display August
		// 9 will display September
		// 10 will display October
		// 11 will display November
		// 12 will display December
		// ANY INPUT outside of 12 should display in output "Invalid"
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the month");
		int month = scan.nextInt();
		
		if(month == 1) {
			System.out.println("January");
		}else if (month == 2) {
			System.out.println("February");
		}else if (month == 3) {
			System.out.println("March");
		}else {
			System.out.println("Invalid");
		}
	}

}

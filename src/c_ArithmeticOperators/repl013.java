package c_ArithmeticOperators;

public class repl013 {
	// Math Magic
		// In this project, you will become a magician and write a small program
		// that performs a mathematical magic trick! It will involve performing
		// arithmetic operations on an integer that you created.

		// For you to do:

		// Create an int variable called myNumber. Set it equal to any number other than 0.
		// We will refer to myNumber as the original number from now on.
		// Create an int variable called stepOne. Set it equal to the original number (myNumber) multiplied by itself.
		// Create an int variable called stepTwo. Set it equal to the previous result (stepOne) plus the original number (myNumber).
		// Create an int variable called stepFour. Set it equal to the previous result (stepThree) plus 17.
		// Create an int variable called stepFive. Set it equal to the previous result (stepFour) minus the original number.
		// Create an int variable called stepSix.Set it equal to the previous result (stepFive) divided by 6.
		// Let's print out the value of the last step as: "The magic number is _ !"

		// Now try running your code! What number is printed to the console?
		// Now, go back to your code and change myNumber to any other integer.
		// Run your program again.
		// Is the output the same?
		// It's math magic!

		// Output: "The magic number is _!"
	public static void main(String[] args) {
		
		int myNumber = 1;
		int step1 = myNumber * myNumber;
		int step2 = step1 + myNumber;
		int step3 = step2 / myNumber;
		int step4 = step3 + 17;
		int step5 = step4 - myNumber;
		int step6 = step5 / 6;
		
		System.out.println("The magic number is " + myNumber);
		
	}
}

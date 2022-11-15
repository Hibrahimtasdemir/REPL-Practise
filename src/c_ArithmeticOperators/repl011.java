package c_ArithmeticOperators;

public class repl011 {
	// For you to do:
			// Write a program to print the perimeter and area of a rectangle with
			// width = 5 and height = 8.

			// Output:
			// “The perimeter of a rectangle with width __ and height __ is equals
			// to __ and the area equals to __”
	
	public static void main(String[] args) {
		
		int width = 5;
		int height = 8;
		
		int area = width*height;
		
		int perimeter = 2 * (width+height);
		System.out.println("The perimeter of a rectangle width 5 and height 8 is equals to " + perimeter + " and area equals to " + area + "");
	}

}

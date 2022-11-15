package g_LogicalOperators;

public class repl034 {
	//For you to do: 
		//	Declare 4 int variables a, b, c and d. 
		//	Your variable c is the result of addition of a & b. 
		//	Variables a & b should be more than d, and c should be more than d. 

		//	Output: 
		//	true
		//	true

		//	Hint: you have 2 outputs meaning you need to have 2 printing statements
public static void main(String[] args) {
	
	int a = 4;
	int b = 5;
	int d = 3;
	int c = a + b;
	
	if (a>d & b>d) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
}

}

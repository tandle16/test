
//Constructor Overload,Chain Constructor
package javaAssignment4;

public class ClassTwo {

	public ClassTwo(boolean a) {
		this(5, ",vehicle");//this keyword refers to current object
	
		System.out.println("true");
	}

	public ClassTwo(int a, int b) {
		this("second   ", false);
		System.out.println("Entered number is:" + a + b);
	}

	public ClassTwo(double a, double b) {

		System.out.println("You entered a double and double:" + a + b);
	}

	public ClassTwo(String a, boolean b) {
		this(2.555  ,- 2.5);

		System.out.println("You entered a string and boolean value:" + a + b);
	}

	public ClassTwo(int a, String b)

	{
		this(18.89, -1.84);
		System.out.println(" You Entered an integer and string:" + a + b);

	}
	
	
	}


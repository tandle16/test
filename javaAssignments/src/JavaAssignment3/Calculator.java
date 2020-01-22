
//Build a basic calculator using if...else.., and also Using method for each operation. 

package JavaAssignment3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter firstnumber :");
		double x = userinput.nextDouble();

		System.out.println("Enter secondnumber :");
		double y = userinput.nextDouble();

		while (true) {

			System.out.println("what operation need to perform");
			String action = userinput.next().toLowerCase();

			if (action.equals("add")) {
				//System.out.println(x + y);
				sum(x, y);

			} else if (action.equals("sub")) {
				//System.out.println(x - y);
               sub(x,y);
			} else if (action.equals("multi")) {
				//System.out.println(x * y);
                   multi(x,y);
			} else if (action.equals("div")) {
				//System.out.println(x / y);
                      div(x,y);
			} else {
				break;
			}
		}
		

	}
	
	private static void sum(double n1, double n2)
	{
		System.out.println("sum method is called");
		System.out.println(n1 + n2);
	}
	private static void sub(double n1,double n2)
	{
		System.out.println(n1-n2);
		
	}
	
	
	private static void multi(double n1,double n2)
	{
		System.out.println(n1*n2);
		
	}
	private static void div(double n1,double n2)
	{
		System.out.println(n1/n2);
		
	}
	
}
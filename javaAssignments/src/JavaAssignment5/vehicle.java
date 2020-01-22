//Assignment 5-Overload methods(without main() //


/* (2Q) Method Overloading   */

package JavaAssignment5;

public class vehicle {
/*public vehicle() {
		System.out.println("default");
	}

	public vehicle(int a) {
		System.out.println("print int" + a);
	}

	public vehicle(String x, String y) {
		System.out.println("print String" + x + y);
	}

	public vehicle(String a, int b) {
		System.out.println("print" + a + b);
	}*/

	public void car()// no arguments
	{
		System.out.println("No passengers in car");
	}

	public void car(int a)// passing arguments
	{
		System.out.println("Number of Passengers in car are :" + a);
	}

	public  void car(String a, String b)// passing arguments
	{
		System.out.println("Passengers are :" + a + b);
	}

	public void car(String a, int b)// passing arguments
	{
		System.out.println("Passengers are :" + a + b);
	}

	{
		car(); // calling method to method
	}
}

/* Assignment 5(2Q)-Method overload with main() */

package JavaAssignment5;

public class Methodcar {

	public static void main(String[] args) {

		vehicle obj = new vehicle();// creating object  from vehicle class
		obj.car(); // calling default method by creating object from vehicle class

		obj.car(2);// calling method with parameter (integer) by creating object from vehicle class
		obj.car("Tom  ", "Tim");// calling method with parameters (strings) by creating object from vehicle
								// class
		obj.car("Ted_?", 3);// calling method with parameters(string ,integer) by creating object from
							// vehicle class
		obj.car("Ted_?", 2);// calling method with parameters(string ,integer) by creating object from
							// vehicle class
	}

}

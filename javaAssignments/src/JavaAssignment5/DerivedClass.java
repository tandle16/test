/* (1Q.a) Implementing inheritance - Use the Super keyword.*/

package JavaAssignment5;

public class DerivedClass extends BaseClass {

	public static void main(String[] args) {

		DerivedClass d = new DerivedClass();
		d.Sum(10, 23);// calling derived method sum
	}

	//public int sum1;

	public int Sum(int a, int b) {

		System.out.println("line 13 Inside Derived Sum method before calling super sum method");

		int k = super.Add(a, b); // super refers to the base class object

		System.out.println("Inside Derived Sum method after calling super sum method");
		System.out.println("   The sum is " + k);
		return k;
	}

}
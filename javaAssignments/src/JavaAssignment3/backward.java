
//Print the pattern to backward (5 4 3 2 1 0).

package JavaAssignment3;

import java.util.Scanner;

public class backward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number  x:");
int x=sc.nextInt();
System.out.println("Backward numbers are :");
for(int i=x;i>=0;i--) {

System.out.println(i);

}
	}
}
                
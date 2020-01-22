package javaAssignments2;
import java.util.Scanner;

public class JavaQ1hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
String x=sc.next();
String T="TEST";
System.out.println("Entered string is  "  +x);
System.out.println(x.toUpperCase());
System.out.println(x.length());
System.out.println(x.replace('o','Z'));
System.out.println(x.endsWith("Z"));
System.out.println("hello  " +T);
	}

}

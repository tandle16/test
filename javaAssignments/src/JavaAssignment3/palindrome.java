//Ask user for a string and print string is Palindrome or not .

package JavaAssignment3;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner userinput=new Scanner(System.in);
   System.out.println("Enter a string s1 :");
   String s1=userinput.next();
   int l=s1.length();//find the length of the string
   String s2="";
   
   for(int i=s1.length()-1;i>=0;i--)
   {
	 s2=s2+s1.charAt(i);
	 System.out.println(s2);
	                                                                                                     
   }
   if(s1.equals(s2)) {
	   System.out.println("String is a palindrome");
   }else {System.out.println("String not a palindrome");
   }
	}

}

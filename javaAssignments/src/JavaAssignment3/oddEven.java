
//Ask user for a number and print out ODD if number is odd, otherwise EVEN .

package JavaAssignment3;

import java.util.Scanner;

public class oddEven {
public static void main(String[] args) {
	
	Scanner num=new Scanner(System.in);
	
	while(true) //repeats the loop
	{
	
	
	System.out.println("Enter a number :");
	int x=num.nextInt();
	if(x==0) //in this condition when you give input 0 then comes out of the loop 
    {
   	 break;
   	 }
	if( x % 2== 1)//condition to know the number odd or even
		{ 
		System.out.println("entered number is odd  ");
	}
	else 
		System.out.println("entered number is even ");
	}
	
}
}
		



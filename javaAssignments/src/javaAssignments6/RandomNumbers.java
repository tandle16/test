
//Generate 500 RANDOM numbers,Find the Nth smallest number(range 100-1000)

package javaAssignments6;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an instance of Random class
		Random rand = new Random();
		// generate random integers in range 0 to 999
		Set<Integer> ts = new TreeSet<Integer>();

		while (ts.size() < 500) {

			int randNum = rand.nextInt(1000 - 100) + 1 + 100;
			//System.out.println(randNum);
			ts.add(randNum);
		}	
			System.out.println(ts);

			System.out.println("size: "+ts.size());
			
		
		Object[] allRandom = ts.toArray();
		System.out.println("Generated 500 random numbers :");
		System.out.println("which Nth smallest number do you want?");
		Scanner userInput = new Scanner(System.in);
		int N = userInput.nextInt();
		System.out.println(allRandom[N - 1]);
	}

}

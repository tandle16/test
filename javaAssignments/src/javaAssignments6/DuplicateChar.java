

//Find and print the Duplicate Character(prints: lo)

package javaAssignments6;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello World";
		String dup = "";// zero length string

		char[] inp = str.toCharArray(); // {'H', 'e', 'l', 'l', 'o', ' ', ......};
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {

				if (inp[i] == inp[j]) {

					if (dup.indexOf(inp[i]) == -1)//get the index of char in dup string 
					{
						dup = dup + inp[i];
					}
				}
			}
		}
		
		
		System.out.println("Duplicate Characters are :"+ dup);
		
	}

}

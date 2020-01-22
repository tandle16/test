
/* Sorting Numbers in an ARRAY */

package javaAssignments6;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 6, 17, 25, 10, 15, 37 };
		int len = a.length ;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}

		System.out.println("Sorted Array is :");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}

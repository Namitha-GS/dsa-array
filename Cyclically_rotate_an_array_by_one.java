package data_structures;

import java.util.Arrays;

public class Cyclically_rotate_an_array_by_one {
	
	/* Store last index element in 1 variable 'x' */
	/* Shift right elements from last but 1 index */
	/* Replace 1st element with 'x' */
	
	private static void rotate(int[] a) {
		int x = a[a.length-1];
		
		for(int i=a.length-1; i>0; i--) {
			a[i] = a[i-1];
		}
		a[0] = x;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		rotate(arr);
		System.out.println(Arrays.toString(arr));
	}

}

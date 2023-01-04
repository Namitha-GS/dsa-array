package data_structures;

import java.util.Arrays;

public class Move_all_negative_no_to_one_side_using_extra_space {

	public static void main(String[] args) {
		int[] arr = { 1, -3, 2, 0, -4, 6, -5, -7, 3, 5, 7, -9};
		moveAll(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void moveAll(int[] a, int n) {
		
		int[] temp = new int[n];
		int j=0;
		
		for(int i=0; i<n; i++) {
			if(a[i] < 0) {
				temp[j++] = a[i];
			}
		}
		
		// if j=0 => all are Positive nos
		// if j=n => all are Negative nos
		if(j==0 || j==n)
			return;
		
		for(int i=0; i<n; i++) {
			if(a[i] >= 0) {
				temp[j++] = a[i];
			}
		}
		
		// copy temp array elements to original array
		for(int i=0; i<temp.length; i++)
			a[i] = temp[i];
		
	}

}

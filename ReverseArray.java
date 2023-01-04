package data_structures;

import java.util.Arrays;

public class ReverseArray {

	// using extra space
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10};
		reverse(arr, arr.length);
	}
	
	public static void reverse(int[] a, int n) {
		int[] b = new int[n];
		int j = n;
		for(int i=0; i<n; i++) {
			b[j-1] = a[i];
			j--;
		}
		System.out.println("Original Array: "+Arrays.toString(a));
		System.out.println("Reversed Array: "+Arrays.toString(b));
	}

}

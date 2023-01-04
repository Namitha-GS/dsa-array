package data_structures;

import java.util.Arrays;

public class Reverse_array_without_extra_space {
	
	private static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	private static void reverseArrayUsingRecursion(int[] arr, int start, int end) {
		if(start >= end)
			return;
		
		int temp = arr[start];
	    arr[start] = arr[end];
	    arr[end] = temp;
	    reverseArrayUsingRecursion(arr, start+1, end-1);
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		reverseArray(arr);
		System.out.println("Reversed array: "+Arrays.toString(arr));
		
		int[] a = {10, 20, 30, 40, 50};
		reverseArrayUsingRecursion(a, 0, a.length-1);
		System.out.println("Reversed array using Recursion: "+Arrays.toString(a));
	}

}

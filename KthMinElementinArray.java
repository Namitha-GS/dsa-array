package data_structures;

import java.util.Arrays;

public class KthMinElementinArray {
	
	public static void main(String[] args) {
		int[] arr = {8,6,-1,3,0,2,-5,4,-4};
		int position = 4;
		System.out.println("kth smallest: "+smallest(arr, position));
	}
	private static int smallest(int[] a, int k) {
//		int temp = 0;
		
//      Time complexity = O(n2)
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
		
		Arrays.sort(a);
		return a[k-1];
	}

}

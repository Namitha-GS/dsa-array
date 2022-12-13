package data_structures;

import java.util.Arrays;

public class MaxAndMinElement {

	public static void main(String[] args) {
		int[] a = {2,4,3,1,6,8,10,100};
		System.out.println("maximum: "+maximum(a, a.length));
		System.out.println("minimum: "+minimum(a, a.length));
		
		int max = Arrays.stream(a).max().getAsInt();
		int min = Arrays.stream(a).min().getAsInt();
		System.out.println("Using Stream - Max element is: "+max);
		System.out.println("Using Stream - Min element is: "+min);
	}
	public static int maximum(int[] a, int n) {
		int max = 0;
		for(int i=0; i<n; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	public static int minimum(int[] a, int n) {
		int min = a[0];
		for(int i=0; i<n; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

}

package data_structures;

public class Largest_sum_contiguous_subarray {

	/* by using Kadane's algorithm */
	/* Time complexity = O(n) */
	
	private static int sum(int[] a, int n) {
		int meh = 0;
		int msf = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			meh = meh+ a[i];
			if(msf < meh)
				msf = meh;
			
			if(meh < 0)
				meh = 0;
		}
		return msf;
	}
	
	public static void main(String[] args) {
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(sum(arr, arr.length));
	}

}

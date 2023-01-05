package data_structures;

import java.util.Arrays;

public class Minimize_max_difference_between_heights {
	
	private static int minDifference(int[] a, int n, int k) {
		Arrays.sort(a);
		
		int ans = a[n-1] - a[0]; // maximum difference
		int tmax=0, tmin=0;
		for(int i=1; i<n; i++) {
			if(a[i]-k < 0)
				continue;
			
			tmax = Math.max(a[n-1]-k, a[i-1]+k);
			tmin = Math.min(a[0]+k, a[i]-k);
			
			ans = Math.min(ans, tmax-tmin);
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = {1, 5, 15, 10};
		int k = 3;
		System.out.println(minDifference(arr, arr.length, k));
	}

}

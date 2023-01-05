package data_structures;

public class Minimum_no_of_jumps_to_reach_end_of_array {
	
	private static int minJump(int[] a, int n) {
		int step = a[0];
		int maxReach = a[0];
		int jump = 1;
		
		if(n <= 1)
			return 0;
		
		if(a[0] == 0)
			return -1;
		
		// since 0th index is already considered, 
		// start iterating from 1st index
		for(int i=1; i<n; i++) {
			maxReach = Math.max(maxReach, a[i]+i);
			step--;
			if(step == 0) {
				if(maxReach-i <= 0) {
					// to check again is step == 0
					return -1;
				}
				step = maxReach-i;
				jump++;
			}
		}
		return jump;
	}

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(minJump(arr, arr.length));
	}

}

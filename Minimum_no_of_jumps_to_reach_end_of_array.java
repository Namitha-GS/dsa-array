package data_structures;

public class Minimum_no_of_jumps_to_reach_end_of_array {
	
     static int minJumps(int[] a){
                int step = a[0];
		int maxReach = a[0];
		int jump = 1;
		int n = a.length;
		
		if(n <= 1)
			return 0;
		
		if(a[0] == 0)
			return -1;
		
		// since 0th index is already considered, 
		// start iterating from 1st index
		for(int i=1; i<n; i++) {
		    // if i reaches end of array then don't increment jump, just directly return jump
		    if(i == a.length-1){
		        return jump;
		    }
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
		return -1;
    }

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(minJump(arr, arr.length));
	}

}

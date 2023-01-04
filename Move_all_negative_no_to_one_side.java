package data_structures;

import java.util.Arrays;

public class Move_all_negative_no_to_one_side {
	
	/* Here Order of elements is not important */
	private static void rearrange(int[] arr) {
		int n = arr.length;
		int j=0; // 'j' always points to positive no
		for(int i=0; i<n; i++) {
			if(arr[i] < 0) {
				if(i != j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, 11};
		
		rearrange(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}

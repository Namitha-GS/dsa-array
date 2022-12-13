package data_structures;

import java.util.Arrays;

public class Sort_0_1_2 {

	public static void main(String[] args) {
		int []arr = {1, 0, 2, 1, 2, 1, 0, 0, 0, 1, 2, 1, 1, 0};
		sortArray(arr);
		System.out.println("After sorting, Array is: "+Arrays.toString(arr));
	}
	
	public static void sortArray(int[] a) {
		int cnt_0=0, cnt_1=0, cnt_2=0;
		int l = a.length;
		for(int i=0; i<l; i++) {
			if(a[i] == 0)
				cnt_0++;
			else if(a[i] == 1)
				cnt_1++;
			else
				cnt_2++;
		}
		
		int i = 0;
		while(i < cnt_0) {
			a[i] = 0;
			i++;
		}
		while(i < (cnt_0+cnt_1)) {
			a[i] = 1;
			i++;
		}
		
		while(i < (cnt_0+cnt_1+cnt_2)) {
			a[i] = 2;
			i++;
		}
	}
	
}

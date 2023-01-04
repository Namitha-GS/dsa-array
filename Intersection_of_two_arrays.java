package data_structures;

public class Intersection_of_two_arrays {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 4, 5, 6};
		int[] arr2 = {2, 3, 5, 7};
		intersection(arr1, arr2, arr1.length, arr2.length);
	}
	
	private static void intersection(int[] a1, int[] a2, int m, int n) {
		int i=0, j=0;
		
		/* if a1[i] < a2[j], then just increment i */
		/* if a2[j] < a1[i], then just increment j */
		/* if both elements are same, then print any one and increments both i and j */
		
		while(i<m && j<n) {
			if(a1[i] < a2[j])
				i++;
			else if(a2[j] < a1[i])
				j++;
			else {
				System.out.print(a1[i++]+" ");
				j++;
			}
		}
	}

}

package data_structures;

public class Union_of_two_arrays {

	public static void main(String[] args) {
		int arr1[] = {1, 3, 4, 5, 7};
		int arr2[] = {2, 3, 5, 6};
		union(arr1, arr2, arr1.length, arr2.length);
	}
	
	private static void union(int[] a1, int[] a2, int m, int n) {
		int i=0, j=0;
		
		/* if a1[i] < a2[j], then print a1[i] and increment i */
		/* if a2[j] < a1[i], then print a2[j] and increment j */
		/* if both elements are same, then print any one and increments both i and j */
		/* then print remaining elements of larger array */
		
		while(i<m && j<n) {
			if(a1[i] < a2[j])
				System.out.print(a1[i++]+" ");
			else if(a2[j] < a1[i])
				System.out.print(a2[j++]+" ");
			else {
				System.out.print(a1[i++]+" ");
				j++;
			}
		}
		
		//print remaining elements
		while(i<m)
			System.out.print(a1[i++]+" ");
		
		while(j<n)
			System.out.print(a2[j++]+" ");
	}

}

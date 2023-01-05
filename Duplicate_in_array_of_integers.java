package data_structures;

public class Duplicate_in_array_of_integers {
	
	private static void duplicates(int[] a, int n) {
		for(int i=0; i<n; i++) 
			a[a[i]%n] = a[a[i]%n] + n;
		
		for(int i=0; i<n; i++) {
			if(a[i]/n > 1)
				System.out.println(i);
		}
		
	}

	/* Find duplicate in an Array of N+1 integers */
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 3, 2, 3};
		duplicates(arr, arr.length);
	}

}

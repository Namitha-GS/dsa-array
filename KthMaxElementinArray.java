package data_structures;

public class KthMaxElementinArray {

	public static void main(String[] args) {
		int[] arr = {10,0,-1,-4,-5,2,3,9,8,6};
		int k=2;
		System.out.print(largest(arr, k));
	}

	private static int largest(int[] a, int k) {
		int temp = 0;
		for(int i=0; i<a.length; i++) {
		  for(int j=i+1; j<a.length; j++) {
			if(a[i] > a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		  }
	    }
		return a[a.length-k];
	}

}

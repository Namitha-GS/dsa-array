package data_structures;

import java.util.*;
public class kthMinUsingTreeSet {

	public static void main(String[] args) {
		int[] arr = {8,6,-1,3,0,2,-5,4,-4};
		int position = 5;
		System.out.println("kth smallest: "+smallest(arr, position));
	}
	
	private static int smallest(int[] a, int k) {
		Set<Integer> s = new TreeSet<>();
		for(int i=0; i<a.length; i++) {
			s.add(a[i]);
		}
		Iterator<Integer> itr = s.iterator();
		k=k-1;
		while(k>0) {
			itr.next();
			k--;
		}
		return itr.next();
	}

}

package data_structures;

import java.util.*;
public class KthMaxUsingTreeSet {

	public static void main(String[] args) {
		int[] a = {10,0,-1,-4,-5,2,3,9,8,6};
		int k=2;
		System.out.print(maximum(a, a.length, k));
	}
	
	private static int maximum(int[] a, int n, int k) {
		Set<Integer> s = new TreeSet<>();
		for(int i=0;i<n;i++) {
			s.add(a[i]);
		}
		k=n-k;
		Iterator<Integer> itr = s.iterator();
		while(k>0) {
			itr.next();
			k--;
		}
		return itr.next();
	}

}

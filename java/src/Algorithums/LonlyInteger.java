package Algorithums;

import java.util.HashSet;
import java.util.Iterator;

public class LonlyInteger {

	public static void main(String[] args) {
         
		int arr[] = {1,2,3,5,3,2,1};
		
		HashSet<Integer> ht = new HashSet<>();
		for (int i : arr) {
			if(ht.contains(i)) {
				ht.remove(i);
			}
			else ht.add(i);
		}
		for (int i : ht) {
			System.out.println(i);
		}
	}

}

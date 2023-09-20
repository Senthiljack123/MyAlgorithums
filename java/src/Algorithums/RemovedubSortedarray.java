package Algorithums;

import java.util.Arrays;
import java.util.HashMap;

public class RemovedubSortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,3,3,4,6,6};
		HashMap hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(hm.get(arr[i]) == null) {
				System.out.print(arr[i] + " ");
			}
			hm.put(arr[i], true);
		}
	 
	}

}

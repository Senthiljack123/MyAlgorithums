package Algorithums;

import java.util.Iterator;

public class SlidingWidow {

	public static void main(String[] args) {
		//Maximum subarray kandu pudika entha methidthan yapothuma use pannanum
	   int arr[]= {2,9,31,-4,21,7};
	   int k=3;
	   int wSum=0, mSum=Integer.MIN_VALUE;
	   for (int i = 0; i < k; i++) {
		    wSum=wSum + arr[i];
		                   
	}
	   for (int i = k; i < arr.length; i++) {
		       wSum = wSum - arr[i-k] + arr[i];
		       mSum = Math.max(mSum, wSum); 
	} 
	   System.out.println(mSum);

	}

}

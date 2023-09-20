package Recursion;

import java.util.Arrays;

public class Permutation {

	public static void main(String[] args) {
           
              char arr[]= {'a','b','c'};
              permutation(arr,arr.length);
              

	}

	private static void permutation(char[] arr, int n) {
		 if(n==1)  System.out.println(Arrays.toString(arr));
		 
		 else {
			 for (int i = 0; i < n-1; i++) {
				 permutation(arr,n-1);
				 
				 if(n%2==1) swap(arr,0,n-1);
				 else swap(arr,i,n-1);
			}
			 permutation(arr,n-1);
		 }
		
	}

	private static void swap(char[] arr, int rig, int lef) {
		 
		char temp=arr[rig];
		arr[rig]=arr[lef];
		arr[lef]=temp;
		
	}

}

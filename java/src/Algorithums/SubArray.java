package Algorithums;

import java.util.Arrays;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={2,3,1,0,4};
		//findInverse(arr);      //vere program summ potu pathen
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = i; k <= j; k++) {
	
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}

	}

}

	private static void findInverse(int[] arr) {
		// TODO Auto-generated method stub
		int temp[]=new int[arr.length];
		int k=0;
		
		for (int i = 0; i < arr.length; i++) {
			   temp[arr[i]]=i ;
		}
		System.out.println(Arrays.toString(temp));
		
	}
}

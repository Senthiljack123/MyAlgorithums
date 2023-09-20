package Algorithums;

import java.util.Arrays;

public class RotateAarray {

	public static void main(String[] args) {
		// TODO Auto-generated method 
         int arr[]= {1,2,3,4,5};
         System.out.println(Arrays.toString(arr));
         int k=3;
         System.out.println(Arrays.toString(rotateArray(arr,k)));


	}

	private static  int[] rotateArray(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		 k=k%arr.length;                   //yathna time rotate aganunu soldrathju
		 if(k<0) k=k+arr.length;           //k Minum(-)valuva eruntha atha kandu pudikurathu
		 
		 reverse(arr,0,k-1);
		 reverse(arr, k, arr.length-1);
		 reverse(arr, 0, arr.length-1); 
		return arr;
	 
	}

	private static void reverse(int[] arr, int start, int end) {
		 
		while(start<end) {
			int temp=arr[start]; 
		    arr[start]=arr[end];
		    arr[end]=temp;
		    start++;
		    end--; 
		}
		
	}

}

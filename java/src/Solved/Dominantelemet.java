package Solved;

import java.util.Arrays;

public class Dominantelemet {

	public static void main(String[] args) {
		int arr[]= {2,1,4,4,4};
		int count;
		 if(dominantElemet(arr)) {
			 System.out.println("yes");
		 }
		 else System.out.println("no");
 
	}

	private static boolean dominantElemet(int[] arr) {
	      int temp[]=new int[4];
	      Arrays.fill(temp, 0);
		  for (int i = 0; i < arr.length; i++) {
			     temp[arr[i]-1]++;
		}
		  for (int i = 0; i < temp.length-1; i++) {
			      if(temp[i]<temp[i+1]) return true;
			      
		}
		   
		return false;
	}

}

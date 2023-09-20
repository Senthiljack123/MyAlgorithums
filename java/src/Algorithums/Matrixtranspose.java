package Algorithums;

import java.util.Arrays;

public class Matrixtranspose {

	public static void main(String[] args) {
		 int arr[][]= {{1,2,3,4},
 		        {5,6,7,8},
 		        {9,10,11,12},
 		        {13,14,15,16}};
		 
	     int res[][]=new int[arr.length][arr.length];
	     for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				  res[j][i]=arr[i][j];
			}
		}
	      for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}

	}

}

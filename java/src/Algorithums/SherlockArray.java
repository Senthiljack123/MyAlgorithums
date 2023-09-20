package Algorithums;

import java.util.Arrays;

public class SherlockArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,4,1,1};
		int leftSum = 0,rightSum = 0, totalSum = 0;
		totalSum = Arrays.stream(arr).sum();
		for (int i = 0; i < arr.length; i++) {
			
			 rightSum = totalSum - arr[i] - leftSum;
			 if(leftSum == rightSum) {
				 System.out.println("yes");
				 break;
			 }
			 else {
				 leftSum = leftSum + arr[i];  
			 }
		    
		}

	}

}

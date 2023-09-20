package practice;

import java.util.Stack;

public class Trappingrainwater {

	public static void main(String[] args) {
		 
		int arr[]= {3,0,0,2,0,4,};
		int l=arr.length;
		int leftmax=arr[0];
		 
		Stack<Integer> rightmax=new Stack<>();
		 rightmax.push(arr[l-1]);
		for (int i=l-2;i>=0;i--) {
			 int temp=Math.max(rightmax.peek(), arr[i]);
			 rightmax.push(temp);
			
		}
		 int water=0;
		 for (int i = 1; i < arr.length-1; i++) {
			int min=Math.min(rightmax.peek(),leftmax);
			int temp=min-arr[i];
			water+=Math.max(0,temp);
			rightmax.pop();
			leftmax=Math.max(leftmax,arr[i]);
			
			
		}
				System.out.println(water);

	}

}

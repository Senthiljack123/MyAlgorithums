package Solved;

import java.util.Arrays;

public class Chocklate {
           static int count=0;
	public static void main(String[] args) {
		 int arr[]= {1,2,4,8,10,12};
		 int size=7;
		  
		 System.out.println(mix(arr,size));
		  
	}
	 static int mix(int[] arr, int size) {
		 Arrays.sort(arr);
		 int sum=0,k=0,t=0;
		 if(arr[0]<size) {
			 sum=arr[0]*1+arr[1]*2;
			 count++;
			 
		 }else return count;
		 int temp[]=new int[arr.length-1];r
		 temp[k++] =sum;
		  for (int i =2; i < arr.length; i++) {
			       temp[k++]=arr[i];
			   
		} 
                mix(temp,size);
               return count;
	 }

}

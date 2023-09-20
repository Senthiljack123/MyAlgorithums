package Algorithums;

import java.util.Arrays;

public class FirstansLast {

	public static void main(String[] args) {
		//Kuduthurka target valuevoda strat index yathu  end index yathhu
		int arr[]= {1,2,3,4,4,4,7};
		int tar=4;
		System.out.println(findIndex(arr,tar));
	 
}
	private static String findIndex(int[] arr, int tar) {
		 
		   int l=0,h=arr.length-1,mid=0;
		   int st=-1,end=-1;
		   int res[] = {-1,-1};
		   while(l<=h) {
		   mid=(l+h)/2;
		      if(tar==arr[mid]) {
		    	  res[0]=mid;
		    	  h=mid-1;
		      }
		      else if(arr[mid]<tar)
		    	  l=mid+1;
		      else h=mid-1;
		   }
		   
		    l=0;
		    h=arr.length-1;
		    mid=0;
		   while(l<=h) {
			   mid=(l+h)/2;
			      if(tar==arr[mid]) {
			    	  res[1]=mid;
			    	  l=mid+1;
			      }
			      else if(arr[mid]<tar)
			    	  l=mid+1;
			      else h=mid-1;
			   }
		return Arrays.toString(res);
	}
}
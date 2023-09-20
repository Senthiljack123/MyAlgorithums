package Stack;

import java.util.Arrays;

public class FrequentNGE {
	  static void nextFreqCount(int[] arr, int len, int[] count) {
		  int frmax=-1;
		  
		 for (int i = 0; i < count.length; i++) {
			 if(count[i]>frmax) {
					frmax=count[i];
				}
		}
		   
	  }

	public static void main(String[] args) {
          int arr[]= {1,1,2,3,4,2,1};
          int len=arr.length;
          int max=Integer.MIN_VALUE;
          for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
          int count[]=new int[max+1];
          
           Arrays.fill(count,0);
           for (int i = 0; i <arr.length; i++) {
			count[arr[i]]++;
			 
		 }
           nextFreqCount(arr,len,count);
	         
	}

}

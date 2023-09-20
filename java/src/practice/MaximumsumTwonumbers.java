package practice;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumsumTwonumbers {

	public static void main(String[] args) {
         int arr[]= {1,5,2,3,4};
         finddifer(arr,2);
         //findmaximum(arr);
	}

	private static void finddifer(int[] arr, int dif) {
            int s=0;
            for (int i = 0; i < arr.length; i++) {
				  for (int j = 0; j < arr.length; j++) {
					    
					    s=arr[i]-arr[j];
					    if(s==dif) {
					    	System.out.println(arr[i]+" "+arr[j]);
					    }
				}
			}
	}

	private static void findmaximum(Integer[] arr) {
          if(arr.length<=1) {
        	  return;
          }
          int x=0,y=0;
          Arrays.sort(arr,Comparator.reverseOrder());
          for (int i = 0; i < arr.length; i+=2) {
			x=x*10+arr[i];
			System.out.println("x  "+x);
		}
          for (int i = 1; i < arr.length; i+=2) {
  			y=y*10+arr[i];
			System.out.println("y  "+y);
  		}
          System.out.println("the two num=="+x+"   "+y);
	}

}

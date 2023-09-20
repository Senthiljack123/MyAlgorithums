package Solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Absolutediffrnce {

	public static void main(String[] args) {
		 int arr[]={1,3,6,10,15};
		 List l= differnce(arr);
		 System.out.println(l);

	}
	   
       private static List<List<Integer>> differnce(int[] arr) {
    	   List<List<Integer>> ret = new ArrayList<List<Integer>>();
    	   Arrays.sort(arr);
           int min = Math.abs(arr[0]-arr[1]);
           for(int i = 2; i<arr.length; i++){
               min = Math.min(arr[i]-arr[i-1],min);
           }
           for(int i = 1; i<arr.length; i++){
               if(min == arr[i]-arr[i-1]){
                   ret.add(Arrays.asList(arr[i-1], arr[i]));
               }
           }
           return ret;
		
	}
	
   }



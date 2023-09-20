package Queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Prioritiequeues {
	
	

	public static void main(String[] args) {
		 
		PriorityQueue p=new PriorityQueue<>();
		int arr[]= {100,100,100};
	
	     for (int i = 0; i < arr.length; i++) {
			  p.add(arr[i]);
		}
	     
	     int len=arr.length;
	      for (int i = arr.length-1; 0 < i; i--) {
			     p.poll();
			     arr[i]= len--;
		}
	      System.out.println(Arrays.toString(arr));
	      

	}

}

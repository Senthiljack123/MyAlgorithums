package Sortings;

import java.util.Arrays;

public class Frequencysort {

	public static void main(String[] args) {
             int arr[]= {3,3,2,1,3,2};
             int max=Arrays.stream(arr).max().getAsInt();
         	 int min=Arrays.stream(arr).max().getAsInt();
         	 
         	for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
	}

}

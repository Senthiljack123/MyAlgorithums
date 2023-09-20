package Recursion;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NondecresingArray {

	public static void main(String[] args) {
		 int arr[]= {5,3,4,4,7,3,6,11,8,5,11};
		   
		 LinkedList  l=new LinkedList<>();
		 for (int i = 0; i < arr.length; i++) {
			    l.add(arr[i]);
		}
		 
		 int res=0;
		 int count=nonderasing(l,res);
         System.out.println(count);
	}

	private static int nonderasing(LinkedList l, int res) {
		    int ans=0;
		    
		  for (int i = 1; i < l.size(); i++) {
			   if
		}
		 
	}

}

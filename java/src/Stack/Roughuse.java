package Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

import Searching.Rules;
 
public class Roughuse {
	
	 public static void main(String[] args) {
		 int arr[] = {8,5,8,};
		 int res = 0 ;
		 for (int i = 0; i < arr.length; i++) {
			 int count = 1;
			  for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
				
			}
 			  if(arr.length/2 < count) {
				  res = arr[i];
			  }
		}
		 System.out.println(res);
	 }
	 
}



package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class Freqsort {

	public static void main(String[] args) {
              
		String arr[] = { "may", "student", "students", "dog",
                 "studentssess", "god", "cat", "act",
                 "tab", "bat", "flow", "wolf", "lambs",
                 "amy", "yam", "balms", "looped", 
                 "poodle"};
		
		Stack l=new Stack();
		
		for (int i = 0; i < arr.length; i++) {
			   if(!arr[i].equals("AAA")) {
			 String  fir=sort(arr[i]);
			// System.out.println(fir);
			  System.out.print(arr[i]);
			      for (int j = i+1; j < arr.length; j++) {
					   
			    	   if(arr[i].length()==arr[j].length()) {
			    		         String sec=sort(arr[j]);
			    		          
			    		         if(fir.equals(sec))  {
			    		        	System.out.print(" "+arr[j]);
			    		         }
			    		         arr[j]="AAA";
			    	   }
			    	  
			    	    
				}
			      System.out.println();
			      }
			       
			       
			 
			   
		}
		
		 
		   
	}

	private static String sort(String s) {
		 
		char c[]=s.toCharArray();
		Arrays.sort(c);
		String sh=String.copyValueOf(c);
		  
		return sh;
		// TODO Auto-generated method stub
		
	}

}

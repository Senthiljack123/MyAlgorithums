package practice;

import java.util.Arrays;

public class Extendwords {

	public static void main(String[] args) {
		 String s="heeellooo";
		 String word[]={"hello", "hi", "helo"};
		 int inc[]=new int[s.length()];
		Arrays.fill(inc, 1);
		 int flag=0;
		  for (int i = 0; i < s.length(); i++) {
			     int count=0;
			     
			     for (int j = i+1; j < s.length(); j++) {
					    if(s.charAt(i)==s.charAt(j)) {
					    	  flag=1;
					    	  inc[i]++;
					    }
				}
			     
			     
		    }
		  for (int i = 0; i < inc.length; i++) {
			  System.out.println(inc[i]);
		}
		 

	}

}

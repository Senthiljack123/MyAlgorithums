package Recursion;

import java.util.Arrays;

public class Rough {
	public static void main(String[] args) {
		
		String s = "geeksgeek";
		int count[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int temp = s.charAt(i) - 97;
			count[temp]++;
		}
		 String ans = "";
		 for (int i = 0; i < count.length; i++) {
			 if(count[i] != 0) {
			          for (int j = 0; j < count[i]; j++) {
						      
						     ans  = ans + (char) (i+97);
					}
			 }
		}
		 System.out.println(ans);
	    
}
}

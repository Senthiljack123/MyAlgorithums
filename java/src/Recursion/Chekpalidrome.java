package Recursion;

import java.util.Scanner;

 
public class Chekpalidrome {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		 System.out.println(checkPali(s,0,s.length()-1));

}

	private static boolean checkPali(String s, int i, int j) {
		
		if(s.charAt(i) != s.charAt(j)) {
			return false;
		}
  
	    if(j <= i) {
	    	return true;
	    }
	    
	    return checkPali(s, i+1, j-1);
	}
	}

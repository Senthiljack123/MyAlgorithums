package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stringarray {
	
	
	static String arr[]= {"word","note","ants","wood"};

	public static void main(String[] args) {
		 
		/*
		 * System.out.println("Alpahanumaeric max value=="+alphaNumeric()); String
		 * h="00009"; int b=Math.max(-1,Integer.parseInt(h)) ; System.out.println(b);
		 */
		System.out.println("editDictonary==");
		List a=editDictonary();
		System.out.println(a);

	}
	//"word","note","ants","wood"}
private static List editDictonary() {
		 
	    String dictonary[]= {"wood","joke","moat"};
	    List l=new ArrayList();
	    for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < dictonary.length; j++) {
				if(arr[i].equals(dictonary[j])) {
					   l.add(arr[i]);
					   break;
				}
				
				int dif=diff(arr[i],dictonary[j]);
				if(dif<=2)  {
					l.add(arr[i]);
					break;
				}
			}
		}
	    
	    
		return l;
	}
private static int diff(String a, String b) {
	  int n=a.length();
	  int d=0;
	  for (int i = 0; i < arr.length; i++) {
	  	if(a.charAt(i)==b.charAt(i)) d++;
	}
	int count=n-d;
	
	return count;
}
// {"alic3","bob","3","4","00000"};
	private static int alphaNumeric() {
		
		int max=Integer.MIN_VALUE;
		
		for(String s:arr) {
			boolean  digit=true;
			char[] c=s.toCharArray();
			 for(int i=0;i<c.length;i++) {
				    if(c[i] >='0' && c[i] <='9') {
				    	continue;
				    }
				    else {
				    	max=Math.max(max, s.length());
				    	digit=false;
				    	break;
				    	}
			 }
			 if(digit) {
				 max=Math.max(max,Integer.parseInt(s));
			 }
			 	
		}
		
 		return max;
	}

}

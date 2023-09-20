package practice;

import java.util.Iterator;

public class Evaluatestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="67542-/+*";

		int x=0;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				x++;
			}
		}
		int op=x;
		int ans=s.charAt(0);
		for (int i = 1; i < x; i++) {
			   
		    if(s.charAt(op)=='-') {  
		    	 ans=ans-s.charAt(i);
		    	 System.out.println(ans);
		         op++;
		    }
		    
		    else if(s.charAt(op)=='/') {   
		    	 ans=ans/s.charAt(i); 
		    	 System.out.println(ans);

		    	 op++;
		    }
		    
		    
		    else if(s.charAt(op)=='+') {
		    	System.out.println(s.charAt(i));
		    	 ans=ans+s.charAt(i);
		    	 System.out.println(ans);

		         op++;
		    }
		    
		    else {
	    	 ans=ans*s.charAt(i);
	    	 System.out.println(ans);

	    	  op++; 
		    }
		}
		System.out.println(ans);
	 
		

	}

}

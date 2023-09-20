package Stack;

import java.util.*;

public class ReverseString {
	 static Stack s=new Stack();
	static Stack rs=new Stack();
	    static void reverse(String str,int n) {
	   
	    	char[] c=new char[n];
	    	for (int i = 0; i <n; i++) {
				s.push(str.charAt(i));
			}
	    	
	    	 for(int i=0; i<n; i++) {
	    		 c[i]=  (char) s.pop();
	    	 }
	    	 for (int i = 0; i < n; i++) {
				System.out.print(c[i]);
			}
	    }


	public static void main(String[] args) {
	 
		 String str="Senthil";
		 int n=str.length();
		 reverse(str,n);
		 recursionReverse(str,n);
		 System.out.println(rs);
		 
		 
        
	}


	private static void recursionReverse(String str, int n) {
          
           for (int i = 0; i <n; i++) {
			     rs.push(str.charAt(i));
		}
           rev();
         
	}


	private static void rev() {
		 if(rs.size()>0) {
			 char x=(char) rs.peek();
			 System.out.println("x=="+x);
			 rs.pop();
			 rev();
			 insertBot(x);
			 
		 }
		
	}


	private static void insertBot(char x) {
		 if(rs.isEmpty()) {
			 rs.push(x);
		 }
		 else {
			 char a=(char) rs.peek();
			 rs.pop();
			 insertBot(x);
			 rs.push(a);
		 }
		 
	}

}

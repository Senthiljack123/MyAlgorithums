package Stack;

 

import java.util.Stack;

 
public class Sorting   {

	public static void main(String[] args) {
	       Stack s=new Stack();
	       s.add(5);
	       s.add(1);
	       s.add(2);
	       s.add(7);
	       s.add(3);
	       
	      Stack ts=sorted(s);
	      while(!ts.empty()) {
	    	  System.out.println(ts.pop());
	      }
}

	private static Stack sorted(Stack s) {
		try {
		 Stack ns=new Stack();
		 while(!s.isEmpty()) {
			 int temp=(int) s.pop();
			 int p=(int) ns.peek();
			 while(!ns.isEmpty() && p > temp) {
				 s.push(ns.pop());
			 }
			 ns.push(temp);
		 }
		 
		return ns;
	}catch(Exception e) {}
		return s;
}}
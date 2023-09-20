package Algorithums;

import java.util.Stack;

public class Parenthischeck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(((]))";
	  if(checkParenthis(s)) {
		  System.out.println("balanced");
	  }
	  else System.out.println("Unbalanced");
		

	}

	private static boolean checkParenthis(String s) {
 
		Stack stack = new Stack();
		for (int i = 0; i < s.length(); i++) {
			 
			char c = s.charAt(i);
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c); 
				continue;
			}
			
			if(stack.isEmpty()) return false;
			
			char check;
			switch (c) {
            case ')':
                check = (char) stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = (char) stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = (char) stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        return (stack.isEmpty());
			
			
			  
		}
 
}

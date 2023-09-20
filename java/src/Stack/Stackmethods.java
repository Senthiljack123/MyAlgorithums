package Stack;

import java.util.Arrays;

public class Stackmethods {
    
	int stack[];
	static int size;
	int top;
	static int len=0;
	int cap;
	
	Stackmethods(int size){
		this.size=size;
		stack=new int[size];
		top=-1;
		cap=size;
		 
		
	}
	 
	void push(int data) {
		if(cap==len) {
			
			return;
		}
		
		stack[++top]=data;
		len++;
		 
		
	}
	
	int popFirst() {
		len--;
		if(isEmpty()) {
			System.out.println("stack is empty");
			System.exit(0);
		}
		try {
		return stack[top--];
		}catch (Exception e) {}
		
		return -1;
	}
	
	void popLast() {
		len--;
		if(isEmpty()) {
			System.out.println("stack is empty");
			System.exit(0);
		}
		for (int i = 1; i <= top; i++) {
			stack[i-1]=stack[i];
		}
		top--;
	}
	
	void popIndex(int del) {
		len--;
	     for (int i = 0; i <top; i++) {
			if(i==del) {
				for (int j = i; j < top; j++) {
					stack[j]=stack[j+1];
					 
				}
				break;
			}
		}
	     top--;
		
		 
	}
	
	void popMid() {
		int mid=top/2;
		  for (int i = 0; i <top; i++) {
				if(i==mid) {
					for (int j = i; j < top; j++) {
						stack[j]=stack[j+1];
						 
					}
					break;
				}
			}
		     top--;
		
	}
	
	int peek() {
		 
		if(isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(0);
		}
		return stack[top];
			 
	}
	
	int search(int ser) {
		 
		for (int i = top; i >0; i--) {
			if(stack[i]==ser)  return i;
		}
		return ser;
	 
		
	}
	
	void addIndex(int ind,int val) {
		 
		      for(int i=top+1;i>ind;i--) {
		    	  stack[i]=stack[i-1];
		      }
		      stack[ind]=val;
		       top++;
		       len++;
		        
		      
	}
	void addLast(int val) {
	 
		stack[top+1]=val;
		top++;
		len++;
	}
	
	void addFirst(int val) {
	      int i;
		for ( i = top+1; i >0; i--) {
			  stack[i]=stack[i-1];
		}
		stack[i]=val;
		top++;
		len++;
		  
	}
	
	void mid(int val) {
		
		  int mid=len/2;
		 // System.out.println(mid);
		  for (int i = top+1; i >mid; i--) {
			   stack[i]=stack[i-1];
		}
		  stack[mid]=val;
		  top++;
		  
	}
	
    boolean isEmpty() {
    	if(len==0) {
    		return true;
    	}
    	return false;
    }
  
    boolean contains(int val) {
    	
    	for (int i = top; i>0; i--) {
			if(val==stack[i]) {
				return true;
			}
		}
		return false;
    	
    }
    
	void display() {
		for (int i = 0; i <=top; i++) {
			System.out.print(stack[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Stackmethods ob=new Stackmethods(20);
		 for (int i = 1; i <= 5; i++) {
			   ob.push(i);
		}
		 System.out.print("push the elements==");
		 ob.display();
		 
		 System.out.println("\npeek elemet=="+ob.peek());
		 System.out.println("Stack is empty=="+ob.isEmpty());
		 System.out.println("Search element postion 3 is =="+ob.search(3));
			
	     System.out.print("Add value at  index=="); 
	     ob.addIndex(2,8);
	     ob.display();
			 
		 System.out.print("\nadd last==");
		 ob.addLast(6);
		 ob.display();
		 System.out.println("\npeek elemet=="+ob.peek());
		 System.out.print("Add first==");
		 ob.addFirst(0);
		 ob.display();
		 
		 System.out.print("\nAdd mid==");
		 ob.mid(9);
		 ob.display();
		 
		 
		 System.out.print("\npop first==");
		 ob.popFirst();
		 ob.display();
		 
		 System.out.print("\npop last==");
		 ob.popLast();
		 ob.display();
		 
		 System.out.print("\npop index ==");
		 ob.popIndex(3);
		 ob.display();
		 
		 System.out.print("\nPop Mid==");
		 ob.popMid();
		 ob.display();
		 
		 System.out.println("\ncontains=="+ob.contains(9));
		 
		 
	}

}

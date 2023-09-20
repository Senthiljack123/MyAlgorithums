package Solved;

 

public class Temprature {
	 static class Stacks{
     	int top;
     	int st[]=new int[100];
     	
     	void push(int data) {
     		if(top==99) {
     			System.out.println("stack is full");
     		}
     		else {
     			st[++top]=data;
     		}
     	}
     	
     	int pop() {
     		if(top==0) {
     			System.out.println("stack is underflow");
     			return -1;
     		}
     		else {
     			int ele=st[top];
     			top--;
     			return ele;
     		}
     	}
     	
     	  int peek() {
     		  if(top==0) {
     			  System.out.println("stack is empty");
     		  }
     		return st[top];
     	}
     	
     	boolean isEmpty() {
     		return (top==0)? true:false;
     	}
     	void display(int arr[],int n) {
     		for (int i = 0; i < n; i++) {
					System.out.print(arr[i]+"  ");
				} 
     	}
     }
  
	 static void checkTemp(int[] arr, int n) {
          int[] res=new int[n];
		   Stacks s=new Stacks();
		   for (int i = arr.length-1; i >= 0; i--) {              
			                      
			    	while(!s.isEmpty() && arr[i]>=arr[s.peek()]) {     
			    		s.pop();
			    	}
			     
			    if(!s.isEmpty())                   
			    	  res[i]=s.peek()-i;
			     
			
			    s.push(i);                   
			    
		} 
	     s.display(res,n);
		return;   
	   
	 }
	 
	 
	 
	public static void main(String[] args) {
		
		int arr[]= {73,74,75,71,69,72,76,73};
		 int n=arr.length;
		 checkTemp(arr,n);
		 
		 
			 
		  
  	}

}

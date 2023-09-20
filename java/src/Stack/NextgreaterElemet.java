package Stack;

public class NextgreaterElemet {
	           
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
	
	   static int[] nextgreater(int[] arr, int n) {
		   int res[]=new int[n];    //Stroe the result
		   Stacks s=new Stacks();
		   for (int i = arr.length-1; i >= 0; i--) {              //itrate in top to bootom
			    if(!s.isEmpty()) {                    
			    	while(!s.isEmpty() && s.peek()<=arr[i]) {    //check pre elemrnt is graeter or not
			    		s.pop();
			    	}
			    }
			    if(s.isEmpty())                  //is epmty push -1;
			    	  res[i]=-1;
			    else 
			    	res[i]=s.peek();             //push greater elemet
			
			    s.push(arr[i]);                  //push cheking elemet
			    
		} 
	     s.display(res,n);
		return res;   
	   }
	   
 
	public static void main(String[] args) {
		 int arr[]= {4,7,3,4,8,1};
		 int n=arr.length;
		 nextgreater(arr,n);
		
	}

}

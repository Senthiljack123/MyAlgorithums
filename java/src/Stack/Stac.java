package Stack;

public class Stac{
	
	private int arr[];
	int  top;
	int cap;
	static int len=0;
	
	Stac(int size){
		arr=new int[size];
		top=0;
		cap=size;
		
	}
	 
	private int search(int ser) {
	
		for (int i = top; i >= 0; i--) {
			if(arr[i]==ser)  return i;
		}
 		return -1;
	}
	
	void push(int data) {
	     if(cap==len) {
	    	  
	    	 return;
	     }
		arr[top++]=data;
		len++;
	}
	
	
	
	int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			System.exit(0);
		}
		return arr[top--];
		
	}
	
	int peek() {
		return arr[top];
	}
	
	void  print() {
		for (int i = 0; i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	static boolean isEmpty() {
		 if(len==0) {
			 return true;
		 }
		return false;
	}
	
	public static void main(String[] args) {
		Stac ob=new Stac(5);
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		ob.push(5);
	    System.out.print("Push element==");
	    ob.print();
	   
	    System.out.print("\nStack top of the elemet=="+ob.peek());
	    
		/*
		 * System.out.print("\nPop first two elemet=="); ob.pop();  ob.pop();
		 * ob.print();
		 */
	    
	    System.out.println("\nSeraching position is =="+ob.search(4));
		
		
	}


	

}

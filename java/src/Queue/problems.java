package Queue;

import java.util.Arrays;
import java.util.Iterator;

public class problems {
         
	  int que[];
	int f,r;
	int cap;
	static int s=3;
	boolean bl[];
	int l=0;
	problems(){
          que=new int[s];
          f=0;
          r=0;
          cap=s;
          bl=new boolean[9];
	
	}
	
	private void Enque(int d) {
		
		if(r==cap) {
		    s=s*2;
		   que=Arrays.copyOf(que, s);
   
		}
		 
		que[r++]=d;
		
	}
	
	  void insertLast(int d) {
		 if(r!=cap) {
			 
		 que[r++]=d;
		 bl[l++]=true;
		 }
		 else {
			 bl[l++]=false;
		 }
		 
		  
	}
	  
	  void insertFront(int d) {
		  
		  if(r!=cap) {
				 
				 que[r++]=d;
				 bl[l++]=true;
				 }
		  else {
			 
			  bl[l++]=false;
		  }
		 
	        
	  }
	
	
	void display() {
		for (int i = 0; i < l; i++) {
			System.out.print(bl[i]+" ");
		}
		System.out.println();
	
	}
	
	void displays() {
		for (int i = 0; i < s; i++) {
			System.out.println(que[i]);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		problems ob=new problems();
		
		 ob.insertLast(1);
		 ob.insertLast(2);
		 ob.insertFront(3);
		 ob.insertFront(4);
		 ob.display();
		 
		
		 
		
		
		
	}





	
}

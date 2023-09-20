package LinkedList;

import LinkedList.Getmiddle.Node;

public class Findloop {
	class Node {
		Node next;
		int data;
		Node(int data){
			 this. data=data;
			  next=null;	  
		}
	}
	
	 Node head=null;
	 Node tail=null; 
	 int len;
	 
	 void addLast(int data) {
		   Node temp=new Node(data);
		   if(head==null) {
			   head=temp;
			   tail=temp;
		   }
		   else {
			  tail.next=temp;
			   tail=temp;
		   }
		   len++;
	 }
	 
	  boolean findLoop() {
		  
		  Node cur=head;
		  Node slow=head,fast=head;
		  while(fast!=null && fast.next!=null) {
			  
			  slow=slow.next;
			  fast=fast.next.next;
			  if(slow==fast) {
				  System.out.println(slow.data);
				  return true;
				  }
		  }
		  
		return false;
		  
	  }
	 
	 void display() {
		 Node cur=head;
		 while(cur!=null) {
			 System.out.print(cur.data+"  ");
			 cur=cur.next;
		 }
		 System.out.println();
	 }
	public static void main(String[] args) {
	  
		Findloop  ob=new Findloop();
		ob.addLast(1);
		ob.addLast(2);
		ob.addLast(3);
		ob.addLast(4);
		ob.addLast(5);
		ob.display();
		//ob.head.next.next.next=ob.head.next;
		
		if(ob.findLoop()) {
			System.out.println("yes");
		}
		else System.out.println("No");
		

	}

}

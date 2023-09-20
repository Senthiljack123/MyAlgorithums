package LinkedList;

public class Findmid {
	
	class Node{
		int data;
		Node next;
		 Node (int data){
			 this.data=data;
			 this.next=null;
			 
		 }
		
	}
	
	int len=0;
	Node head=null;
	Node tail=null;
	
	void insertLast(int d) {
		 Node n=new Node(d);
		 if(head==null) {
			 head=n;
			 tail=n;
			 
		 }
		 else {
			 tail.next=n;
			 tail=n;
		 }
		 len++;
		 
	}
	 int findMid() {
		 
		  Node slow=head;
		  Node fast=head;
		  while(slow!=null && fast.next!=null) {
			  slow=slow.next;
			  fast=fast.next.next;
		  }
		  
		 
		 
		return slow.data ;
		 
	 }
	
	   void display() {
		   
		   Node cur=head;
		   while(cur!=null) {
			   System.out.print(cur.data+" ");
			   cur=cur.next;
		   }
	   }

	public static void main(String[] args) {
		 
		Findmid ob=new Findmid();
		for (int i = 1; i <= 7; i++) {
			   ob.insertLast(i);
		}
		int m=ob.findMid();
		System.out.println(m);
		 //ob.display();

	}

}

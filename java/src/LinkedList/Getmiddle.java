package LinkedList;

public class Getmiddle {
	
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
	 
	 
	 int getMiddle() {
		int mid=(len%2==0)?(len/2):((len+1)/2);
		int index=1;
		Node cur=head;
		while(cur!=null) {
			if(index==mid) {
				return index;
			}
			cur=cur.next;
			index++;
		}
		return len;
		 
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
		 
		Getmiddle ob=new Getmiddle();
		ob.addLast(1);
		ob.addLast(2);
		ob.addLast(3);
		ob.addLast(4);
		ob.addLast(5);
		ob.display();
		
		System.out.println("Middle element is== "+ob.getMiddle());
		
		
		  

	}

}

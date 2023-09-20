package LinkedList;

import LinkedList.AddTwoNumber.Node;

public class MultiplyTwoNumber {
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
	 
	 void addFirst(int data) {
		   Node temp=new Node(data);
		   if(head==null) {
			   head=temp;
			   tail=temp;
		   }
		   else {
			   temp.next=head;
			   head=temp;
		   }
		   len++;
	 }

	  Node multiplyTwoNumbers(Node head2, Node head3) {
   
		 Node one=new Node(0);
		// Node two=new Node(0);
		 //Node twocur=two;
		 Node a=head2;
	 	 Node b=head3;
	     Node cur=one;
	 	 int carry=0;
	 	  while(b!=null) {
	 		  carry=0;
	 	  while(a!=null) {
	 		  int sum=a.data*b.data+carry;
	 		   carry=sum/10;
	 		   cur.next=new Node(sum%10);
	 		   cur=cur.next;
	 		   a=a.next;
	 	  }
	 	  if(carry>0)  
	 		  cur.next=new Node(carry);
	 	  
	 	  b=b.next;
	 	  a=head2;
	  
	  }
	 	  return one.next;
	 	  
	 }
	 
	static void display(Node head) {
		 Node cur=head;
		 while(cur!=null) {
			 System.out.print(cur.data+"  ");
			 cur=cur.next;
		 }
		 System.out.println();
	 }
	public static void main(String[] args) {
		MultiplyTwoNumber ob=new MultiplyTwoNumber();
		ob.addFirst(4);
		ob.addFirst(2);
		ob.display(ob.head);
		
		MultiplyTwoNumber ot=new MultiplyTwoNumber();
		ot.addFirst(1);
		ot.addFirst(5);
		ob.display(ot.head);
		
		MultiplyTwoNumber om=new MultiplyTwoNumber();
		Node head=om.multiplyTwoNumbers(ob.head,ot.head);
		om.display(head);
		
		
	}

}

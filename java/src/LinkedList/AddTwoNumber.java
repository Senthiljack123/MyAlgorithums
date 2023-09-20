package LinkedList;

public class AddTwoNumber {
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
	 
	 Node addTwoNumber(Node head1, Node head2) {
		 Node temp=new Node(0);
		 Node a=head1;
		 Node b=head2;
		 Node cur=temp;
		  int carry=0;
		  while(a!=null || b!=null) {
			  int x=(a!=null)?a.data:0;
			  int y=(b!=null)?b.data:0;
			  int sum=x+y+carry;
			  carry=sum/10;
			  cur.next=new Node(sum%10);
			  cur=cur.next;
			  if(a!=null) a=a.next;
			  if(b!=null) b=b.next;
		  }
		  
		  if(carry>0) {
			  cur.next=new Node(carry);
		  }
		 
		return temp.next;
	  
	 }
	 
	 
 
	 void display(Node head) {
		 Node cur=head;
		 while(cur!=null) {
			 System.out.print(cur.data+"  ");
			 cur=cur.next;
		 }
		 System.out.println();
	 }

	public static void main(String[] args) {
	 
		AddTwoNumber ob=new AddTwoNumber();
		ob.addFirst(4);
		ob.addFirst(3);
		ob.addFirst(8);
		System.out.println("List One");
		ob.display(ob.head);
		
		AddTwoNumber ot=new AddTwoNumber();
		ot.addFirst(0);
		ot.addFirst(1);
		ot.addFirst(2);
		System.out.println("List two");
		ot.display(ot.head);
		
		AddTwoNumber obt=new AddTwoNumber();
		 Node head= obt.addTwoNumber(ob.head,ot.head);
		 obt.display(head);
		 
		  
		
		
		

	}

}

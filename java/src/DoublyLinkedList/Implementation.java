package DoublyLinkedList;

 
public class Implementation {
	
	class Node{
		   
		Node next;
		int data;
		 Node pre;
		Node(int data){
			this.data=data;
			next=null;
			pre=null;
			 
		}
	}
	
	Node head=null;
	Node tail=null;
	int len;
	 
	
	void addFirst(int data) {
		Node temp=new Node(data);
		if(head==null) {
			head=tail=temp;
			head.pre=null;
		}
		else {
			head.pre=temp;
			temp.next=head;
			head=temp;
		}
		len++;
	}
	
	void addLast(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=tail=n;
			head.pre=null;
			 
		}
		else {
			tail.next=n;
			n.pre=tail;
			tail=n;
		}
		len++;
	}
	
	boolean isPalidrome(Node head) {
		int mid=len/2;
		int count=1;
		Node cur=head;
  
		while(cur!=null) {
			 if(head.data!=tail.data) return false;
			 else {
				head=head.next;
				tail=tail.pre;
			 }
			 if(count==mid) break;
			count++; 
			cur=cur.next;
		}
	 
		return true;
		
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
           
		Implementation ob=new Implementation();
		ob.addFirst(4);
		ob.addFirst(1);
		ob.addFirst(2);
		ob.addFirst(4);
		//ob.display(ob.head);
		
		Implementation ot=new Implementation();
		ot.addLast(4);
		ot.addLast(3);
		ot.addLast(4);
		ot.addLast(3);
		ot.addLast(4);
		
		ot.display(ot.head);
		
		
		if(ot.isPalidrome(ot.head)) {
			System.out.println("true");
		}
		else System.out.println("False");
		
	}

}

package LinkedList;

public class Removedublicate {
	class Node{
		Node next;
		int data;
		Node(int d){
			this.data=d;
			next =null;
		}
	}
	
	
	
	
	private Node head=null;
	private Node tail=null;
	int len=0;
	
	void addLast(int d) {
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
	
	
	void removeDublicate() {
		
		if(head==null) return;
		
		else {
			Node cur=head;
			while(cur!=null) {
				Node temp=cur;
				Node index=cur.next;
				while(index!=null) {
					if(cur.data==index.data)
						temp.next=index.next;
					else
						temp=index;
					
					index=index.next;
				}
				cur=cur.next;
		 	
			}
		}
				
		
	}
	
	void reverse() {
		  Node pre=null;
		  Node cur=head;
		  Node next=null;
		 while(cur!=null) {
			 next=cur.next;
			 cur.next=pre;
			 pre=cur;
			 cur=next;
		 }
		 head=pre;
				  
	}
	
	void getMid() {
		 int mid=(len%2==0)?(len/2):((len+1)/2);
		 Node cur=head;
		int in=1;
		 while(cur!=null) {
			 if(mid==in) {
				 System.out.println(cur.data);
			      break;
			 }
			 cur=cur.next;
			 in++;
		 }
		
	}
	
	
	void display(Node head) {
		Node cur=head;
		while(cur!=null) {
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Removedublicate ob=new Removedublicate();
		ob.addLast(1);
		ob.addLast(2);
		ob.addLast(3);
		ob.addLast(3);
		ob.addLast(5);
		 
		
		ob.display(ob.head);
		ob.removeDublicate();
		ob.display(ob.head);
		
		//ob.reverse();
		//ob.display(ob.head);
		
		//ob.getMid();
		
		
 

	}

}

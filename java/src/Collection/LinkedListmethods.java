package Collection;

public class LinkedListmethods {
	
	class Node{
		Node next;
		int data;
		
		Node(int data){
		    this.data=data;
		    this.next=null;
		}
	}
	
	Node head=null;
	Node tail=null;
	int len=0;
	
	void addLast(int data) {
		Node n=new Node(data);
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
	
	void addFirst(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			n.next=head;
			head=n;
			
		}
	}
	
	void addPodition(int index,int data) {
		Node temp=new Node(data);
		Node cur=head;
		int pos=1;
		while(cur!=null) {
			Node t=cur.next;
            if(pos==index-1) {
            	cur.next=temp;
            	temp.next=t;
            			
            }
            pos++;
            cur=cur.next;
		}
	}
	
	void addMid(int data) {
		Node n=new Node(data);
		int mid=(len%2==0)? (len/2):((len+1)/2);
		Node cur=head;
		int index=2;
		
		while(cur!=null) {
			  Node temp=cur.next;
			if(index==mid) {
				cur.next=n;
				n.next=temp;
				 
			}
			index++;
			cur=cur.next;
		}
	}
	
	int getMid() {
		
		int mid=(len%2==0)? (len/2):((len+1)/2);
		Node cur=head;
		int index=1;
		while(cur!=null) {
			if(index==mid) {
				return cur.data;
			}
			index++;
			cur=cur.next;
		}
		return -1;
	}
	
	int getFirst() {
		return head.data;
	}
	int getlast() {
	   return tail.data;	
	}
	
	int getindex(int index) {
		
		Node cur=head;
		int in=1;
		 while(cur!=null) {
			 if(in==index) {
				  return cur.data;  
			 }
			 in++;
			 cur=cur.next;
		 }
		return -1;
		
	}
	
	
	
	void display() {
		Node cur=head;
		while(cur!=null) {
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
		
	}
		
	public static void main(String[] args) {
		LinkedListmethods ob=new LinkedListmethods();
		ob.addLast(1);
		ob.addLast(2);
		ob.addLast(3);
		ob.addLast(4);
		ob.addLast(5);
		System.out.print("Add last==");
		ob.display();
		
		/*
		 * ob.addFirst(1); ob.addFirst(2); ob.addFirst(3); ob.addFirst(4);
		 * ob.addFirst(5); System.out.print("\nAdd First=="); ob.display();
		 */
		System.out.print("\nAdd Mid==");
		ob.addMid(8);
		ob.display();
		System.out.print("\nAddPosition==");
		ob.addPodition(4,9);
		ob.display();
		
		//System.out.print("\ngetMid=="+ob.getMid());
		//System.out.print("\ngetFirst=="+ob.getFirst());   
		//System.out.print("\ngetLast=="+ob.getlast());
		//System.out.print("\ngetindex=="+ob.getindex(3));
		

		
 
	 
		
 
	}

	 

}

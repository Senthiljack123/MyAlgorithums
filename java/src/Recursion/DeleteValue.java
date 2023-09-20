package Recursion;

public class DeleteValue {
	
	class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
			next=null;
			
		}
	}
	
	Node head=null;
	Node tail=null;
	
	
	public void insertFirst(int data) {
		
		Node t=new Node(data);
		if(head==null) {
			head=t;
			tail=t;
		}
		else {
			t.next=tail;
			tail=t;
		}
		
	}
	
	public Node deleteNode(Node tail,int k) {
		
		if(k<1) {
			return tail;
			
		}
		
		if(tail==null) return null;
	    if(k==1) {
	    	Node res=tail.next;
	    	return res;
	    }
	    tail.next=deleteNode(tail.next, k-1);
		return tail;
		
	}
	
	
	public void display(Node tail) {
		Node cur=tail;
		while(cur!=null) {
			  System.out.print(cur.data+"-->");
			  cur=cur.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DeleteValue ob=new DeleteValue();
		ob.insertFirst(1);
		ob.insertFirst(2);
		ob.insertFirst(5);
		ob.insertFirst(3);
		ob.insertFirst(8);
		ob.insertFirst(9);
		ob.display(ob.tail);
		int k=3;
		ob.deleteNode(ob.tail, k);
		ob.display(ob.tail);
		 
		

	}

}

package Collection;

public class MeragtwoSortedlist {
    class Node{
    	Node next;
    	int data;
		public Node head;
    	Node(int d){
    		next=null;
    		data=d;
    	}
    }
    
    Node head=null;
    Node  tail=null;
    Node nn=null;
    int len;
	
	void  addLast(int d) {
		Node temp=new Node(d);
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
	
	 Node mergtwoList(Node head1,Node head2) {
		 
		 Node temp=new Node(0);
		 Node nn=temp;
		 while(true) {
			 if(head1==null) {
				 nn.next=head2;
				 break;
			 }
			 if(head2==null) {
				 nn.next=head1;
				 break;
			 }
			 if(head1.data<=head2.data) {
				 nn.next=head1;
				 head1=head1.next;
			 }
			 else {
				 nn.next=head2;
				 head2=head2.next;
			 }
			   nn=nn.next;
			   
			   
		 }
		 return temp.next;
		   
	 }
	
	
	static void print(Node head) {
		Node cur=head;
		while(cur!=null) {
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
	}
	
	public static void main(String[] args) {
		MeragtwoSortedlist ob=new MeragtwoSortedlist();
		ob.addLast(5);
		ob.addLast(10);
		ob.addLast(15);
		//ob.print(ob.head);
		
		MeragtwoSortedlist o=new MeragtwoSortedlist();
		o.addLast(2);
		o.addLast(3);
		o.addLast(20);
		//o.print(o.head);
	
		MeragtwoSortedlist om=new MeragtwoSortedlist();
		Node head=om.mergtwoList(ob.head, o.head);
	     print(head);
		
		
	}

	 

}

package Collection;

import java.util.Arrays;
import java.util.List;

public class MergsortuseLinklist {
	
	class Node{
		int data;
		Node next;
		Node(int d){
			next=null;
			data=d;
		}
	}
	
	
	Node head=null;
	Node tail=null;
	
	void addlast(int d) {
		Node temp=new Node(d);
		if(head==null) {
			head=temp;
			tail=temp;
			
		}
		else {
			tail.next=temp;
			tail=temp;
		}
	}
	
	private static Node mergSort(Node head) {
		 if(head==null || head.next==null) {
			 return head;
		 }
		Node mid=getMiddle(head);
		Node midnext=mid.next;
		//System.out.println(midnext.data);
		mid.next=null;
		
		Node left=mergSort(head);
		Node right=mergSort(midnext);
		
		Node sort=sorting(left,right);
 		
		
		return sort;
	}

	
	private static Node sorting(Node left, Node right) {
	 
	
		if(left==null) {
			//System.out.println("right=="+right.data);
			return right;
			
		}
		if(right==null) {
			//System.out.println("left=="+left.data);
			return left;
		}
		Node res=null;
		if(left.data<=right.data) {
			res=left;
		    res.next=sorting(left.next, right);
		   // System.out.println("res.next=="+res.next.data);
		}
		else {
			res=right;
		    res.next=sorting(left, right.next);
		   // System.out.println("res.next==="+res.next.data);
			
		}
		//System.out.print("sorting==");print(res);
 		return res;
	}

	private static Node getMiddle(Node hd) {
		if(hd==null) {
			return hd;
		}
		Node slow=hd,fast=hd;
		while(fast.next!=null && fast.next.next!=null) {
			 slow=slow.next;
			 fast=fast.next.next;
		}
	//System.out.println(slow.data);
		return slow;
	}

	static void print(Node head) {
		Node cur=head;
		while(cur!=null) {
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
		System.out.println();
	}
	 
	
	public static void main(String[] args) {
		MergsortuseLinklist ob=new MergsortuseLinklist();
		int arr[]= {2,8,9,7,6,4};
		int n=arr.length;
		for (int i = 0; i < arr.length; i++) {
			   ob.addlast(arr[i]);
		}
		 Node head=mergSort(ob.head);
		 print(head);
		
	}

 

	

}

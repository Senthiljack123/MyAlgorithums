package Sortings;

public class StackusingLinked {
       class Node{
    	   Node next;
    	   int  data;
    	   Node(int d){
    		   data=d;
    		   next=null;
    	   }
    	   
       }
       
       Node head=null;
       Node tail=null;
       static int len=0;
       
       void push(int d) {
    	   Node n=new Node(d);
    	   if(head==null) {
    		   head=n;
    		   tail=n;
    	   }
    	   else {
    		   n.next=head;
    	       head=n;
    	   }
    	   len++;
       }
       
       void pop() {
    	   if(isEmpty()) {
    		   System.out.println("stack is empty");
    		   return;
    	   }
           
    	   head=head.next;
    	   len--;
    	   
    	   
       }
       
       int peek() {
    	   
		return head.data;
    	   
       }
       static boolean isEmpty() {
        	return (len==0);
        }
       

   	private int search(int ser) {
   		Node  cur=head;
   		int size=len;
   		while(cur!=null) {
   			if(cur.data==ser) {
   				return size;
   			}
   			cur=cur.next;
   			size--;
   			
   		}
    		return -1;
   	}
       
       void print() {
    	   Node cur=head;
    	   while(cur!=null)
    	   {
    		   System.out.print(cur.data+" ");
    		   cur=cur.next;
    		   
    	   }
    	   System.out.println();
    	   }
        
	
	
	public static void main(String[] args) {
		StackusingLinked ob=new StackusingLinked();
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		ob.push(5);
		ob.print();
		System.out.println("top of the elemet=="+ob.peek());
		System.out.println("searching postion=="+ob.search(4));
		ob.pop();
		ob.pop();
		
		ob.print();
	}


}

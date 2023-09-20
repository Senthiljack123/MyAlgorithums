package Queue;

public class Queuemethods {
	
     private int que[];
     private int front,rear,cap;	
	
     Queuemethods(int size){
    	 front=0;
    	 rear=0;
    	 cap=size;
    	 que=new int[size];
    	 
     }
     
     void Enque(int data) {
    	 if(cap==rear) {
    		 System.out.println("\nQueue is full");
    		 return;
    	 }
    	 que[rear++]=data;
     }
     
     void deque() {
    	 if(cap==rear) {
    		 System.out.println("\nQueue is full");
    		 return;
    	 }
    	 for (int i = 0; i <rear; i++) {
			   que[i]=que[i+1];
		}
    	  
    	 rear--;
     
     }
     
     int front(){
    	return que[0];
     }
     
     int rear() {
    	
    	 return que[rear-1];
     }
     
     boolean isEmpty() {
    	 
    	 if(rear==0) {
    		 return true;
    	 }
    	 return false;
     }
    	 
     int size() {
    	 return rear;
     }
     void display() {
    	 for (int i = 0; i < rear; i++) {
			System.out.print(que[i]+" ");
		}
    	 System.out.println();
     }

	public static void main(String[] args) {
		Queuemethods ob=new Queuemethods(10);
		ob.Enque(1);
		ob.Enque(2);
		ob.Enque(3);
		ob.Enque(4);
		ob.Enque(5);
		System.out.print("Enque==");
	    ob.display();
	    
	    System.out.print("deque==");
	    ob.deque();
	    ob.display();
	    
	    System.out.println("front elemet=="+ob.front());
	    System.out.println("rear elemet=="+ob.rear());
	    System.out.println("que is  empty=="+ob.isEmpty());
	    System.out.println("size of que=="+ob.size());
	    
	   System.out.println("Add first");
	   
	   
	    
		
		
		
	}

}

package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
 

public class Arraydeque {

	public static void main(String[] args) {
            Deque<Integer> q=new ArrayDeque<Integer>();
            q.add(10);
            q.add(15);
            q.add(20);
            q.add(9);
            q.add(10);
            
            
            q.addFirst(46);
            q.addLast(39);
            
             Iterator it=q.iterator();
             
             while(it.hasNext()) {
            	 System.out.print(it.next()+" ");
             }
            	 q.remove();
            	 System.out.println(); 
            	 it=q.iterator();
            	 
            	 while(it.hasNext()) {
                	 System.out.print(it.next()+" ");
             
		}
            
	}

}

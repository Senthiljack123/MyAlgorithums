package Queue;

import java.util.PriorityQueue;

public class Laststoneweight {

	public static void main(String[] args) {
		 int arr[]= {2,7,4,1,8,1};
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b-a);
        for (int a : arr)
            pq.add(a);
        
        System.out.println(pq);
        
        while (pq.size() > 1)
        
            pq.add(pq.poll() - pq.poll());
       System.out.println(pq.poll());
		 

}

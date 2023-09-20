package Queue;

import java.util.PriorityQueue;

public class Arrangealpahabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s="senthilkumar";
		String n="";
		PriorityQueue<Character> pq = new PriorityQueue<>();
	
		for (int i = 0; i <s.length(); i++) {
			 pq.add(s.charAt(i));
		}
		
		while(!pq.isEmpty()) {
			
			n=n+pq.peek();
		    pq.poll();
		}
		System.out.println(n);
	}

}

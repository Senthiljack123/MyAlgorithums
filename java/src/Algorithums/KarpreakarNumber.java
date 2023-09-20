package Algorithums;

import java.util.LinkedList;

public class KarpreakarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		LinkedList l = new LinkedList<>();
		for(int i =1; i <= n; i++) {
			if(checkKarprekar(i)) {
				 l.add(i);
			}	 
		}
		System.out.println(l);	
	}
	private static boolean checkKarprekar(int n) {
	       
		int count = 0;
		int temp = n;
		int sqrt = temp * temp;
		while(temp > 0) {
			count++;
			temp = temp / 10;
		}
		int rem = (int) (sqrt % (Math.pow(10, count)));
		int div =  (int) (sqrt / (Math.pow(10, count)));
		
	    int res = rem + div;
	    if(res == n) return true;
	    return false;	
	}

}

package Algorithums;

public class Primefactors {

	public static void main(String[] args) {
		
		int n = 13;
		int  arr[] = new int[10];
		int k =0;
		for (int i = 2; i <= n;) {
		
			if(n%i == 0) {
				System.out.println(i);
				n = n/i;
				
			} 
			else i++;
			
		}
		
		 
 		 
	}
}

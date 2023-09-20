package Algorithums;

public class KerighnsAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 42;
		String b = "";
		while(n >= 1) {
		     
			int x = n % 2;
		 
			n = n/2;
			b = x + b;
			
		}
		 
		int count = 0;
		for (int i = 0; i < b.length(); i++) {
			if(b.charAt(i) == '1') {
				count++;
			}
		}
		
		System.out.println("The set values are = " + count );

	}

}

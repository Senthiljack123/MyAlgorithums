package Algorithums;

public class BitConversion {

	public static void main(String[] args) {
		
		int n = 45;
		String b = "";
		
		while(n>=1) {
			
			int x = n%2;
			n = n/2;
			b = x + b; 
		}
		System.out.println("decimal to binary  " + b);
		
		String  bin = b;
		int res = 0;
		int pow = 1;
	    for (int i = b.length()-1; i >= 0; i--) {
			  
	    	if(b.charAt(i) == '1') res = res + pow;
	    	pow = pow * 2;
	    	System.out.println(pow);
		}
	    
	    System.out.println("Bin to Decimal " + res);
		
	}
}

package Algorithums;

public class josphus {

	public static void main(String[] args) {
		 int n=7,k=3;
		 System.out.println(josaphusKill(n,k));
	}

	private static int josaphusKill(int n, int k) {
 		if(n==1)
			return 0;
		return (josaphusKill(n-1, k)+k)%n;          
		              
		//A,B,C,D,E,F,G    0--3      (return value +k)%n 
		//D,E,F,G,A,B      3--0        
		//G,A,B,D,E        0--3
		//D,E,A,B          1--0
		//B,D,E            1--1
		//B,D              0--1
		//D    RETURN 0;     
		
		
	}

}

package Algorithums;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		
		for (int i = 2; i <= n; i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
		
	}

	private static boolean checkPrime(int n) {
		
		for (int i = 2; i <= n/2; i++) {
		     
			   if(n % i == 0) {
                    return false;				  
			   }
			 
		}
		return true;

	}

}

package Algorithums;

public class LuckyNumber {

	public static void main(String[] args) {
		 //countter number lam elminate pannita varanum
		 //apdi elminate pannum bothu namku kodutha n number countter  
		 //agalana atham lucky number
		int n=13;
		int counter=2;
		System.out.println(isLukyNum(n,counter));
	}

	private static boolean isLukyNum(int n, int counter) {
		
		   if(n < counter) return true;
		    	
		   if(n % counter == 0) return false;
		   
		   return isLukyNum(n - (n/counter), counter + 1);
	} 

}

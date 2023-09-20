package Algorithums;

public class LengthConsecitive {
     public static void main(String[] args) {
		 //Length of consecutive in Binary values;
    	 
    	 int n = 101;
    	 int count = 0;
    	 while(n > 0) {
    	    n = (n & (n << 1));
    	    System.out.println(n);
    	    count++;
    	 }
    	 System.out.println(count);
	}
}

package Solved;

public class Happynumber {

	public static void main(String[] args) {
		 int n=19; 
		  if(isHappy(n))
			  System.out.println("Happy");
		  else System.out.println("Not Happy");
		}
	 public static boolean isHappy(int n) {
	        do{
	            n = findDigSqrSum(n);
	        }while(n>2);
	        return n == 1;
	    }
	    
	    public static int findDigSqrSum(int num){
	        int sum = 0;
	        while(num > 0){
	            int currDig = num%10;
	            sum += currDig*currDig;
	            num /= 10;
	        }
	        System.out.println(sum);
	        return sum;
	    }
	}

 

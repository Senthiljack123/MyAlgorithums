package Algorithums;

public class PowerofNum {

	public static void main(String[] args) {
		 
		int x=5,pow=8;
		System.out.println(findRes(x,pow));

	}

	private static long findRes(int x, int pow) {
		
		if(pow==0)
		  return 1;
		
		if(pow%2==0) {
			  long res=findRes(x, pow/2);
			  return res*res;
		}
		else 
			 return findRes(x, pow-1)*x;
			
		 
	}

}

package Algorithums;

 
public class Squreroot {

	public static void main(String[] args) {
		 
		int n=25;
		
	 System.out.println(findSqure(n));

}

	private static int findSqure(int n) {
		 
		if(n==1 || n==0)
			return n;
		int l=2;
		int h=n/2,res=0,m=0;
		
		while(l<=h) {
			m=(l+h)/2;
			if(m*m == n)
				return  m;
			else if(m*m <n) {
				  l=m+1;
				  res=m;
			}
			else h=m-1;
		}
		
		return res;
	}
}
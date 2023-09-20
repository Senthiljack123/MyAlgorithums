package Algorithums;

 
public class kangarosjumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 0;
		int j1 = 3;
		int s = 4;
		int j2 = 2;
	    System.out.println(findJumbs(f,j1,s,j2));      
	}

	private static String findJumbs(int f, int j1, int s, int j2) {
 		if(j1 < j2) return "No";
		
		if((f - s) % (j1 - j2) == 0) 
			   return "yes";
		
		else return "No";	
	}
}

package Algorithums;

public class RverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Senthil";
		//String r=reverse(s,"",s.length()-1);
		//System.out.println(r);
		//Check palidrome
		Boolean b=palidrome(s,0,s.length()-1);
        System.out.println(b);
	}

	private static Boolean palidrome(String s, int i, int j) {
		 
		if(s.charAt(i)!=s.charAt(j)) return false;
		if(i==j) return true;
		return palidrome(s, i+1, j-1);
	}

	private static String reverse(String s, String rev, int i) {
		
		   if(i<0)  return rev;
		   
		return reverse(s,rev+s.charAt(i), i-1);
	}

}

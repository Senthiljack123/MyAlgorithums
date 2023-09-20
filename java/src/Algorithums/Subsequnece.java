package Algorithums;

public class Subsequnece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="abcd";
	getsubSeq(s,"");
	
	//System.err.println(s.substring(1));

	}

	private static void getsubSeq(String s, String ans) {
		 if(s.length()==0) {
			 System.out.println(ans);
			 return;
			 
		 }
		 getsubSeq(s.substring(1), ans+s.charAt(0));
		 getsubSeq(s.substring(1), ans);
		 
		
	}

}

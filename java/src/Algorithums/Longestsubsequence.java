package Algorithums;

public class Longestsubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String s = "acdea";
		String s2 = "ace";
		int count = 0;
		for (int i = 0; i < s2.length(); i++) {
			  
	            for (int j = 0; j < s.length(); j++) {
					   if(s.charAt(j) == s2.charAt(i)) { count++;
					   break;
					   }
				}
		}
		System.out.println(count);

	}

}

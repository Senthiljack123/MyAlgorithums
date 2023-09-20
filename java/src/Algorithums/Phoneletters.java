package Algorithums;

public class Phoneletters {
	
	static String[]  words= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

	public static void main(String[] args) {
		 String s="846";
		 String ans="";
		 possibleWords(s,ans);
		 

	}

	private static void possibleWords(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
		    return ;
		}
		String key=words[s.charAt(0)-48];
		for (int j = 0; j < key.length(); j++) {
			possibleWords(s.substring(1), ans+key.charAt(j));
		}
	 	
	}

}

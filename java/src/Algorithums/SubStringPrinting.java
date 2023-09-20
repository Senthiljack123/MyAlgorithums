package Algorithums;

public class SubStringPrinting {

	public static void main(String[] args) {
		// sub Strinng print pandrathu
		String s="babad";
		
		for (int i = 0; i < s.length(); i++) {
			String sub="";
			for (int j = i; j < s.length(); j++) {
				  sub=sub+s.charAt(j);
				  System.out.println(sub);
			}
		}

	}

}

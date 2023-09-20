package practice;

public class truncateSentrnce {

	public static void main(String[] args) {
 		String s="chopper is not a tanuki";
		int k=5;
		int sc=0;
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
			if(s.charAt(i)==' ') {
				sc++;
			}
			if(sc==k) break;
		}
		 
		

	}

}

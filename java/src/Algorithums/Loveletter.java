package Algorithums;

public class Loveletter {

	public static void main(String[] args) {
		// kuduthurka stringa polidrama mathanum athuku yaathnaa countnu check pannnum
		String s = "abcd";
		int i = 0, j = s.length()-1;
		int total = 0;
		while(i < j) {
			
			  char first = s.charAt(i);
			  char last  = s.charAt(j);
			  if(first != last) {
				  total += Math.abs(first - last);
			  }
			  i++;
			  j--;
		}
		System.out.println(total);

	}

}

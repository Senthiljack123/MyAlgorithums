package Algorithums;

public class Erotothenses {
     //Prime print pandra algos
	public static void main(String[] args) {
		 
		int n = 20;
		boolean b[] = new boolean[n+1];
		for (int i = 2; i <= n; i++) {
			if(b[i] == false ) {
				for (int j = i*2; j <=n ; j = j+i) {
					     b[j] = true;
				}
			}
			
		}
		for (int i = 2; i < b.length; i++) {
			if(b[i] == false ) System.out.println(i);
		}

}
}

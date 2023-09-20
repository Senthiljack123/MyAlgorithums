package Algorithums;

import java.util.Scanner;

public class Trallingzeros {

	public static void main(String[] args) {
        
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int res =  (int) (Math.log10((n & n-1) ^ n) / Math.log10(2));
		System.out.println(res);

 }
}

package Recursion;

public class FibonicieNum {

	public static void main(String[] args) {
 		int n =  30;
		int a =0,b = 1,res;
 		for (int i = 0; i < 10; i++) {
 			System.out.println(a);
 			a = a + b;
 			b = a - b;
		}
		

	}

}

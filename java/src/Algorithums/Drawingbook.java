package Algorithums;

public class Drawingbook {
     public static void main(String[] args) {
		  int n = 10;
		  int p = 5;
		  
		  int fr = p / 2;
		  int to = n /2;
		  int ba = Math.abs(to - fr);
		  System.out.println(Math.min(ba, fr));
		  
	}
}

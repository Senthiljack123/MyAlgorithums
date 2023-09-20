package practice;

public class Throw2 {

	public static void main(String[] args) throws Exception {
		   vote(12);
	}

	private static void vote(int i) throws Exception {
		// TODO Auto-generated method stub
		 if(i<18)  {
			 throw new Exception("sry not eligible");
		 }
}
}
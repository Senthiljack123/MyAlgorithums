package practice;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=10;
         int b=0,r=0;
         try {
          r=a/b;  
         try {
        	 r=a+b;
         }
         catch(Exception e) {}
         }
         catch(ArithmeticException s) {
        	 s.printStackTrace();       //stacktrace yantha linla excption occur aguthu
        	 
        	 System.out.println(s.getMessage());
         }
         catch(Exception e) {
        	 System.out.println("pls check your input");
         }
         finally {
        	 System.out.println("finally i dont care");
         }
         System.out.println(r);
	}

}

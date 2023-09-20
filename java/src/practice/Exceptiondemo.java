package practice;

public class Exceptiondemo{
     public static void main(String[] args) throws Exception{
    	 int a=10,b=0;
    	 try {
    		 
    		 display();
    	 }
    	 catch(NumberFormatException e) {
    		 System.out.println("print 1");
    	 }
    	 catch(ArithmeticException e) {
    		 System.out.println("Print 2");
    	 }
    	 catch(Exception e) {
    		 System.out.println("pls crt input");
    	 }finally {
    		 System.out.println("In Finally");
    	 }
    	// e.result(a,b);
    	  
	}

	private static void display() throws Exception {
	    Exceptiondemo e=new Exceptiondemo();
	    
           e.result(10, 2);
	}

	private void result(int a, int b) throws Exception{
		   
		int res=a/b;
	}
}

package ZOHO;

public class ExpendString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s="a11b2c33";
           int num=0;
           char c;
         
           for (int i = 0; i < s.length(); i++) {
			       
        	   if(s.charAt(i)>=(int)'0' && s.charAt(i)<=(int)'9') {
        		          c=s.charAt(i-1);
        		          num=0;
        		          while(s.charAt(i)>='0' && s.charAt(i)<='9' &&i<s.length()) {
        		        	  num=(num*10)+(s.charAt(i)-48);
        		        	  i++;
        		        	  
        		          }
        		          System.out.println(num);
        		          for (int j = 0; j <num; j++) {
							System.out.print(c+" ");
						}
        		          
        	   }
		}
	}

}

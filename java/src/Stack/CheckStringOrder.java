package Stack;

public class CheckStringOrder {

	public static void main(String[] args) {
	         String s="AABAAB";
	         
	        int del=0;
	        for (int i = 0; i < s.length()-1; i++) {
				    if(s.charAt(i)==s.charAt(i+1)) {
				    	del++;
				    }
			} 
	        System.out.println("Delete=="+del);
	        	
	}

}
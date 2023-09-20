package Solved;

public class HelpMowgli {

	public static void main(String[] args) {
		 
		int input=18;
		String s="HT";
		if(isValid(s)) System.out.println("Valid");
		else System.out.println("Not Valid");
 
	}

	private static boolean isValid(String s) {
		char c='a';
		int flag=0,h=0,t=0;
		char arr[]=s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			 if(arr[i]=='H' && c=='a') {
				c=(arr[i]=='H')?'T':'.'; 
				 h++;
			 }
			 else if(arr[i]==c) {
				 t++;
				  c='a';	 	  
			 }
			 else if(arr[i]=='.') {
				  
				 continue;
			 }
			 else  {
				  return false;
			 }
	 	
		}
		 if(h!=t) return false;
		return true;
	}

}

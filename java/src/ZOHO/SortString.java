package ZOHO;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="geeksforgeeks";
		int l=s.length();
		int maxChar=26;
		int leters[]=new int[maxChar];
		
	     for (char c :s.toCharArray()) {
			     
	    	   leters[c-'a']++;
		}
	      
	     for (int i = 0; i <maxChar; i++) {
			if(0<leters[i]) {
				  for (int j = 0; j <leters[i]; j++) {
					System.out.print((char)(i +'a'));
				}
			}
		}
	     

	}

}

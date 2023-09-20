package ZOHO;

public class StringChck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="senthilfrGeeksfor";
		String sub="for";
		int c=1;
		for (int i = 0; i < s.length(); i++) {
			if(sub.charAt(0)==s.charAt(i)) {
				int n=i;
				c=0;
				System.out.println(n);
				for (int j = 0; j < sub.length(); j++) {
					    if(sub.charAt(j)==s.charAt(n)) {
					    	c++;
					    	n++;
					    }
					    else
					    	break;
					    	
				}
				if(c==sub.length()) {
					System.out.println(i);
					break;
				}
			}
		}

	}

}

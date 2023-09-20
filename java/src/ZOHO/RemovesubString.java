package ZOHO;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovesubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="senthil";
		String sub="th";
		 ArrayList l=new ArrayList<>();
		 for (int i = 0; i < sub.length(); i++) {
			 l.add(sub.charAt(i));
		}
		  String res="";
		  for (int i = 0; i < s.length(); i++) {
			if(!l.contains(s.charAt(i))) {
				res+=s.charAt(i);
			}
		}
		  System.out.println(res);
    
	}

}

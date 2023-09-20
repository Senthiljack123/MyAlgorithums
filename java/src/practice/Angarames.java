package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Angarames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String arr[]= {"abba","baba","bbaa","cd","cd"};
          
       List l=new ArrayList<>();
       String pre="";
       for (int i = 0; i < arr.length; i++) {
	             char[] c=arr[i].toCharArray();
	             Arrays.sort(c);
	             System.out.println(Arrays.toString(c));
	             String cur=String.valueOf(c);
	             System.out.println("cur  "+cur);
	             
	             if(!cur.equals(pre)){
	                   l.add(arr[i]);
	                   pre=cur;
	             
	             }   
	}
       
          System.out.println(l);
	}

}

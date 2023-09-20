package Algorithums;

import java.util.LinkedHashMap;
import java.util.Map;

public class SubString {

	public static void main(String[] args) {
         //NOn reabaeted sub String
		String s="abbac";
		subString(s);
	}

	private static void subString(String s) {
		 String sub=null;
		 int subLength=0;
		 
		 Map<Character,Integer> map= new LinkedHashMap<Character,Integer>();
		 char[] arr=s.toCharArray();
		 for (int i = 0; i < arr.length; i++) {
			 
			 if(!map.containsKey(arr[i])) {
				   map.put(arr[i], i);
				  // System.out.println(map);
			 }
			 else {
				 i=map.get(arr[i]);
				// System.out.println(i);
				 map.clear();
			 }
		}
		   if(subLength<map.size())
		   {
			   subLength=map.size();
			   sub=map.keySet().toString();
		   }
		   System.out.println(subLength);
		   System.out.println(sub);
		
	}

}

package Algorithums;

import java.util.HashMap;

public class Removedublicates {

	public static void main(String[] args) {
          
	     int arr[] = {1,2,3,4,3,3,1};
	     HashMap<Integer, Boolean> hm =new HashMap<>();
	     for (int i = 0; i < arr.length; i++) {
			
	    	// System.out.println("----  "+hm.get(arr[i]));
	    	 if(hm.get(arr[i]) == null) {
	    		 System.out.print(arr[i] + " ");
	    	  }
	    	 hm.put(arr[i], true);
	    	 //System.out.println( hm.put(arr[i], true));
		}
	     
	     String s = "aabb";
	     String res ="";
	     for (int i = 0; i < s.length(); i++) {
			String ch = "" + s.charAt(i);
			System.out.print(ch);
			if(res.contains(ch)) {
				continue;
			}
			res += ch; 
		}
	     System.out.println(res);
	     
		
	}

}

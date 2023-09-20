package Algorithums;

public class Findleader {

	public static void main(String[] args) {
		//right mosta yantha elementa perusha eruko athalam yadukanum
		//yapothuma right most arry periya  elementthan
		int arr[]= {8,11,5,11,7,6,3};
	    int curLead=arr[arr.length-1];
	    System.out.println(curLead);
	    for (int i = arr.length-1; 0<i; i--) {
			     if(arr[i]>curLead) {
			    	    curLead=arr[i];
			    	    System.out.println(curLead);
			     }
			     
		}
          

	}

}

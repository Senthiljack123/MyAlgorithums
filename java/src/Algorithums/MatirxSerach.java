package Algorithums;

public class MatirxSerach {

	public static void main(String[] args) {
		// kudutha targeta  find pandrathu
          int arr[][]= {{1,2,3,4},
        		        {5,6,7,8},
        		        {9,10,11,12},
        		        {13,14,15,16}};
          
          int tar=11;
          
          int i=0,j=arr[0].length-1;
          while(i<arr.length && j>=0) {
        	  if(arr[i][j]==tar) {
        		  System.out.println("true");
        		  break;
        	  }
        	  else if(tar<arr[i][j])
        		     j--;
        	  else i++;
          }
          System.out.println("false");

	}

}

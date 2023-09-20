package practice;

import java.util.ArrayList;

public class Sepeartepostive {

	public static void main(String[] args) {
		 int arr[][]= {{10,20,15},{21,65,14},{7,16,32}};
		 ArrayList l=new ArrayList();
		 int max=Integer.MIN_VALUE;
		 int r=0,c=0;
		 for (int i = 0; i < arr.length; i++) {
		      for (int j = 0; j < arr[0].length; j++) {
				 if(arr[i][j]>max) {
					 r=i;
					 c=j;	 
				 }
			}	
		}
		 System.out.println("["+r+","+c+"]");
             
	}

}

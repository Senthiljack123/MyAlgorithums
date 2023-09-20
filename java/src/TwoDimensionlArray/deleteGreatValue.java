package TwoDimensionlArray;

import java.util.Iterator;

public class deleteGreatValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int arr[][]= {{1,2,4},{3,3,1}};
		
		   int max=0;
		     int res=findMAx(arr,max);
		

	}

	private static int findMAx(int[][] arr,int max) {
		
		   int r=arr.length;
		   int c=arr[0].length;
		   int res=0;
		   for (int i = 0; i < arr.length; i++) {
			  for (int j = 0; j < arr[i].length; j++) {
				  int q=arr[i][j];
				  if(q>max) { 
					  max=q;
					  
				  }
			}
		}
		
		   res=res+max;
		
		return max;
		 
		
	}

}

package Algorithums;

import java.util.Arrays;

public class MovezeroLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={0,1,2,0,0,5,0,8};
		 int l=arr.length;
		 int nz=0,z=0;   //nz=non zer,z=zero
		  
		 for (int i = 0; i < arr.length; i++) {
		 
			  if(arr[nz]!=0) {
				  int temp=arr[nz];
				  arr[nz]=arr[z];
				  arr[z]=temp;
				  nz++;
				  z++;
                       				  
			  }
			  else 
				  nz++;
		}
		  System.out.println(Arrays.toString(arr));		 
	}

}

package Algorithums;

public class Matrixreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[][]= {{1,2,3,4},
 		        {5,6,7,8},
 		        {9,10,11,12},
 		        {13,14,15,16}};
		 
	
		 for (int i = 0; i < arr.length; i++) {
			 int left=0,right=arr[0].length-1;
			  while(left<right) {
				  
				  int temp=arr[i][left];
				  arr[i][left]=arr[i][right];
				  arr[i][right]=temp;
				  left++;
				  right--;
			  }
		}
		 for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}

package Algorithums;

public class MatrixSpiral {

	public static void main(String[] args) {
		// spirala  modela print pandrathu
		
		int arr[][]= {{1,2,3,4},
				      {5,6,7,8},
				      {9,10,11,12},
				      {13,14,15,16}};
		
		int top=0,left=0;
		int right=arr[0].length-1;
		int bot=arr.length-1;
		
		while(top<=bot && left<=right) {
			
			for (int i = left; i <= right; i++) {
				  System.out.print(arr[top][i]+" ");
			}
			top++;
			
			for (int i = top; i <= bot; i++) {
				  System.out.print(arr[i][right]+" ");
			}
			right--;
			
			for (int i = right; i >= left; i--) {
				  System.out.print(arr[bot][i]+" ");
			}
			bot--;
			
			for (int i = bot; i >= top; i--) {
				System.out.print(arr[i][left]+" ");
			}
			left++;
		}
				    

	}

}

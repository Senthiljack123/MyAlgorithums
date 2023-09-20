package Algorithums;

public class MatrixSnakpattern {

	public static void main(String[] args) {
		// Matreixa Snake patterna print oandrathu 
		
		int arr[][]= {{1,2,3,4},
			          {5,6,7,8},
			          {9,10,11,12},
			          {13,14,15,16}};
	 
		
		int top=0,bot=arr.length-1;
		int left=0,right=arr[0].length-1;
		while(top<arr.length) {
		for (int i = left; i <= right; i++) {
			  System.out.print(arr[top][i]+" ");
		}
		top++;
		System.out.println();
		for (int i = right; i >= left; i--) {
			 System.out.print(arr[top][i]+" "); 
		}
		top++;
		System.out.println();

	}
	}

}

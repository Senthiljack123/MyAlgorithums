package TwoDimensionlArray;

public class NumberofIslands {

	public static void main(String[] args) {
      
		int arr[][]= {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,1},{0,0,1,0,0}};
		int r=arr.length;
		int c=arr[0].length;
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==1) {
					   count++;
					   markZero(arr,i,j);
				}
			}
		}
		System.out.println(count);
		
	}

	private static void markZero(int[][] arr, int i, int j) {
         
		int l=arr.length;
		int b=arr[0].length;
		 if(i<0 || j<0 || i>=l || j>=b || arr[i][j]!=1) {
			 return;
		 }
		 
		 arr[i][j]=0;
		 markZero(arr, i-1, j);
		 markZero(arr, i+1, j);
		 markZero(arr, i, j-1);
		 markZero(arr, i, j+1);
         }
 
}

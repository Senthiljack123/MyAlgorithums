package Recursion;

public class Maximumgold {

	public static void main(String[] args) {
		// TODO Auto-generated method 
         int arr[][]= {{1,0,7},{2,0,6},{3,4,5},{0,3,0},{9,0,20}};
         int r=arr.length;
         int c=arr[0].length;
         int max=0;
         boolean visit[][]=new boolean[r][c];
         for (int i = 0; i < r; i++) {
        	 for (int j = 0; j < c; j++) {
				if(arr[i][j]!=0) {
					 max=Math.max(max, findMax(arr,visit,i,j));
				}
			}
			
		}
         System.out.println(max);

	}

	private static int findMax(int[][] arr, boolean[][] visit, int i, int j) {
	     
		if(i<0 || j<0 || i >= arr.length || j>=arr[0].length)
			return 0;
		
		if(arr[i][j]==0 || visit[i][j])
			return 0;
		
		visit[i][j]=true;
		 int max =  findMax(arr, visit, i-1, j);
	        max = Math.max(max,  findMax(arr, visit, i+1, j));
	        max = Math.max(max,  findMax(arr, visit, i, j-1));
	        max = Math.max(max,  findMax(arr, visit, i, j+1));
		visit[i][j]=false;
	
		return arr[i][j]+max;
	}

}

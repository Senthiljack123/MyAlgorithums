package TwoDimensionlArray;

public class Changerowcol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{4,5,6},{1,2,3}};
		int a=arr.length;
		int b=arr[0].length;
		int[][] ans=new int[b][a];
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				 ans[c][r]=arr[r][c];
			}
		}
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}

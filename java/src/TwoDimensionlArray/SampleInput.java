package TwoDimensionlArray;

public class SampleInput {

	public static void main(String[] args) {
		 int arr[][]= {{1,2,3},{7,6,5}};
		 add(arr);
		 print(arr);

	}

	private static void print(int[][] arr) {
	 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void add(int[][] arr) {
		int sum=0;
		
		 int k[][]=new int[2][3];
		 int m=0;
		 for (int i = 0; i <arr[i].length; i++) {
			for (int j = 0; j <arr.length; j++) {
		         k[i][j]=arr[j][i];
			}
		}
 	
	}

}

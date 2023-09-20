package Algorithums;

public class MatrixBorder {

	public static void main(String[] args) {
		// Border elementa print pananum
		int arr[][]= {{1,2,3,4},
				      {5,6,7,8},
				      {9,10,11,12},
				      {13,14,15,16}};
		int i=0,j=0;
		for(j=0;j<arr.length;j++) {
			System.out.println(arr[i][j]);
		}
		j=arr.length-1;
		for(i=1;i<arr.length;i++) {
			System.out.println(arr[i][j]);
		}
		
		i=arr.length-1;
		for(j=arr.length-2;j>=0; j--) {
			System.out.println(arr[i][j]);
		}
		
		j=0;
		for(i=arr.length-2;i>0;i--)
			System.out.println(arr[i][j]);
	}

}

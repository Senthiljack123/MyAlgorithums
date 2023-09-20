package practice;

public class matrix {

	public static void main(String[] args) {
       int arr[][]= {{1,2,2,3,4,5,6,7},{2,3,6,7,8,9,0}};
       int len=arr[0].length;
       int l=arr[1].length;
       for (int i = 0; i < len-1; i++) {
		for (int j = 0; j < l-1; j++) {
			System.out.print(arr[i][j]);
		}
	}
       
	}

}

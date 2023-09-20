package Recursion;

public class SumodArray {

	public static void main(String[] args) {
 		int[] arr = {1,2,3,4,5,6,7,8};
 		int res =0;
		System.out.println(sum(arr,arr.length-1,res));
		

	}

	private static int sum(int[] arr, int l, int res) {
		 
		if(l < 0) return  res;
		return sum(arr, l-1, res + arr[l]);
		
		
	}

}

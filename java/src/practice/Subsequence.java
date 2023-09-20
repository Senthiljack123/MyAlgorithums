package practice;

import java.util.Arrays;

public class Subsequence {

	public static void main(String[] args) {
               
		int arr[]= {3,5,2,6};
		int k=2;
		
		int a[]= mostCompetitive(arr,k);
		System.out.println(Arrays.toString(a));
	}
	 public static int[] mostCompetitive(int[] A, int k) {
	        int st[] = new int[k];
	        int n = A.length;
	        int j = 0;
	        for (int i = 0; i < n; ++i) {
	         
	            while (j > 0 && st[j - 1] > A[i] && j - 1 + n - i >= k)
	                j--;
	            if (j < k)
	                st[j++] = A[i];
	            
	            System.out.println(Arrays.toString(st));
	        }
	        return st;
	    }

}

package ZOHO;

import java.util.HashMap;

public class Arraysumfinder {

	public static void main(String[] args) {
		//kuduthuruka summm arraya ulla valuva add panna kaedikuma ellaya
		
		int arr[]= {1,3,4,3};
		int sum=6;
		int n=arr.length;
		System.out.println(findSum(arr,n,sum));

	}

	private static boolean findSum(int[] arr, int n, int sum) {
		// TODO Auto-generated method stub
		
		int a[]=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			 a[arr[i]]++;
		}
		
		int dif;
        for (int i = 0; i < n; i++) {
			dif=sum-arr[i];
			if(dif==arr[i]) {
				if(a[arr[i]]>1) return true;
			}
			else {
				if(a[dif]>0) return true;
			}
		}
		
		return false;
	}

}

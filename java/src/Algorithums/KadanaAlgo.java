package Algorithums;

public class KadanaAlgo {

	public static void main(String[] args) {
		//Sub aray sum kandu pudikanum
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int maxsum = arr[0];
		int sum    = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(sum >= 0) {
				sum += arr[i];
			}
			else 
				sum = arr[i];
			maxsum = Math.max(maxsum, sum); 
		}
		System.out.println(maxsum);
		

	}

}

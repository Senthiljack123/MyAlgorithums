package Algorithums;

public class SubarraySum {

	public static void main(String[] args) {
		// Sub arrayavalam yaduthu athu suma find pannin athula yathu  maxiumanu pakkanum
		int arr[]= {-1,3,4,-2};
		int max=arr[0];
		int sum=arr[0];
		for (int i = 0; i < arr.length; i++) {
		      
			if(sum >=0) {
				sum=sum+arr[i];
			}
			else {
				sum=arr[i];
			}
			max=Math.max(max, sum);
		
		
		} 
			
		System.out.println(max);	
			

	}

}

package Subarray;

public class Slidingwindow {

	public static void main(String[] args) {
 		int arr[]= {1,2,3,4,5,6,7,8,9};
		int sub=3;
		int k =12;
		int sum=0;
		
	    for (int i = 0; i < sub; i++) {
			sum+=arr[i];
			
		}
	    int count=0;
	    if(sum==k)  count++;
	    
	    for (int i = sub; i < arr.length; i++) {
			    
	    	sum=sum+arr[i];
	    	sum=sum-arr[i-sub];
	    	
	    	if(sum==k)  count++;
		}
	    
	    System.out.println(count);
	    
		  
		

	}

}

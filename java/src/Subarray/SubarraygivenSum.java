package Subarray;

public class SubarraygivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,7,5};
		int k=12;
		int j=0,i=0;
		int flag=0;
		int sum=arr[0];
		while(j<arr.length) {
			
			if(sum==k) {
				  flag=1;
				  break;
			}
			
			if(sum<k) {
				j++;
				sum+=arr[j];
				continue;
			}
			
			if(sum>k) {
			     sum-=arr[i];
			     i++;
			     continue;
				
			}
		}
		
		if(flag==1) System.out.println("i=="+(i+1)+"  j=="+(j+1));
		else System.out.println("Given not sun array");

	}

}

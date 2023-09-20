package Solved;

public class MinimunSubArray {

	public static void main(String[] args) {
          int arr[]= {2,3,1,2,4,3};
          int n=arr.length;
          int target=7;
          //Run time o(n)^3
            System.out.println("subaray=="+minimumSubArray1(arr,n,target));
          //Run time o(n)
            System.out.println("SubArray=="+minimumSubArray2(arr,n,target));
            
        		  
	}

	private static int minimumSubArray2(int[] arr, int n, int target) {
		
		int ans=Integer.MAX_VALUE;
		 int left=0,sum=0;
		 for (int i = 0; i < n; i++) {
			 sum+=arr[i];
			// System.out.println("sum=="+sum);
			 while(sum>=target) {
				 ans=Math.min(ans, i+1-left);
				// System.out.println("ans=="+ans);
				 sum-=arr[left++]; 
				// System.out.println("sum=="+sum);

			 }
		}
		
		
		 
		return (ans!=Integer.MAX_VALUE)?ans:0;
	}

	private static int minimumSubArray1(int[] arr, int n, int target) {
		int ans=Integer.MAX_VALUE;
		
		for (int i = 0; i <n; i++) {
			for (int j = i; j < n; j++) {
				int sum=0;
				for (int k = i; k <= j; k++) {
					  sum+=arr[k];
				}
				if(sum>=target) {
					ans=Math.min(ans,(j-i+1));
					break;
				}
			}
		}
		
		return (ans!=Integer.MAX_VALUE)?ans:0;
		
		
	}

}

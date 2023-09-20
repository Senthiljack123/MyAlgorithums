package Algorithums;

public class TrappingRainwater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,2,0,3,2,5};
		System.out.println(findWater(arr));

	}

	private static int findWater(int[] arr) {
		// TODO Auto-generated method stub
		int res=0;
		for (int i = 1; i < arr.length-2; i++) {
			  
			int lb=arr[i];
			for (int j = 0; j < i; j++) {
				  if(arr[j]>lb) {
					  lb=arr[j];
				  }
			}
			int rb=arr[i];
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]>rb) {
					rb=arr[j];
				}
			}
			int mb;
			if(lb<rb) {
				mb=lb;
			}
			else mb=rb;
			
			int tw=mb-arr[i];
			res=res+tw;
		}
		return res;
		
	}

}

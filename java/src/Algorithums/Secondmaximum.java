package Algorithums;

public class Secondmaximum {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,89};
		 
		int max1 = 0,max2 = 0;
		if(arr[0] < arr[1]) {
			max1 = arr[1];
			max2 = arr[0];
		}
		else {
			max1 = arr[0];
			max2 = arr[1];
			
		}
		for (int i = 2; i < arr.length; i++) {
			if(arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
				
			}
			else  {
				max2 = arr[i];
			}
		}
		System.out.println(max2);
	}
	 

}

package SlidingWindow;

public class Arraysum {

	public static void main(String[] args) {
          
		int arr[]= {1, 4, 2, 10, 2, 3, 1, 0, 20};
		int k=4;
		int n=arr.length;
		int arrsum=0;
		
		for (int i = 0; i < k; i++) {
			  arrsum+=arr[i];
		}
		int newsum=arrsum;
		for (int i = k; i < arr.length; i++) {
			  
			  newsum=newsum+arr[i] - arr[i-k];
			  arrsum=Math.max(arrsum, newsum);
		}
		
		System.out.println(arrsum);

	}

}

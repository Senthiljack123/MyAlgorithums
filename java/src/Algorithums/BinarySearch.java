package Algorithums;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int arr[]= {1,2,3,4,5,6,7,8,9};
		   int key=7;
		   System.out.println(binarySearch(arr,key));
		   

	}

	private static int binarySearch(int[] arr, int key) {
		 
		int l=0,h=arr.length-1,mid=0;
		 while(l<=h) {
			 mid=(l+h)/2;
			 if(key==arr[mid]) return mid;
			 else if(key<arr[mid]) h=mid-1;
			 else l=mid+1;
		 }
		 return -1;
		
		
	}

}

package Algorithums;

public class Countsmaller {

	public static void main(String[] args) {
		// kuduthuruka key valuva vida less or equal yathana value erukunu pakkanum
		int arr[] ={2,6,12,24,26,26,28,30};
		int key=26;
		System.out.println(findSmall(arr,key));
	}

	private static int findSmall(int[] arr, int key) {
 		
		int l=0,h=arr.length-1,mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			
			if(key==arr[mid]) {
				while(mid+1<arr.length && key==arr[mid+1])  //dub check pannathuku
					mid++;
				break;
			}
			else if(key<arr[mid]) h=mid-1;
			else l=mid+1;
			
			
		}
		
		if(arr[mid]>key) 
		      return mid;
		
		else return mid+1;
	}

}

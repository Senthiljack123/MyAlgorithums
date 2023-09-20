package Algorithums;

public class Ceilandfloor {

	public static void main(String[] args) {
	 // ceil== atha value arrayala eruntha atha return pannum ellana athuki aprm ulla 
     //periya first value retrun pannum;
	 // floor=mela ulla mathurithan oru difeer ethu china valueva return pannum
		int arr[]= {1,2,3,4,5,6,7,9,10,13};
		int ceil=8;
		System.out.println(findceil(arr,ceil));
		
		

	}
  
	private static int findceil(int[] arr, int ceil) {
		 
		 int l=0,h=arr.length-1,mid=0;
		  
		 while(l<=h) {
			 
			 mid=(l+h)/2;
			 if(ceil==arr[mid]) {
				 return arr[mid];
			 }
			 if(ceil<arr[mid]) {
				 h=mid-1;
			 }
			 else {
				 l=mid+1;
			 }
		 }
		 if(l<arr.length)
		 return arr[l];
		 else return -1;
		
	}

}

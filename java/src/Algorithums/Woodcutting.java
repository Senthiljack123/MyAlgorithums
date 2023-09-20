package Algorithums;

public class Woodcutting {
	
	public static void main(String[] args) {
		//kuduthurkura target value achiev panna yavlo sizela wood cut panna namaku
		//target  kaedikanuu pakkanum
		
		int arr[]= {20,10,15,17};
		int tar=8;
		System.out.println(woodCut(arr,tar));
	}

	private static int woodCut(int[] arr, int tar) {
		 
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			  if(arr[i]>max) {
				  max=arr[i];
			  }
			  
			 int l=0,h=max,mid=0;
			 while(l<=h) {
				 mid=(l+h)/2;
				 int wc=woodCount(arr,mid);
				 if(wc==tar || l==mid)
					 return mid;
				 else if(wc>tar)
					 l=mid;
				 else h=mid;
				 
			 }
		}
		
		return -1;
	}

	private static int woodCount(int[] arr, int mid) {
		
		int res=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>mid)
			{
				res=res+(arr[i]-mid);
			}
		}
		
		
		return res;
	}

}

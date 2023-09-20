package Searching;

public class SerachingAlgos {
	
	     int arr[]={20,40,60,70,80,90,100,110,120};
	     int l=arr.length;

	public static void main(String[] args) {
           
		SerachingAlgos ob=new SerachingAlgos();
		//System.out.println("Binary Search position is=="+ob.binarySerach(3));
		//System.out.println("Linear Search=="+ob.linearSerach(3));
		//System.out.println("Jumb search=="+ob.junbSerach(7));
		//System.out.println("interpolation search=="+ob.interPolaton(80));
		
		
		
	}

	private int interPolaton(int value) {
		int low,high,pos;
		low=0;
		high=arr.length-1;
		
		while(low<high) {
			pos=low+((value-arr[low])/(arr[high]-arr[low]))*(high-low);
			System.out.println(pos);
			if(arr[pos]==value)       return pos;
			
			else if(arr[pos]>value)   high=pos-1;
			
			else low=pos+1;
		}
		
 		return -1;
	}

	private int junbSerach(int value) {
		int n=arr.length;
	    int jumb=(int) Math.sqrt(n);
	    int low=0;
	    for (int i = 0; i < arr.length; i+=jumb) {
			if(arr[i]==value) {
				return i;
			}
			else if(arr[i]<value) {
				  low=i;
			}
			else if(arr[i]>value)
				  break;
		}
	    for (int i = low; i < arr.length; i++) {
			if(arr[i]==value)
				return i;
		}
	 	
 		return -1;
	}

	private int linearSerach(int value) {
		   for (int i = 0; i < arr.length; i++) {
			    if(arr[i]==value)
			    	return i;
		}
		
 		return -1;
	}

	private int binarySerach(int value) {
 		  int low=0,high=arr.length;
 		  int mid;
 		  while(low<=high) {
 			  mid=(low+high)/2;
 			  if(arr[mid]<value) {
 				  low=mid+1;
 			  }
 			  else if(arr[mid]>value) {
 				  high=mid-1;
 			  }
 			  else return mid;
 		  }
 		  return -1;
	}

}

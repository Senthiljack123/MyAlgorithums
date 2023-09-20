package practice;

public class Arra {
     
	int arr[]= {1,2,3,7,6};
	
	public static void main(String[] args) {
		Array ob=new Array();
		//System.out.print("Two sum index==");
		//ob.twoSum(18);
		//System.out.print("remove dub sorted==");
		//ob.removeSorted();
		//System.out.print("found and find position=="+ob.findPos(4));
		//System.out.println("find postivesmall elemet=="+ob.postivesmallElemet());
		System.out.println("first missing small postive=="+ob.missingPostive());
		
		
		
		
		
		
}

//1,2,3,7,6
private int missingPostive() {
 	
	int min=postivesmallElemet();
	 System.out.println(min);
     for (int i = 0; i < arr.length; i++) {
		     
		     for (int j = 0; j < arr.length; j++) {
				  if(--min==arr[j]) {
					  break;
				  }
				  else {
					  return min;
				  }
				 
			}
		 
	
	}
	return min;
	
}

//2,3,7,6 
 public int postivesmallElemet() {
	int min=arr[0];
	
	for (int i = 0; i < arr.length; i++) {
		
		  if(arr[i]>=0) {
			  if(min>arr[i]) {
				  min=arr[i];
			  }
			 
	        }
		  }
	 
	return min;
}

//2,3,7,6 
private int findPos(int pos) {
	  int pre,next;
	  int i;
	for (  i = 1; i < arr.length; i++) {
		   pre=arr[i-1];
		   next=arr[i];
		   if(pos>pre && pos<next) {
			   return i;
		   }
	}
	return i;
	
 		
	}
//1,1,2,2,3,4,4,5
	private int[] removeSorted() {
          int n=arr.length;
          int size=0;
          int temp[]=new int[arr.length];
          if(n==0 || n==1) {
        	  return arr;
          }
          for (int i = 0; i < arr.length-1; i++) {
			   if(arr[i]!=arr[i+1]) {
				   temp[size++]=arr[i];
			   }
		}
          temp[size++]=arr[n-1];
          display(temp,size);
          
		return arr;
	}
//2,7,11,15
	private int[] twoSum(int target) {
		 
		int temp[]=new int[2];
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			  sum=arr[i]+arr[i+1];
			  if(target==sum) {
				  temp[0]=i;
			      temp[1]=i+1;
			      break;
			  }
			  else System.out.println("sry not have sum ");
		}
		 display(temp,2);
 		return temp;
	}

	private void display(int[] temp, int size) {
     for (int i = 0; i < size; i++) {
		   System.out.print(temp[i]+" ");
	}	
     System.out.println();
	}

}

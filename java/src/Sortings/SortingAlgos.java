package Sortings;

import java.util.Arrays;

public class SortingAlgos {

	int arr[]= {1,4,1,2,7,5,2};
	    
	public static void main(String[] args) {
		SortingAlgos ob=new SortingAlgos();
		//ob.selectionSort();
		//ob.bubbleSort();
		//ob.insertionSort();
		/*
		 * int[] arr={9,7,8,3,2,1}; ob.mergSort(arr,0,arr.length-1); ob.display(arr);
		 */
		 
	    // int arr[]={1,7,8,5};
	    //ob.quickSort(arr, 0, arr.length-1);
        // ob.display(arr);
		
		//System.out.println("CountSort==");
		//ob.countSort();
		
	}

	
//kudthurukura arravoda raangea yaduthu(mim value to MAX value than range)antha arrayala ulla valuevoda 
	//counting count panni antha propera athida positionla set pandtahu
private void countSort() {
	
	int max=Arrays.stream(arr).max().getAsInt();
	int min=Arrays.stream(arr).min().getAsInt();
	
	int range=max-min+1;
	int count[]=new int[range];
	int res[]=new int[arr.length];
 
	for (int i = 0; i < res.length; i++) {  //arrayala ulla valuvodav count pandrathu
		     count[arr[i]-min]++;	     
	}
	 
	 for (int i = 1; i < count.length; i++) {//mela ulla arrayava cumlative arryava maathurthu
		count[i]=count[i]+count[i-1];
		
	}
	 
	for (int i =arr.length-1;i>=0;i--) {     //epo finala sort pandratthu
		int v=count[arr[i]-min]-1;
		  res[v]=arr[i];
		  count[arr[i]-min]--;
	}
	display(res);
}
//first valuva select panni athida chinatha erukuratha left sideum perusha erukuatha right sidum potu
//atha divide panni sort pandrthu
	
	  private void quickSort(int[] arr, int start, int end) { 
		   if(start<end) {
			   int partionpos=partition(arr, start, end);
			   
			   quickSort(arr,start,partionpos-1);
			   quickSort(arr,partionpos+1,end);

		   }
	  }
	 
  //arryava thani thaniya perika comman element yathunu kandupudikurathu partion
	private int partition(int[] arr, int start, int end) {
		  
	    int pivot = arr[start]; 
	    int i = start +1;
	        for (int j = start+1; j <=end; j++) {
	        	if(arr[j]<pivot) {
	        		int swap=arr[i];
	        		arr[i]=arr[j];
	        		arr[j]=swap;
	        		
	        		i++;
	        		display(arr);
	        	}
				    
			}
	        int  swap=arr[i-1];
	        arr[i-1]=arr[start];
	        arr[start]=swap;
	        
	       display(arr);
	       return i-1;
	    
	    }

 private void mergSort(int[] arr, int low, int high) {
	     System.out.println(low+" "+high);  
		if(low<high) {
			int mid=(low+high)/2;
			mergSort(arr,low,mid);
			mergSort(arr,mid+1,high);
			sorting(arr,low,mid,high);	
		}
	}

	private void sorting(int[] arr, int start, int mid, int high) {
		 System.out.print("first==");
	      display(arr);
		int p=start,q=mid+1;
		System.out.println("p="+p+" "+"q="+q+" "+"high="+high);
		
		int A[]=new int[arr.length];
		int k=0;
		for (int i = start; i <= high; i++) {
			if(p>mid) {
				A[k++]=arr[q++];	
			}
			else if(q>high) {
				A[k++]=arr[p++];
			}
			else if(arr[p]>arr[q]) {
				A[k++]=arr[q++];
			}
			else {
				A[k++]=arr[p++];
			}
		}
		for (int j = 0; j < k; j++) {
			arr[start++]=A[j];
		}
		display(arr);
 		 
    }

	//leftlaa erunthu overu valuva swap pannita vaurm
    private void insertionSort() {
          int n=arr.length;
          int temp,j;
          for (int i = 0; i < n; i++) {
			      temp=arr[i];
			    //  System.out.println("temp="+temp);
			      j=i;
                //  System.out.println("j=="+j);
			    
			      while(j>0 && temp<arr[j-1]) {
			    	     arr[j]=arr[j-1];
			    	     j--;
			      }
			      arr[j]=temp;
			     
		}
          display(arr);
     }
    
   
	//o(n^2)
    //rendu rendu valuva compare panni swap pnadrthu...erukurthulaya periya bubblea lasta podrathu
	private void bubbleSort() {
		   for (int i = 0; i < arr.length; i++) {
			for (int j =0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int swap=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=swap;
							
				}
			}
		}
		   display(arr);
		
	}
    // minimum valuva select panni slecet pannni swap  pandrathu   
	private int[] selectionSort() {
	  int min;
	  for (int i = 0; i < arr.length-1; i++) {
		    min=i;
		for (int j = i+1; j < arr.length; j++) {
			if(arr[min]>arr[j]) {
				min=j;
			}
			}
			int swap=arr[min];
			arr[min]=arr[i];
			arr[i]=swap;
	}
	  display(arr);
		return arr;
 		
	}

   protected  void display(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
        System.out.println();
	}

}

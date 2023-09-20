package practice;

import java.util.Arrays;

public class Remaining {
           
	int arr[]= {1,2,3,6}; 
	
	public static void main(String[] args) {
		Remaining ob=new Remaining();
           //ob.countFrequent();
		   //ob.separations(); 
		   //ob.printPrime();
		   //ob.findsumindexPostion(17);
		   //ob.movelastNegatives();
		   //ob.factorieal();
		   //ob.consecutive();
            
	}

	private void consecutive() {
		  
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]!=arr[i-1]+1) {
				System.out.println("false");
			}
		}
		System.out.println("true");
 		
	}

	private void factorieal() {
		
		int  temp[]=new int[arr.length];
		
		for (int i = 0; i < temp.length; i++) {
			 int limit=arr[i];
			 int sum=1;
			 for (int j = 1; j <=limit; j++) {
			    sum=sum*j;
			}
			 temp[i]=sum;
		}
 		display(temp);
	}

	private void movelastNegatives() {
		
		for (int i = 0; i < arr.length; i++) {
			      for (int j = i+1; j < arr.length; j++) {
					if(arr[j]<0) {
						int swap=arr[i];
						arr[i]=arr[j];
						arr[j]=swap;
								
					}
				}
		}
		display(arr);
		
 		
	}

	private void findsumindexPostion(int sum) {
		 int cursum;
		 for (int i = 0; i < arr.length; i++) {
			  cursum=arr[i];
			  for (int j = i+1; j < arr.length; j++) {
				  if(cursum==sum) {
					  int p=j-1;
					  System.out.println("postion is=="+i+" to "+p);
					  break;
				  }
				  else if(cursum>sum) {
					  break;
				  }
				  else
					  cursum=cursum+arr[j];
			}
		}
 		
	}

	private void printPrime() {
		 int[] temp=new int[arr.length];
		 int k=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=0 || arr[i]==1) {
				continue;
			}
			int flag=0;
			int check=arr[i]/2;
		   for (int j = 2; j <= check;j++) {
			    
				   if(arr[i]%j==0) {
					  flag=1;
				   } 
		 
		}
		  if(flag==0) {
			  temp[k++]=arr[i];
		  }

		}
		display(temp,k);
		
	}

	private void separations() {
		
		 int temp=0;
		 boolean fin=false;
		 do {
			 fin=true;
			 for (int i = 0; i < arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					fin=false;
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			 
		 }while(!fin);
	     display(arr);
 		  
	}

	private void countFrequent() {
        int count=0,temp;;
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i]==0)  continue;
			   count=1;
			   for (int j = i+1; j < arr.length; j++) {
				 if(arr[i]==arr[j]) {
					 count++;
					 arr[j]=0;
				 }
			}
				 System.out.println(arr[i]+"=="+count);

		}
	}
	static void display(int arrs[],int l) {
		for (int i = 0; i <l; i++) {
			System.out.print(arrs[i]+" ");
		}
	}
		
	static void display(int arrs[]) {
		for (int i = 0; i <arrs.length; i++) {
			System.out.print(arrs[i]+" ");
		}
	}

}

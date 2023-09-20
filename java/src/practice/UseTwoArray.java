package practice;

import java.util.Arrays;
import java.util.Iterator;

public class UseTwoArray {
	
	     int arr[]= {28,6,22,8,44,17};
	     int ar2[]= {22,28,8,6};
	      

	public static void main(String[] args) {
		UseTwoArray ob=new UseTwoArray();
         //System.out.print("Next graeter element==");
         //ob.nextGreater();
         //System.out.println("distance b/w two array=="+ob.distanceTwoArray(2));
//		System.out.println("Common Elemets==");
//		ob.commonElements();
//		System.out.println("Pairs in sum==");
//		ob.sumPair(3);
		//System.out.println("Assign Cookies=="+ob.assignCookies());
		//System.out.println("Fixed heters=="+ob.fixedHeater());
		//System.out.println("common sub array=="+ob.commonSubArray());
		//System.out.println("Sort two aarray"+ob.compareSecondArraySorting());
		ob.rough();
	}


	private void rough() {
		 int j=0;
		 int freq[]=new int[100];
		 int ans[]=new int[arr.length];
		 
		 for(int i:arr) {
			 freq[i]++;
		 }
		  
		 for(int i:ar2){
	            while(freq[i]!=0){
	                ans[j++]=i;
	                freq[i]--;
	            }
		 }
		 System.out.println(Arrays.toString(ans));
		 
	 	
	}


	private String compareSecondArraySorting() {
		 int k=0;
		int res[]=new int[arr.length];
		for (int i = 0; i < ar2.length; i++) {
			for (int j = 0; j < res.length; j++) {
				if(ar2[i]==arr[j]) {
					res[k++]=arr[j];
				    arr[j]=-1;
				}
			}
		}
		for (int i = 0; i < res.length; i++) {
			   if(arr[i]!=-1)  res[k++]=arr[i];
		}
		
		
		
		 for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
		
		return null;
	}


	private int commonSubArray() {
		   int m = arr.length;
	        int n = ar2.length;
	        int ans = 0;
	        int[][] dp = new int[m+1][n+1];
	        for(int i=1;i<=m;i++){
	            for(int j = 1;j<=n;j++){
	                if(arr[i-1]==ar2[j-1]){
	                    dp[i][j] = dp[i-1][j-1] + 1;
	                }
	                else{
	                    dp[i][j] = 0;
	                }
	                if(dp[i][j] > ans){
	                    ans = dp[i][j];
	                }
	            }
	        }
	      
	        return ans;
	    }
	 


	private int fixedHeater() {
		
		int radius=0;
		int c=arr.length-ar2.length;
	        for (int i = 0; i < c; i++) {
				    radius=Math.abs(arr[i]-arr[ar2[i]-1])-1;
			} 
		 
 		return radius;
	}


	private int assignCookies() {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
 			  if(arr[i]<=ar2[i])
 				  count++;
 			  else break;
		}
		
 		return count;
	}


	private void sumPair(int k) {
		 int sum=0;
		 int res =Integer.MAX_VALUE; 
		 int i,j;
		for(i=0;i<arr.length;i++) {
			  sum=0;
			for ( j = 0;  j< ar2.length; j++) {
				 sum=sum+arr[i]+arr[j];
			}
			if(res>sum) {
				res=sum;
			}
		}
		
	}


	private void commonElements() {
		
 		 int temp[]=new int[10];
 		 int k=0;
 		 for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < ar2.length; j++) {	
				if(arr[i]==ar2[j])  
					temp[k++]=arr[i];
			}
		}
 		 display(temp);
	}


	private int distanceTwoArray(int d) {
		int res=0,count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < ar2.length; j++) {
				res=0;
				    res=arr[i]-ar2[j];
				    int f=Math.abs(res);
				    if(f<d)
				    	count++;
			}
		}
		
		return count;
	}


	private int[] nextGreater() {
		 int k=0;
		 int temp[]=new int[arr.length];
		 
		  for (int i = 0; i < arr.length; i++) {
			   for (int j = 0; j < ar2.length; j++) {
				   if(j!=ar2.length-1) {
				   if(arr[i]==ar2[j]) {
						   if(ar2[j]<ar2[j+1]) {
							      temp[k++]=ar2[j+1];
							      break;
						   }
						   else temp[k++]=-1;
					  
				   }
			}
		     else 
		    	 temp[k++]=-1;
			}
			   }
		  
		         display(temp);
	              return temp;
	
	}


	private void display(int[] temp) {
 		   
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
	} 

}

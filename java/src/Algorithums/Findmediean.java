package Algorithums;

import java.util.Arrays;

public class Findmediean {

	public static void main(String[] args) {
		 //rendu arrayav sort panni medium element find pandrath even lengthna diivid by 2
		//odd na apdiya potralm
		int arr1[]= {1,3,8,17};
		int arr2[]= {5,6,7,19,21,25};
		//System.out.println(findMediean(arr1,arr2));
		System.out.println(findMid(arr1,arr2));                     //Brute Force Approch
		
		
	}

	private static float findMid(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int i=0, j=0,k=0;
		int temp[]=new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length) {
			  if(arr1[i]<arr2[j]) {
				    temp[k++]=arr1[i];
				    i++;
			  }
			  else {
				  temp[k++]=arr2[j];
				  j++;
			  }
		}
		while(j<arr2.length)
		{
			temp[k++]=arr2[j];
			j++;
		}
		if(k%2==0) {
			
			return  ((float)temp[k/2]);
		}
		System.out.println(Arrays.toString(temp));
		
		return temp[k/2];
	}

	private static float findMediean(int[] arr1, int[] arr2) {
		
		if(arr2.length<arr1.length)
			return findMediean(arr2, arr1);
		
		int l=0,h=arr1.length;
		
		while(l<=h) {
			int m1=(l+h)/2;
			int m2=((arr1.length + arr2.length+1)/2)-m1;
			
			int l1=(m1==0) ? Integer.MIN_VALUE : arr1[m1-1];
			int r1=(m1==arr1.length) ? Integer.MAX_VALUE : arr1[m1];
			
			int l2=(m2==0) ? Integer.MIN_VALUE : arr2[m2-1];
			int r2=(m2==arr1.length) ? Integer.MAX_VALUE : arr2[m2];
			
			if(l1<=r2 && l2<=r1)
			{
				if((arr1.length + arr2.length)%2 ==0) {
					return (float)(Integer.max(l1,l2) + Integer.min(r1, r2))/2;
				}
				else 
					return Integer.max(l1,l2);
				
			}
			else if(l1>r2)  l=m1+1;
			else h=m1-1;
			
				
			
		}
		 
		return 0.0f;
	}

}

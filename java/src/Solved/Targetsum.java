package Solved;

public class Targetsum {

	public static void main(String[] args) {
		 int arr[]= {3,7,1,2,8,4,5};
		 int n=arr.length;
		 int sum=10;
		  findSum(arr,sum);

	}

	private static void findSum(int[] arr,int sum) {
		int flag=1;
		 for (int i = 0; i < arr.length-1; i++) {
			  for (int j = i+1; j < arr.length-1; j++) {
				for (int k = j+1; k < arr.length; k++) {
				int res=arr[i]+arr[j]+arr[k];
				if(res==sum) {
					flag=0;
					System.out.println("{"+arr[i]+","+arr[j]+","+arr[k]+"}");
					break;
					
				}
				}
			}
		}
		 if(flag==1)  System.out.println("Sry given sum not in array");
		 
		
	}

}

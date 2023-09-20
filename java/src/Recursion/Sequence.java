package Recursion;

public class Sequence {

	public static void main(String[] args) {
        
		int x=5;
		genrate(x);
	}

	private static void genrate(int x) {
		 
		int arr[]=new int[x];
		genUtil(x,arr,0,0);
		
	}

	private static void genUtil(int x, int[] arr, int cursum, int curind) {
		
		     if(cursum==x) {
		    	 printArr(arr,curind);
		    	 return;
		     }
		     int num=1;
		     System.out.println(num+"==num");
		     System.out.println("cursum=="+cursum);
		     System.out.println("curind=="+curind);
		     while(num <= x-cursum && (curind==0 || num <= arr[curind-1])) {
		    	    arr[curind]=num;
		    	    genUtil(x,arr,cursum+num,curind+1);
		    	    num++;
	     }
		
	}

	private static void printArr(int[] arr, int n) {
        		   for (int i = 0; i < n; i++) {
					 System.out.print(arr[i]+" ");
				}
        		   System.out.println();
	}

}

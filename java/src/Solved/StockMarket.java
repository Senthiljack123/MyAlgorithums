package Solved;

public class StockMarket {
       public static void main(String[] args) {
		    int arr[]= {10,4,5,90,120,80};   //1 1 1 2 1 4 6
		    int res[]=new int[arr.length];
		    int count=1 ,i;
		    for (  i = arr.length-1; i >0; i--) {
		    	     count=1;
				     for (int j = i-1;  j>=0; j--) {
						if(arr[i]>arr[j]) {
							count++;
						}
						if(arr[i]<arr[j]) {
							break;
						}
						
					}
				     res[i]=count;
				}
		    res[i]=1;
		    
		    for (int j = 0; j < res.length; j++) {
				System.out.print(res[j]+" ");
			}
			 
		    
	}
}

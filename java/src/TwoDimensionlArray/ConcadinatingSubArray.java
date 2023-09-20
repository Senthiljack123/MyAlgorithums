package TwoDimensionlArray;

public class ConcadinatingSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{10,-2},{1,2,3,4}};
		int num[]= {1,2,3,4,10,-2};
		int z=0,k=0,j=0;
		int l=arr.length*arr[0].length;
		 
		for (int i = 0; i < arr.length; i++) {
			j=0;
			while(j<arr[i].length) {
				   
					 if(arr[i][j]==num[z++]) 
						 {
						 k++;
						 j++;
						 continue;
						 }
					 
					 else {
						 k=0;
						 j=0;
			  
					 }
				
			}
		}
		
		if(k==l) System.out.println("true");
		else System.out.println("false");

	}

}

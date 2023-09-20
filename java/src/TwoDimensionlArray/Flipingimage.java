package TwoDimensionlArray;

public class Flipingimage {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		int arr[][]= {{1,1,0},{1,0,1},{0,0,0}};
		int v=2;
	 
		for (int i = 0; i < arr.length; i++) {
			v=2;
			for(int j=0;j<arr[i].length;j++) {
				  if(arr[i][j]==1)
					  arr[i][j]=0;
				  else 
					  arr[i][j]=1;
			}
		}
		 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
         
	}

}

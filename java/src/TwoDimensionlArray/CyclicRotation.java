package TwoDimensionlArray;

public class CyclicRotation {

	public static void main(String[] args) {
		int arr[][]= {{4,10},{30,20}};
		int k=1;
		int i=0,j=0;
		int res[][]=rotation(arr,k,i,j);
		
	}

	private static int[][] rotation(int[][] arr, int k, int i, int j) {
		  int temp[][]=new int[arr.length][arr[0].length];
		     
			     arr[i][j]=arr[i][j+1];
			     arr[i][j+1]=arr[i+1][j+1];
			     arr[i+1][j+1]=arr[i+1][j];
			     arr[i+1][j]=arr[i][j];
			    k--;
			    if(0<k) {
		       i++;
		       j++;
		       rotation(arr,k,i,j);
			    }
			    
			    return arr;
		       
		       
	}

}

package TwoDimensionlArray;

public class CheckStarightLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2},{2,3},{3,4},{4,5}};
	   System.out.println(cherc(arr));	
	}

	private static boolean cherc(int[][] arr) {
		int flag=0;
		try {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				  int firs=arr[i][j]+1;
				
				if(arr[i+1][j]==firs) {
					   continue;
				}
				else {
					  flag=1;
					  break;
				}
			}
			if(flag==1) {
				return false;
				 
			}
		}}catch(Exception e) {}
		return true;
		
	}

}

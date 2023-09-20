package TwoDimensionlArray;

public class NerestExit {

	public static void main(String[] args) {
	 
		String arr[][]= {{"+","+",".","+"},{".",".",".","+"},{"+","+","+","."}};
		int r=1,c=2;
		 exit(arr,r,c);
		

	}

	private static void exit(String[][] arr, int r, int c) {
		      
	 int res=0;
				     if(arr[r][c+1]=="+") {
				    	    
				    	 exit(arr,r-1,c);
				    	 exit(arr,r-1,c);
				    	 
				    	 
				     }
		 
		
	}

}

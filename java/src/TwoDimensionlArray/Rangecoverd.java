package TwoDimensionlArray;

public class Rangecoverd {

	public static void main(String[] args) {
      
		int arr[][]= {{1,2},{3,4},{5,6}};
		int left=2,right=5;
		boolean b=true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				     
				int l=Math.abs(arr[i][j]-left);
				int r=Math.abs(arr[i][j]-right);
				if(l<left && r<right) continue;
				else {
					b=false;
					break;
				}
			}
		}
		System.out.println(b);
		
		

	}

}

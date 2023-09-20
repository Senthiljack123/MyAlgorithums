package Algorithums;

public class MatrixClockviserotate {

	public static void main(String[] args) {
		// erukura matrixa 90 egere clok vise la roate panananumm 
		//logic yanana transpose matrix oru vatti pannanum
		//reverse matrixa oru vatti pannum apdi pann ans  kedaikum
		
		 int arr[][]= {{1,2,3,4},
	 		        {5,6,7,8},
	 		        {9,10,11,12},
	 		        {13,14,15,16}};
		 
		 //transpose matrix
          for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
          for (int i = 0; i < arr.length; i++) {
  			for (int j = 0; j < arr.length; j++) {
  				System.out.print(arr[i][j]+" ");
  			}
  			System.out.println();
          }
          
          //reverse matrix
          for (int i = 0; i < arr.length; i++) {
			  int left=0,right=arr[0].length-1;
			  while(left<right) {
				  int temp=arr[i][left];
				  arr[i][left]=arr[i][right];
				  arr[i][right]=temp;
				  left++;
				  right--;
			  }
		}
          
          for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

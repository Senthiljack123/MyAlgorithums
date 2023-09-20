package Solved;

public class MinimumrequredDeletion {

	public static void main(String[] args) {
		   String s="ABABABAB";
		   int count=0;
		   char arr[]=s.toCharArray();
		   for (int i = 0; i < arr.length-1; i++) {
			   if(arr[i]==arr[i+1]) {
				   count++;
			   }
		}
             System.out.println(count);
	}

}

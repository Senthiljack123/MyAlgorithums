package TwoDimensionlArray;

public class Countunsoeted {

	public static void main(String[] args) {
         
		String arr[]= {"zyx","wvu","tsr"};
		int count=0;
		for (int i = 0; i < arr[0].length(); i++) {
			   for (int j = 0; j < arr.length-1; j++) {
				   if(arr[j].charAt(i)<=arr[j+1].charAt(i)) {
					   continue;
				   }
				   else {
					   count++;
					   break;
					   
				   }
			}
		}
		System.out.println(count);
	}

}

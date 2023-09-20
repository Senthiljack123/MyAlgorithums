package Algorithums;

public class Findmajaority {

	public static void main(String[] args) {
		//Arrayala ulla majority element'    wrong outtput
		int arr[]= {5,5,8,8,8,1};
		int i=0;
		int count=0;
		int n=arr.length;
		 while(i<arr.length) {
		       if(arr[i]==arr[i-1]) {
		           count++;
		            i++;
		       }
		       else {
		           if(count>n/2)
		               break; 
		            else
		                count=0;
		                i++;
		       }
		   }
		System.out.println(i-1);

	}

}

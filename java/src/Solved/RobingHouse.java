package Solved;

public class RobingHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method 
       int arr[]= {2,7,9,3,1};
       int i,sum = 0;
       for ( i = 0; i < arr.length; i+=2) {
		       sum=arr[i]+sum;
	}
       System.out.println(sum);
       

	}

}

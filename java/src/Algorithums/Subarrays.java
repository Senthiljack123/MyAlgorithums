package Algorithums;

public class Subarrays {

	public static void main(String[] args) {
		//kuduthuku  arraya add and even value erukura  sub arrayoda length sollanum
		int arr[]= {8,10,13,14,6,5};
		int count=1;
		int max=1;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]%2==0 && arr[i-1]%2 !=0 || arr[i]%2!=0 && arr[i-1]%2==0) {
				  count++;
				  max=Math.max(max, count);
			}
			else {
				count=1;;
			}
		}
		System.out.println(max);

	}

}

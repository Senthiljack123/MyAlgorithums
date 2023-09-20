package Algorithums;

public class MaxConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,1,1};
		int count = 0, max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				count = 0;
			}
			else count++;
			max = Math.max(max, count);
		}

		System.out.println(max);
	}

}

package Algorithums;

public class Maximumconsecutive {

	public static void main(String[] args) {
		//Consucutive erukura onna mattum print pannanum
		int arr[]= {0,1,1,0,0,1,1,1,0};
		int count =0,max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				count=0;
				
			}
			else {
				count++;
				max=Math.max(count, max);
			}
		} 
		System.out.println(max);

	}

}

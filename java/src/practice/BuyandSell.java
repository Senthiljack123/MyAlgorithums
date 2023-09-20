package practice;

public class BuyandSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={1,2,3,4,5};
		System.out.println("Maximum profit=="+maxProfit(arr));
		System.out.println("Total profit=="+totalProfit(arr));

}
	private static int totalProfit(int[] arr) {
		 int max=0;
		 int sum=0;
		 for (int i = 0; i < arr.length-1; i++) {
			 if(arr[i]<arr[i+1]) {
					int dif=arr[i]-arr[i+1];
					sum=sum+Math.abs(dif);
				}
		}
		return sum;
	}
	static int maxProfit(int[] arr) {
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			   
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
				   int dif=arr[i]-arr[j];
				   dif=Math.abs(dif);
				   if(max<dif) {
					   max=dif;
				   }
			}
		}

	}
		 
		return max;
		
	}
}
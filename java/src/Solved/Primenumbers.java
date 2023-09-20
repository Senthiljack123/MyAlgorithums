package Solved;

public class Primenumbers {

	public static void main(String[] args) {
		 
		//System.out.println("Check prime=="+checkPrime(18));
 		System.out.println("print prinme==");
//	    printPrime(20);
//		int arr[]= {1,2,3,4,5,6,7,8,9};
//		onlyPrime(arr);
		System.out.println("Nth Prime Number=="+nthPrime(10));

	}

	private static int nthPrime(int num) {
		 int count = 0,i;
		 int res=1;
		 
		 while(count<num) {
			 res++;
			 
			 for ( i = 2; i <=res; i++) {
				if(res%i==0)
					break;
				
			}
			 if(i==res)
			 count++;
		 }
	 
			 
		return res;
	}

	private static void onlyPrime(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int num=arr[i];
			if(arr[i]==2) {
				
			System.out.println(arr[i]);
			continue;
			
			}
			for (int j = 2; j <= num; j++) {
			 
				if(num%j!=0) { 
					System.out.println(arr[i]);
					break;
				
				}
				else if(num%j==0) break;
			}
		}
 		
	}

	private static void printPrime(int num) {
		
		for (int i = 2; i < num; i++) {
			
			for (int j = 2; j <= i; j++) {
				if(i%j!=0)
					System.out.println(i);
				    break;
			}
			
		}
               
	}

	private static boolean checkPrime(int num) {
		
		if(num==0 || num==1)
			 return false;
		else {
			for(int i=2;i<num;i++) {
				if(num%i!=0) {
					 System.out.println(i);
				}
			}
		}
	 
 		return true;
	}

}

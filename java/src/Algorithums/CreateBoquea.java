package Algorithums;

 
public class CreateBoquea {

	public static void main(String[] args) {
		// kuduthutka arraya  ulla value poo yathna nalla pookunu kuduthurku
		//thodarnthu pookura poova yaduthu bokas seiyanum
		
		int arr[]= {2,5,2,9,3,10,4,6,5,6};
		int boukas=4;
		int flower=2;
		
		System.out.println(createBoukas(arr,boukas,flower));
		

	}

	private static int createBoukas(int[] arr, int boukas, int flower) {
 
		if(boukas*flower>arr.length)
			return -1;
		int l=arr[0],h=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			 if(l>arr[i]) l=arr[i];
			 if(h<arr[i]) h=arr[i];
		}
		
		int res=-1;
		while(l<=h) {
			  
			int m=(l+h)/2;
		    System.out.println(m);
			
			
			if(isPossible(arr,m,boukas,flower)) {
				res=m;
				h=m-1;
			}
			else l=m+1;
		}
		
		
		return res;
	}

	private static boolean isPossible(int[] arr, int m, int boukas, int flower) {
		
		int adj=0,bc=0;
		for (int i = 0; i < arr.length; i++) {
			  if(arr[i]<=m) {
				  adj++;
				  if(adj==flower) {
					  bc++;
					  if(boukas==bc) {
						  return true;
					  }
					  adj=0;
				  }
			  }
			  else {
				  adj=0;
				  
			  }
		}
		
 		return false;
	}

}

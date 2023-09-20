package Algorithums;

public class Bookallocation {

	public static void main(String[] args) {
           //kuduthurka arryala ulla booksa crta studntsuku prichu kumadukanum....
		int arr[]= {12,34,67,90};
		int students=2;
		System.out.println(maxPages(arr,students));
	}

	private static int maxPages(int[] arr, int students) {
		 if(students>arr.length) {  //studentsa vida array perusha eruntha booka perika mudiyathu
			 return -1;
		 }
		 
		 int l = arr[0],h=0;
		 for (int i = 0; i < arr.length; i++) {
			if(arr[i] < l)
				l = arr[i];
			    h = h+arr[i];
		}
		 int res = -1;
		 while(l <= h) {
			 int m = (l+h) / 2;
			 if(isPossible(arr,m,students)) {
				   res=m;
				   h=m-1;
			 }
			 else {
				 l=m+1;
			 }
		 }
 	 
		return res;
	}

	private static boolean isPossible(int[] arr, int m, int b) {
		 
		int student = 1;
		int spc = 0;                    //spc  ==  seleect pages count
		for (int i = 0; i < arr.length; i++) {
			
			  if(arr[i] > m)
				  return false;
			  
			  if(spc + arr[i] <= m)
			  {  
				  spc = spc + arr[i];
				  
			  }
			  else {
				  student++;
				  if(student > b) return false;    //kuduthuruka studenta vida athigama eruntha false
				  spc = arr[i];
			  }
		}
		return true;
	}

}

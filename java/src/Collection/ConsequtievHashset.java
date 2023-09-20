package Collection;

import java.util.HashSet;

public class ConsequtievHashset {

	public static void main(String[] args) {
           int arr[]= {1,9,3,10,4,20,2};
           int n=arr.length;
           System.out.println("logest subSequence=="+logestSubsequence(arr));
        		  
	}

	private static int logestSubsequence(int[] arr) {
		
		HashSet s=new HashSet();
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			  s.add(arr[i]);
		}
		for (int i = 0; i < arr.length; ++i) {
			    if(!s.contains(arr[i]-1)) {
			    	int j=arr[i];
			    	while(s.contains(j))
			    		j++;
			    	
			    	if(ans<j -arr[i])
			    		ans=j-arr[i];
			    }
		}
		
 		return ans;
	}

}

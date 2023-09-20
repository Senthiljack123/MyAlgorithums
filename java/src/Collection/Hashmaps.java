package Collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmaps {

	public static void main(String[] args) {
		 
		int arr[]= {1,5,7,8,5,3,4,2,1};
		int dif=-2;
		System.out.println(longestSubsequence(arr,dif));

	}
	public static int longestSubsequence(int[] arr, int difference) {
        int result = 1;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
        	
        	System.out.println("maps con=="+map.containsKey(arr[i]-difference));
            if(map.containsKey(arr[i]-difference)){
                map.put(arr[i], map.get(arr[i]-difference) +1);
                result = Math.max(result, map.get(arr[i]));
            }
            else {
                map.put(arr[i], 1);
                System.out.println(map);
            }
        }
        System.out.println(map);
        return result;
    }

}

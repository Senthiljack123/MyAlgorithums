package Queue;

import java.util.PriorityQueue;

public class Heightchecker {

	public static void main(String[] args) {
		
		int arr[]= {1,0,2,3,0,4,5,0};
       
		int length = arr.length;
        int[] res = new int[length];
        int j = 0;
        
        for (int i = 0; i < length && j < length; i++){
            if (arr[i] != 0){
                res[j] = arr[i];
            } else {
                j++;
            }
            j++;
        }
        
        for (int i = 0; i < length; i++){
            arr[i] = res[i];
        }
        
        for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}

}

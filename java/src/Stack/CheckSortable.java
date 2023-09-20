package Stack;

import Stack.NextgreaterElemet.Stacks;

public class CheckSortable extends Stacks {

	public static void main(String[] args) {
		    int arr[]= {1,1,2};
            if(check(arr)) {
            	System.out.println("yes");
            }
            else System.out.println("NO");
	}

	private static boolean check(int[] arr) {
		
		Stacks s=new Stacks();
		int i;
		 for (i = 0; i < arr.length; i++) {
			while(!s.isEmpty()) {
				if(s.pop()>arr[i]) return false;
		}
		  if(s.isEmpty())   s.push(arr[i]);
		 }
		 
 		return true;
	}

}

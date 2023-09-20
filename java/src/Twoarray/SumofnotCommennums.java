package Twoarray;

 
import java.util.HashSet;
import java.util.Set;

public class SumofnotCommennums {

	public static void main(String[] args) {
          
		  int arr1[]= { 1, 2, 3, 4 };
		  int arr2[]= { 2, 3, 4, 5, 8 };
		  int sum=0;
		   HashSet hs=new HashSet();
		    for (int i = 0; i < arr1.length; i++) {
				   hs.add(arr1[i]);
			}
		    for (int i = 0; i < arr2.length; i++) {
				   if(hs.contains(arr2[i]))
					   sum++;
			}
		    System.out.println(sum);
	}

}

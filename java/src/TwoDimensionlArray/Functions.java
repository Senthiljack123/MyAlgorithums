package TwoDimensionlArray;

import java.util.ArrayList;
import java.util.List;

public class Functions {
	
	int arr[][]= {{1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0}, {1,1,1,1,1}};

	public static void main(String[] args) {
		
		Functions ob=new Functions();
		System.out.println("Weakest soldirea=="+ob.alignWeakestSoldirers());

	}

	private String alignWeakestSoldirers() {
	     int count=0,pre=0;
	     int a[]=new int[5];
		 List l=new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			   count=0;
			 for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==1) {
					  count++;
				}
			}
			  a[i]=count;
			     	 
		}
		for (int i = 0; i < 3; i++) {
               int min=Integer.MAX_VALUE;
               int index=0;
               for (int j = 0; j < a.length; j++) {
				    if(a[j]!=-1 && a[j]<min) {
				    	min=a[j];
				    	index=j;
				    }
			}                        //2,4,1,2,5
               l.add(index);
               a[index]=-1;
		}
	    System.out.println(l);
		return null;
	}

}

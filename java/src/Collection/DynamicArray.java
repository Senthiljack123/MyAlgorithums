package Collection;

import java.util.Scanner;

public class DynamicArray {
	static final int initialcapacity=5;
	int arr[]= {1,2,3,4,5};
	int size=arr.length;
	int capacity;
	
	DynamicArray(){
		 
		//arr=new  int[initialcapacity];
		capacity=initialcapacity;
		 
	}
	 
	
	  void addValue(int data) {
		  if(size==capacity) {
			  expandCapcity();
		  }
		  arr[size++]=data;
		  
	  }
	  
	  void display() {
		  for (int i = 0; i < size; i++) {
			 System.out.print(arr[i]+" ");
		}
		  System.out.println();
	  }
	  
	  void insertPosition(int pos,int val) {
		    for (int i = size-1; i >=pos; i--) {
				arr[i+1]=arr[i];
			}
		    arr[pos]=val;
		    size++;
	  }
	  
	  void deletePos(int pos) {
		  for (int i = pos+1; i < size; i++) {
			  arr[i-1]=arr[i];
		}
		  size--;
		  
		  if(capacity>3*size) {
			    shrinkArray();
		  }
		}
	  
	  void getFirstandlast() {
		  System.out.println("the first value is"+arr[0]+"   last value  "+arr[arr.length-1]);
	  }
	  
	  int getIndex(int pos) {
		  
		  for (int i = 0; i < arr.length; i++) {
			    if(i==pos)
			    	return arr[i];	    
		}
		    return -1;
		 
	  }
	  
	  void deleteFirstandlast() {
		     for (int i = 0; i < arr.length-1; i++) {
				     arr[i]=arr[i+1];
				     
			}
		      size--;
		     for (int i = 0; i < arr.length-1; i++) {
				   arr[i]=arr[i];
			}
		     size--;
	  }
	  

	private void shrinkArray() {
           	capacity /=2;
           	arr=java.util.Arrays.copyOf(arr, capacity);
	}

	private void expandCapcity() {
 		     capacity*=capacity;
 		     arr=java.util.Arrays.copyOf(arr, capacity);
 		     
	}

	public static void main(String[] args) {
		int val,pos;
		DynamicArray ob=new DynamicArray();
		Scanner s=new  Scanner(System.in);
     while(true) {
		System.out.println("--------Menu--------");
		System.out.println("1  Insert data");
		System.out.println("2  display");
		System.out.println("3  Inesert Postion");
		System.out.println("4  Delete postion");
		System.out.println("5  Getfirst and last value");
		System.out.println("6  Get index");
		System.out.println("7  Delete first and Last");
		System.out.println("8  Exit");
		System.out.println("--------------------");
	    System.out.println("plse enter your choice");
		 int choice=s.nextInt();
		 switch(choice) {
		 case 1:  System.out.println("Enter the data");
		           val=s.nextInt();
		           ob.addValue(val);
		           break;
		
		 case 2:   ob.display();
		           break;
		 
		 case 3:   System.out.println("Enter the postion and value");
		           pos=s.nextInt();
		           val=s.nextInt();
		           if(pos<0) {
		        	   System.out.println("Invalid postion");
		        	   break;
		           }
		           ob.insertPosition(pos,val);
		           break;
		
		 case 4:   System.out.println("Enter the pos");              
		           pos=s.nextInt();
		           if(pos>0) {
		        	   System.out.println("Invalid postion");
		        	   break;
		           }
		           ob.deletePos(pos);
		           break;
		           
		 case 5:   ob.getFirstandlast();
		           break;
		           
		 case 6:   System.out.println("Enter the postion");
		           pos=s.nextInt();
		           System.out.println(ob.getIndex(pos));
		           break;
		           
		 case 7:   ob.deleteFirstandlast();
		           break;
			    
		 case 8:   System.out.println("<<<<<thank You>>>>5");
			       System.exit(0);
		            
		 
		 default:  System.out.println("please enter correct choicee");
		           
		           
		          
		 }
		 

	}

}
}

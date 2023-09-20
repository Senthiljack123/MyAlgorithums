package Solved;

public class MoneyNotes {

	public static void main(String[] args) {
		 int amount=1000;
		 int arr[]= {50,100,200,500};
		 int note = 0,i;
		 for (i = 0; i < arr.length; i++) {
			    if(arr[i]<amount ) {
			        note=arr[i];
			       }
			    else break;
		 }    
		     
				     while(note<=amount) {
				    	 System.out.print(arr[i-1]+" ");
				    	 note=arr[i-1]+note;
				    	
				     }
			  }

	}

 

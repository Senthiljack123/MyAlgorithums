package Solved;

public class Keyboard {

	public static void main(String[] args) {
             String arr[]= {"Hello","Alaks","Dad","Pease"};
             String words[]={"qwertyuiop","asdfghjkl","zxcvbnm"};
             String row1="qwertyuiop";
             String row2="asdfghjkl";
             String row3="zxcvbnm";
               for (int i = 0; i < arr.length; i++) {
            	         if(row1.contains(arr[i])) {
            	        	 System.out.println(arr[i]);
            	         }
            	         if(row2.contains(arr[i])) {
            	        	 System.out.println(arr[i]);
            	         }
            	         if(row3.contains(arr[i])) {
            	        	 System.out.println(arr[i]);
            	         }
			}
	 

}
}
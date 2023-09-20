package practice;

public class Numbers {
	public static void main(String[] args) {
        int num=407;
        int nums=num;
        int rem=0,res,fin=0;
        while(0<num) {
        	rem=num%10;
        	res=rem*rem*rem;
        	fin=res+fin;
        	num=num/10;
        	
        }
        if(nums==fin) {
        	System.out.println("is armstrong ");
        }
        else System.out.println("not armstrong");
}

}

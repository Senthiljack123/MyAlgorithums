package Algorithums;

public class RomanletertoInteger {

	public static void main(String[] args) {
		//Roman lettera integeer mathi  sum yannanu sollanum
		
		String s="MCMXCIV";
		  int sum=0,number=0,prev=0;
	        for(int i=s.length()-1;i>=0;i--){
	            switch(s.charAt(i)){
	                case 'I'->number=1;
	                case 'V'->number=5;
	                case 'X'->number=10;
	                case 'L'->number=50;
	                case 'C'->number=100;
	                case 'D'->number=500;
	                case 'M'->number=1000;
	            }
	            if(number<prev)
	                sum-=number;
	            else
	                sum+=number;
	            prev=number;
	        }
		System.out.println(sum);
		

	}

}

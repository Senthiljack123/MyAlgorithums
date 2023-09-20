package Solved;

public class Findwords {

	public static void main(String[] args) {
	    String s[]= {"hello","world","leetcode"};
	    String ch="welldonehoneyr";
	    int ans=0;
	    int res=0;
	    int flag=0;
	    for (int i = 0; i < s.length; i++) {
	    	        ans=0;
			  for (int j = 0; j <s[i].length(); j++) {
				       
				 for (int j2 = 0; j2 < ch.length(); j2++) {
					 
					if(s[i].charAt(j)==ch.charAt(j2))
					{
						  ans++;
						  break;
					      
					}
		 
				}
		 	 
			}
			  if(ans==s[i].length()) { 
				  res=res+s[i].length();
				   
			  }
		}
	    System.out.println(res);
		
		
	}

}

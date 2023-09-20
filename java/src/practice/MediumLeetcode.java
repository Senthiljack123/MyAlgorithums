package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

import Queue.Prioritiequeues;

public class MediumLeetcode {
	
	   static int arr[]= {10,20,30,40,50,60,70,80,90,100,110};
       static int l=0;
	public static void main(String[] args) {
		 
		//System.out.println("Balls Arrnged=="+ballsArranged(6));
	    //System.out.println("Fair=="+findFair());
		//System.out.println("frequently smaallest==");
	    //int a[]=smallfreqq();
	    //System.out.println(Arrays.toString(a));
		//System.out.println("Maximum distance of valid pair=="+distancePair());
		//System.out.println("Detect patterm M equal N=="+detactPat(2,3));
		//System.out.println("Rope colorfull=="+minimumTime());
		//System.out.println("Sorting Pivot value=="+sortPivot(2));
		//System.out.println("Sucesse full pairs=="+pairs(16));
		//System.out.println("Replacement the array=="+replacMent());
		// System.out.println("minimumdif=="+minimumdif());
		//System.out.println("replace the  chakpiese=="+chakPiece(22));
		//System.out.println("Min and max pair=="+maxvalPair());
		//System.out.println("distance=="+distance(5,3));
		//System.out.println("Truncate distance=="+truncate(2));
		//System.out.println("longestsubstribg=="+longSubString());
		//System.out.println("subarrau sum=="+subArray(7));
		//System.out.println("same element distance=="+sameElementDist());
		//System.out.println("missing and rebeating=="+missingRebating());
		//System.out.println("rearrange sorted array=="+rearrange());
		//System.out.println("Stock ans Span=="+stocSpan());
		//System.out.println("minimum Swap == "+minSwaps());
		//System.out.println("Array to long Number=="+arraytoNumber());
		//System.out.println("finddublicate=="+findDublicate());
		//System.out.println("union array=="+unionArray());
		//System.out.println("Permutation=="+permutaion());
		System.out.println("print prime=="+primeEratothenses());
		 
		 
	}//String =abc
	private static String primeEratothenses() {
		int n=20;
		boolean[] b=new boolean[n+1];
		for (int i = 2; i <= n; i++) {
		       if(b[i]==false) {
		    	   for (int j =i*2; j <= n; j=j+i) {
					     b[j]=true;
					     
				}
		       }
			
		}
		for (int i = 2; i < b.length; i++) {
			  if(b[i]==false) System.out.println(i);
		}
		 
		return null;
	}
	private static String permutaion() {
		   String s = "ABC";
	       permute(s.toCharArray(),0);
	        
		return null;
	}
	private static void permute(char[] cs, int fi) {
		 
		if(cs.length-1==fi) {
			System.out.println(cs);
			 
			return;
		}
		for (int i = fi; i < cs.length; i++) {
			     
			swap(cs,i,fi);
			permute(cs,fi+1);
			swap(cs,i,fi);
		}
		   
		
	}
	private static void swap(char[] cs, int i, int fi) {
		 
		      char temp=cs[i];
		      cs[i]=cs[fi];
		      cs[fi]=temp;
		
	}
	//1,2,3,4,5
	private static String unionArray() {
		int sec[]= {1,2,3,85,1,2};
		  HashSet hs=new HashSet<>();
		 
		  for (int i = 0; i < arr.length; i++) {
			  hs.add(arr[i]);
		}
		  for (int i = 0; i < sec.length; i++) {
			  hs.add(sec[i]);
		}
		  System.out.println(hs.size());
 		return null;
	}
	//2,3,1,2,3
	private static String findDublicate() {
		
		  HashSet hs=new HashSet<>();
		  ArrayList a=new ArrayList();
		  int flag=0;
		  for (int i = 0; i < arr.length; i++) {
			   if(!hs.contains(arr[i])) {
				    hs.add(arr[i]);
			   }
			   else {
				   a.add(arr[i]);
				   flag=1;
			   }
		}
		  if(flag==0) System.out.println("-1");
		  else
		  System.out.println(a);
		 
		return null;
	}
	//3,30,34,9
	 private static String arraytoNumber() {
		 String st[]= {"3","30","34","5","9"};
		  for (int i = 0; i < arr.length; i++) {
			  for (int j = i+1; j < arr.length; j++) {
				  
				    String ij=st[i]+st[j];
				    String ji=st[j]+st[i];
				    int f=Integer.parseInt(ij);
				    int s=Integer.parseInt(ji);
				    if(f<s) {
				    	String temp=st[i];
				    	st[i]=st[j];
				    	st[j]=temp;
				    	
				    }
				    else continue;
		}
	}
		  String res ="";
		  for (int i = 0; i < st.length; i++) {
			     res=res+st[i];
		}
		  System.out.println(res);
		  return null;
	 }
	// 3   5  6  10 19
	   public static int minSwaps()
	    {
	        // Code here
	        int[] temp = new int[arr.length];
	        for(int i=0; i<arr.length; i++) {
	            temp[i] = arr[i];
	        }
	        Arrays.sort(temp);
	        int count=0;
	        for(int i=0; i<temp.length; i++) {
	            if(arr[i] != temp[i])
	                count++;
	            System.out.println(count+"==count");
	            int j = temp[i];
	            System.out.println("j=="+j);
	            int idx = index(j, arr);
	            System.out.println("idx=="+idx);
	            
	            int temps = arr[i];
	            arr[i] = arr[idx];
	            arr[idx] = temps;
	            
	            System.out.println(Arrays.toString(arr));
	        }
	        return count;
	    }
	    public static int index(int j, int[] nums) {
	        int i;
	        for(i=0; i<nums.length; i++) {
	            if(nums[i] == j)
	                break;
	        }
	        return i;
	    }
	
	//100 80 60 70 60 75 85
	private static String stocSpan() {
		
		int count=1;
		int temp[]=new int[arr.length];
		temp[0]=1;
		for (int i = 1; i < temp.length; i++) {
			   count=1;
			for (int j =i-1; j < temp.length; j++) {
				    
				if(arr[i]>=arr[j]) {
					 
					count++;
				}
				else break;  
					   
			}
			temp[i]=count;
		}
		  System.out.println(Arrays.toString(temp));
		
 		return null;
	}
	//1 2 3 4 5 6
	private static String rearrange() {
		
		 LinkedList l=new LinkedList();
		 int c=arr.length-1;
		for(int i=0;i<arr.length/2;i++){
            
            
             l.add(arr[c--]);
             l.add(arr[i]);
        }
        System.out.println(l);
		
		
 		return null;
	}
	//7, 3, 4, 5, 5, 6, 2
private static int missingRebating() {
	int i;
	int size=arr.length;
    System.out.print("The repeating element is ");

    for (i = 0; i < size; i++) {
        int abs_val = Math.abs(arr[i]);
        
        if (arr[abs_val - 1] > 0) {
            arr[abs_val - 1] = -arr[abs_val - 1];
            
        }
        else
            System.out.println(abs_val);
    }
      for (int j = 0; j < arr.length; j++) {
		System.out.println(arr[j]);
	}

    System.out.print("and the missing element is ");
    for (i = 0; i < size; i++) {
        if (arr[i] > 0)
            System.out.println(i + 1);
    }
    return 0;
}
	
 	 
//{3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}
private static int sameElementDist() {
	 
	HashMap<Integer, Integer> h=new HashMap<>();
	int maxdist=0;
	for (int i = 0; i < arr.length; i++) {
		  if(!h.containsKey(arr[i])) {
			  //System.out.println(arr[i]+"==="+i);
			  h.put(arr[i], i);
		  }
		  else {
			  //System.out.println(arr[i]+">");
			 // System.out.println("get=="+(i-h.get(arr[i])));
			  maxdist=Math.max(maxdist, i-h.get(arr[i]));
			  //System.out.println(maxdist);
		  }
	}
	
		 
		return maxdist;
	}
//2,3,1,2,4,3	 
      private static int subArray(int target) {
    	  int n=arr.length;
          int sum = 0;            //Current Sum
          int left = 0;           //left ptr
          int right = 0;          //right ptr
          int shortest = Integer.MAX_VALUE; //shortest window with Sum>=Target
          
          //Variable Size sliding window: 2-pointer
          while(right<n){
              sum += arr[right];//Add current element to Sum
              System.out.println("sum=="+sum);
              if(sum >= target){//Check if currentSum >= Target
                  //Skip all left elements till sum < target (to find the smallest window)
                  while(sum>=target){
                	  System.out.println("left=="+left);
                      sum -= arr[left];
                      left++;
                  }
                  shortest = Math.min(shortest,right-left+2);//Update smallest window size
                  System.out.println("Shortset=="+shortest);
              }
              right++;
          }
          return shortest==Integer.MAX_VALUE?0:shortest;
      }

	public static int longSubString() {
		String s="abcabcbb";
	    final int n = s.length();
	    int len = 0;
	    int [] repeat = new int[128];
	    for (int c = 0, j = 0, i = 0; j < n; j++) {
	        c = s.charAt(j);
	        System.out.println("c== "+c);
	        System.out.println("rebeat=="+repeat[c]);
	        
	        i = Math.max(repeat[c], i);
	        System.out.println("i== "+i);
	        
	        len = Math.max(len, j - i +1);
	        System.out.println("len== "+len);
	        
	        repeat[c] = j+1;
	        System.out.println("-----------");
	    }
	    return len;
	}
	private static String truncate(int k) {
		
		String s="Hello how are you Contestant";
		char sp=' ';
		int co=0;
		for (int i = 0; i < s.length(); i++) {
			
			   
			   if(s.charAt(i)==sp)  co++;
			   if(co==k) break;
				   System.out.print(s.charAt(i));
			
		}
		
		
 		return null;
	}
	//1,2,3,4,5
	private static int distance(int tar, int strt) {
	     
		int min =Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==tar) {
				min=Math.min(min, Math.abs(i-strt));
			}
		}
		
 		return min;
	}
	//3,5,4,2,4,6
private static int maxvalPair() {
	   int max =Integer.MIN_VALUE;
	   int res=0;
	   Arrays.sort(arr);
	   int j=arr.length-1;
	   for (int i = 0; i <arr.length/2; i++) {
		   
		   res=arr[i]+arr[j--];
		   if(max<res) {
			   max=res;
		   }
		   
	}
	
 		return max;
	}
//3,4,1,2	
 private static int chakPiece(int chalk) {
	   int i=0;
	   int cal;
	     while(i<chalk) {
	    	 
	         chalk=Math.abs(arr[i]-chalk);
	         System.out.println("i =="+i+" arr[i]"+arr[i]+"   ch=="+chalk);
	         i++;
	         
	         if(arr[i-1]>chalk) {
	        	 break;
	         }
	         if(i==arr.length) i=0;
	    	   
	     }
	      
 		return i;
	}

//1,3,4,8
private static LinkedList minimumdif() {
    int f = 0,s = 0;
	int qury[][]= {{0,1},{1,2},{2,3},{0,3}};
	LinkedList l=new LinkedList();
	for (int i = 0; i < qury.length; i++) {
		    for (int j = 0; j < qury[0].length; j++) {
				  
		    	  f=arr[qury[i][j]];
		    	 s=arr[qury[i][j+1]];
		    	j++;
			}
		    
		      int res=Math.abs(f-s);
		      if(res>0) {
		    	    l.add(res);
		      }
		      else 
		    	  l.add(-1);
		      
			   
		}
	
	
	return l;
	}


//5,3,5,10
private static String maximumSteps(int dist) {
		int count=0;
		int dif=arr[0];
	for (int i = 0; i < arr.length; i++) {
		    
		dif=dist-dif;
		
		 if(dif>dist)  {
			 count++;
			 
			 i=0;
		 }
		
		
	}
	
	
	
		return null;
	}



//1,2,,4,6
private static String replacMent() {
		 
	int replace[][]= {{1,3},{2,1},{3,2}};
	int z=0;
	 for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < replace.length; j++) {
			      
					  if(arr[i]==replace[j][z]) {
						  arr[i]=replace[j][z+1];
					  
				} 
				  
		}
	}
	 System.out.println(Arrays.toString(arr));
	 
	
		return null;
	}

private static LinkedList pairs(int target) {
	
	int[] potion= {8,5,8};	
	int count=0;
	LinkedList l=new LinkedList();
	for (int i = 0; i < arr.length; i++) {
		   count=0;
		for (int j = 0; j < potion.length; j++) {
			    int sum=arr[i]*potion[j];
			    if(sum>=target)  count++;
		}
		 
			l.add(count);
		 
		
	}
	 
 		return l;
	}

//9,12,5,10,14,3,10
private static String sortPivot(int pi) {
	   int temp[]=new int[arr.length];
	   int  left=0;
	   int right=arr.length-1;
	  for (int i = 0 ,j=arr.length-1; i < arr.length; ++i,--j) {
		     
		  if(arr[i]<pi) {
			  temp[left++]=arr[i];	
		  }
		  if(arr[j]>pi) {
			 temp[right--]=arr[j];
		  }
	}
	  
	  
	  while(left<=right) {
		 temp[left++]=pi;
	  }
	  
	  for (int i = 0; i < temp.length; i++) {
		System.out.print(temp[i]+" ");
	}
	
		return null;
	}

//1,2,3,4,5
private static int minimumTime() {
	
	String s="aabaa";
	int re=0;
	int ans=0;
	for (int i = 0; i < s.length()-1; i++) {
		re=0;
		if(s.charAt(i)==s.charAt(i+1)) {
			     re=i;
		}
		if(re!=0)
		 ans=ans+arr[re];
			
	}
 
 		return ans;
	}
//1,2,1,2,1,1,1,3
private static boolean detactPat(int count, int reb) {
	    if(count<arr.length) {
	     int c=1;
	     int re=0;
	     for (int i = 0; i < arr.length; i++) {
	    	 if(arr[i]!=-1) {
	    		 c=1;
			  for (int j =i+1; j < arr.length; j++) {
				   if(arr[i]==arr[j]) {
					   c++;
					   arr[j]=-1;
				   }
			    
			}
			 
			  if(c>=reb) {
				  re++;
                  			  
			  }
 			  if(re==count) return true;
			  
		}
	     }
	    }
 		return false;
	}
//55,30,5,4,2
private static int distancePair() {
    int dif=0;
    int res=0;
    int min=Integer.MIN_VALUE;
	int pair[]= {10,10,1};
	for (int i = 0; i < arr.length; i++) {
		for (int j = i; j < pair.length; j++) {
			
		      if(arr[i]<pair[j]) {
		    	  dif=pair[j]-arr[i];
		    	  System.out.println(dif);
		    	  
		      }
		      if(min<dif) {
		    	  min=dif;
		    	  res++;
		      }
		    	  
		}
	}
	
	
	return res;
	}

private static int[] smallfreqq() {
	
	String quries[]= {"cbd"};
	String word[]= {"zaaaz"};
	 int[] q = new int[quries.length];
     int[] w = new int[word.length];
     //fill q and w for each array member
     for (int i = 0; i < q.length; i++) {
         q[i] = getFunc(quries[i]);
     }
     System.out.println(Arrays.toString(q)+"q");
     for (int i = 0; i < w.length; i++) {
         w[i] = getFunc(word[i]);
     }
     System.out.println(Arrays.toString(w));
     
     Arrays.sort(w);
     int[] res = new int[q.length];
     for (int i = 0; i < q.length; i++) {
    	 
         int l = 0, r = w.length - 1;
         
         while (l <= r) {
             int m = (r + l) / 2;
             if (w[m] <= q[i]) {
                 l = m + 1;
             } else {
                 r = m - 1;
             }
         }
         res[i] = w.length - l;
     }
     return res;
 
	}

private static int getFunc(String s) {
	char chr = 'z';
    int count = 0;
	 for (char ch : s.toCharArray()) {
         if (ch < chr) {
             count = 1;
             chr = ch;
         } else if (chr == ch) {
             count++;
         }
     }
     return count;
 
}

//2,1,6,4
private static int findFair() {
	
	   int count=0;
	   int odd=0,eve=0;
	   for (int i = 0; i < arr.length; i++) {
		            odd=0;
		    		eve=0;
		  for (int j = 0; j < arr.length; j++) {
			   
			  if(i==j) continue;
			  
			  if(j%2==1 ||j==0) {
				  odd=odd+arr[j];
				  System.out.println("odd=="+odd);
			  }
			  else if(j%2==0){
				
				    eve=eve+arr[j];  
				    System.out.println("eve=="+eve);
			  }
			  
	   
		}
		  System.out.println("------------");
		  if(odd==eve)  count++;
	}
	  
	
		return count;
	}

// 3,5(6)
	private static int ballsArranged(int order) {
		
		int res=0,k=0;
		int s=2; 
		int j=0;
		
		for (int i = 0; i < order; i++) {
		 
			while(j<s) {
		     int t=arr[k]--;		
		  
			 res=t+res;
			 
			 i++;
			 j++;
			}
			if(s==j)  {s=order-j;  j=0; }
			k++;
			
		}
		
		return res;
	     

}
}

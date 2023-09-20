package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class Arrayfunctions {
          int arr[]= {5,6,2,7,4};
		 
    
public static void main(String[] args) {
     Arrayfunctions ob=new Arrayfunctions();
     //System.out.print("CountFrequnet");
     //ob.countFrequncy();
     //ob.separate();
     //System.out.println("SumofArray=="+ob.summArray());
     //System.out.println("Occurent of 5=="+ob.countOccurent(5));
     //System.out.print("Print prime==");
     //ob.printPrime();
     //System.out.print("3rd small element==");
     //System.out.println(ob.smallElement(3));
     //ob.findSum(18);
     //System.out.print("Move the nagative element==");
     //ob.display(ob.moveNegative());       
     //System.out.println("Missing element in array=="+ob.missingElement());
     //System.out.println("count pair in arry=="+ob.countPair(2));
     //System.out.print("Remove  dublicate sortted Array==");
     //ob.removedublicateSortedArray();
     //System.out.println("First Non repeating elemet=="+ob.nonRebeat());
     //System.out.println(ob.sumZero(0));
     //System.out.print("print factorieal in array==");
     //ob.factorieal();
     //System.out.println("longe consecutive=="+ob.consecutive());  
     //System.out.println("Find minimumm elemrnt=="+ob.findMinimum());
     //ob.tripletSum(11);
     //System.out.print("Towers Sum=="+ob.minimumDiffer(2));
     //System.out.println("gruop of reverse array=="+ob.groupResverse(3));
     //System.out.println("Array given subset=="+ob.subset());
     //System.out.println("Majority elemet=="+ob.majorityElement());
     //System.out.println("two two reverse=="+ob.twoReverse());
     //System.out.println("find single nummber="+ob.findSingle());
     //System.out.println("squre root=="+ob.squreRoot());
     //ob.rebeatandMissing();
     //ob.closesetSum(10);
     //System.out.print("Whole array add one==");
     //int[] res=ob.addOne();
     //ob.display(res);
     //System.out.print("Add two arrays==");
     //ob.oddTwoArrays();
     //System.out.println("Third maximim value=="+ob.thirddMaxi());
     //System.out.println("Find max average=="+ob.findMaxAvg(4));
     //System.out.println("find misaamtch==");
     //ob.misMatch();
     //System.out.println("Add array to Integer==");
     //ob.addArraytoInt(1255);
     //System.out.println("Sorting Even first=="+ob.evenFirst());
     //System.out.println("Sorting squre  decrsing order=="+ob.squreDecrsing());
     //System.out.println("first mssing positve=="+ob.firstMissingPos());
     //System.out.println("Latgest sum=="+ob.largestSum());
     //System.out.println("Original count==");
     //ob.originalCount();
     //System.out.println("kth largest elemet=="+ob.largestElemet(3));
     //System.out.println("kth minmum elemet=="+ob.minimumValue(3));
     //System.out.println("reverse=="+ob.reverse());
     //System.out.println("delete one elemt in array=="+ob.delete(4));
     //System.out.println("Next graeter elemet==");
     //ob.nextGraterElemmet();
     //System.out.println("delete k smaller value==");
     //ob.deleteSmaller(2);
     //System.out.println("Maximum gap=="+ob.maximumGap());
     //System.out.print("sum indexes==");
     //ob.sumindes(10);
     //System.out.print("roatte array==");
     //ob.rotateArray(3);
     //System.out.println("Contain sduublicate=="+ob.containsDub());
     //System.out.println("Peak elemet=="+ob.peakElement());
     //System.out.println("count prime=="+ob.countPrime(10));
     //System.out.println("Minimum size sub Array=="+ob.minimumSubArray(7));
     //System.out.print("Move zeros==");
     //ob.moveZeros();
     //System.out.println("Longest Sub sequemnce=="+ob.longsubSequnce());
     //System.out.println("Wiggle Sequnce=="+ob.wiggleSequent());
     //System.out.println("find Treiplets=="+ob.findTriplet());
     //System.out.println("Rotate Function=="+ob.rotateSumMax());
     //System.out.println("minimumMoveEqual array=="+ob.minimumMove());
     //System.out.println("Most consecutive Ones=="+ob.mostConsecutive()); 
     //System.out.println("Realatives rank=="+ob.realtiveRank());
     //System.out.println("Continue subArray=="+ob.subArray(6));
     //System.out.println("Find single elemnt=="+ob.findSingle());
     //System.out.println("Distribute Candies=="+ob.distributeCandies());
     //System.out.println("Can place flower=="+ob.placeFlowers(2));
     //System.out.println("Find dubliacte And missing Number=="+ob.dubandMissing());
     //System.out.println("Non decreasing oreder=="+ob.nonDecresing());
     //System.out.println("base Ball game=="+ob.baseBallScore());
     //System.out.println("find pivot index=="+ob.pivotIndex());
     //System.out.println("Print sub arrays=="+ob.subArray());
     //System.out.println("less then sub Array=="+ob.lessthanSubaArray(100));
     //System.out.println("arryay Function=="+ob.deleteEarn());
     //System.out.println("Cost climp Stairs=="+ob.stairsClimp());
     //System.out.println("Large sum Average=="+ob.largSumAvg(3));
     //System.out.println("Longest Mounatin=="+ob.longestMounntain());
     //System.out.println("Card arrangement=="+ob.cardArrangement(3));
     //System.out.println("Shift the String=="+ob.shiftString());
     //System.out.println("Cuurent change give back customers=="+ob.currntChange());
     //System.out.println("Smalest range=="+ob.smallrange(3));
     //System.out.println("Mounatin array are not=="+ob.checkMountain());
     //System.out.println("Add array from integer=="+ob.addInteger(34));
     //System.out.println("Array partion=="+ob.findPartion());
     //System.out.println("Freq and value=="+ob.frqvalue());
     //System.out.println("Consecutive odds=="+ob.consecutiveOdds());
     //System.out.println("Unique occurrances=="+ob.uniqueOccrnace());
     //System.out.println("Bus stop=="+ob.stopDestination());
     //System.out.println("Moving  Chip=="+ob.moveChip());
     //System.out.println("count even digits=="+ob.findEven());
     //System.out.println("Smaller than currnt Number=="+ob.smallerCurrrentNum());
     //System.out.println("Given oreder=="+ob.givenOrder());
     //System.out.println("Increasing frequency=="+ob.increseFreq());
     //System.out.println("candies extra candirws"+ob.extraCandies(1));
     //System.out.println("Permutation=="+ob.permutation());
     //System.out.println("Arry Increasing=="+ob.increseCount());
     //System.out.println("Greatest divisible=="+ob.graetestDivisible());
     //System.out.println("Absolute diffrence=="+ob.minimuDiffers());
     //System.out.println("Long squre streak=="+ob.findSqre());
     //System.out.println("Largest postive integr=="+ob.largerPostiveInt());
     //System.out.println("Freq even element=="+ob.mostFreqelement());
     //System.out.println("Min max game=="+ob.minmaxGame(arr));
     //System.out.println("Maximum avg Sub array=="+ob.subArrays(4));
     System.out.println("max and Min diff=="+ob.maxandMin());
     
     
     
}
//[5,6,2,7,4
private int maxandMin() {
	 
	 
		int largest = 0;
	    int secondLargest = 0, smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
	    System.out.println(smallest);
	    System.out.println(secondSmallest);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=largest) {
				secondLargest = largest;
				largest = arr[i];
			} 
			else if(arr[i]>secondLargest)
				secondLargest = arr[i];
			if(arr[i]<=smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if(arr[i]<secondSmallest) 
				secondSmallest = arr[i];
		 
	}
	
	return (largest*secondLargest) - (smallest * secondSmallest);
}
//1,12,-5,-6,50,3
private double subArrays(int k) {
	
	  double sum=0;
      for(int i=0;i<k;i++)
          sum+=arr[i];
      System.out.println(sum);
      
      double res=sum;
      for(int i=k;i<arr.length;i++){
          sum+=arr[i]-arr[i-k];
          System.out.println("se=="+sum);
          res=Math.max(res,sum);
          System.out.println("res=="+res);
      }
      return res/k;
  
}
//1,3,5,2,4,8,2,2]
private  LinkedList minmaxGame() {
	   LinkedList l=new LinkedList<>();
	    
	    for (int i = 0; i < arr.length; i=i+2) {
			if(arr[i]<arr[i+1]) {
				l.add(arr[i]);
				 
			}
			else  {
				l.add(arr[i]);
				 
			}
			
		 
	   }
 	return l;
}
//0,1,2,2,4,4,1
private int mostFreqelement() {
	int most=0;
	int count=1;
	 int min=Integer.MIN_VALUE; 
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]%2==0) {
			   count=1;
			   int  find=-1;
			for (int j = i+1; j < arr.length; j++) {
				  if(arr[i]==arr[j]) {
					  count++;
					  find=arr[i];
					  
				  }
				  else break;
			}
			if(min>find)   min=find;
		}
	}
	
	return min;
}
//-1,10,6,7,-7,1
private int largerPostiveInt() {
	int max=Integer.MIN_VALUE;
	int res=-1;
	for (int i = 0; i < arr.length; i++) {
		   if(arr[i]>max) {
			   max=arr[i];
			   for (int j = 0; j < arr.length; j++) {
				        int n=-max;
				        if(n==arr[j]) {
				        	res=max;
				        }
			}
			   if(res==-1)   max=Integer.MIN_VALUE;
		   }
	}
	
 	return res;
}
//4,3,6,16,8,2
private int findSqre() {
	
	int res=0;
	/// LinkedList l=new LinkedList<>();
	 HashSet l=new HashSet();
	for (int i = 0; i < arr.length; i++) {
		  int sqr=arr[i]*arr[i];
		  for (int j = 0; j < arr.length; j++) {
			      if(arr[j]==sqr) {
			    	    l.add(arr[i]);
			    	    l.add(arr[j]);
			    	    
			    	    
			      }
		}
	}
	    res=l.size();
	
	
 	return res;
}
//4,2,1,3
private String minimuDiffers() {
	Arrays.sort(arr);
	int dif=0;
	int mindif=Integer.MAX_VALUE;
	 List<List<Integer>> ans = new ArrayList<>();
	 
	for (int i = 0; i < arr.length-1; i++) {
		   dif=Math.abs(arr[i]-arr[i+1]);
		   if(mindif>=dif) {
			   mindif=dif;
			   List <Integer> pair = new ArrayList<>();
               pair.add(arr[i]);
               pair.add(arr[i+1]);
               ans.add(pair);
			    
		   }
	}
	System.out.println(ans);
	 
	return null;
}
//2,3,4,5,6,7,8
private int  graetestDivisible() {
	
    int small=Arrays.stream(arr).min().getAsInt();
    int larg=Arrays.stream(arr).max().getAsInt();
 	int count=0,j=0;
 	int cal=small;
 	int res=0;
 	while(j<2) {
 		
 		if(j==1) cal=larg;
 		
 	for (int i = 0; i < arr.length; i++) {
		   if(arr[i]==cal) {
			   continue;
		   }
		   if(arr[i]%cal==0) count++;
	}
 	if(res<count)   res=count;
 	j++;
 	}
 	return res;
}
//1,1,1
private int increseCount() {
	
	int count=0;
	try {
	for (int i = 0; i < arr.length; i++) {
		 if(arr[i]<arr[i+1]) {
			 continue;
		 }
		 else {
			 count++;
			 arr[i+1]=arr[i+1]+1;
		 }
	}
	}catch(Exception e) {}
 	return count;
}
//[0,2,1,5,3,4]
private String permutation() {
      
	int temp[]=new int[arr.length];
	for (int i = 0; i < temp.length; i++) {
		    temp[arr[i]]=arr[i];
	}
	   System.out.println(Arrays.toString(temp));
 
	return null;
}
//4,2,1,1,2
private String extraCandies(int k) {
 
	boolean b[]=new boolean[arr.length];
	Arrays.fill(b, true);
	int max=arr[0]+k;
     for (int i = 1; i < b.length; i++) {
		  int v=arr[i]+3;
		   
			  if(max>v){
			  b[i]=false;
		  }
			  max=v;
		  
	}
     System.out.println(Arrays.toString(b));
	
	return null;
}
//1,1,2,2,2,3
private String increseFreq() {
	   int len=Arrays.stream(arr).max().getAsInt();
	  int a[]=new int[arr.length];
      int pos=0;
      int count=1;
      int min=Integer.MIN_VALUE;
      for (int i = 0; i < a.length; i++) {
    	  int val=arr[i];
    	  count=1;
		    for (int j = i+1; j < a.length; j++) {
				    if(val==arr[j]) {
				    	count++;
				    }
				    if(min<count) {
				    	min=count;
				    	
				    }
			}
	}
	
	
 	return null;
}
//0,1,2,3,4
private String givenOrder() {
	  int index[]={0,1,2,2,1};
	  ArrayList<Integer> list = new ArrayList<>();
      
      for(int i=0; i<arr.length; i++)
          list.add(index[i], arr[i]);
      
      System.out.println(list);
      
 
 	return null;
}
//8,1,2,2,3
private String smallerCurrrentNum() {
	
	int count=0;
	int res[]=new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
		count=0;
		for (int j = 0; j < arr.length; j++) {
			   if(arr[i]>arr[j]) {
				     count++;
			   }
			   
			   res[i]=count;
			   
		}
		
	}
	  System.out.println(Arrays.toString(res));
	
	return null;
}
//12,345,2,6,7896
private int  findEven() {
	 int count=0,dig=0;
	 for (int i = 0; i < arr.length; i++) {
		 int v=arr[i];
		  while(v!=0) {
			  v=v/10;
			  dig++;
		  }
		  if(dig%2==0)  count++;
	}
	 
	return count;
}
//2,2,2,3,3
private int moveChip() {
	int even_cnt = 0;
    int odd_cnt = 0;
    for (int i : arr) {
        if (i % 2 == 0) {
            even_cnt++;
        } else {
            odd_cnt++;
        }
    }
    return Math.min(odd_cnt, even_cnt);
}
//1,2,3,4
private int stopDestination() {
	int start=1,destination=3;
	int clock = 0;
    int counterclock = 0;
    for(int i =0;i<arr.length;i++){
        if(i>=start&&i<destination || i<start&&i>=destination) 
        	clock+=arr[i];
        else counterclock+=arr[i];
    }
    return Math.min(clock,counterclock);
}
//1,2,2,1,1,3
private boolean uniqueOccrnace() {
	int count=1,ans=0;
	for (int i = 0; i < arr.length; i++) {
		  count=1;
		   for (int j = i+1; j < arr.length; j++) {
			  if(arr[i]==arr[j]) {
				  count++;
				  arr[j]=-1;
			  }
		}
		   if(ans!=count) {
			    ans=count;
		  }
		  else return false;
	}
	
 	return true;
}
//1,2,34,3,4,5,7,23,12
private boolean consecutiveOdds() {

	   for (int i = 0; i < arr.length-2; i++) {
		    if((arr[i]%2==1) && (arr[i+1]%2==1) && (arr[i+2]%2==1)){
		    	return true;
		    }}
	
	return false;
}
 

//1,1,2,3
private String frqvalue() {
	
	  int  res[]=new int[arr.length];
	  int k=0,j=0;;
	  for (int i = 0; i < res.length; i+=2) {
		  k=0;
		  int freq=arr[i];
		  int val=arr[i+1];
		 while(k<freq) {
			 res[j++]=val;
			 k++;
		 }
	}
	  System.out.println(Arrays.toString(res));
	
	 	return null;
}


private boolean findPartion() {
	
	int sum=Arrays.stream(arr).sum();
	if(sum%3!=0) return false;
	
	int each=sum/3;
	int temp=0,count=0;
	
	for (int i = 0; i < arr.length; i++) {
		  temp+=arr[i];
		  if(temp==each) {
			  temp=0;
			  count++;
		  }
	}
	
	  return (count==each)?true:false; 
	 
}
//1,2,0,0
private String addInteger(int k) {
	
	 final LinkedList<Integer> result = new LinkedList<>();
	    int len = arr.length - 1;
	    
	    while(len >= 0 || k != 0){
	        
	        if(len >= 0){
	            k += arr[len];
				len--;
	        }
	        
	        result.addFirst(k % 10);
	        k /= 10;
	    }
	        
	    System.out.println(result);
		return null;
	 
}
//0,3,2,1
private boolean checkMountain() {
	int r=0,l=0;
	 int max=Arrays.stream(arr).max().getAsInt();
	 for (int i = 0; i < arr.length/2; i++) {
		 if(arr[max]<arr[max-1]) return false;
		 
		 if(arr[max]<arr[max+1]) return false;
	}
	
 	return true;
}
//1,3,6
 private int smallrange(int k) {
	 int sum=0;
	 int[] temp=new int[arr.length];
	 for (int i = 0; i < arr.length; i++) {
		 sum=0;
		  if(arr[i]<k) {
			  sum=sum+(arr[i]+k);
			  temp[i]=Math.abs(sum);
		  }
		  else if(arr[i]==k) {
			  sum=sum+(k+1);
			  temp[i]=Math.abs(sum);
		  }
		  else {
			  sum= sum+(arr[i]-k);
			  temp[i]=Math.abs(sum);
		  }
			    
	}
	 int max = Arrays.stream(temp).max().getAsInt();
	 int min =Arrays.stream(temp).min().getAsInt();
	 
	 sum=max-min;
	 
 	return sum;
}
//5,5,5,10,10,30
private boolean currntChange() {
	int five = 0, ten = 0;
    for (int i : arr) {
        if (i == 5) five++;
        else if (i == 10) {five--; ten++;}
        else if (ten > 0) {ten--; five--;}
        else five -= 3;
        if (five < 0) return false;
    }
    return true;
}

//1,2,3
private String shiftString() {
	
	String s="abc";
	StringBuilder ans = new StringBuilder(s);
    long shift=0;
    for (int i = s.length()-1; i >=0 ; i--){
        ans.setCharAt(i, (char)((s.charAt(i) - 'a' + (shift+ arr[i]) % 26) % 26 + 'a'));
        shift+= arr[i];
    }
    return ans.toString();
	 
}


//1,2,3,6,2,3,4,7,8
private boolean cardArrangement(int W) {
   
        PriorityQueue<Integer> Que = new PriorityQueue<>();
         
		for(int i : arr){
            Que.add(i);
        }
	
        while(Que.size() != 0) {
        	 
            int start = Que.poll();
            
            for(int j = 1; j < W; j++){
            	  boolean u=Que.remove(start+j);
            	   
                if(u) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    

}
//2,1,4,7,3,2,5
private int longestMounntain() {
	
	   int count =0;
	   int max;
	   int maxIndex = 0;
	   int right=maxIndex;
	   int m=0;
	   for (int i = 0; i < arr.length; i++) {
		    
		   if(m<arr[i]) {
			   m=arr[i];
			   maxIndex=i;
		   }		   
	}
	    int flag=0;
	    right=maxIndex;
	    int j=0;
	    try {
	  while(j<arr.length/2) {
		   
		   if(arr[maxIndex]>arr[maxIndex-1]) {
			   count++;
			   maxIndex--;
			   flag=1;
		   }
	
		   if(arr[right]>arr[right+1]) {
			   count++;
			   right++;
		   }
		   j++;
	}
	  if(flag!=0) count++;
	    }catch(Exception e) {}
	//  System.out.println(count);
	
	
	return count;
}
//9,1,2,3,9
private double largSumAvg(int l) {
	  
	        int N = arr.length;
	        double[] P = new double[N+1];
	        for (int i = 0; i < N; ++i) {
	        System.out.println(P[i]);
	            P[i+1] = P[i] + arr[i];
	        }
	        double[] dp = new double[N];
	        for (int i = 0; i < N; ++i)
	            dp[i] = (P[N] - P[i]) / (N - i);

	        for (int k = 0; k < l-1; ++k)
	            for (int i = 0; i < N; ++i)
	                for (int j = i+1; j < N; ++j)
	                    dp[i] = Math.max(dp[i], (P[j]-P[i]) / (j-i) + dp[j]);

	        return dp[0];
	    
	 
}
//1,100,1,1,1,100,1,1,100,1
private int stairsClimp() {
	int i = arr.length - 3;

    while (i >= 0) {
    	arr[i] += Math.min(arr[i+1], arr[i--+2]);
    	System.out.println(arr[i]);
    }

    return Math.min(arr[0], arr[1]);
}
//2,2,3,3,3,4
private   int deleteEarn() { 
	int count=0;
	
	for (int i = 0; i < arr.length; i++) {
		  int dec=arr[i]-1;
		  int inc=arr[i]+1;
		  for (int j = 0; j < arr.length; j++) {
			    if(dec==arr[j] || inc==arr[j])
			    	  arr[j]=0;
		}
		  count=arr[i]+count;
	}
	
	
	
	return count;
  
}
//10,5,2,6
private int lessthanSubaArray(int k) {
	if(k<=1) return 0;
    int count=0;
    int left=0;
    int product=1;

    for (int i = 0; i < arr.length; i++) {
        product *= arr[i];
        while (product >=k){
            product /= arr[left++];
        }
        count += i-left+1;
        
    }
    return count;
	 
}
//4,6,8
public int subArray() {
	int count=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = i; j < arr.length; j++) {
			for (int k = i; k <= j; k++) {
				System.out.print(arr[k]+" ");
				 
			}
			count++;
			System.out.println();
		}
	}
	 
	
	
	return count;
}
	 
//1,7,3,6,5,6
private int pivotIndex() {
	int totalSum = 0;
    int sum = 0;
    int leftSum = 0;
    int rightSum = 0;
    for(int el : arr){
        totalSum += el;
    }
   
    for(int i=0; i<arr.length; i++){
        sum += arr[i];
       System.out.println("sum=="+sum);
        leftSum = sum - arr[i];
        System.out.println("leftsum=="+leftSum);
        rightSum = totalSum - sum;
        System.out.println("right=="+rightSum);
        if(leftSum == rightSum) return i;
        System.out.println("------------------------");
    }
    return -1;
}
	 

private int baseBallScore() {
	String str[]= {"5","-2","4","C","D","9","+","+"};
	 Stack s=new Stack();
	  int k=0;
	int max=0;
	for (int i = 0; i < str.length; i++) {
		 switch(str[i]) {
		 
		 
		 case "C" :   s.pop();
			 break;
			 
		 case "D" :   int p=(int) s.peek()*2;
		              s.push(p);             
				 break;
			 
		 case "+" :      int a = (int) s.pop();
                         int  b = (int) s.pop();
                         s.push(b);s.push(a);
                         s.push(a+b);
			 break;
			 
		 default:
			   int num=Integer.parseInt(str[i]);
			   s.push(num);
			 
		   
		 }
	 	 
	}
	   while(!s.isEmpty()) {
		    int v=(int) s.pop();
		    max=max+v;
	   }
 
	return max;
}
//4,2,3
private boolean nonDecresing() {
	   int c=1;
	   for (int i = 0; i < arr.length-1; i++) {
		  if(arr[i]>arr[i+1]) {
			 c++;
		  }
		 
	}
	   if(c==arr.length)  return false;
	
 	return true;
}
//1,2,2,4,4,6
private int[] dubandMissing() {
	
	for (int i = 0; i < arr.length-1; i++) {
		  if(arr[i]==arr[i+1]) {
			  arr[i+1]=arr[i]+1;
		  }
   
	}
	  display(arr);
	 
	return arr;
}
//1,0,0,0,1
private boolean placeFlowers(int n) {
	 
	   int count=0;
		          for(int i=0;i<arr.length;i++){
		              if(arr[i]>0)
		                    continue;
		              else if(0==arr[i]){
		                  count++;
		              }
		              
		              if(2==count){
		                 n--;
		                 count=0; 
		              } 
		              if(n==0) break;
		              
		          }
		        if(n==0) return true;
		        else return false;
}
//1,1,2,3
private int distributeCandies() {
	 int co=1;
	 int res=0;
	 int limit=arr.length/2;
	 for (int i = 0; i < arr.length; i++) {
		 co=0;
		   for (int j = i+1; j < arr.length; j++) {
			      if(arr[i]==arr[j])  co++;
		}
		  if(co==0) co++; 
		   System.out.println(co);
		   if(limit<=res) {
		    if(1<=co) res++;
		   }
	}
	 
	return co;
}

//23,2,4,6,7 
private boolean subArray(int sum) {
	    int res=0,ress=0;
	    int count=0;
      for (int i = 0; i < arr.length-1; i++) {
    	 
		    res=arr[i]+arr[i+1];
		    ress=arr[i]*arr[i+1];
		    
		    if(res==sum || ress==sum)  return true;
	}   
	
 	return false;
}

//10,3,8,9,4
private String[] realtiveRank() {
	 String[] res=new String[arr.length];
	List li=new ArrayList();
	 for (int i = 0; i < arr.length; i++) {
		   li.add(arr[i]);
	}
	 Collections.sort(li);
	 System.out.println(li);
	 String str[]=new String[arr.length];
	 for(int i=0;i<arr.length;i++) {
		 System.out.println(li.indexOf(arr[i]));
		 if(li.indexOf(arr[i])==arr.length-1)       res[i]="Gold medal";
		 else if(li.indexOf(arr[i])==arr.length-2)  res[i]="Silver" ;
		 else if(li.indexOf(arr[i])==arr.length-3)  res[i]="Bronze" ;
		 else 
			 res[i]=String.valueOf(arr.length-li.indexOf(arr[i]));
	 }
	 
	     for (int i = 0; i < str.length; i++) {
			 System.out.println(" ' "+res[i]+" '");
		}
		return res;
 
}
//1,0,1,1,0,1 
private int mostConsecutive() {
	int c=1;
	int dif=0;
	for (int i = 0; i < arr.length-1; i++) {
		 if(arr[i]==arr[i+1])  c++;
		 
		 else { 
			 c=1;
			 continue;
		 }
		 if(dif<c) dif=c;
	 
	}       
 	return dif;
}

//1,2,3 
private int  minimumMove() {
  
	int ans=0;
	int min=Integer.MAX_VALUE;
	for(int i:arr) {
		if(min>i) {
			min=i;
		}
	}
	System.out.println(min);
	for (int i : arr) {
		ans+=(i-min);
		System.out.println(ans);
	}
	
	
	return ans;
}

//4,3,2,6
private int rotateSumMax() {
    int sum=0,res = 0;
    for (int i = 0; i < arr.length; i++) {
    	int last=arr[arr.length-1];
    	 sum=0;
		 for (int j = 0; j < arr.length; j++) {
			   sum=sum+arr[j]*j;   
		}
		 
		 if(res<sum)   res=sum;
		 
		 for (int k = arr.length-1; k >0; k--) {
			     arr[k]=arr[k-1];
		}
		 arr[0]=last;
 
		 
	}
	
	return res;
}
//2,1,5,0,4,6
private boolean findTriplet() {
	int c=1;
	for (int i = 0; i < arr.length; i++) {
		 if(arr[i]<arr[i+1] && arr[i+1]<arr[i+2]) {
			 return true;
		 }  
	}
	 
 	return false;
}

//first elemeti=um second elemtum copare pannna first minusum secodum plusum erukanum[-,+,-,+]
//1,7,4,9,2,5
private int wiggleSequent() {
	  int count=0;
	  int flag=0;
	      for (int i = 1; i < arr.length; i++) {
			  int sum=arr[i]-arr[i-1];
			 
			  if(0<sum && flag==0) {
				  count++;
				  flag=1;
			  }
			  if(sum<0 && flag==1) {
				  count++;
			     flag=0;
			  }
		}
       
 	return count;
}

//10,9,2,5,3,7,18
private int longsubSequnce() {
	 int count=0,sum=0;;
	 for (int i = 0; i < arr.length; i++) {
		       count=0;
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]<arr[j]) {
				count++;
			}
		}
		     if(sum<count)  sum=count;
	}
	 
	return (count==0)?1:sum;
}
//2,1,0,5,0,3,0
private int[] moveZeros() {
	int n=0;
	  for (int i = 0; i < arr.length; i++) {
		      if(arr[i]!=0) {
		    	  arr[n++]=arr[i];
		      }
	}
	  while(n<arr.length) {
		  arr[n++]=0;
	  }
	  
	  display(arr);
	 return arr;	
}
//2,3,1,2,4,3
private int minimumSubArray(int target) {
       int ans =Integer.MAX_VALUE;
       int n=arr.length; 
       for (int i = 0; i < n; i++) {
		  for (int j = i; j < n; j++) {
			  int sum=0;
			  for (int k = i; k <=j; k++) {
				 sum+=arr[k];
				 System.out.print(arr[k]);
				 
			}
			  System.out.println();
			  if(sum>=target) {
				  ans=Math.min(ans, (j-i+1));
				  break;
			  }
			  
			
		}
	}
       return (ans!=Integer.MAX_VALUE)? ans : 0;
	
	
}
private int countPrime(int prime) {
	 int count=0;
	 for (int i = 2; i <= prime; i++) {
		 int temp=0;
		 for (int j = 2; j <=i-1; j++) {
			  if(i%j==0) {
				  temp++;
				  break;
			  }
		}
		 if(temp==0)  count++;
		 else temp=0;
		
	}
return count;
}
//1,2,1,3,5,7,5
private int peakElement() {
	 int max = 0;
	for (int i = 0; i < arr.length-1; i++) {
		   if(arr[i]<arr[i+1]) max=arr[i+1];
	}
	
	return max;
}
//1,2,1,3,5
private boolean containsDub() {
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j]) 
			{
				return true;
			}
		}
	}
	 
	return false;
}
//1,2,3,4,5,6,7
private void rotateArray(int rot) {
	 for (int i = 0; i < rot; i++) {
		 int last=arr[arr.length-1];
		   for (int j = arr.length-1; j >0; j--) {
			    arr[j]=arr[j-1];
		}
		   arr[0]=last;
	}
	display(arr);
	       	
}
//2,7,11,15
 private void sumindes(int tar) {
 	int sum=0;
 	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			   sum=arr[i]+arr[j];
			   if(sum==tar) {
				   System.out.println((i+1)+" "+(j+1));
			   }
		}
	}
	 
	 
}
//1,9,3,6
private int  maximumGap() {
	
	int max=0;
	int dif;
	if(arr.length>=2) {
		
	
	Arrays.sort(arr);
	for (int i = 0; i < arr.length-1; i++) {
		   dif=Math.abs(arr[i]-arr[i+1]);
		   if(max<dif)   max=dif;
	}
	}
	else {
		System.out.println("Sry your input less than two");
	}
	
 	return max;
}

//20,10,25,30,40
 private void deleteSmaller(int ind) {
 	    int k=ind;
 	    int i = 0;
 	    int n=arr.length;
 	    try {
	for ( i = 0; i < arr.length; i++) {      //wrong output
		if(arr[i]<=arr[ind]) {
			arr[i]=arr[k++];
			 
		}
	    
	}
 	    }catch(Exception e) {}
 		arr=Arrays.copyOfRange(arr, 0,i);
 	    display(arr);
	 	 
}
//4,5,2,25
  private void nextGraterElemmet() {
	  
 	int next;
 	for (int i = 0; i < arr.length; i++) {
		next=-1;
		for (int j = i+1; j < arr.length; j++) {
			    if(arr[i]<arr[j]) {
			     next=arr[j];
			    	break;
			    }
			    
		}
		System.out.println(arr[i]+" << "+next);
	}
 	
}

int[] delete(int del) {
	  int n=arr.length;
	   int i;
	   for(i=0;i<arr.length;i++) {
		   if(arr[i]==del) {
			   break;
		   }
	   }
	   
	   if(i<n) {
		   n=n-1;
		   for (int j = i; j < n; j++) {
			  arr[j]=arr[j+1];
		}
	   }
	  display(arr,n);
	  return  arr;
  }
 
private int[] reverse() {
	     int temp[]=new int[arr.length];
	     int size=0;
	   for (int i = arr.length-1; i >=0; i--) {
		      temp[size++]=arr[i];
	}
	   display(temp,size);
	return arr;
}
//9,8,2,5,7,1
private int minimumValue(int k) {
	int min=0,index=0;
	for (int i = 1; i <= k; i++) {
		min =arr[0];
		for (int j = 0; j < arr.length; j++) {
			if(min>arr[j]) {
			       min=arr[j];
			       index=j;
			}
		}
		arr[index]=Integer.MAX_VALUE;
	}
			
	return min;
}
//9,8,2,5,7,1
private int largestElemet(int k) {
	 int max = 0,index=0;
	 for (int i = 1; i <= k; i++) {
		 max=arr[0];
		 
		 for (int j = 0; j < arr.length; j++) {
			if(max<arr[j]) {
				max=arr[j];
				index=j;
			}
			 
		}
		 arr[index]=-1;
		  
	}
	
 	return max;
}
//1,2,2,3,3,4,1
private void originalCount() {
	  boolean[] temp=new boolean[arr.length];
      int count=1;
      Arrays.fill(temp,false);
     for (int i = 0; i < temp.length; i++) {
    	     if(temp[i]==true) {
    	    	 continue;
    	     }
    	     count=1;
    	     for (int j = i+1; j < arr.length; j++) {
				    if(arr[i]==arr[j]) {
				    	count++;
				    	temp[j]=true;
				    }
			}
    	     System.out.println(arr[i]+"=="+count);  	    
	}	
}

//-2,1,-3,4,-1,2,1,-5,4
private int largestSum() {
	
	int cursum=arr[0];
	int maxsum=arr[0];
	for (int i = 0; i < arr.length; i++) {
		   if(cursum>0)   cursum+=arr[i];
		   else cursum=arr[i];
		   
		   if(cursum>maxsum)   maxsum=cursum;
	}
			
	
 	return maxsum;
}
//10,6,7,8,4
private int firstMissingPos() {
    HashSet set=new HashSet();
    int co=1;
    for (int i = 0; i < arr.length; i++) {
		set.add(arr[i]);
	}
    for (int i = 0; i < arr.length; i++) {
		if(set.contains(co))
			co++;
		else return co;
	}
	return co;
	
}
//4,1,0,3,10
private int[] squreDecrsing() {
	    int sq;
	    int temp[]=new int[arr.length];
	    for (int i = 0; i < arr.length; i++) {
			  sq=arr[i]*arr[i];
			  temp[i]=sq;
		}
	    for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length-1; j++) {
				if(temp[j]>temp[j+1]) {
					int swap=temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=swap;
			}
		      
		}
	    }
	    display(temp);
	return temp;
	
}
//1,2,3,4
private int[] evenFirst() {
	
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1; j < arr.length; j++) {
			
	      if(arr[i]%2==0) {
	    	  int swap=arr[i];
	    	  arr[i]=arr[j];
	    	  arr[j]=swap;
	      }
		}
	      
	}
	display(arr);
	
 	return null;
}
//1228+12=1240
private void addArraytoInt(int add) {
	int sum=0,car,rem=0,me=0;
	int temp[]=new int[arr.length];
 	     for (int i = arr.length-1; i >=0; i--) {
 	    	    sum=0;
 	    	   car =add%10;
			   sum=arr[i]+car+me;
			   rem=sum%10;
			   me=sum/10;
			   temp[i]=rem;
			   add=add/10;
			   
		}
 	     display(temp);
}
//1,2,2,4
private int[] misMatch() {
	int size=0;
	int temp[]=new int[arr.length];
	try {
	  for (int i = 0; i < arr.length; i++) {
		  if(arr[i]==arr[i+1]) {
		   int k=arr[i]+1;
		    temp[size++]=arr[i];
		    temp[size++]=k;
	}
	  }
	}catch(Exception e) {}
	  display(temp,size);
 	return temp;
}
private int findMaxAvg(int k) {
	  int sum=0;
	  for (int i = 0; i < k; i++) {
		   sum+=arr[i];
	}
 	int avg=sum/k;
 	int j=k;
 	for (int i = 0; i < arr.length-k; i++) {
		   sum+=arr[j]-arr[i];
		   int a=sum/k;
		   avg=Math.max(a, avg);
		   j++;
	}
 	return avg;
}
//1,3,4,5,2,8,9
  private int thirddMaxi() {
	  if(arr.length<3) {
		  return -1;
	  }
	  int fir=arr[0];
	  int sec=Integer.MIN_VALUE,thrd=Integer.MIN_VALUE;
	   for (int i = 1; i < arr.length; i++) {
		     if(arr[i]>fir) {
		    	  thrd=sec;
		    	  sec=fir;
		    	  fir=arr[i];
		     }
		     else if(arr[i]>sec){
		    	 thrd=sec;
		    	 sec=arr[i];
		     }
		     else if(arr[i]>thrd) {
		    	 thrd=arr[i];
		     }
	   }
	   return thrd;
  }
	               
	 
 private int[] oddTwoArrays() {
       int fir[]= {1,2,3,9};
       int sec[]= {4,5,3};
       int f=fir.length;
       int s=sec.length;
        if(f>=s) {
        	return calSum(f,s,fir,sec);
        }
        else return calSum(s,f,fir,sec);
         
}

private int[] calSum(int f, int s, int[] fir, int[] sec) {
	
	int t[]=new int[f];
	int i=f-1,j=s-1,k=f-1;
	int car=0,res=0,rem=0;
	while(j>=0) {
		res=fir[i]+sec[j]+rem;
		System.out.println("res "+res);
		car=res;
		if(9<res) {
			car=res%10;
		}
		rem=res/10;
		System.out.print("rem "+rem);
		t[i]=car;
		j--;
		i--;
		
	}
	 
	display(t);
	while(i>0) {
		
		res=fir[i]+rem;
		System.out.println("reeee"+res);
		car=res;
		if(9<res) {
			car=res%10;
		}
		rem=res/10;
		t[i]=car;
		
	}
	
	display(t);
 	return t;
}

int[] addOne() {
	 int n=arr.length;
	 for (int i = n-1; i>=0; i--) {
		      if(arr[i]<9) {
		    	  arr[i]++;
		    	  
		    	  return arr;
		      }
		      arr[i]=0;
		    
	}
	  int[] temp=new int[n+1];
	   temp[0]=1;
	    
	   return temp;	
	 
	 
 }
 //1,2,3,4,5
private void closesetSum(int x) {
	 
	int resl=0,resr=0;
	int l=0,r=arr.length-1;
	int dif=Integer.MAX_VALUE;
	while(r>l) {
		   int n=Math.abs(arr[l]+arr[r]-x);
		   System.out.println(n);
		if(n<dif){
			resl=l;
			resr=r;
			dif=Math.abs(arr[l]+arr[r]-x); 
			System.out.println("dif="+dif);
		}		
		if(arr[l]+arr[r]>x) {
			r--;
		}
		else l++;	
	}
	System.out.println("The  closest pair=="+arr[resl]+" "+arr[resr]); 
}
//1,2,4,5,8
private int rebeatandMissing() {
	
	 int dif=arr[0]-0;
	 for (int i = 0; i < arr.length; i++) {
		 System.out.println(dif+"dd");
		if(arr[i]-i!=dif) {
			while(dif<arr[i]-i) {
				System.out.println((i+dif)+" ");
				dif++;
			}
		}
	}
	 
	 
	return -1;
}
//8,16,9,4,2
private int[] squreRoot() {
	 int temp[]=new int[arr.length];
	 int i,res;
	 
	 for (int j = 0; j < temp.length; j++) {
		 i=1;res=1;
	   while(res<=arr[j]) {
		   i++;
		   res=i*i;   
	   }
	   temp[j]=i-1;
	 }
	 //display(temp);  
 	return arr;
}
//2,1,3,2,3
private int findSingle() {
	
	  int count=0;
	  for (int i = 0; i < arr.length; i++) {
		  count=0;
		for (int j = 0; j < arr.length; j++) {
		    if(arr[i]==arr[j])	{
		    	  count++;
		    }
		    
		} 
		if(count<=1) {
	    	return arr[i];
	    }
	}
 	return 0;
}
//2,4,7,8,9,10
private int[] twoReverse() {
	
	   int i=0,j=2;
	   while(i<=arr.length-2) {
		   int swap=arr[i];
		   arr[i]=arr[i+1];
		   arr[i+1]=swap;
		   i=i+2;
		   
	   }
	display(arr);
	
 	return arr;
}
//1,2,1,2,1,1,2
 private int majorityElement() {
	    int count=1,sum=1;
	    int maj=0;
	         for (int i = 0; i < arr.length; i++) {
	        	 count=0;
				for (int j = 0; j < arr.length; j++) {
					if(arr[i]==arr[j]) {
						count++;
					}
				}
				if(count>sum) {
					sum=count;
					maj=arr[i];
				}	 
			}
 	return maj;
}
private boolean subset() {
	 int arr2[]={1,2,3};
	 int k=0;
	 int j;
	 for (int i = 0; i < arr.length; i++) {
		         
		    for (j = 0; j < arr2.length; j++) {
 				if(arr[i]==arr2[j]){
 					arr2[j]=0;
					k++;
		            break;
				}	
			}
	}
	 if(k==arr2.length)  return true;

 	return false;
}
//1,2,1,3,5,6,7,8    //doubt o(n) run panna vaikanum
private int[] groupResverse(int index) {
	int  temp[]=new int[arr.length];
	int k=0,i=index-1,j=0;
	int sum=arr.length-index;
	try {
	 while(i>=j) {
		 temp[k++]=arr[i];
		 i--;
	 }
	      i=arr.length-1;
	      while(i>j) {
	    	  temp[k++]=arr[i];
	    	  i--;
	      }
}catch(Exception e) {}
	display(temp,k);
 	return temp;
}

//5,3,7,1,2,9
private int minimumDiffer(int difer) {
	  int temp[]=new int[arr.length];
	  int low=0,high=0;
	  int sum=0;
	for (int i = 0; i < arr.length; i++) {
		  
		if(difer<arr[i]){
			temp[i]=arr[i]-difer;
		}
		else {
			temp[i]=arr[i]+difer;

		}}
		low=temp[0];
		high=temp[arr.length-1];
		try {
		 for (int l = 0; l < temp.length; l++) {
		 
			    if(low>temp[l+1]) {
			    	low=temp[l+1];
			    }
			    
			     if(high<temp[l+1]) {
			    	 high=temp[l+1];
			     }
			    
		}}
		catch(Exception e) {}
		 sum=high-low;
 	return sum;
}
//5,3,7,1,2,9
private boolean tripletSum(int sum) {
	       
	for (int i = 0; i < arr.length-2; i++) {
		
	 for (int j = i+1; j <arr.length-1; j++) {
		 
		      for (int k = j+1; k < arr.length; k++) {
		    	  
		    	  if(arr[i]+arr[j]+arr[k]==sum) {
		    		  System.out.print("TRiplet is=="+arr[i]+" "+arr[j]+" "+arr[k]);
		    		  return true;
		    	  }
				
			}  
		}
		 
	}
	return false;
	
}
//5,3,7,1,2,9,4,6,0,-1
private int  findMinimum() {
	int min =arr[0];
 
	for (int i = 0; i < arr.length-1; i++) {
			if(min>arr[i+1]) {
				min=arr[i+1];
				
			}
		}
 	return min;
}
// thodarchiya yathana number eruku.....solving list
 private int consecutive() {
	 
	 int count=0;
	
	 for (int i = 0; i < arr.length; i++) {
		 int s=arr[i]+1;
		// System.out.println(s);
		 try {
	     for (int j = i+1; j < arr.length; j++) {
	    	 int  sum=0;
	    	 if(arr[i]<arr[j]) {
	    		 sum=arr[j]-1;
	    	 }
	    	// System.out.println("sum="+sum);
			if(arr[j]==s || s==sum) {
				count++;
				break;
			}
		}}catch(Exception e) {}
	}
 	return count;
}
//1,2,3,4,5
private int[] factorieal() {
       int temp[]=new int[arr.length];
       for (int i = 0; i < temp.length; i++) {
		    int sum=1,k=1;
		        while(k<=arr[i]) {
		        	sum=k*sum;
		        	k++;
		        }
		      
		     temp[i]=sum;
	}
       display(temp);
       return temp;
       
}

private boolean sumZero(int i) {
	
	
	
 	return true;
}

//1,2,3,2,1
private int nonRebeat() {
	  
      for (int i = 0; i < arr.length; i++) {
    	  int count=0;
		    for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		    if(count<=0) {
		    	return arr[i];
		    }
	}
	return -1;
	   	
}
 
private int[] removedublicateSortedArray() {
     int temp[]=new int[arr.length];
     int k=0,l=0;
      
     for (int i = 0; i < temp.length-1; i++) {
    	  if(arr[i]!=arr[i+1]) {
    		  temp[k++]=arr[i];
		  }	  
	}
     temp[k++]=arr[arr.length-1];
     display(temp,k);
	return temp;
     
	
}
//1,5,7,1
private int countPair(int sum) {
       int count = 0;
   for (int i = 0; i < arr.length; i++) {
	   for (int j = i+1; j < arr.length; j++) {
           int res=arr[i]+arr[j];
           if(res==sum) {
        	   count++;
           }
}
   }	
	
	return count;
}
private int missingElement() {
	   int n=0;
	for (int i = 0; i < arr.length; i++) {
		n=arr[i]+1;
		 int f=0;
	    for (int j = 0; j < arr.length; j++) {
	     
		        if(arr[j]==n){
		        	 f=1;
		        	break;
		        }
	}
	  if(f==0) {
		  break;
     
	  }  
	}
	return n;
		    	     
}
private int[] moveNegative() {
      int arrs[]=new int[arr.length];
      int l=arr.length,j=0;
      for (int i = 0; i < arr.length; i++) {
		if(arr[i]>=0) {
			    arrs[j++]=arr[i];
			    
		}
      }
		for (int k = 0; k < arrs.length; k++) {
		     if(arr[k]<0) {
		    	 arrs[j++]=arr[k];
		     }
		
	}
	return arrs;
}
private void findSum(int sum) {
     int arr[]=this.arr;
	 int cursum;
	 int flag=1;
	 for (int i = 0; i < arr.length; i++) {
		     cursum=arr[i];
		     for (int j = i+1; j < arr.length; j++) {
				if(cursum==sum) {
					 flag=0;
					int p=j-1;
					System.out.println("sum of array positon index="+i +" to "+p);
					break;
				}
				if(cursum>sum) {
					break;
				}
				cursum=cursum+arr[j];
		} 
	 }
	 if(flag==1)   System.out.println("sry given sum is not");
}
void display(int arrs[]) {
	for (int i = 0; i < arrs.length; i++) {
		System.out.print(arrs[i]+" ");
	}
}
private int smallElement(int i) {
	   int arrs[]=this.arr;
	   Arrays.sort(arr);
	   int find=arr[i-1];
	   
	return find;
}


// [1,2,3,4,5,6,8,9]
private void printPrime() {
	  int[] temp=new int[arr.length];
	  int k=0;
	          for (int i = 0; i < arr.length; i++) {
				   if(check(arr[i]))
					   temp[k++]=arr[i];
			}
	          display(temp,k);
}

private boolean check(int n) {
	// TODO Auto-generated method stub
	 int i,m=0;
	 m=n/2;
	// System.out.println("m=="+m);
	 if(n==0 || n==1) {
		return false;
	 }
	 else {
		 for ( i = 2; i <=m; i++) {
			 if(n%i==0)
			 {
				return false;
			 }
		 }
			
		}
	return true;
	 }


private int countOccurent(int i) {
	      int arr[]=this.arr;
	      int count=0;
	       for (int j =0;j<arr.length;j++) {
			      if(arr[j]==5) count++;
		}
	
	return count;
}
private  int summArray() {
	     int arr[]=this.arr;
	     int sum=0;
	     for (int i = 0; i < arr.length; i++) {
			  sum=sum+arr[i];
		}
	return sum;
}
private void display(int arrs[],int len) {
       for (int i = 0; i < len; i++) {
		  System.out.print(arrs[i]+" ");
	}
	
}

private void separate() {
 	int arr[]=this.arr;
 	System.out.print("positive==");
 	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>0)  System.out.print(arr[i]);
	}
 	System.out.print("\nNegative==");
 	for (int i = 0; i < arr.length; i++) {
		if(arr[i]<0)  System.out.print(arr[i]);
	}
 	System.out.print("\nzeros==");
 	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==0) System.out.print(arr[i]);
	}
}
//arraya ulla valuesoda count soldrthu
     private void countFrequncy() {
    int arr[]=this.arr;
     for (int i = 0; i < arr.length; i++) {           //iterrate num to num
	  int count=1;                                 //counting
	  if(arr[i]!=0) {                              //arryala zero ellana mattum ulla varanum
	    for (int j = i+1; j < arr.length; j++) {   //next elemeta check pandrathu

         if(arr[i]==arr[j]) {
  	    count++;
  	    arr[j]=0;                               //vantha elementa vantha athula zerova add 
  	                                            //panndrathu
     }
}
	  }
	  if(arr[i]!=0)
      System.out.println(arr[i]+"=="+count);
}      
}
}

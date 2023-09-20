package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Lederboard {
	 public static void main(String[] args) {
		  
		 int arr[] = {100,100, 50, 40, 40, 20, 10};
		 int ne[] = {6,25,50,150};
		 ArrayList<Integer> brd = new ArrayList<>();
		 ArrayList<Integer> player = new ArrayList<>();
		 ArrayList<Integer> rank = new ArrayList<>();
		 HashMap<Integer, Integer> res = new HashMap<>();
		 for (int i = 0; i < arr.length; i++) {
			  brd.add(arr[i]);		  
		}
		 for (int i = 0; i < ne.length; i++) {
			  player.add(ne[i]);
		}
		 int rk =1;
		 for(int i =0; i<brd.size();i++) {
			 if(!res.containsKey(brd.get(i))) {
				 res.put(brd.get(i),rk++);
			 }
		 }
		 System.out.println(res);
		 int init = brd.size()-1;
		 for (int score : player) {
			 for(int i = init; i>=0; i--) {
				 if(score >= brd.get(i)) {
					 rk = res.get(brd.get(i));
					 init = i-1;
				 }
				 else {
					 break;
					 
				 }
			 }
			 rank.add(rk);
		}
		 System.out.println(rank);
	}
}  





 

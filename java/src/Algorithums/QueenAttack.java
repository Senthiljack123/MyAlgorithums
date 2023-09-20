package Algorithums;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class QueenAttack {
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "-" + obstacle[1]);
        }
        
        
        int count = 0;
        
        // Define 8 possible directions a queen can attack
        int[][] directions = {
            {-1, 0}, {-1, 1}, {0, 1}, {1, 1},
            {1, 0}, {1, -1}, {0, -1}, {-1, -1}
        };
        
        for (int[] dir : directions) {
            int r = r_q + dir[0];
            int c = c_q + dir[1];
            
            while (r >= 1 && r <= n && c >= 1 && c <= n) {
                if (obstacleSet.contains(r + "-" + c)) {
                    break;
                }
                count++;
                r += dir[0];
                c += dir[1];
            }
        }
        
        return count;
    }

    public static void main(String[] args) { 
        int n = 5;
        int k = 3;
        int r_q = 4;
        int c_q = 3;
        
        int[][] obstacles = {{5,5},{4,2},{2,3}};
         
        int result = queensAttack(n, k, r_q, c_q, obstacles);
        System.out.println(result);
     

}
}

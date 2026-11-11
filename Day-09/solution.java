/**
 * Problem: Day 9 - Integer Square Root
 * Domain: DSA Placement (EASY)
 * Input: One integer x.
 * Output: Print floor(sqrt(x)).
 * Constraints: 0 <= x <= 2^31 - 1
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();

        int low = 0;
        int high = x;
        int ans = 0;

        while (low<= high){
            int mid = low +(high - low) /2;

         if ((long) mid * mid <= x){
            ans =mid;
            low = mid + 1;
         }else {
            high = mid-1;
         }   
        }
        System.out.println(ans);
        sc.close();
    }
}

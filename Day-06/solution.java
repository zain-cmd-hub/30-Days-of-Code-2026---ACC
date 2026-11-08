/**
 * Problem: Day 6 - Contains Duplicate II
 * Domain: DSA Placement (EASY)
 * Input: Line 1: n and k. Line 2: n integers.
 * Output: Print YES or NO.
 * Constraints: 1 <= n <= 100000; 0 <= k <= 10^9; -10^9 <= a[i] <= 10^9.
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k  = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();
        boolean found = false;

        for(int i = 0; i<n;i++){
            int x = sc.nextInt();
            if (map.containsKey(x) && i - map.get(x) <= k){
                found =true;
            }
            map.put(x, i);
        }

        System.out.println(found ? "YES" : "NO");
        
        sc.close();
    }
}

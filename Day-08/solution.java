/**
 * Problem: Day 8 - Search Insert Position
 * Domain: DSA Placement (EASY)
 * Input: Line 1: n and the target. Line 2: n sorted integers.
 * Output: Print the index.
 * Constraints: 1 <= n <= 100000; -10^9 <= a[i], target <= 10^9; values are distinct and sorted strictly increasingly.
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        int i = 0;

        while (i<n && arr [i] < target){
            i++;
        }
        
        System.out.println(i);
        sc.close();
    }
}

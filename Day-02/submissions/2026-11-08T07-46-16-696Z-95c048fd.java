/**
 * Problem: Day 2 - Squares of a Sorted Array
 * Domain: DSA Placement (EASY)
 * Input: Line 1: n. Line 2: n space-separated integers.
 * Output: Print the resulting array on one line, with the numbers separated by single spaces.
 * Constraints: 1 <= n <= 10000; -10000 <= a[i] <= 10000; the input array is sorted in nondecreasing order.
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     int n =sc.nextInt();
     int[] arr = new int[n];

     for(int i=0;i<n; i++){
        arr[i] = sc.nextInt();
     }

     for(int i =0; i< n; i++){
        arr[i] = arr[i]*arr[i];
     }
     Arrays.sort(arr);

     for(int i =0; i<n; i++){
        System.out.print(arr[i]);
        if (i < n-1) {
          System.out.print(" ");
        } 
     }
        
        sc.close();
    }
}

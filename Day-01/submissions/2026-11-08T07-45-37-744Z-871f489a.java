/**
 * Problem: Day 1 - Sort an Array
 * Domain: DSA Placement (EASY)
 * Input: Line 1: n. Line 2: n space-separated integers.
 * Output: Print the resulting array on one line, with the numbers separated by single spaces.
 * Constraints: 1 <= n <= 50000, -50000 <= a[i] <= 50000
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        
        
        sc.close();
    }
}

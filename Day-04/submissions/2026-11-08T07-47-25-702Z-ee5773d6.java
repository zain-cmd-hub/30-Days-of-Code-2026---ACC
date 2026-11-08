/**
 * Problem: Day 4 - Merge Two Sorted Lists
 * Domain: DSA Placement (EASY)
 * Input: Line 1: n. Line 2: n values (blank if n=0). Line 3: m. Line 4: m values (blank if m=0).
 * Output: The merged list.
 * Constraints: 0 <= n, m <= 50000; n + m >= 1; -10^9 <= node value <= 10^9; both input lists are nondecreasing.
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int n = sc.nextInt();
       int[] a = new int[n];
    
    for(int i = 0; i< n; i++){
        a[i] = sc.nextInt();
    }
    int m = sc.nextInt();
    int[] b = new int[m];

    for(int i =0; i<m; i++){
        b[i] = sc.nextInt();
    }
    int i =0, j=0;

    while(i<n && j<m){
        if(a[i] <=b[j]){
            System.out.print(a[i++] + " ");
        } else {
            System.out.print(b[j++]+ " ");
        }
    }
    while (i<n){
        System.out.print(a[i++]+ " ");
    }
    while(j<m){
        System.out.print(b[j++]+ " ");
    }
        sc.close();
    }
}

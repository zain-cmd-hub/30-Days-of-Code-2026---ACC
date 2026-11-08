/**
 * Problem: Day 3 - Middle of the Linked List
 * Domain: DSA Placement (EASY)
 * Input: Line 1: n, the number of nodes. Line 2: n space-separated integers (the list from head to tail).
 * Output: The values from the middle node to the tail.
 * Constraints: 1 <= n <= 100; -10^5 <= node value <= 10^5.
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();

        }

        for(int i = n/2; i<n ;i++){
            System.out.print(arr[i]+ " ");
        }
        
        sc.close();
    }
}

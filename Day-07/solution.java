/**
 * Problem: Day 7 - Range Sum Query
 * Domain: DSA Placement (EASY)
 * Input: Line 1: n and q. Line 2: n integers. Then q lines with l and r.
 * Output: One answer per query.
 * Constraints: 1 <= n, q <= 100000; -10^9 <= a[i] <= 10^9; 0 <= l <= r < n. Each sum fits signed 64-bit.
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int q = sc.nextInt();

        long[] prefix = new long[n+1];

        for (int i =1 ; i<=n; i++){
            prefix[i] = prefix[i - 1] + sc.nextLong();

        }

       StringBuilder sb = new StringBuilder();

        for (int i =0;i < q; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
        sb.append(prefix[r + 1] - prefix[l]).append('\n');
        }

          System.out.print(sb.toString());
        
        sc.close();
    }
}

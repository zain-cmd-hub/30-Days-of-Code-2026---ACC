/**
 * Problem: Day 10 - Remove All Adjacent Duplicates In String
 * Domain: DSA Placement (EASY)
 * Input: One string of lowercase letters.
 * Output: Print the resulting string on one line. If it is empty, print a single empty line (just a newline).
 * Constraints: 1 <= length <= 100000
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i =0; i< s.length(); i++){
            char ch = s.charAt(i);

            int n = sb.length();

            if (n > 0 && sb.charAt(n - 1) == ch){
                sb.deleteCharAt(n - 1);
                } else {
                    sb.append(ch);
            }
        }
        
        System.out.println(sb);

        sc.close();
    }
}

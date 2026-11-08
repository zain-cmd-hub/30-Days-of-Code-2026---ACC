/**
 * Problem: Day 5 - Valid Palindrome
 * Domain: DSA Placement (EASY)
 * Input: One line of text.
 * Output: Print YES or NO.
 * Constraints: 1 <= line length <= 200000; characters are ASCII letters, digits, spaces and punctuation.
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     String s = sc.nextLine().toLowerCase();
     String str = s.replaceAll("[^a-z0-9]","");
     String rev = new StringBuilder(str).reverse().toString();

     if(str.equals(rev)){
        System.out.println("YES");
     } else {
        System.out.println("NO");
     }
        
        sc.close();
    }
}

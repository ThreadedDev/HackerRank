import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = a[i];
            if (sum < 0)
                count++;
            for (int j = i + 1; j < n && i + 1 < n; j++) {
                sum += a[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}

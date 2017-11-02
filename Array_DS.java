import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = n-1; i >= 0 ; i--) {
            arr[i] = scanner.nextInt();
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]);
            if (j != n-1) {
                System.out.print(" ");
            }
        }
    }
}
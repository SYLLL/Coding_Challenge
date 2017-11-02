import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int[][] maze = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                int temp = calculate(i,j,maze);
                if (temp > max) {
                    max = temp;
                }
            }
        }
        System.out.print(max);
    }
    
    public static int calculate(int x, int y, int[][] maze) {
        return (maze[x][y] + maze[x-1][y] + maze[x-1][y-1] + maze[x-1][y+1] + maze[x+1][y] + maze[x+1][y-1] + maze[x+1][y+1]);
    }
}
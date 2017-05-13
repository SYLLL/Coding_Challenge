//String a is the shorter one, String b is the longer one
//If their lengths are different, whatever, return the longer one's length
//If their length are the same, if LCS is the size, return 0,
//                              if LCS <size, return size.
public class Solution {
    public int findLUSlength(String a, String b) {
        if (a == null || b == null) {
            return -1;
        } else if (a.length() == 0 && b.length() == 0) {
            return -1;
        } else if (a.length() != b.length()) {
            return a.length() > b.length() ? a.length() : b.length();
        } else {
            if (LCS(a,b) == a.length()) {
                return -1;
            } else {
                return a.length();
            }
            //if (a.equals(b)) {
            //    return -1;
            //} else {
            //    return a.length();
            //}
        }
    }
    
    //not needed
    //assuming the input is never gonna be null
    public int LCS(String a, String b) {
        int[][] table = new int[a.length()+1][b.length()+1];
        for (int i = 0; i < a.length()+1; i++) {
            for (int j = 0; j < b.length()+1; j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = 0;
                } else if (a.charAt(i-1) == b.charAt(j-1)) {
                    table[i][j] = table[i-1][j-1]+1;
                } else {
                    table[i][j] = Math.max(table[i][j-1], table[i-1][j]);
                }
            }
        }
        return table[a.length()][b.length()];
    }
}
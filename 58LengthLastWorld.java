public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        int i = s.length()-1;
        //locate to a place
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        if (i < 0) {
            return 0;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}
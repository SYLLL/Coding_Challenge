public class Solution {
    public static String minWindow(String s, String t) {
        if (s == null || s.length() == 0) {
            return "";
        }
        String temps = s.toUpperCase();
        t = t.toUpperCase();
        int[] primearray = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        int identifier = 1;
        for (int i = 0; i < t.length(); i++) {
            identifier *= primearray[t.charAt(i) - 'A'];
        }
        int left = 0;
        int right = 0;
        int curr = primearray[temps.charAt(0) - 'A'];
        int resleft = 0;
        int resright = 0;
        int min = temps.length();
        while (right < temps.length() && left <= right) {
            if (curr % identifier != 0) {
                if (right < temps.length() - 1) {
                    curr *= primearray[temps.charAt(right + 1) - 'A'];
                } else {
                    break;
                }
                right++;
            } else {
                // == 0
                if (right - left < min) {
                    min = right - left;
                    resleft = left;
                    resright = right;
                }
                curr = curr / primearray[temps.charAt(left) - 'A'];
                left++;
            }
        }
        if (min == s.length()) {
            return "";
        } else {
            return resright == s.length() - 1? s.substring(resleft) : s.substring(resleft, resright + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }
}
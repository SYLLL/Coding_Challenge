public class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            //non letter, non number
            if ((s.charAt(left)-'a' < 0 || s.charAt(left)-'a' > 25) && (s.charAt(left)-'A' < 0 || s.charAt(left)-'A' > 25) && (s.charAt(left) < 48 || s.charAt(left) > 57)) {
                left++;
                continue;
            }
            //non letter, non number
            if ((s.charAt(right)-'a' < 0 || s.charAt(right)-'a' > 25) && (s.charAt(right)-'A' < 0 || s.charAt(right)-'A' > 25) && (s.charAt(right) < 48 || s.charAt(right) > 57)) {
                right--;
                continue;
            }
            //left is number
            if ((s.charAt(left) >= 48 && s.charAt(left) <= 57) && (s.charAt(left) != s.charAt(right))) {
                return false;
            } else if (s.charAt(left)-'a' != s.charAt(right)-'a' && s.charAt(left)-'A' != s.charAt(right)-'a' && s.charAt(left)-'a' != s.charAt(right)-'A') {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
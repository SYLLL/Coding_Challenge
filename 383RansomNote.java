public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] test = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            test[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            test[magazine.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (test[i] > 0) {
                return false;
            }
        }
        return true;
    }
}
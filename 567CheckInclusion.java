public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }
        int j = 0;
        while (j < s2.length() - s1.length()) {
            if (checkSameArray(arr1, arr2)) {
                return true;
            }
            arr2[s2.charAt(j)-'a']--;
            arr2[s2.charAt(j+s1.length())-'a']++;
            j++;
        }
        return checkSameArray(arr1, arr2);
    }
    
    public boolean checkSameArray(int[] first, int[] second) {
        for (int i = 0; i < 26; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }
}
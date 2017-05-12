public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        if (strs[0].length() == 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        int i = 0;
        int last = strs.length-1;
        while(i<strs[0].length() && i<strs[last].length()) {
            if (strs[0].charAt(i) == strs[last].charAt(i)) {
                sb.append(strs[0].charAt(i));
            } else {
                return sb.toString();
            }
            i++;
        }
        return sb.toString();
    }
}
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        //key to value
        HashMap<Character, String> hmap = new HashMap<Character, String>();
        //value to key
        HashMap<String, Character> hmap2 = new HashMap<String, Character>();
        String[] splited = str.split(" ");
        //check length
        if (splited.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (!hmap.containsKey(pattern.charAt(i))) {
                hmap.put(pattern.charAt(i), splited[i]);
            } else {
                if (!hmap.get(pattern.charAt(i)).equals(splited[i])) {
                    return false;
                }
            }
            if (!hmap2.containsKey(splited[i])) {
                hmap2.put(splited[i], pattern.charAt(i));
            } else {
                if (hmap2.get(splited[i]) != pattern.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
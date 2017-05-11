public class Solution {
    public String countAndSay(int n) {
        if (n==0) {
            return "";
        }
        StringBuffer prev = new StringBuffer();
        prev.append(1);
        StringBuffer curr;
        Character pre = '0';
        int count = 0;
        for (int i = 1; i < n; i++) {
            //already covered one iteration
            curr = new StringBuffer();
            pre = '0';
            count = 0;
            for (int j = 0; j < prev.length(); j++) {
                if (prev.charAt(j) != pre) {
                    if (pre != '0') {
                        curr.append(count);
                        curr.append(pre);
                    }
                    count=0;
                    pre = prev.charAt(j);
                } 
                count++;
            }
            curr.append(count);
            curr.append(pre);
            prev = curr;
        }
        return prev.toString();
    }
}
public class Solution {
    public String countAndSay(int n) {
        StringBuffer sb = new StringBuffer();
        int prev = 0;
        int count = 0;
        int mod = 0;
        while (n!=0) {
            mod = n % 10;
            if (mod != prev) {
                if (prev == 0) {
                    prev = mod;
                } else {
                    sb.append(prev);
                    sb.append(count);
                    count = 0;
                    prev = mod;
                }
            } else {
                count++;
            }
            n = n / 10;
        }
        //final move
        if (prev != 0) {
            sb.append(prev);
        }
        sb.append(count);
        return sb.reverse().toString();
    }
    
    public int flip(int input) {
        if (input == 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
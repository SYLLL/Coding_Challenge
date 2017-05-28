//filter two numbers into two groups
public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ret = new int[2];
        int xor = 0;
        for (int n : nums) {
            xor ^= n;
        }
        int b = 1;
        while ((xor & b) == 0) {
            b = b << 1;
        }
        int num1 = 0;
        int num2 = 0;
        for (int n : nums) {
            if ((b & n) == 0) {
                num1 ^= n;
            } else {
                num2 ^= n;
            }
        }
        ret[0] = num1;
        ret[1] = num2;
        return ret;
    }
}
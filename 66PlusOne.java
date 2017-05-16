public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return digits;
        }
        int i = digits.length - 1;
        int carry = 1;
        int val = 0;
        while (carry != 0 && i >= 0) {
            val = digits[i] + carry;
            digits[i] = val % 10;
            carry = val / 10;
            i--;
        }
        //overflow
        if (i<0 && carry>0) {
            int[] newdigits = new int[digits.length+1];
            newdigits[0] = 1;
            for (int j = 1; j < newdigits.length; j++) {
                newdigits[j] = digits[j-1];
            }
            return newdigits;
        }
        return digits;
    }
}
public class Solution {
    //convert to arr first
    public int romanToInt(String s) {
        int ans = 0;
        int[] nums = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'M':
                    nums[i]=1000;
                    break;
                case 'D':
                    nums[i]=500;
                    break;
                case 'C':
                    nums[i]=100;
                    break;
                case 'L':
                    nums[i]=50;
                    break;
                case 'X' :
                    nums[i]=10;
                    break;
                case 'V':
                    nums[i]=5;
                    break;
                case 'I':
                    nums[i]=1;
                    break;
            }
            //calculate each digit
            if (i < s.length()-1 && nums[i] < nums[i+1]) {
                ans -= nums[i];
            }
            if (i < s.length()-1 && nums[i] >= nums[i+1]) {
                ans += nums[i];
            }
        }
        return ans+nums[nums.length-1];
    }
}
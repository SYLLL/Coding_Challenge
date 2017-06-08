public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (s == 0 || nums == null || nums.length == 0) {
            return 0;
        }
        int first = 0;
        int second = 0;
        int sum = nums[0];
        int min = nums.length + 1;
        while (first < nums.length && second <= first) {
            if (sum < s) {
                if (first == nums.length -1) {
                    //don't pay a look
                    break;
                }
                sum += nums[++first];
            } else {
                sum -= nums[second++];
                if (first - second + 2 < min) {
                    min = first - second + 2;
                }
            }
        }
        return min == nums.length+1? 0 : min;
        
    }
}
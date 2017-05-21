//The max subArray must end somewhere
//The max subArray ending at myself is either 
//composed of only me or me+max subArray ending
//at i-1 (if not max at i-1, can replace the part
//with my max)
public class Solution {
    public int maxSubArray(int[] nums) {
        int[] sums = new int[nums.length];
        //based on assumption sum has at least one element
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                sums[i] = sums[i-1] > 0 ? sums[i-1] + nums[i] : nums[i];
            } else {
                sums[i] = nums[i];
            }
            if (sums[i] > max) {
                max = sums[i];
            }
        }
        return max;
    }
}
//The max subArray must end somewhere
//The max subArray ending at myself is either 
//composed of only me or me+max subArray ending
//at i-1 (if not max at i-1, can replace the part
//with my max)
public class Solution {
    public int maxSubArray(int[] nums) {
        int[] sums = new int[nums.length];
        //based on assumption sum has at least one element
        int prev = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            prev = prev > 0? prev + nums[i] : nums[i];
            max = prev > max? prev : max;
        }
        return max;
    }
}
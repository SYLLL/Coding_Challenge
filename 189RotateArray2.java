public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) {
            return;
        }
        int[] ret = new int[nums.length];
        int j = 0;
        for (int i = k; i < k + nums.length; i++) {
            ret[i % nums.length] = nums[j++];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ret[i];
        }
    }
 
}
//two pointers
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        } else if (k == 0) {
            return true;
        } else if (k >= nums.length) {
            return false;
        } else {
            int left = 0;
            int right = k;
            while (right < nums.length) {
                if (nums[left] == nums[right]) {
                    return true;
                }
                left++;
                right++;
            }
            return false;
        }
    }
}
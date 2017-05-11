public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int fast = 0;
        int slow = 0;
        int temp = 0;
        int prev = nums[0]-1;
        while (fast < nums.length) {
            if (nums[fast] != prev) {
                //update prev when fast changes
                prev = nums[fast];
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
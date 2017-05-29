public class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                nums[fast] = fast == slow? nums[fast] : 0;
                slow++;
            }
            fast++;
        }
    }
}
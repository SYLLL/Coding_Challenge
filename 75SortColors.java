public class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int ind = sortK(nums, 0, 0);
        if (ind != -1) {
            sortK(nums, 1, ind);
        }
        return;
    }
    
    //move every k to the left
    private int sortK(int[] nums, int k, int start) {
        if (nums == null || nums.length == 0 || start >= nums.length) {
            return -1;
        }
        int fast = start;
        int slow = start;
        int temp;
        while (fast < nums.length) {
            if (nums[fast] == k) {
                temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
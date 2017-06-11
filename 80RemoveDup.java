public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0;
        int fast = 0;
        int prev = nums[0] - 1;
        //1 if there is already an element, 2 if already two elements
        int dupcount = 0;
        while (fast < nums.length) {
            if (prev == nums[fast]) {
                if (dupcount < 1) {
                    //put
                    dupcount++;
                    nums[slow++] = nums[fast];
                }
            } else {
                dupcount = 0;
                prev = nums[fast];
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }
}
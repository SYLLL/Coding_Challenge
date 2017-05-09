public class Solution {
    public int searchInsert(int[] nums, int target) {
        //use binary search to make the algo faster
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        low = low > nums.length-1? nums.length-1 : low;
        if (nums[low] < target) {
            return low+1;
        } else {
            return low;
        }
    }
}
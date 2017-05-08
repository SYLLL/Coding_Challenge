public class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low != high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > nums[low]) {
                if (target < nums[low]) {
                    low = mid + 1;
                } else if (target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] < nums[low]) {
                if (target < nums[mid]) {
                    high = mid - 1;
                } else if (target < nums[low]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                //nums[mid] == nums[low]
                low = mid + 1;
            }
        }
        
        return nums[low] == target? low : -1;
        
    }
}
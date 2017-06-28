public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hmap.containsKey(nums[i])) {
                hmap.put(nums[i],i);
            } else {
                if (Math.abs(hmap.get(nums[i]) - i) <= k) {
                    return true;
                }
                hmap.put(nums[i],i);
            }
        }
        return false;
    }
}
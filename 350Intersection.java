public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return (new int[0]);
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int[] ret = new int[nums1.length > nums2.length? nums1.length : nums2.length];
        int reallength = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                ret[reallength++] = nums1[i];
                i++;
                j++;
            }
        }
        //copy
        int[] realret = new int[reallength];
        for (int ind = 0; ind < reallength; ind++) {
            realret[ind] = ret[ind];
        }
        return realret;        
    }
}
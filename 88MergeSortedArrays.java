public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        } 
        if (n == 0) {
            return;
        }
        //inplace
        int[] res = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }
        if (j == n) {
            while (i < m) {
                res[k++] = nums1[i++];
            }
        } else {
            while (j < n) {
                res[k++] = nums2[j++];
            }
        }
        for (int q = 0; q < nums1.length; q++) {
            nums1[q] = res[q];
        }
    }
}
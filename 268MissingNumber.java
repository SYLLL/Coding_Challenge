public class Solution {
    public int missingNumber(int[] nums) {
        //correct num must be from 0...n
        //if correct num is 0 1 2 3 4 5
        //num's length is 5
        //correct sum = (0+5)*6/2
        int n = nums.length;
        int correct = n * (n+1) / 2;
        for (int i = 0; i<nums.length; i++) {
            correct -= nums[i];
        }
        return correct;
    }
}
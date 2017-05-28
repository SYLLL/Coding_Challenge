public class Solution {
    public int nthUglyNumber(int n) {
        //O(n) time, O(n) space
        //1st sequence: 1*2,2*2,3*2,4*2,5*2,6*2,8*2...
        //2nd sequence: 1*3,2*3,3*3,4*3,5*3,6*3,8*3...
        //3rd sequence: 1*5,2*5,3*5,4*5,5*5,6*5,8*5...
        int[] arr = new int[n];
        arr[0] = 1;
        int next_2 = 2, next_3 = 3, next_5 = 5;
        //wait to be multiplied
        int two_ind = 1, three_ind = 1, five_ind = 1;
        //merge
        for (int i = 1; i < n; i++) {
            int min = Math.min(Math.min(next_2, next_3), next_5);
            arr[i] = min;
            if (min == next_2) {
                next_2 = arr[two_ind++]*2;
            }
            if (min == next_3) {
                next_3 = arr[three_ind++]*3;
            } 
            if (min == next_5) {
                //curr_ugly == next_5
                next_5 = arr[five_ind++]*5;
            }
        }
        return arr[n-1];
    }
}
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

//use binary search idea
//if bad is at left, then it and its left is bad
//if bad is at right, then it and its right is good
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (isBadVersion(1)) {
            return 1;
        }
        int low = 1;
        int high = n;
        int mid;
        while (low < high) {
            mid = low + (high - low)/2;
            if (isBadVersion(mid)) {
                //always eliminating range if high != low
                //so no infinite loop
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        //low == high
        return low;
    }
}
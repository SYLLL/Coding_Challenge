/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> ret = new ArrayList<Interval>();
        for (Interval interv : intervals) {
            checkAndInsert(ret, interv);
        }
        return ret;
    }
    
    public void checkAndInsert(List<Interval> currentIntervals, Interval interval) {
        if (currentIntervals == null) {
            currentIntervals.add(interval);
            return;
        } else {
            int beststart = interval.start;
            int bestend = interval.end;
            boolean needsInsert = true;
            for (Interval target : currentIntervals) {
                // checks each target in the list
                if (target.start <= bestend && bestend <= target.end && beststart < target.start) {
                    // end is in the middle, needs to change start
                    currentIntervals.remove(target);
                    bestend = target.end;
                    needsInsert = true;
                } else if (beststart >= target.start && beststart <= target.end && bestend > target.end) {
                    // start in the middle, needs to change end
                    currentIntervals.remove(target);
                    beststart = target.start;
                    needsInsert = true;
                } else if (beststart < target.start && bestend > target.end) {
                    // start before, end later
                    currentIntervals.remove(target);
                    needsInsert = true;
                } else if (beststart >= target.start && bestend <= target.end) {
                    // Immediately return since already exists
                    return;
                }
            } //end for  
            currentIntervals.add(new Interval(beststart, bestend));
        } //end else
    } // end method
}
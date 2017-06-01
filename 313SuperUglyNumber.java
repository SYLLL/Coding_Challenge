public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if (primes == null || primes.length == 0) {
            return -1;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        //initially, pq contains all 1*prime aka primeindex[0]*primes[i]
        for (int i = 0; i < primes.length; i++) {
            pq.offer(primes[i]);
        }
        int[] ret = new int[n];
        ret[0] = 1;
        //all 0;
        int[] primeindex = new int[primes.length];
        int[] nextprimeingroup = primes.clone();
        for (int i = 1; i < n; i++) {
            ret[i] = pq.peek();
            for (int j = 0; j < primes.length; j++) {
                if (ret[i] == ret[primeindex[j]] * primes[j]) {
                    nextprimeingroup[j] = ret[++primeindex[j]] * primes[j];
                    pq.poll();
                    pq.offer(nextprimeingroup[j]);
                }
            }
        }
        return ret[n-1];
    }
}
public class Solution111 {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int now = 0;
        int lastlast = 1;
        int last = 2;
        for (int i = 3; i <= n; i++) {
            now = lastlast + last;
            lastlast = last;
            last = now;
        }
        return now;
    }
}
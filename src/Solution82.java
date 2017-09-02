public class Solution82 {
    /**
     * @param A : an integer array
     *          return : a integer
     */
    public int singleNumber(int[] A) {
        if (A == null) {
            return -1;
        }
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result ^= A[i];
        }
        return result;
    }
}
public class Solution172 {
    /**
     * @param A:    A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int l = 0;
        int h = A.length - 1;
        while (l <= h) {
            if (A[l] == elem) {
                A[l] = A[h];
                h--;
            } else {
                l++;
            }
        }
        return h + 1;
    }
}
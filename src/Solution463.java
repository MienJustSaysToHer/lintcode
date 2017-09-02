public class Solution463 {
    /*
     * @param A: an integer array
     * @return:
     */
    public void sortIntegers(int[] A) {
        int l = A.length;
        boolean swap = true;
        for (int i = 0; i < l - 1 && swap; i++) {
            swap = false;
            for (int j = 0; j < l - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    swap = true;
                }
            }
        }
    }
}
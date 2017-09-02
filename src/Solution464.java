public class Solution464 {
    /**
     * @param A an integer array
     * @return void
     */
    public void sortIntegers2(int[] A) {
        merge(A, 0, A.length - 1, new int[A.length], new int[A.length]);
    }

    void merge(int[] A, int start, int end, int[] left, int[] right) {
        if (start < end) {
            int middle = (start + end) / 2;
            merge(A, start, middle, left, right);
            merge(A, middle + 1, end, left, right);
            sort(A, start, middle, end, left, right);
        }
    }

    private void sort(int[] A, int start, int middle, int end, int[] left, int[] right) {
        int leftlength = middle - start + 1;
        for (int i = 0; i < leftlength; i++) {
            left[i] = A[start + i];
        }
        int rightlength = end - middle;
        for (int i = 0; i < rightlength; i++) {
            right[i] = A[middle + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = start;
        while (i < leftlength && j < rightlength) {
            if (left[i] < right[j]) {
                A[k] = left[i];
                i++;
                k++;
            } else {
                A[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < leftlength) {
            A[k] = left[i];
            i++;
            k++;
        }
        while (j < rightlength) {
            A[k] = right[j];
            j++;
            k++;
        }
    }
}
public class Solution196 {
    /**
     * @param nums: an array of integers
     * @return: an integer
     */
    public int findMissing(int[] nums) {
        // write your code here
        int n = nums.length, i = 0;
        while (i < n) {
            while (nums[i] != i && nums[i] < n) {
                int t = nums[i];
                nums[i] = nums[t];
                nums[t] = t;
            }
            ++i;
        }
        for (i = 0; i < n; ++i)
            if (nums[i] != i) return i;
        return n;
    }
}
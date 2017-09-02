public class Solution41 {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int localmax = nums[0];
        int globalmax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            localmax = Math.max(localmax + nums[i], nums[i]);
            globalmax = Math.max(globalmax, localmax);
        }
        return globalmax;
    }
}
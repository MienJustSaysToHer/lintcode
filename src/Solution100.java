public class Solution100 {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int j = 0;
        int now = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != now) {
                nums[j] = nums[i];
                now = nums[i];
                j++;
            }
        }
        return j;
    }
}
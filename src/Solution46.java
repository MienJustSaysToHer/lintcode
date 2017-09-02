import java.util.ArrayList;

public class Solution46 {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        int count = 0;
        int result = -1;
        for (int i = 0; i < nums.size(); i++) {
            if (count == 0) {
                result = nums.get(i);
                count++;
            } else if (nums.get(i) == result) {
                count++;
            } else {
                count--;
            }
        }
        return result;
    }
}
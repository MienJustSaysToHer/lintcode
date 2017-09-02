public class Solution491 {
    /**
     * @param num a positive number
     * @return true if it's a palindrome or false
     */
    public boolean palindromeNumber(int num) {
        int high = 1;
        int dump = num;
        while (num / 10 != 0) {
            high *= 10;
            num /= 10;
        }
        int low = 10;
        while (dump != 0) {
            int h = dump / high;
            int l = dump % low;
            if (h != l) {
                return false;
            }
            dump %= high;
            dump /= low;
            high /= 100;
        }
        return true;
    }
}
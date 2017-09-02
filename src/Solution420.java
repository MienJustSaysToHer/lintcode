public class Solution420 {
    /**
     * @param n the nth
     * @return the nth sequence
     */
    public String countAndSay(int n) {
        if (n <= 1) {
            return "1";
        }
        String result = "1";
        for (int i = 2; i <= n; i++) {
            char now = '0';
            int time = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < result.length(); j++) {
                if (now == result.charAt(j)) {
                    time++;
                } else {
                    if (time != 0) {
                        sb.append(time);
                        sb.append(now);
                    }
                    now = result.charAt(j);
                    time = 1;
                }
            }
            sb.append(time);
            sb.append(now);
            result = sb.toString();
        }
        return result;
    }
}
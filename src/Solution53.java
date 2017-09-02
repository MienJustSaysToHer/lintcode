public class Solution53 {
    /**
     * @param s : A string
     * @return : A string
     */
    public String reverseWords(String s) {
        if (s == null) {
            return null;
        }

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!"".equals(words[i])) {
                result.append(words[i]);
                result.append(" ");
            }
        }
        return result.length() > 1 ? result.substring(0, result.length() - 1) : result.toString();
    }
}
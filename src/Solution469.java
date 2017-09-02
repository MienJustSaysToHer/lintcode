public class Solution469 {
    /**
     * @param a, b, the root of binary trees.
     * @return true if they are identical, or false.
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        if (a == null) {
            return b == null;
        }
        if (b == null) {
            return false;
        }
        boolean leftIdentical = isIdentical(a.left, b.left);
        boolean rightIdentical = isIdentical(a.right, b.right);
        return leftIdentical && rightIdentical && a.val == b.val;
    }
}